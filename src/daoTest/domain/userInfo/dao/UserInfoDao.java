package daoTest.domain.userInfo.dao;

/**
 * 
 * UserInfoDao interface with methods to be provided
 * 
 * 
 * @author Seulgi Kim
 * 
 */

import daoTest.domain.userInfo.UserInfo;

public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	
}
