package booklist_test;


import java.sql.CallableStatement;
import java.sql.*;
import java.io.*;

public class Booklist {
	Connection con;
	
	public Booklist() {
		String Driver = "";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String pwd = "tiger";
		
		try { // 데이터베이스를 찾는 과정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try { // 데이터베이스를 연결하는 과정
			System.out.println("데이터베이스 연결 준비...");
			con = DriverManager.getConnection(url,userid,pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void sqlRun() {
		String query = "SELECT * FROM Book"; // sql문
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("BOOK NO \tBOOK NAME \tPUBLISHER \tPRICE");
			while (rs.next()) {
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t\t" + rs.getString(3));
				System.out.println("\t\t" + rs.getInt(4));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	public static void main(String[] args) {
		Booklist so = new Booklist();
		so.sqlRun();
		
	}

}
