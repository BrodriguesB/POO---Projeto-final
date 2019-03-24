package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	
	private Connection con = null;


	

	private String hostName = null;
	private String userName = null;
	private String password = null;
	private String url = null;
	private String jdbcDriver = null;
	private String dataBaseName = null;
	private String dataBasePrefix = null;
	private String dataBasePort = null;
	
	public Conexao() {
		super();
		this.setHostName("localhost");
		this.setUserName("postgres");
		this.setPassword("1234");
		this.setJdbcDriver("org.postgresql.Driver");//com.mysql.jdbc.Driver
		this.setDataBasePrefix("jdbc:postgresql://");//"jdbc:mysql://"
		this.setDataBasePort("5432");//3306
		this.setDataBaseName("ByteFood");
		this.setUrl(dataBasePrefix + hostName + ":"+dataBasePort+"/" + dataBaseName);
	}

	
	public Connection getConnection() {
		
		try {
				Class.forName(jdbcDriver);
				DriverManager.registerDriver(new org.postgresql.Driver());
				con = DriverManager.getConnection(this.getUrl(),this.getUserName(),this.getPassword());
				System.out.println("Conectado ao Banco de Dados!");
	
		}catch(ClassNotFoundException e) {
			System.err.print(e.getMessage());
			System.out.println("Erro na conexao!");
		}catch(SQLException e) {
			System.err.print(e.getMessage());
			System.out.println("Erro na conexao!");
			
		}
		
	return con;	
	}
	
	
	
	
	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getJdbcDriver() {
		return jdbcDriver;
	}

	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}

	public String getDataBaseName() {
		return dataBaseName;
	}

	public void setDataBaseName(String dataBaseName) {
		this.dataBaseName = dataBaseName;
	}

	public String getDataBasePrefix() {
		return dataBasePrefix;
	}

	public void setDataBasePrefix(String dataBasePrefix) {
		this.dataBasePrefix = dataBasePrefix;
	}

	public String getDataBasePort() {
		return dataBasePort;
	}

	public void setDataBasePort(String dabaBasePort) {
		this.dataBasePort = dabaBasePort;
	}

	
	
}