package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "referring_provider")
public class ReferringProvider implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "npi")
   private String npi;
   @Basic(optional = false)
   @Column(name = "last_name")
   private String lastName;
   @Basic(optional = false)
   @Column(name = "first_name")
   private String firstName;
   @Column(name = "middle_initial")
   private Character middleInitial;
   @Column(name = "suffix")
   private String suffix;
   @Column(name = "state_license_num")
   private String stateLicenseNum;
   @Column(name = "phone")
   private String phone;
   @Column(name = "email")
   private String email;
   @Column(name = "address")
   private String address;
   @Column(name = "city")
   private String city;
   @Column(name = "state")
   private String state;
   @Column(name = "zip_code")
   private String zipCode;

   public String getNpi() {
      return npi;
   }

   public void setNpi(String npi) {
      this.npi = npi;
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

   public String getSuffix() {
      return suffix;
   }

   public void setSuffix(String suffix) {
      this.suffix = suffix;
   }

   public String getStateLicenseNum() {
      return stateLicenseNum;
   }

   public void setStateLicenseNum(String stateLicenseNum) {
      this.stateLicenseNum = stateLicenseNum;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
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

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (npi != null ? npi.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof ReferringProvider)) {
         return false;
      }
      ReferringProvider other = (ReferringProvider) object;
      if ((this.npi == null && other.npi != null) || (this.npi != null && !this.npi.equals(other.npi))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.medicalcare.domain.healthcare.ReferringProvider[code=" + npi + "]";
   }

}
