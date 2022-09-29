package com.snippers.azure.mapper;

import com.snippers.azure.beans.Address;
import com.snippers.azure.beans.IndividualContact;
import com.snippers.azure.beans.SchoolRegistration;
import com.snippers.azure.model.School_Registration;
import org.springframework.stereotype.Component;

@Component
public class SchoolRegistrationMapper {
    public School_Registration mapToSchoolRegistrationModel(SchoolRegistration schoolRegistration){
        School_Registration school_registration = new School_Registration();
        school_registration.setUserId(schoolRegistration.getUserId());
        school_registration.setCountryOfRegistration(schoolRegistration.getCountryOfRegistration());
        school_registration.setSchoolEmail(schoolRegistration.getSchoolEmail());
        school_registration.setSchoolPhone(schoolRegistration.getSchoolPhone());
        school_registration.setSchoolName(schoolRegistration.getSchoolName());
        school_registration.setChildrenCount(schoolRegistration.getChildrenCount());
        school_registration.setChildrenInNeedCount(schoolRegistration.getChildrenInNeedCount());
        school_registration.setEstalishedDate(schoolRegistration.getEstalishedDate());
        school_registration.setHelpType(schoolRegistration.getHelpType().toString());
        school_registration.setReferralId(schoolRegistration.getReferralId());
        school_registration.setRegistrationDate(schoolRegistration.getRegistrationDate());
        school_registration.setSchoolDescription(schoolRegistration.getSchoolDescription());

        Address address = schoolRegistration.getSchoolAddress();
        school_registration.setCountry(address.getCountry());
        school_registration.setAddressLine1(address.getAddressLine1());
        school_registration.setAddressLine2(address.getAddressLine2());
        school_registration.setAddressLine3(address.getAddressLine3());
        school_registration.setCity(address.getCity());
        school_registration.setPostCode(address.getPostCode());

        IndividualContact firstContact = schoolRegistration.getFirstContact();
        school_registration.setDesignation1(firstContact.getDesignation());
        school_registration.setFirstName1(firstContact.getFirstName());
        school_registration.setMiddleName1(firstContact.getMiddleName());
        school_registration.setLastName1(firstContact.getLastName());
        school_registration.setTitle1(firstContact.getTitle());
        school_registration.setEmail1(firstContact.getEmail());
        school_registration.setPhoneNumber1(firstContact.getPhoneNumber());

        IndividualContact secondContact = schoolRegistration.getSecondContact();
        school_registration.setDesignation2(secondContact.getDesignation());
        school_registration.setFirstName2(secondContact.getFirstName());
        school_registration.setMiddleName2(secondContact.getMiddleName());
        school_registration.setLastName2(secondContact.getLastName());
        school_registration.setTitle2(secondContact.getTitle());
        school_registration.setEmail2(secondContact.getEmail());
        school_registration.setPhoneNumber2(secondContact.getPhoneNumber());

        return school_registration;
    }
}
