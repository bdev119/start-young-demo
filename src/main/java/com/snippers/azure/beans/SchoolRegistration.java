package com.snippers.azure.beans;

import com.snippers.azure.utils.CommonUtils;

public class SchoolRegistration{
    private String userId;
    private String password;
    private String schoolName;
    private Address schoolAddress;
    private String schoolEmail;
    private String schoolPhone;
    private String schoolDescription;
    private String estalishedDate;
    private String registrationDate;
    private String countryOfRegistration;
    private String referralId;
    private IndividualContact firstContact;
    private IndividualContact secondContact;
    private Long childrenCount;
    private CommonUtils.HelpType helpType;
    private Long childrenInNeedCount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Address getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(Address schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }

    public String getSchoolPhone() {
        return schoolPhone;
    }

    public void setSchoolPhone(String schoolPhone) {
        this.schoolPhone = schoolPhone;
    }

    public String getSchoolDescription() {
        return schoolDescription;
    }

    public void setSchoolDescription(String schoolDescription) {
        this.schoolDescription = schoolDescription;
    }

    public String getEstalishedDate() {
        return estalishedDate;
    }

    public void setEstalishedDate(String estalishedDate) {
        this.estalishedDate = estalishedDate;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCountryOfRegistration() {
        return countryOfRegistration;
    }

    public void setCountryOfRegistration(String countryOfRegistration) {
        this.countryOfRegistration = countryOfRegistration;
    }

    public String getReferralId() {
        return referralId;
    }

    public void setReferralId(String referralId) {
        this.referralId = referralId;
    }

    public IndividualContact getFirstContact() {
        return firstContact;
    }

    public void setFirstContact(IndividualContact firstContact) {
        this.firstContact = firstContact;
    }

    public IndividualContact getSecondContact() {
        return secondContact;
    }

    public void setSecondContact(IndividualContact secondContact) {
        this.secondContact = secondContact;
    }

    public Long getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(Long childrenCount) {
        this.childrenCount = childrenCount;
    }

    public CommonUtils.HelpType getHelpType() {
        return helpType;
    }

    public void setHelpType(CommonUtils.HelpType helpType) {
        this.helpType = helpType;
    }

    public Long getChildrenInNeedCount() {
        return childrenInNeedCount;
    }

    public void setChildrenInNeedCount(Long childrenInNeedCount) {
        this.childrenInNeedCount = childrenInNeedCount;
    }
}
