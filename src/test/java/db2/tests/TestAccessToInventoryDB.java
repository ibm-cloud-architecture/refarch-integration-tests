package db2.tests;

import static org.junit.Assert.fail;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import inventory.model.Inventory;
import inventory.model.ItemEntity;
import inventory.model.SupplierEntity;
import inventory.test.InventoryPersistenceManager;

/**
 * This test is to validate direct remote JPA/jdbc access to the database.
 * 
 * It uses a local persistence manager.
 * @author Jerome Boyer
 *
 */
public class TestAccessToInventoryDB {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testListItems() {
		EntityManager em = InventoryPersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
		List<ItemEntity> results;
		try{ 
			Query query =em.createNamedQuery("Item.findAll");
			results = query.getResultList ();
			Assert.assertTrue(results.size() > 10);
			for (ItemEntity ie : results){
				System.out.println(ie.getId()+" "+ie.getName());
			}
		} catch (Exception w){
			fail("Exception reported " + w.getMessage());
			
		}   finally {
			em.close();
		}	
	}

	
	@Test
	public void testGetOneItem() {
		EntityManager em = InventoryPersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
		ItemEntity entity=em.find(ItemEntity.class, 13403);
		Assert.assertNotNull(entity);
		Assert.assertTrue(13403==entity.getId());
		em.close();
	}
	
	@Test
	public void testModifyUpdateDate(){
		EntityManager em = InventoryPersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
		 
		List<ItemEntity> results = new ArrayList<ItemEntity>();
		try{ 
			em.getTransaction().begin();
			Query query =em.createNamedQuery("Item.findAll");
			results = query.getResultList ();
			for (ItemEntity ie : results){
				ie.setUpdateDate(new Timestamp((new Date()).getTime()));
				em.merge(ie);
			}
			 em.getTransaction().commit();
		} catch (Exception w){
			fail("Exception reported " + w.getMessage());
			
		}   finally {
			em.close();
		}	
	}
	
	@Test
	public void testReadInventory() {
		EntityManager em = InventoryPersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
		try{ 
			Query query =em.createNamedQuery("Inventory.findAll");
			List<Inventory >results = query.getResultList ();
			Assert.assertTrue(results.size() >= 2);
			for (Inventory ie : results){
				System.out.println(ie.getId()+" "+ie.getSite());
			}
		} catch (Exception w){
			fail("Exception reported " + w.getMessage());
			
		}   finally {
			em.close();
		}		
	}

	@Test
	public void testReadSuppliers() {
		EntityManager em = InventoryPersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
		try{ 
			Query query =em.createNamedQuery("Supplier.findAll");
			List<SupplierEntity >results = query.getResultList ();
			Assert.assertTrue(results.size() >= 2);
			for (SupplierEntity ie : results){
				System.out.println(ie.getId()+" "+ie.getName());
			}
		} catch (Exception w){
			fail("Exception reported " + w.getMessage());
			
		}   finally {
			em.close();
		}		
	}
}
