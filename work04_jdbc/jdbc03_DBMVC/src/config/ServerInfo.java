package config;

public interface ServerInfo {
	//인터페이스는 필드가 없고 무조건 상수이다.
	//따라서 기본적으로 public static final이 붙어있다고 보면 된다.
	
	String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	String USER = "kb_db";
	String PASS = "1234";

}
