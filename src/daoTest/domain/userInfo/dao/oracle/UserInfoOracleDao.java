package daoTest.domain.userInfo.dao.oracle;

import daoTest.domain.userInfo.UserInfo;
import daoTest.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert user ID into Oracle DB: " 
				+ userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update user ID in Oracle DB: " 
				+ userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete user ID from Oracle DB: "
				+ userInfo.getUserId());
	}

}
