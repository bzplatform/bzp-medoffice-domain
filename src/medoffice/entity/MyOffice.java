package medoffice.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "myoffice")
public class MyOffice implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "code")
   private String code;
   @Basic(optional = false)
   @Column(name = "name")
   private String name;
   @Column(name = "phone")
   private String phone;
   @Column(name = "phone_ext")
   private String phoneExt;
   @Column(name = "email")
   private String email;
   @Column(name = "contact")
   private String contact;
   @Column(name = "address")
   private String address;
   @Column(name = "city")
   private String city;
   @Column(name = "state")
   private String state;
   @Column(name = "zip_code")
   private String zipCode;

   public MyOffice() {
   }

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getPhoneExt() {
      return phoneExt;
   }

   public void setPhoneExt(String phoneExt) {
      this.phoneExt = phoneExt;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getContact() {
      return contact;
   }

   public void setContact(String contact) {
      this.contact = contact;
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
      hash += (code != null ? code.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof MyOffice)) {
         return false;
      }
      MyOffice other = (MyOffice) object;
      if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.MyOffice[code=" + code + "]";
   }
}