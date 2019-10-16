package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnection() throws SQLException {
        //Given
        //when
        DbManager dbManager = DbManager.getInstance();
        //then
        Assert.assertNotNull(dbManager);
    }

    @Test
    public void testSelectedUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //when
        String sqlQuerry = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuerry);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + "," + rs.getString("FIRSTNAME") + "," + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(4, counter);
    }

    @Test
    public void testSelectedUsersAndPosts() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();

        //when
        String sqlQuerry = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID GROUP BY P.USER_ID HAVING COUNT(*) > 2 ORDER BY U.LASTNAME, U.FIRSTNAME;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuerry);

        //then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + "," + rs.getString("FIRSTNAME") + "," + rs.getString("LASTNAME") + rs.getInt("POSTS_NUMBER"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(0, counter);
    }
}
