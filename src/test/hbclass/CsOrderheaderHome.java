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
 * Home object for domain model class CsOrderheader.
 * @see hbclass.CsOrderheader
 * @author Hibernate Tools
 */
public class CsOrderheaderHome {

	private static final Log log = LogFactory.getLog(CsOrderheaderHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(CsOrderheader transientInstance) {
		log.debug("persisting CsOrderheader instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CsOrderheader instance) {
		log.debug("attaching dirty CsOrderheader instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CsOrderheader instance) {
		log.debug("attaching clean CsOrderheader instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CsOrderheader persistentInstance) {
		log.debug("deleting CsOrderheader instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CsOrderheader merge(CsOrderheader detachedInstance) {
		log.debug("merging CsOrderheader instance");
		try {
			CsOrderheader result = (CsOrderheader) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CsOrderheader findById(java.lang.String id) {
		log.debug("getting CsOrderheader instance with id: " + id);
		try {
			CsOrderheader instance = (CsOrderheader) sessionFactory.getCurrentSession().get("hbclass.CsOrderheader",
					id);
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

	public List findByExample(CsOrderheader instance) {
		log.debug("finding CsOrderheader instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("hbclass.CsOrderheader")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
