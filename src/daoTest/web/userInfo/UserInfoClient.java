package daoTest.web.userInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import daoTest.domain.userInfo.UserInfo;
import daoTest.domain.userInfo.dao.UserInfoDao;
import daoTest.domain.userInfo.dao.mysql.UserInfoMySqlDao;
import daoTest.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src/daoTest/db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("User1");
		userInfo.setPassword("a12345");
		userInfo.setUserName("Kim");
		
		UserInfoDao userInfoDao = null;	
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}else {
			System.out.println("DB ERROR");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}

}
