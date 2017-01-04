package cn.bst.model;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for CollectinonRelation entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see cn.bst.model.CollectinonRelation
  * @author MyEclipse Persistence Tools 
 */
public class CollectinonRelationDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(CollectinonRelationDAO.class);
		//property constants
	public static final String USERS_ID = "usersId";
	public static final String SHEARS_ID = "shearsId";



    
    public void save(CollectinonRelation transientInstance) {
        log.debug("saving CollectinonRelation instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(CollectinonRelation persistentInstance) {
        log.debug("deleting CollectinonRelation instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public CollectinonRelation findById( java.lang.Integer id) {
        log.debug("getting CollectinonRelation instance with id: " + id);
        try {
            CollectinonRelation instance = (CollectinonRelation) getSession()
                    .get("cn.bst.model.CollectinonRelation", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(CollectinonRelation instance) {
        log.debug("finding CollectinonRelation instance by example");
        try {
            List results = getSession()
                    .createCriteria("cn.bst.model.CollectinonRelation")
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
      log.debug("finding CollectinonRelation instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from CollectinonRelation as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByUsersId(Object usersId
	) {
		return findByProperty(USERS_ID, usersId
		);
	}
	
	public List findByShearsId(Object shearsId
	) {
		return findByProperty(SHEARS_ID, shearsId
		);
	}
	

	public List findAll() {
		log.debug("finding all CollectinonRelation instances");
		try {
			String queryString = "from CollectinonRelation";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public CollectinonRelation merge(CollectinonRelation detachedInstance) {
        log.debug("merging CollectinonRelation instance");
        try {
            CollectinonRelation result = (CollectinonRelation) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(CollectinonRelation instance) {
        log.debug("attaching dirty CollectinonRelation instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(CollectinonRelation instance) {
        log.debug("attaching clean CollectinonRelation instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}