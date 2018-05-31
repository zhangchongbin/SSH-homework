/**
 * 
 */
package com.zhbit.bbs.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zhbit.bbs.domain.Stu;

/**
 * @author Administrator
 * 
 */
public class StuDaoImpl implements StuDao {
	@Resource
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zhbit.bbs.dao.UserDao#insertUser(com.zhbit.bbs.domain.User)
	 */
	@Override
	public Stu insertUser(Stu user) {
		sessionFactory.getCurrentSession().persist(user);

		return user;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zhbit.bbs.dao.UserDao#updateUser(com.zhbit.bbs.domain.User)
	 */
	@Override
	public Stu updateUser(Stu user) {
		sessionFactory.getCurrentSession().merge(user);
		return user;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zhbit.bbs.dao.UserDao#deleteUser(com.zhbit.bbs.domain.User)
	 */
	@Override
	public void deleteUser(Stu user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zhbit.bbs.dao.UserDao#selectUser(java.lang.String)
	 */
	@Override
	public List searchUser() {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		Stu student=new Stu();
		String sql = "select * from Stu";
		Session session=sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			List students = session.createSQLQuery(sql).addEntity(Stu.class).list();
			for(Iterator iter=students.iterator();iter.hasNext();){
				student = (Stu)iter.next();
				System.out.println(student.getName()+","+student.getSex()+","+student.getAge());
				list.add(student);
			}
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
		return list;
	}

}
