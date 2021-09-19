package com.um.factory;

import com.um.dao.InterfaceDao;

public abstract class AbstractFactory {

	public abstract InterfaceDao getDao();
	public static AbstractFactory getFactory(int choice)
	{
		AbstractFactory factory=null;
		if(choice==1)
		{
			factory= new OracleFactory();
		}
		if(choice==2) {
			factory=new FileSystemFactory();
		}
		return factory;
		
	}
}
