package com.example.demo.dto;

public class PersonDto {
    private String personIdExternal;
    private String dateOfBirth;
    private String lastModifiedOn;
    private String lastModifiedDateTime;
    private String dateOfDeath;
    private String createdOn;
    private String countryOfBirth;
    private String createdBy;
    private String createdDateTime;
    private String lastModifiedBy;
    private String personId;

    public PersonDto() {}

    public String getPersonIdExternal() { return personIdExternal; }
    public void setPersonIdExternal(String personIdExternal) { this.personIdExternal = personIdExternal; }

    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getLastModifiedOn() { return lastModifiedOn; }
    public void setLastModifiedOn(String lastModifiedOn) { this.lastModifiedOn = lastModifiedOn; }

    public String getLastModifiedDateTime() { return lastModifiedDateTime; }
    public void setLastModifiedDateTime(String lastModifiedDateTime) { this.lastModifiedDateTime = lastModifiedDateTime; }

    public String getDateOfDeath() { return dateOfDeath; }
    public void setDateOfDeath(String dateOfDeath) { this.dateOfDeath = dateOfDeath; }

    public String getCreatedOn() { return createdOn; }
    public void setCreatedOn(String createdOn) { this.createdOn = createdOn; }

    public String getCountryOfBirth() { return countryOfBirth; }
    public void setCountryOfBirth(String countryOfBirth) { this.countryOfBirth = countryOfBirth; }

    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

    public String getCreatedDateTime() { return createdDateTime; }
    public void setCreatedDateTime(String createdDateTime) { this.createdDateTime = createdDateTime; }

    public String getLastModifiedBy() { return lastModifiedBy; }
    public void setLastModifiedBy(String lastModifiedBy) { this.lastModifiedBy = lastModifiedBy; }

    public String getPersonId() { return personId; }
    public void setPersonId(String personId) { this.personId = personId; }
}
