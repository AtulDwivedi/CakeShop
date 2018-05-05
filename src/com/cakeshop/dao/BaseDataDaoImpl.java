package com.cakeshop.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.StringTokenizer;

public class BaseDataDaoImpl implements BaseDataDao {

	@Override
	public void createBaseData(String filePath) {
		System.out.println(">> createTables");
		try {
			FileInputStream fin = new FileInputStream(filePath);
			byte data[] = new byte[fin.available()];
			fin.read(data);
			fin.close();
			String str = new String(data);
			StringTokenizer st = new StringTokenizer(str, "----");
			while (st.hasMoreTokens()) {
				String query = st.nextToken();
				if (query.trim().equals("stop")) {
					break;
				}
				try (Connection con = DbUtil.getConnection(); Statement stmt = con.createStatement();) {
					stmt.execute(query);
					System.out.println(query.split(" ")[2] + " table is successfully created.");
				} catch (Exception e) {
					System.out.println(this.getClass().getSimpleName() + " " + e);
				}

				System.out.println("<< createTables");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
