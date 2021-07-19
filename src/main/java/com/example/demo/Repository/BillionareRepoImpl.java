package com.example.demo.Repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.BillionarEntity;
@Repository
public class BillionareRepoImpl implements BillionaresRepo{
	
	@Autowired
	private EntityManager em;
	private static String FIND_BY_ID = "Select b from BillionarEntity b where b.id = ?1";
	
	@Override
	public void save(BillionarEntity entity) {
		em.persist(entity);
	}

	@Override
	public void update(BillionarEntity entity) {
		em.merge(entity);	
	}

	@Override
	public void delete(BillionarEntity entity) {
		em.remove(entity);
	}
	@Override
	public BillionarEntity find(Long id) {
		return (BillionarEntity) em.createQuery(FIND_BY_ID)
				.setParameter(1, id)
				.getSingleResult();
	}
	

}
