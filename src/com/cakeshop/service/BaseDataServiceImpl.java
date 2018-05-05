package com.cakeshop.service;

import com.cakeshop.dao.BaseDataDao;
import com.cakeshop.dao.BaseDataDaoImpl;

public class BaseDataServiceImpl implements BaseDataService {

	private BaseDataDao baseDataDao;
	
	public BaseDataServiceImpl() {
		baseDataDao = new BaseDataDaoImpl();
	}

	
	@Override
	public void createBaseData(String filePath) {
		baseDataDao.createBaseData(filePath);
	}
}
