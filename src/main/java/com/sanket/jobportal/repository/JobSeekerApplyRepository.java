package com.sanket.jobportal.repository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanket.jobportal.entity.JobPostActivity;
import com.sanket.jobportal.entity.JobSeekerApply;
import com.sanket.jobportal.entity.JobSeekerProfile;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}