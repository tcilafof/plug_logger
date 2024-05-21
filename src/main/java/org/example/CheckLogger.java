package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CheckLogger extends Main{

    @BeforeAll
    public void getPage() {
        driver.get("https://testengineer.ru/testng-tutorial/");
    }

    @Test
    public void checkLogger(){
//        driver.findElement(By.className("nkjfcsfnjcfsj"));
    }

//    @Test
//    public ResultSet sqlQuery() throws SQLException {
//        Statement statement = connection.createStatement();
//        String query = "SELECT * FROM bookings.aicrafts;";
//        ResultSet result = statement.executeQuery(query);
//        return result;
//    }

//    @Test
//    public void sql() throws SQLException {
//        Assertions.assertTrue(connection.createStatement().execute("SELECT * FROM bookings.aircrafts;"));
//    }
}
