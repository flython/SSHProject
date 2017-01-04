package cn.bst.model;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * ReplysAndAccount entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.bst.model.ReplysAndAccount
 * @author MyEclipse Persistence Tools
 */
public class ReplysAndAccountDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(ReplysAndAccountDAO.class);
	// property constants

	public void save(ReplysAndAccount transientInstance) {
		log.debug("saving ReplysAndAccount instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ReplysAndAccount persistentInstance) {
		log.debug("deleting ReplysAndAccount instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ReplysAndAccount findById(cn.bst.model.ReplysAndAccountId id) {
		log.debug("getting ReplysAndAccount instance with id: " + id);
		try {
			ReplysAndAccount instance = (ReplysAndAccount) getSession().get("cn.bst.model.ReplysAndAccount", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ReplysAndAccount instance) {
		log.debug("finding ReplysAndAccount instance by example");
		try {
			List results = getSession().createCriteria("cn.bst.model.ReplysAndAccount").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ReplysAndAccount instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from ReplysAndAccount as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ReplysAndAccount instances");
		try {
			String queryString = "from ReplysAndAccount";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ReplysAndAccount merge(ReplysAndAccount detachedInstance) {
		log.debug("merging ReplysAndAccount instance");
		try {
			ReplysAndAccount result = (ReplysAndAccount) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ReplysAndAccount instance) {
		log.debug("attaching dirty ReplysAndAccount instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ReplysAndAccount instance) {
		log.debug("attaching clean ReplysAndAccount instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}