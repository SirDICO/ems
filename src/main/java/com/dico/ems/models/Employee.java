package com.dico.ems.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;

    private String firstname;
    private String lastname;
    private String middlename;

    @Formula(value = " concat(lastname,' ', middlename, ' ', firstname) ")
    private String fullName;

    private String residentialAddress;
    private String maritalStatus;
    private String phone;
    private String stateOrigin;
    private String passport;
    private String photo;
    private int DepartmentId;
    private String email;
    private String title;
    private String initials;
    private String fileNumber;
    private String gender;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date dob;

    @ManyToOne
    @JoinColumn(name = "employeetype_id", insertable=false, updatable=false)
    private EmployeeType employeetype;
    private Integer employeetype_id;

    @ManyToOne
    @JoinColumn(name = "nok_id", insertable=false, updatable=false)
    private NextOfKin nextOfKin;
    private Integer nok_id;

    @ManyToOne
    @JoinColumn(name = "appointment_id", insertable=false, updatable=false)
    private Appointment appointment;
    private Integer appointment_id;


    public Integer getEmployeetype_id() {
        return employeetype_id;
    }

    public void setEmployeetype_id(Integer employeetype_id) {
        this.employeetype_id = employeetype_id;
    }

    public Integer getNok_id() {
        return nok_id;
    }

    public void setNok_id(Integer nok_id) {
        this.nok_id = nok_id;
    }

    public Integer getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(Integer appointment_id) {
        this.appointment_id = appointment_id;
    }

    public Integer getSalarystructure_id() {
        return salarystructure_id;
    }

    public void setSalarystructure_id(Integer salarystructure_id) {
        this.salarystructure_id = salarystructure_id;
    }

    @ManyToOne
    @JoinColumn(name = "salarystructure_id", insertable=false, updatable=false)
    private SalaryStructure salaryStructure;
    private Integer salarystructure_id;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStateOrigin() {
        return stateOrigin;
    }

    public void setStateOrigin(String stateOrigin) {
        this.stateOrigin = stateOrigin;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(int departmentId) {
        DepartmentId = departmentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
