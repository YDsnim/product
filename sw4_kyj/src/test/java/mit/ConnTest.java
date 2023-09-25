package mit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class ConnTest {
	@Test
	public void connTest() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("db연결중");
			Connection conn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/", "root", "1234");
				System.out.println("연결정보 conn: "+conn);
				System.out.println("DB 연결성공");
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void jdbcTest() {
		log.info("jdbcTest 입니다.");
	}
}
