package com.spring.jdbc;

import java.sql.*;


/**
 * @author akash.gond
 * @Project Practice_Spring_Boot
 * @Date 432023 Copyright (C) 2023 Newcastle University, UK
 */
public class TestJdbc {

	public static void main(String[] args) {
		String connectionUrl ="*******" +
				"database=CSC8019;" +
				"user=**********;" +
				"password=*******" +
				"encrypt=true;" +
				"trustServerCertificate=false;" +
				"hostNameInCertificate=*.database.windows.net;" +
				"loginTimeout=30;";

		try (Connection connection = DriverManager.getConnection(connectionUrl);) {
			// Code here.
			System.out.println("Connection established!");
		}
		// Handle any errors that may have occurred.
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
