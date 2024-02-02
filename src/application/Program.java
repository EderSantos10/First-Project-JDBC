package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.entities.Department;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
	}
}
