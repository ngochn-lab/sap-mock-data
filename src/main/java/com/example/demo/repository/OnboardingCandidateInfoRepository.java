package com.example.demo.repository;

import com.example.demo.model.OnboardingCandidateInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnboardingCandidateInfoRepository extends JpaRepository<OnboardingCandidateInfo, String> {
}
