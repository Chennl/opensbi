package hbclass;
// Generated Jan 11, 2017 1:51:27 PM by Hibernate Tools 4.3.5.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class CsOrderitem.
 * @see hbclass.CsOrderitem
 * @author Hibernate Tools
 */
public class CsOrderitemHome {

	private static final Log log = LogFactory.getLog(CsOrderitemHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(CsOrderitem transientInstance) {
		log.debug("persisting CsOrderitem instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CsOrderitem instance) {
		log.debug("attaching dirty CsOrderitem instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CsOrderitem instance) {
		log.debug("attaching clean CsOrderitem instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CsOrderitem persistentInstance) {
		log.debug("deleting CsOrderitem instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CsOrderitem merge(CsOrderitem detachedInstance) {
		log.debug("merging CsOrderitem instance");
		try {
			CsOrderitem result = (CsOrderitem) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CsOrderitem findById(hbclass.CsOrderitemId id) {
		log.debug("getting CsOrderitem instance with id: " + id);
		try {
			CsOrderitem instance = (CsOrderitem) sessionFactory.getCurrentSession().get("hbclass.CsOrderitem", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CsOrderitem instance) {
		log.debug("finding CsOrderitem instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("hbclass.CsOrderitem")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
