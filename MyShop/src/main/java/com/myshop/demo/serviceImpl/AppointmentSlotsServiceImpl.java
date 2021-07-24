package com.myshop.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.demo.entity.AppointmentSlots;
import com.myshop.demo.repository.AppointmentSlotsRepository;
import com.myshop.demo.service.AppointmentSlotsService;
@Service
public class AppointmentSlotsServiceImpl implements AppointmentSlotsService{
    @Autowired
	AppointmentSlotsRepository appRepo;
	
	@Transactional
	public AppointmentSlots save(AppointmentSlots apps) {
		// TODO Auto-generated method stub
		return appRepo.save(apps);
	}

	@Transactional
	public List<AppointmentSlots> findAll() {
		// TODO Auto-generated method stub
		return appRepo.findAll();
	}

	@Transactional
	public Optional<AppointmentSlots> findById(Long id) {
		// TODO Auto-generated method stub
		return appRepo.findById(id);
	}

}
