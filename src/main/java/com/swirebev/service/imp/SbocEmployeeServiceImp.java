package com.swirebev.service.imp;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swirebev.dao.SbocEmployeeDao;
import com.swirebev.pojo.SbocEmployee;
import com.swirebev.service.SbocEmployeeService;

@Service
public class SbocEmployeeServiceImp implements SbocEmployeeService {
    @Autowired
    private SbocEmployeeDao sbocEmployeeDao;
    
	@Override
	public void save(SbocEmployee entity) {
		sbocEmployeeDao.save(entity);

	}

	@Override
	public void update(SbocEmployee entity) {
		sbocEmployeeDao.update(entity);

	}

	@Override
	public void saveOrUpdate(SbocEmployee entity) {
		sbocEmployeeDao.saveOrUpdate(entity);

	}

	@Override
	public void delete(SbocEmployee entity) {
		sbocEmployeeDao.delete(entity);

	}

	@Override
	public void deleteById(Serializable id) {
		sbocEmployeeDao.deleteById(id);

	}

	@Override
	public SbocEmployee getById(Serializable id) {
		
		return sbocEmployeeDao.getById(id);
	}

	@Override
	public List<SbocEmployee> findAll() {
		// TODO Auto-generated method stub
		return sbocEmployeeDao.findAll();
	}

	@Override
	public List<SbocEmployee> find(String queryString) {
		// TODO Auto-generated method stub
		return null;
	}

}
