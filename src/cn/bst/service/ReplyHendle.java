package cn.bst.service;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.bst.model.Replys;
import cn.bst.model.ReplysAndAccount;
import cn.bst.model.Shares;
import cn.bst.utils.HibernateUtils;

public class ReplyHendle {
	Replys reply;
	
	public ReplyHendle(Replys reply){
		reply.setReplysTime(new Timestamp(System.currentTimeMillis()));
		this.reply = reply;
	}
	
	public boolean saveAsNewReply() {
		boolean flag = true;
		Session session = null;
		Transaction tran = null;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			session.save(reply);
			tran.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		}
		finally {
			HibernateUtils.closeSession(session);
		}
		return flag;
	}
	
	public static List<Replys> getReplysByID(int id) {
		List<Replys> rp = null;
		Session session = null;
		Transaction tran = null;
		try {
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			
			String hql = "from Replys p where (p.shearsId = ?)";
			Query query = session.createQuery(hql).setInteger(0, id);
			rp = (List<Replys>)query.list();
			tran.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			HibernateUtils.closeSession(session);
		}
		return rp;
	}
	
}
