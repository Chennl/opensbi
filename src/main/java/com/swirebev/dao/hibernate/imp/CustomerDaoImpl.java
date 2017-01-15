package com.swirebev.dao.hibernate.imp;
import org.springframework.stereotype.Repository;
import com.swirebev.dao.CustomerDao;
import com.swirebev.dao.hibernate.GenericDaoImplHibernate;
import com.swirebev.pojo.Customer;

@Repository
public class CustomerDaoImpl extends GenericDaoImplHibernate<Customer> implements CustomerDao {

	
}
 