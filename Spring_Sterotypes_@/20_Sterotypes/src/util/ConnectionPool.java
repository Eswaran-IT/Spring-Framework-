package util;

import org.springframework.stereotype.Component;


public class ConnectionPool
{
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public ConnectionPool() {
	System.out.println("ConneectionPool object");
	}

}


