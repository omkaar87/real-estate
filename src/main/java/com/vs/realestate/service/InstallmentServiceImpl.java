package com.vs.realestate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vs.realestate.dao.InstallmentDao;
import com.vs.realestate.entity.Installment;

@Service
public class InstallmentServiceImpl implements InstallmentService {

	@Autowired
	InstallmentDao installmentDao;
	
	@Override
	@Transactional
	public void saveInstallment(String[] modeName, int[] noOfInstallment) {
		
		installmentDao.saveInstallment(modeName, noOfInstallment);
		
	}

	@Override
	@Transactional
	public List<Installment> getServiceInstallmentsList() {
		
		return installmentDao.getInstallmentsList();
		
	}

	@Override
	@Transactional
	public String getServiceLastMode() {
		
		return installmentDao.getLastMode();
		
	}
	
	
	
}
