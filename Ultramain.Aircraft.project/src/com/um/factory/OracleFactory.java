package com.um.factory;

import com.um.dao.InterfaceDao;
import com.um.dao.OracleDao;

public class OracleFactory extends AbstractFactory {
	@Override
	public InterfaceDao getDao() {
		return new OracleDao() ;
	}

}