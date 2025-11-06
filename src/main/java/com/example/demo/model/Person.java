package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "persons")
public class Person {
    @Id
    @Column(name = "person_id_external", nullable = false, length = 64)
    private String personIdExternal;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "last_modified_on")
    private String lastModifiedOn;

    @Column(name = "last_modified_date_time")
    private String lastModifiedDateTime;

    @Column(name = "date_of_death")
    private String dateOfDeath;

    @Column(name = "created_on")
    private String createdOn;

    @Column(name = "country_of_birth")
    private String countryOfBirth;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date_time")
    private String createdDateTime;

    @Column(name = "last_modified_by")
    private String lastModifiedBy;

    @Column(name = "person_id")
    private String personId;

    public Person() {}

    @Override
    public String toString() {
        return "Person{" +
                "personIdExternal='" + personIdExternal + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", lastModifiedOn='" + lastModifiedOn + '\'' +
                ", lastModifiedDateTime='" + lastModifiedDateTime + '\'' +
                ", dateOfDeath='" + dateOfDeath + '\'' +
                ", createdOn='" + createdOn + '\'' +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDateTime='" + createdDateTime + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", personId='" + personId + '\'' +
                '}';
    }
}
