package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pharmacy")
public class Pharmacy implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "ncpdp_provider_id")
   private String ncpdpProviderId;
   @Column(name = "name")
   private String name;
   @Column(name = "npi")
   private String npi;
   @Column(name = "web_site")
   private String webSite;
   @Column(name = "email")
   private String email;
   @Column(name = "phone")
   private String phone;
   @Column(name = "fax")
   private String fax;
   @Column(name = "address")
   private String address;
   @Column(name = "city")
   private String city;
   @Column(name = "state")
   private String state;
   @Column(name = "postal_code")
   private String postalCode;
   @Column(name = "contact")
   private String contact;
   @Column(name = "notes")
   private String notes;

   public String getNcpdpProviderId() {
      return ncpdpProviderId;
   }

   public void setNcpdpProviderId(String ncpdpProviderId) {
      this.ncpdpProviderId = ncpdpProviderId;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getNpi() {
      return npi;
   }

   public void setNpi(String npi) {
      this.npi = npi;
   }

   public String getWebSite() {
      return webSite;
   }

   public void setWebSite(String webSite) {
      this.webSite = webSite;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getFax() {
      return fax;
   }

   public void setFax(String fax) {
      this.fax = fax;
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

   public String getPostalCode() {
      return postalCode;
   }

   public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
   }

   public String getContact() {
      return contact;
   }

   public void setContact(String contact) {
      this.contact = contact;
   }

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (ncpdpProviderId != null ? ncpdpProviderId.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof Pharmacy)) {
         return false;
      }
      Pharmacy other = (Pharmacy) object;
      if ((this.ncpdpProviderId == null && other.ncpdpProviderId != null) || (this.ncpdpProviderId != null && !this.ncpdpProviderId.equals(other.ncpdpProviderId))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.Pharmacy[ncpdpProviderId=" + ncpdpProviderId + "]";
   }
}