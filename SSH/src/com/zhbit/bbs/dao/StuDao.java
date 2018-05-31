/**
 * 
 */
package com.zhbit.bbs.dao;

import java.util.List;

import com.zhbit.bbs.domain.Stu;


/**
 * @author Administrator
 * 
 */
public interface StuDao {
	// insert User record.
	public Stu insertUser(Stu student);

	public Stu updateUser(Stu student);

	public void deleteUser(Stu student);

	public List searchUser();
}
