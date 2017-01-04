package cn.bst.utils;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.Configuration; 

public class HibernateUtils {
	 private static SessionFactory factory;  
	  
	    //static只初始化一次.  
	    static  
	    {  
	        try{  
	        //默认读取的是hibernate.cfg.xml 文件.  
	                Configuration cfg = new Configuration().configure();  
	                  
	                //建立SessionFactory.  
	                factory = cfg.buildSessionFactory(); 
	      
	        }catch(Exception e )  
	        {  
	            e.printStackTrace();  
	        }  
	    }  
	      
	    public static Session getSession()  
	    {  
	        //打开session.  
	        return factory.openSession();  
	    }  
	      
	    //关闭session.  
	    public static void closeSession(Session session)  
	    {  
	        //判断是否为空.  
	        //判断是否是打开状态再进行关闭.  
	          
	        if(session!=null)  
	        {  
	            if(session.isOpen())  
	            {  
	                session.close();  
	            }  
	        }  
	    }  
	      
	    //返回工厂类.  
	    public static SessionFactory getSessionFactory()  
	    {  
	        return factory;  
	    }  
}
