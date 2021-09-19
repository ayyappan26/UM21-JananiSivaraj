package com.um.factory;

import com.um.dao.FileSystemDao;
import com.um.dao.InterfaceDao;

public class FileSystemFactory extends AbstractFactory {

	@Override
	public InterfaceDao getDao() {
		return new FileSystemDao();
	}

}
