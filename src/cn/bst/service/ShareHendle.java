package cn.bst.service;

import java.io.File;
import java.sql.Timestamp;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.bst.model.Shares;
import cn.bst.model.SharesDAO;
import cn.bst.utils.HibernateUtils;
import cn.bst.utils.ImgUtils;

public class ShareHendle {
	private Shares share;

	public ShareHendle() {
		share = null;
	}
	
	public ShareHendle(Shares share) {
		this.share = share;
		this.share.setShareTime(new Timestamp(System.currentTimeMillis()));

	}
	
	public Shares getShareByID(Integer id){
		return new SharesDAO().findById(id);
	}

	public boolean saveAsNewShare() {
		boolean reply = true;
		Session session = null;
		Transaction tran = null;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			session.save(share);
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
	
	public void saveAsNewShare(Shares share) {
		Session session = null;
		Transaction tran = null;
		String imgFilePath = "E:\\Fly的Files\\Desktop\\坑\\apache-tomcat-9.0.0.M15\\webapps\\BSTServer\\img\\share";
		addImage(imgFilePath);
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			session.save(share);
			tran.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			HibernateUtils.closeSession(session);
		}
	}
	
	public String addImage(String imgFilePath){
		String imgBase64Str = share.getShearImage();
		share.setShearImage(share.getId() + share.getTitle() + "share.jpg");
		imgFilePath += "\\" + share.getShearImage();
		ImgUtils.string2Image(imgBase64Str, imgFilePath);
		return null;
	}
	
	public static List<Shares> getMyShares(int id) {
		List<Shares> myShares = null;
		Session session = null;
		Transaction tran = null;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			
			String hql = "from Shares p where (p.masterId = ?)";
			Query query = session.createQuery(hql).setParameter(0, id);
			myShares = (List<Shares>)query.list();
			tran.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			HibernateUtils.closeSession(session);
		}
		return myShares;
		
	}
	
	public static List<Shares> getSharesList(String tag) {
		List<Shares> shares = null;
		Session session = null;
		Transaction tran = null;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			String hql;
			Query query;
			if(tag.equals("全部")){
				hql = "from Shares";
				query = session.createQuery(hql);
			}
			else {
				hql = "from Shares p where (p.tagArray = ?)";
				query = session.createQuery(hql).setString(0, tag);
			}
			
			shares = (List<Shares>)query.list();
			tran.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			HibernateUtils.closeSession(session);
		}
		//用来玩的+++++
		String path = "E:\\Fly的Files\\WorkSpace\\git\\BSTServer\\WebRoot\\img\\share";
		File file=new File(path);
		File[] tempList = file.listFiles();
		for(Shares temp: shares) {
			int i = (int)(Math.random() * tempList.length);
			temp.setShearImage(tempList[i].getName());
		}
		//用来玩的+++++
		return shares;
	}
}
