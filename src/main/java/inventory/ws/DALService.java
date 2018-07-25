
package inventory.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DALService", targetNamespace = "http://ws.inventory/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DALService {


    /**
     * 
     * @return
     *     returns java.util.List<inventory.ws.Item>
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItems", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetItems")
    @ResponseWrapper(localName = "getItemsResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetItemsResponse")
    public List<Item> getItems()
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteSupplier", targetNamespace = "http://ws.inventory/", className = "inventory.ws.DeleteSupplier")
    @ResponseWrapper(localName = "deleteSupplierResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.DeleteSupplierResponse")
    public String deleteSupplier(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns inventory.ws.Inventory
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addItemToSite", targetNamespace = "http://ws.inventory/", className = "inventory.ws.AddItemToSite")
    @ResponseWrapper(localName = "addItemToSiteResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.AddItemToSiteResponse")
    public Inventory addItemToSite(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        long arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        double arg4)
        throws DALException
    ;

    /**
     * 
     * @return
     *     returns java.util.List<inventory.ws.Inventory>
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInventoryCrossSite", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetInventoryCrossSite")
    @ResponseWrapper(localName = "getInventoryCrossSiteResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetInventoryCrossSiteResponse")
    public List<Inventory> getInventoryCrossSite()
        throws DALException
    ;

    /**
     * 
     * @param id
     * @return
     *     returns inventory.ws.Item
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "itemById", targetNamespace = "http://ws.inventory/", className = "inventory.ws.ItemById")
    @ResponseWrapper(localName = "itemByIdResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.ItemByIdResponse")
    public Item itemById(
        @WebParam(name = "id", targetNamespace = "")
        long id)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns inventory.ws.Supplier
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateSupplier", targetNamespace = "http://ws.inventory/", className = "inventory.ws.UpdateSupplier")
    @ResponseWrapper(localName = "updateSupplierResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.UpdateSupplierResponse")
    public Supplier updateSupplier(
        @WebParam(name = "arg0", targetNamespace = "")
        Supplier arg0)
        throws DALException
    ;

    /**
     * 
     * @return
     *     returns java.util.List<inventory.ws.Supplier>
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suppliers", targetNamespace = "http://ws.inventory/", className = "inventory.ws.Suppliers")
    @ResponseWrapper(localName = "suppliersResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.SuppliersResponse")
    public List<Supplier> suppliers()
        throws DALException
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns inventory.ws.Inventory
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sellItem", targetNamespace = "http://ws.inventory/", className = "inventory.ws.SellItem")
    @ResponseWrapper(localName = "sellItemResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.SellItemResponse")
    public Inventory sellItem(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        long arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        double arg4)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<inventory.ws.Inventory>
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInventoryPerSupplier", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetInventoryPerSupplier")
    @ResponseWrapper(localName = "getInventoryPerSupplierResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetInventoryPerSupplierResponse")
    public List<Inventory> getInventoryPerSupplier(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns inventory.ws.Item
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "newItem", targetNamespace = "http://ws.inventory/", className = "inventory.ws.NewItem")
    @ResponseWrapper(localName = "newItemResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.NewItemResponse")
    public Item newItem(
        @WebParam(name = "arg0", targetNamespace = "")
        Item arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns inventory.ws.Inventory
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInventoryById", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetInventoryById")
    @ResponseWrapper(localName = "getInventoryByIdResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetInventoryByIdResponse")
    public Inventory getInventoryById(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteItems", targetNamespace = "http://ws.inventory/", className = "inventory.ws.DeleteItems")
    @ResponseWrapper(localName = "deleteItemsResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.DeleteItemsResponse")
    public String deleteItems(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns inventory.ws.Inventory
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInventoryForSiteAndItemId", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetInventoryForSiteAndItemId")
    @ResponseWrapper(localName = "getInventoryForSiteAndItemIdResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetInventoryForSiteAndItemIdResponse")
    public Inventory getInventoryForSiteAndItemId(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<inventory.ws.Supplier>
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSuppliersOfItem", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetSuppliersOfItem")
    @ResponseWrapper(localName = "getSuppliersOfItemResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetSuppliersOfItemResponse")
    public List<Supplier> getSuppliersOfItem(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns inventory.ws.Supplier
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "newSupplier", targetNamespace = "http://ws.inventory/", className = "inventory.ws.NewSupplier")
    @ResponseWrapper(localName = "newSupplierResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.NewSupplierResponse")
    public Supplier newSupplier(
        @WebParam(name = "arg0", targetNamespace = "")
        Supplier arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns inventory.ws.Supplier
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "supplierById", targetNamespace = "http://ws.inventory/", className = "inventory.ws.SupplierById")
    @ResponseWrapper(localName = "supplierByIdResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.SupplierByIdResponse")
    public Supplier supplierById(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns inventory.ws.Supplier
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "supplierByName", targetNamespace = "http://ws.inventory/", className = "inventory.ws.SupplierByName")
    @ResponseWrapper(localName = "supplierByNameResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.SupplierByNameResponse")
    public Supplier supplierByName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns inventory.ws.Item
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateItem", targetNamespace = "http://ws.inventory/", className = "inventory.ws.UpdateItem")
    @ResponseWrapper(localName = "updateItemResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.UpdateItemResponse")
    public Item updateItem(
        @WebParam(name = "arg0", targetNamespace = "")
        Item arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns inventory.ws.Inventory
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateInventoryEntry", targetNamespace = "http://ws.inventory/", className = "inventory.ws.UpdateInventoryEntry")
    @ResponseWrapper(localName = "updateInventoryEntryResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.UpdateInventoryEntryResponse")
    public Inventory updateInventoryEntry(
        @WebParam(name = "arg0", targetNamespace = "")
        Inventory arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItemStock", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetItemStock")
    @ResponseWrapper(localName = "getItemStockResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetItemStockResponse")
    public int getItemStock(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<inventory.ws.Item>
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItemsPerSite", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetItemsPerSite")
    @ResponseWrapper(localName = "getItemsPerSiteResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetItemsPerSiteResponse")
    public List<Item> getItemsPerSite(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws DALException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<inventory.ws.Inventory>
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInventoryPerSite", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetInventoryPerSite")
    @ResponseWrapper(localName = "getInventoryPerSiteResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.GetInventoryPerSiteResponse")
    public List<Inventory> getInventoryPerSite(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws DALException
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://ws.inventory/", className = "inventory.ws.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.SayHelloResponse")
    public String sayHello();

    /**
     * 
     * @param name
     * @return
     *     returns inventory.ws.Item
     * @throws DALException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "itemByName", targetNamespace = "http://ws.inventory/", className = "inventory.ws.ItemByName")
    @ResponseWrapper(localName = "itemByNameResponse", targetNamespace = "http://ws.inventory/", className = "inventory.ws.ItemByNameResponse")
    public Item itemByName(
        @WebParam(name = "name", targetNamespace = "")
        String name)
        throws DALException
    ;

}
