/**
 * 
 */
package com.zhbit.bbs.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zhbit.bbs.dao.StuDao;
import com.zhbit.bbs.dao.StuDaoImpl;
import com.zhbit.bbs.domain.Stu;


/**
 * @author Administrator
 * 
 */
@Transactional(propagation = Propagation.REQUIRED)
public class StuServiceImpl implements StuService {

	@Resource

	StuDao StudentDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.zhbit.bbs.services.UserService#insertUser(com.zhbit.bbs.domain.User)
	 */

	public StuDao getUserDao() {
		return StudentDao;
	}

	public void setUserDao(StuDao userDao) {
		this.StudentDao = userDao;
	}

	@Override
	public Stu insertUser(Stu student) {
		// TODO Auto-generated method stub
		return StudentDao.insertUser(student);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.zhbit.bbs.services.UserService#updateUser(com.zhbit.bbs.domain.User)
	 */
	@Override
	public Stu updateUser(Stu student) {
		// TODO Auto-generated method stub
		return StudentDao.updateUser(student);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.zhbit.bbs.services.UserService#deleteUser(com.zhbit.bbs.domain.User)
	 */
	@Override
	public void deleteUser(Stu student) {
		// TODO Auto-generated method stub
		StudentDao.deleteUser(student);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zhbit.bbs.services.UserService#searchUser(java.lang.String)
	 */
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	@Override
	public List searchUser() {
		// TODO Auto-generated method stub
		return StudentDao.searchUser();
	}

}
