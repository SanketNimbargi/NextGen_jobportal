package com.sanket.jobportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanket.jobportal.entity.UsersType;
import com.sanket.jobportal.repository.UsersTypeRepository;

@Service
public class UsersTypeService {

	private final UsersTypeRepository usersTypeRepository ;

	@Autowired
	public UsersTypeService(UsersTypeRepository usersTypeRepository) {
		this.usersTypeRepository = usersTypeRepository;
	}
	
	public List<UsersType> getAll() {
		return usersTypeRepository.findAll();
	}
	
}
