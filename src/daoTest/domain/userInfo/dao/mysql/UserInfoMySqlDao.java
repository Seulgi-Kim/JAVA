package daoTest.domain.userInfo.dao.mysql;

import daoTest.domain.userInfo.UserInfo;
import daoTest.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert user ID into MySQL DB: " 
				+ userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update user ID in MySQL DB: " 
				+ userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete user ID from MySQL DB: "
				+ userInfo.getUserId());
	}
	
}
