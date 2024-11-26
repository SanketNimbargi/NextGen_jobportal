 package com.sanket.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanket.jobportal.entity.JobPostActivity;
import com.sanket.jobportal.entity.JobSeekerProfile;
import com.sanket.jobportal.entity.JobSeekerSave;

@Repository
 public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

     public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

     List<JobSeekerSave> findByJob(JobPostActivity job);

 }
