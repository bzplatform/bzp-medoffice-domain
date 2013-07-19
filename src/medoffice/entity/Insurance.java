package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "insurance")
public class Insurance implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;
   @Basic(optional = false)
   @Column(name = "name")
   private String name;
   @Column(name = "short_name")
   private String shortName;
   @Basic(optional = false)
   @Column(name = "type_code")
   private String typeCode;
   @JoinColumn(name = "type_code", insertable = false, updatable = false)
   @ManyToOne
   private InsuranceType insuranceType;
   @Basic(optional = false)
   @Column(name = "active")
   private boolean active;
   @Column(name = "payer_id")
   private String payerId;
   @Column(name = "plan_type")
   private String planType;
   @Column(name = "web_site")
   private String webSite;
   @Column(name = "address")
   private String address;
   @Column(name = "city")
   private String city;
   @Column(name = "state")
   private String state;
   @Column(name = "zip_code")
   private String zipCode;
   @Column(name = "phone")
   private String phone;
   @Column(name = "email")
   private String email;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getShortName() {
      return shortName;
   }

   public void setShortName(String shortName) {
      this.shortName = shortName;
   }

   public String getTypeCode() {
      return typeCode;
   }

   public void setTypeCode(String typeCode) {
      this.typeCode = typeCode;
   }

   public InsuranceType getInsuranceType() {
      return insuranceType;
   }

   public void setInsuranceType(InsuranceType insuranceType) {
      this.insuranceType = insuranceType;
   }

   public boolean isActive() {
      return active;
   }

   public void setActive(boolean active) {
      this.active = active;
   }

   public String getPayerId() {
      return payerId;
   }

   public void setPayerId(String payerId) {
      this.payerId = payerId;
   }

   public String getPlanType() {
      return planType;
   }

   public void setPlanType(String planType) {
      this.planType = planType;
   }

   public String getWebSite() {
      return webSite;
   }

   public void setWebSite(String webSite) {
      this.webSite = webSite;
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

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (id != null ? id.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof Insurance)) {
         return false;
      }
      Insurance other = (Insurance) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.Insurance[id=" + id + "]";
   }  
}