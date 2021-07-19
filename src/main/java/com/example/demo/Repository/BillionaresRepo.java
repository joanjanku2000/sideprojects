package com.example.demo.Repository;

import com.example.demo.entities.BillionarEntity;


public interface BillionaresRepo {
	 void save(BillionarEntity entity);
	 void update(BillionarEntity entity);
	 void delete (BillionarEntity entity);
	 BillionarEntity find(Long id);
}
