package cn.bst.model;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Users entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see cn.bst.model.Users
  * @author MyEclipse Persistence Tools 
 */
public class UsersDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(UsersDAO.class);
		//property constants
	public static final String ACCOUNT = "account";
	public static final String PSW = "psw";
	public static final String SEX = "sex";
	public static final String AGE = "age";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String HEAD_IMAGE = "headImage";
	public static final String PERSONAL_CHECK = "personalCheck";
	public static final String EMAIL = "email";
	public static final String LIKE_COUNT = "likeCount";
	public static final String SHARE_COUNT = "shareCount";



    
    public void save(Users transientInstance) {
        log.debug("saving Users instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Users persistentInstance) {
        log.debug("deleting Users instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Users findById( java.lang.Integer id) {
        log.debug("getting Users instance with id: " + id);
        try {
            Users instance = (Users) getSession()
                    .get("cn.bst.model.Users", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Users instance) {
        log.debug("finding Users instance by example");
        try {
            List results = getSession()
                    .createCriteria("cn.bst.model.Users")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Users instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Users as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByAccount(Object account
	) {
		return findByProperty(ACCOUNT, account
		);
	}
	
	public List findByPsw(Object psw
	) {
		return findByProperty(PSW, psw
		);
	}
	
	public List findBySex(Object sex
	) {
		return findByProperty(SEX, sex
		);
	}
	
	public List findByAge(Object age
	) {
		return findByProperty(AGE, age
		);
	}
	
	public List findByPhoneNumber(Object phoneNumber
	) {
		return findByProperty(PHONE_NUMBER, phoneNumber
		);
	}
	
	public List findByHeadImage(Object headImage
	) {
		return findByProperty(HEAD_IMAGE, headImage
		);
	}
	
	public List findByPersonalCheck(Object personalCheck
	) {
		return findByProperty(PERSONAL_CHECK, personalCheck
		);
	}
	
	public List findByEmail(Object email
	) {
		return findByProperty(EMAIL, email
		);
	}
	
	public List findByLikeCount(Object likeCount
	) {
		return findByProperty(LIKE_COUNT, likeCount
		);
	}
	
	public List findByShareCount(Object shareCount
	) {
		return findByProperty(SHARE_COUNT, shareCount
		);
	}
	

	public List findAll() {
		log.debug("finding all Users instances");
		try {
			String queryString = "from Users";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Users merge(Users detachedInstance) {
        log.debug("merging Users instance");
        try {
            Users result = (Users) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Users instance) {
        log.debug("attaching dirty Users instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Users instance) {
        log.debug("attaching clean Users instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}