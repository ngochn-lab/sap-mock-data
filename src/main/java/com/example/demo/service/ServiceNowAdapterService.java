package com.example.demo.service;

import com.example.demo.dto.EmployeeProfileDto;
import com.example.demo.dto.OnboardingCandidateInfoDto;
import com.example.demo.model.OnboardingCandidateInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ServiceNowAdapterService {
    EmployeeProfileDto getEmployeeProfileById(Long id);
    OnboardingCandidateInfoDto getOnboardingCandidateInfoById(String id);
    Page<OnboardingCandidateInfoDto> getAllOnboardingCandidateInfo(Pageable pageable);
}
