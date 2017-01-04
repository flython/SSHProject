package cn.bst.service;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.bst.model.Users;
import cn.bst.utils.HibernateUtils;
import cn.bst.utils.ImgUtils;

public class UserHendle {
	Users user;
	
	public UserHendle(Users user) {
		user.setRegTime(new Timestamp(System.currentTimeMillis()));
		this.user = user;
	}
	
	public boolean saveAsNewUser(){
		boolean reply = true;
		Session session = null;
		Transaction tran = null;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			
			String hql = "from Users p where p.account = ?";
			Query query = session.createQuery(hql).setString(0, user.getAccount());
			if(query.uniqueResult() == null){
				session.save(user);
			}
			else {
				reply = false;
			}
			tran.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reply = false;
		}
		finally {
			HibernateUtils.closeSession(session);
		}
		return reply;
	}
	
	public String updateHeadImage(String imgFilePath){
		String imgBase64Str = user.getHeadImage();
		user.setHeadImage(user.getId() + user.getAccount() + "head.jpg");
		imgFilePath += "\\" + user.getHeadImage();
		ImgUtils.string2Image(imgBase64Str, imgFilePath);
		return null;
	}
	
	public boolean updateUser() {
		boolean reply = true;
		Session session = null;
		Transaction tran = null;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			session.update(user);
			tran.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reply = false;
		}
		finally {
			HibernateUtils.closeSession(session);
		}
		return reply;
	}
	
	public Users doLogin() {
		Users user = null;
		Session session = null;
		Transaction tran = null;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			
			String hql = "from Users p where (p.account = ?) AND (p.psw = ?)";
			Query query = session.createQuery(hql).setParameter(0, this.user.getAccount()).setParameter(1, this.user.getPsw());
			user = (Users)query.uniqueResult();
			tran.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			HibernateUtils.closeSession(session);
		}
		return user;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
}
