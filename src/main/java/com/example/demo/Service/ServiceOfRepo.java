package com.example.demo.Service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.BillionaresRepo;
import com.example.demo.entities.BillionarEntity;

import dto.BillionareCreateDto;

@Service
public class ServiceOfRepo {
	private BillionaresRepo billionaresRepo;
	@Autowired
	public ServiceOfRepo(BillionaresRepo billionaresRepo) {
		this.billionaresRepo= billionaresRepo;
		}
	@Transactional
	public void save(BillionareCreateDto dto) throws Exception {
		
		if (dto.getName()==null || dto.getLastName() == null || dto.getCareer() == null) {
			throw new Exception("Fields must not be null");
		}
		if ( dto.getName().isEmpty() || dto.getLastName().isEmpty() || dto.getCareer().isEmpty() ) {
			throw new Exception("Neither field must be null");
		}
		
		BillionarEntity billionare = new BillionarEntity(dto.getName(),dto.getLastName(),dto.getCareer());
		billionaresRepo.save(billionare);
	}
	public void update(Long id,String career) throws Exception {
		
		if (career == null) {
			throw new Exception("Fields must not be null");
		}
		if (career.isEmpty() ) {
			throw new Exception("Neither field must be null");
		}
		
		BillionarEntity billionare = billionaresRepo.find(id);
		billionaresRepo.update(billionare);
	}
	public BillionarEntity find(Long id) {
		return billionaresRepo.find(id);
	}
	

}
