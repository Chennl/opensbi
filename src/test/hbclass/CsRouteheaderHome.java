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
 * Home object for domain model class CsRouteheader.
 * @see hbclass.CsRouteheader
 * @author Hibernate Tools
 */
public class CsRouteheaderHome {

	private static final Log log = LogFactory.getLog(CsRouteheaderHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(CsRouteheader transientInstance) {
		log.debug("persisting CsRouteheader instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CsRouteheader instance) {
		log.debug("attaching dirty CsRouteheader instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CsRouteheader instance) {
		log.debug("attaching clean CsRouteheader instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CsRouteheader persistentInstance) {
		log.debug("deleting CsRouteheader instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CsRouteheader merge(CsRouteheader detachedInstance) {
		log.debug("merging CsRouteheader instance");
		try {
			CsRouteheader result = (CsRouteheader) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CsRouteheader findById(java.lang.String id) {
		log.debug("getting CsRouteheader instance with id: " + id);
		try {
			CsRouteheader instance = (CsRouteheader) sessionFactory.getCurrentSession().get("hbclass.CsRouteheader",
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

	public List findByExample(CsRouteheader instance) {
		log.debug("finding CsRouteheader instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("hbclass.CsRouteheader")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
