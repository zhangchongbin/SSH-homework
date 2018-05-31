/**
 * 
 */
package com.zhbit.bbs.services;

import java.util.List;

import com.zhbit.bbs.domain.Stu;

/**
 * @author Administrator
 * 
 */
public interface StuService {

	public Stu insertUser(Stu user);

	public Stu updateUser(Stu user);

	public void deleteUser(Stu user);

	public List searchUser();

}
