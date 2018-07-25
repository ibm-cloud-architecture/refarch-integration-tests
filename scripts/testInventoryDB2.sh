#!/bin/bash
echo "######################"
echo Test access to DB2 Inventory DB using the junit class.
echo Be sure to have VPN access to the remote DB2 server

export CP=./build/classes/test:./build/classes/main:./lib/junit.jar:./lib/commons-codec-1/9.jar:./lib/commons-logging-1.2.jar:./lib/org.hamcrest.core_1.3.0.v201303031735.jar:./lib/gson-2.2.4.jar
java -cp $CP org.junit.runner.JUnitCore db2.tests.TestAccessToInventoryDB
