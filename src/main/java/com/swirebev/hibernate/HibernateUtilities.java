package com.swirebev.hibernate;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;

import com.swirebev.pojo.simple.ArticleMasterSimple;

public class HibernateUtilities {
	@Resource(name="sessionFactory")
	SessionFactory sessionFactory;
	 
	@SuppressWarnings("rawtypes")
	public List getArticleList(){
		String sql="select article_no,category_code ,brand_code,flavor_code,package_code,name_c from am_articlemaster";
		Query q = sessionFactory.getCurrentSession().createSQLQuery(sql).setResultTransformer(Transformers.aliasToBean(ArticleMasterSimple.class)); 
		return q.list();	
	}
}
