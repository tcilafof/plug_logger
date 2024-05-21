package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {
    protected static WebDriver driver;
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static Connection connection;

    @BeforeAll
    public static void initialize() throws SQLException {
        LOGGER.info("Chromedriver start...");
        driver = new ChromeDriver();
        connection = getConnection();
        LOGGER.info("DB connected");
    }

    @AfterAll
    public static void quit() throws SQLException {
        LOGGER.info("Chromedriver close");
        driver.quit();
        connection.close();
        LOGGER.info("DB disconnected");
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "0192");
    }

    @Test
    public ResultSet sqlQuery() throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM bookings.aicrafts;";
        ResultSet result = statement.executeQuery(query);
        return result;
    }

    /*@Test
    public void shouldGetJdbcConnection() throws SQLException {
        try(Connection connection = getConnection()) {
            assertTrue(connection.isValid(1));
            assertFalse(connection.isClosed());
        }
    }*/
}