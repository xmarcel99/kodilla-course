package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcTestSuite {

    @Test
    public void updateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL = \"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String procedureCall = "call UpdateVipLevels()";
        statement.execute(procedureCall);
        //Then
        String sqlCheckTable = " select count(*) as how_many from READERS where VIP_LEVEL =  \"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()) {
            howMany = rs.getInt("how_many");
        }
        Assert.assertEquals(0,howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        Statement statement = dbManager.getConnection().createStatement();
        String sqlUpdateQuery = "update BOOKS set BESTSELLER = \"0\"";
        statement.executeUpdate(sqlUpdateQuery);
        //When
        String procedureCall = "call UpdateBestsellers()";
        statement.execute(procedureCall);
        //Then
        String sqlChecktTableFalse = "select count(*) as how_many_false from BOOKS where BESTSELLER =  \"0\"";
        ResultSet rsFalse = statement.executeQuery(sqlChecktTableFalse);
        int howManyFalse = -1;
        if(rsFalse.next()) {
            howManyFalse = rsFalse.getInt("how_many_false");
        }
        Assert.assertEquals(1,howManyFalse);
    }
}
