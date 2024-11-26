package com.sanket.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.jobportal.entity.UsersType;

public interface UsersTypeRepository extends JpaRepository<UsersType,Integer>{

	

	List<UsersType> findAll();

}
