package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import util.ConnectionPool;

@Repository
public class DDao 
{	@Autowired
	private ConnectionPool pool;
		
	public DDao() {
	System.out.println("DDao object");
	}

	public void printCPDATA(){
		System.out.println(pool.getName());
	}
	
	
}
