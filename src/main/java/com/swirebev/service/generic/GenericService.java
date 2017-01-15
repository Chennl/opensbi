package com.swirebev.service.generic;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T> {
	 /**
     * Create entity
     * @param entity
     */
    void save(T entity);
    
    /**
     * Update entity
     * @param entity
     */
    void update(T entity);
    
    /**
     * Create or Update entity
     * @param entity POJO
     */
    void saveOrUpdate(T entity);
    
    /**
     * Delete entity
     * @param entity
     */
    void delete(T entity);
    
    /**
     * Delete entity
     * @param entity
     */
    void deleteById(Serializable id);
    
    /**
     * Find entity by id
     * @param id ID
     * @return Entity
     */
    T getById(Serializable id);
    
    /**
     * Find all
     */
    List<T> findAll();
    
    /**
     * Find 
     * @return
     */
    List<T> find(String  queryString);
    


}
