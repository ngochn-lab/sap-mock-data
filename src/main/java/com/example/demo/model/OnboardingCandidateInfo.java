package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "onboarding_candidate_info")
@Data
public class OnboardingCandidateInfo {
    @Id
    @Column(name = "candidate_id", nullable = false, length = 64)
    private String candidateId;

    @Column(name = "applicant_id", length = 64)
    private String applicantId;

    @Column(name = "created_by", length = 128)
    private String createdBy;

    @Column(name = "created_date_time", length = 64)
    private String createdDateTime;

    @Column(name = "crossboarded")
    private boolean crossboarded;

    @Column(name = "department", length = 128)
    private String department;

    @Column(name = "division", length = 128)
    private String division;

    @Column(name = "email", length = 128)
    private String email;

    @Column(name = "external_name_de_de", length = 128)
    private String externalName_de_DE;

    @Column(name = "external_name_default_value", length = 128)
    private String externalName_defaultValue;

    @Column(name = "external_name_en_gb", length = 128)
    private String externalName_en_GB;

    @Column(name = "external_name_en_us", length = 128)
    private String externalName_en_US;

    @Column(name = "external_name_es_es", length = 128)
    private String externalName_es_ES;

    @Column(name = "external_name_fr_fr", length = 128)
    private String externalName_fr_FR;

    @Column(name = "external_name_ja_jp", length = 128)
    private String externalName_ja_JP;

    @Column(name = "external_name_ko_kr", length = 128)
    private String externalName_ko_KR;

    @Column(name = "external_name_localized", length = 128)
    private String externalName_localized;

    @Column(name = "external_name_nl_nl", length = 128)
    private String externalName_nl_NL;

    @Column(name = "external_name_pt_br", length = 128)
    private String externalName_pt_BR;

    @Column(name = "external_name_pt_pt", length = 128)
    private String externalName_pt_PT;

    @Column(name = "external_name_ru_ru", length = 128)
    private String externalName_ru_RU;

    @Column(name = "external_name_zh_cn", length = 128)
    private String externalName_zh_CN;

    @Column(name = "external_name_zh_tw", length = 128)
    private String externalName_zh_TW;

    @Column(name = "f_name", length = 64)
    private String fName;

    @Column(name = "failed_seb_events_occured")
    private boolean failedSEBEventsOccured;

    @Column(name = "from_external_ats")
    private boolean fromExternalATS;

    @Column(name = "global_assignment")
    private boolean globalAssignment;

    @Column(name = "hire_date", length = 64)
    private String hireDate;

    @Column(name = "hired")
    private boolean hired;

    @Column(name = "hr_manager_id", length = 64)
    private String hrManagerId;

    @Column(name = "internal_hire")
    private boolean internalHire;

    @Column(name = "job_req_id", length = 64)
    private String jobReqId;

    @Column(name = "job_title", length = 128)
    private String jobTitle;

    @Column(name = "kms_user_id", length = 64)
    private String kmsUserId;

    @Column(name = "l_name", length = 64)
    private String lName;

    @Column(name = "last_modified_by", length = 128)
    private String lastModifiedBy;

    @Column(name = "last_modified_date_time", length = 64)
    private String lastModifiedDateTime;

    @Column(name = "location", length = 128)
    private String location;

    @Column(name = "manager_id", length = 64)
    private String managerId;

    @Column(name = "mdf_system_record_status", length = 64)
    private String mdfSystemRecordStatus;

    @Column(name = "onboarding_locale", length = 64)
    private String onboardingLocale;

    @Column(name = "pay_grade", length = 64)
    private String payGrade;

    @Column(name = "processor_id", length = 64)
    private String processorId;

    @Column(name = "ready_to_hire")
    private boolean readyToHire;

    @Column(name = "user_id", length = 64)
    private String userId;

    @Column(name = "work_country", length = 64)
    private String workCountry;
}