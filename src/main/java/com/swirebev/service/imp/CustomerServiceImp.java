package com.swirebev.service.imp;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swirebev.dao.CustomerDao;
import com.swirebev.pojo.Customer;
import com.swirebev.service.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    
	@Override
	public void save(Customer entity) {
		customerDao.save(entity);

	}

	@Override
	public void update(Customer entity) {
		customerDao.update(entity);

	}

	@Override
	public void saveOrUpdate(Customer entity) {
		customerDao.saveOrUpdate(entity);

	}

	@Override
	public void delete(Customer entity) {
		customerDao.delete(entity);

	}

	@Override
	public void deleteById(Serializable id) {
		customerDao.deleteById(id);

	}

	@Override
	public Customer getById(Serializable id) {
		
		return customerDao.getById(id);
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

	@Override
	public List<Customer> find(String queryString) {
		// TODO Auto-generated method stub
		return null;
	}

}
