package com.swirebev.service.imp;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swirebev.dao.ArticleMasterDao;
import com.swirebev.pojo.ArticleMaster;
import com.swirebev.service.ArticleMasterService;

@Service
public class ArticleMasterServiceImp implements ArticleMasterService {
    @Autowired
    private ArticleMasterDao ArticleMasterDao;
    
	@Override
	public void save(ArticleMaster entity) {
		ArticleMasterDao.save(entity);

	}

	@Override
	public void update(ArticleMaster entity) {
		ArticleMasterDao.update(entity);

	}

	@Override
	public void saveOrUpdate(ArticleMaster entity) {
		ArticleMasterDao.saveOrUpdate(entity);

	}

	@Override
	public void delete(ArticleMaster entity) {
		ArticleMasterDao.delete(entity);

	}

	@Override
	public void deleteById(Serializable id) {
		ArticleMasterDao.deleteById(id);

	}

	@Override
	public ArticleMaster getById(Serializable id) {
		
		return ArticleMasterDao.getById(id);
	}

	@Override
	public List<ArticleMaster> findAll() {
		// TODO Auto-generated method stub
		return ArticleMasterDao.findAll();
	}

	@Override
	public List<ArticleMaster> find(String queryString) {
		// TODO Auto-generated method stub
		return null;
	}

}
