package com.cakeshop.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.cakeshop.dao.BaseDataDao;
import com.cakeshop.dao.BaseDataDaoImpl;

import com.cakeshop.service.BaseDataService;
import com.cakeshop.service.BaseDataServiceImpl;

@WebListener
public class ServletContextLifecycleListener implements ServletContextListener {


	private BaseDataService baseDataService;
	
	public ServletContextLifecycleListener() {
		baseDataService = new BaseDataServiceImpl();
	}

	public void contextDestroyed(ServletContextEvent sce) {
	}

	public void contextInitialized(ServletContextEvent sce) {
		ServletContext contxt = sce.getServletContext();
		String baseDataFilePath = contxt.getRealPath("WEB-INF//db//base-data.sql");
		String createBaseData = contxt.getInitParameter("CreateBaseData");
		if (createBaseData.equalsIgnoreCase("YES")) {
			BaseDataDao baseDatedao = new BaseDataDaoImpl();
			baseDatedao.createBaseData(baseDataFilePath);

			baseDataService.createBaseData(baseDataFilePath);
		}
	}

}
