package cn.bst.model;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Replys entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.bst.model.Replys
 * @author MyEclipse Persistence Tools
 */
public class ReplysDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(ReplysDAO.class);
	// property constants
	public static final String COMMENT_VALUE = "commentValue";
	public static final String SHEAR_IS = "shearIs";
	public static final String USER_ACCOUNT = "userAccount";

	public void save(Replys transientInstance) {
		log.debug("saving Replys instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Replys persistentInstance) {
		log.debug("deleting Replys instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Replys findById(java.lang.Integer id) {
		log.debug("getting Replys instance with id: " + id);
		try {
			Replys instance = (Replys) getSession().get("cn.bst.model.Replys", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Replys instance) {
		log.debug("finding Replys instance by example");
		try {
			List results = getSession().createCriteria("cn.bst.model.Replys").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Replys instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Replys as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCommentValue(Object commentValue) {
		return findByProperty(COMMENT_VALUE, commentValue);
	}

	public List findByShearIs(Object shearIs) {
		return findByProperty(SHEAR_IS, shearIs);
	}

	public List findByUserAccount(Object userAccount) {
		return findByProperty(USER_ACCOUNT, userAccount);
	}

	public List findAll() {
		log.debug("finding all Replys instances");
		try {
			String queryString = "from Replys";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Replys merge(Replys detachedInstance) {
		log.debug("merging Replys instance");
		try {
			Replys result = (Replys) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Replys instance) {
		log.debug("attaching dirty Replys instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Replys instance) {
		log.debug("attaching clean Replys instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}