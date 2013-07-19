package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "guarantor")
  public class Guarantor implements Serializable {

  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "last_name", nullable = false)
  private String lastName;

  @Column(name = "first_name", nullable = false)
  private String firstName;

  @Column(name = "middle_initial")
  private Character middleInitial;

  @Column(name = "sex")
  private Character sex;

  @Column(name = "birth_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date birthDate;

  @Column(name = "ssn")
  private String ssn;

  @Column(name = "address")
  private String address;

  @Column(name = "city")
  private String city;

  @Column(name = "state")
  private String state;

  @Column(name = "zip_code")
  private String zipCode;

  @Column(name = "email")
  private String email;

  @Column(name = "home_phone")
  private String homePhone;

  @Column(name = "emergency_phone")
  private String emergencyPhone;

  @Column(name = "company")
  private String company;

  @Column(name = "work_phone")
  private String workPhone;

  @Column(name = "work_phone_ext")
  private String workPhoneExt;

  @Column(name = "work_address")
  private String workAddress;

  @Column(name = "work_city")
  private String workCity;

  @Column(name = "work_state")
  private String workState;

  @Column(name = "work_zip_code")
  private String workZipCode;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public Character getMiddleInitial() {
      return middleInitial;
   }

   public void setMiddleInitial(Character middleInitial) {
      this.middleInitial = middleInitial;
   }

   public Character getSex() {
      return sex;
   }

   public void setSex(Character sex) {
      this.sex = sex;
   }

   public Date getBirthDate() {
      return birthDate;
   }

   public void setBirthDate(Date birthDate) {
      this.birthDate = birthDate;
   }

   public String getSsn() {
      return ssn;
   }

   public void setSsn(String ssn) {
      this.ssn = ssn;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   public String getZipCode() {
      return zipCode;
   }

   public void setZipCode(String zipCode) {
      this.zipCode = zipCode;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getHomePhone() {
      return homePhone;
   }

   public void setHomePhone(String homePhone) {
      this.homePhone = homePhone;
   }

   public String getEmergencyPhone() {
      return emergencyPhone;
   }

   public void setEmergencyPhone(String emergencyPhone) {
      this.emergencyPhone = emergencyPhone;
   }

   public String getCompany() {
      return company;
   }

   public void setCompany(String company) {
      this.company = company;
   }

   public String getWorkPhone() {
      return workPhone;
   }

   public void setWorkPhone(String workPhone) {
      this.workPhone = workPhone;
   }

   public String getWorkPhoneExt() {
      return workPhoneExt;
   }

   public void setWorkPhoneExt(String workPhoneExt) {
      this.workPhoneExt = workPhoneExt;
   }

   public String getWorkAddress() {
      return workAddress;
   }

   public void setWorkAddress(String workAddress) {
      this.workAddress = workAddress;
   }

   public String getWorkCity() {
      return workCity;
   }

   public void setWorkCity(String workCity) {
      this.workCity = workCity;
   }

   public String getWorkState() {
      return workState;
   }

   public void setWorkState(String workState) {
      this.workState = workState;
   }

   public String getWorkZipCode() {
      return workZipCode;
   }

   public void setWorkZipCode(String workZipCode) {
      this.workZipCode = workZipCode;
   }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (this.id != null ? this.id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Guarantor)) {
      return false;
    }
    Guarantor other = (Guarantor)object;
    if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) return false;
    return true;
  }

  @Override
  public String toString() {
    return "medoffice.entity.Guarantor[id=" + id + "]";
  }
}