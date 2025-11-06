package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employee_profile")
public class EmployeeProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "background_banner")
    private String backgroundBanner;

    @Column(name = "employment_start_date")
    private String employmentStartDate;

    @Column(name = "short_bio")
    private String shortBio;

    @Column(name = "sys_mod_count")
    private String sysModCount;

    @Column(name = "work_mobile")
    private String workMobile;

    @Column(name = "work_phone")
    private String workPhone;

    @Column(name = "sys_updated_on")
    private String sysUpdatedOn;

    @Column(name = "sys_tags")
    private String sysTags;

    @Column(name = "employment_end_date")
    private String employmentEndDate;

    @Column(name = "location_type")
    private String locationType;

    @Column(name = "number")
    private String number;

    @Column(name = "sys_id")
    private String sysId;

    @Column(name = "sys_updated_by")
    private String sysUpdatedBy;

    @Column(name = "sys_created_on")
    private String sysCreatedOn;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "preferred_pronoun")
    private String preferredPronoun;

    @Column(name = "legal_name")
    private String legalName;

    @Column(name = "position_type")
    private String positionType;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private LinkValue user;

    @Column(name = "sys_created_by")
    private String sysCreatedBy;

    public EmployeeProfile(String backgroundBanner, String employmentStartDate, String shortBio, String sysModCount,
                           String workMobile, String workPhone, String sysUpdatedOn, String sysTags,
                           String employmentEndDate, String locationType, String number, String sysId,
                           String sysUpdatedBy, String sysCreatedOn, String nickname, String preferredPronoun,
                           String legalName, String positionType, LinkValue user, String sysCreatedBy) {
        this.backgroundBanner = backgroundBanner;
        this.employmentStartDate = employmentStartDate;
        this.shortBio = shortBio;
        this.sysModCount = sysModCount;
        this.workMobile = workMobile;
        this.workPhone = workPhone;
        this.sysUpdatedOn = sysUpdatedOn;
        this.sysTags = sysTags;
        this.employmentEndDate = employmentEndDate;
        this.locationType = locationType;
        this.number = number;
        this.sysId = sysId;
        this.sysUpdatedBy = sysUpdatedBy;
        this.sysCreatedOn = sysCreatedOn;
        this.nickname = nickname;
        this.preferredPronoun = preferredPronoun;
        this.legalName = legalName;
        this.positionType = positionType;
        this.user = user;
        this.sysCreatedBy = sysCreatedBy;
    }

    @Override
    public String toString() {
        return "EmployeeProfile{" +
                "id=" + id +
                ", backgroundBanner='" + backgroundBanner + '\'' +
                ", employmentStartDate='" + employmentStartDate + '\'' +
                ", shortBio='" + shortBio + '\'' +
                ", sysModCount='" + sysModCount + '\'' +
                ", workMobile='" + workMobile + '\'' +
                ", workPhone='" + workPhone + '\'' +
                ", sysUpdatedOn='" + sysUpdatedOn + '\'' +
                ", sysTags='" + sysTags + '\'' +
                ", employmentEndDate='" + employmentEndDate + '\'' +
                ", locationType='" + locationType + '\'' +
                ", number='" + number + '\'' +
                ", sysId='" + sysId + '\'' +
                ", sysUpdatedBy='" + sysUpdatedBy + '\'' +
                ", sysCreatedOn='" + sysCreatedOn + '\'' +
                ", nickname='" + nickname + '\'' +
                ", preferredPronoun='" + preferredPronoun + '\'' +
                ", legalName='" + legalName + '\'' +
                ", positionType='" + positionType + '\'' +
                ", sysCreatedBy='" + sysCreatedBy + '\'' +
                '}';
    }
}