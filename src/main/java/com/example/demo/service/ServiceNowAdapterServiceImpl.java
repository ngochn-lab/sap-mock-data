package com.example.demo.service;

import com.example.demo.dto.EmployeeProfileDto;
import com.example.demo.dto.LinkValueDto;
import com.example.demo.dto.OnboardingCandidateInfoDto;
import com.example.demo.model.EmployeeProfile;
import com.example.demo.model.OnboardingCandidateInfo;
import com.example.demo.repository.EmployeeProfileRepository;
import com.example.demo.repository.OnboardingCandidateInfoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceNowAdapterServiceImpl implements ServiceNowAdapterService {

    private final EmployeeProfileRepository employeeProfileRepository;
    private final OnboardingCandidateInfoRepository onboardingCandidateInfoRepository;

    @Autowired
    public ServiceNowAdapterServiceImpl(EmployeeProfileRepository employeeProfileRepository,
                                        OnboardingCandidateInfoRepository onboardingCandidateInfoRepository) {
        this.employeeProfileRepository = employeeProfileRepository;
        this.onboardingCandidateInfoRepository = onboardingCandidateInfoRepository;
    }

    @Override
    public EmployeeProfileDto getEmployeeProfileById(Long id) {
        EmployeeProfile employeeProfile = employeeProfileRepository.findById(id)
                .orElse(null);
        return toEmployeeProfileDto(employeeProfile);
    }

    @Override
    public OnboardingCandidateInfoDto getOnboardingCandidateInfoById(String candidateId) {
        OnboardingCandidateInfo onboardingCandidateInfo = onboardingCandidateInfoRepository.findById(candidateId).orElse(null);
        return toOnboardingCandidateInfoDto(onboardingCandidateInfo);
    }

    @Override
    public Page<OnboardingCandidateInfoDto> getAllOnboardingCandidateInfo(Pageable pageable) {
        Page<OnboardingCandidateInfo> onboardingCandidateInfos = onboardingCandidateInfoRepository.findAll(pageable);
        return onboardingCandidateInfos.map(this::toOnboardingCandidateInfoDto);
    }

    // Manual mapping from entity to DTO
    private EmployeeProfileDto toEmployeeProfileDto(EmployeeProfile entity) {
        if (entity == null) {
            return null;
        }
        EmployeeProfileDto dto = new EmployeeProfileDto();
        dto.setBackgroundBanner(entity.getBackgroundBanner());
        dto.setEmploymentStartDate(entity.getEmploymentStartDate());
        dto.setShortBio(entity.getShortBio());
        dto.setSysModCount(entity.getSysModCount());
        dto.setWorkMobile(entity.getWorkMobile());
        dto.setWorkPhone(entity.getWorkPhone());
        dto.setSysUpdatedOn(entity.getSysUpdatedOn());
        dto.setSysTags(entity.getSysTags());
        dto.setEmploymentEndDate(entity.getEmploymentEndDate());
        dto.setLocationType(entity.getLocationType());
        dto.setNumber(entity.getNumber());
        dto.setSysId(entity.getSysId());
        dto.setSysUpdatedBy(entity.getSysUpdatedBy());
        dto.setSysCreatedOn(entity.getSysCreatedOn());
        dto.setNickname(entity.getNickname());
        dto.setPreferredPronoun(entity.getPreferredPronoun());
        dto.setLegalName(entity.getLegalName());
        dto.setPositionType(entity.getPositionType());
        dto.setSysCreatedBy(entity.getSysCreatedBy());

        LinkValueDto user = new LinkValueDto();
        user.setValue(entity.getUser().getValue());
        user.setLink(entity.getUser().getLink());
        dto.setUser(user);

        return dto;
    }

    private OnboardingCandidateInfoDto toOnboardingCandidateInfoDto(OnboardingCandidateInfo entity) {
        if (entity == null) {
            return null;
        }
        OnboardingCandidateInfoDto dto = new OnboardingCandidateInfoDto();
        dto.setApplicantId(entity.getApplicantId());
        dto.setCandidateId(entity.getCandidateId());
        dto.setCreatedBy(entity.getCreatedBy());
        dto.setCreatedDateTime(entity.getCreatedDateTime());
        dto.setCrossboarded(entity.isCrossboarded());
        dto.setDepartment(entity.getDepartment());
        dto.setDivision(entity.getDivision());
        dto.setEmail(entity.getEmail());
        dto.setExternalName_de_DE(entity.getExternalName_de_DE());
        dto.setExternalName_defaultValue(entity.getExternalName_defaultValue());
        dto.setExternalName_en_GB(entity.getExternalName_en_GB());
        dto.setExternalName_en_US(entity.getExternalName_en_US());
        dto.setExternalName_es_ES(entity.getExternalName_es_ES());
        dto.setExternalName_fr_FR(entity.getExternalName_fr_FR());
        dto.setExternalName_ja_JP(entity.getExternalName_ja_JP());
        dto.setExternalName_ko_KR(entity.getExternalName_ko_KR());
        dto.setExternalName_localized(entity.getExternalName_localized());
        dto.setExternalName_nl_NL(entity.getExternalName_nl_NL());
        dto.setExternalName_pt_BR(entity.getExternalName_pt_BR());
        dto.setExternalName_pt_PT(entity.getExternalName_pt_PT());
        dto.setExternalName_ru_RU(entity.getExternalName_ru_RU());
        dto.setExternalName_zh_CN(entity.getExternalName_zh_CN());
        dto.setExternalName_zh_TW(entity.getExternalName_zh_TW());
        dto.setFName(entity.getFName());
        dto.setFailedSEBEventsOccured(entity.isFailedSEBEventsOccured());
        dto.setFromExternalATS(entity.isFromExternalATS());
        dto.setGlobalAssignment(entity.isGlobalAssignment());
        dto.setHireDate(entity.getHireDate());
        dto.setHired(entity.isHired());
        dto.setHrManagerId(entity.getHrManagerId());
        dto.setInternalHire(entity.isInternalHire());
        dto.setJobReqId(entity.getJobReqId());
        dto.setJobTitle(entity.getJobTitle());
        dto.setKmsUserId(entity.getKmsUserId());
        dto.setLName(entity.getLName());
        dto.setLastModifiedBy(entity.getLastModifiedBy());
        dto.setLastModifiedDateTime(entity.getLastModifiedDateTime());
        dto.setLocation(entity.getLocation());
        dto.setManagerId(entity.getManagerId());
        dto.setMdfSystemRecordStatus(entity.getMdfSystemRecordStatus());
        dto.setOnboardingLocale(entity.getOnboardingLocale());
        dto.setPayGrade(entity.getPayGrade());
        dto.setProcessorId(entity.getProcessorId());
        dto.setReadyToHire(entity.isReadyToHire());
        dto.setUserId(entity.getUserId());
        dto.setWorkCountry(entity.getWorkCountry());
        return dto;
    }
}
