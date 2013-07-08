package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "provider_insurance")
public class ProviderInsurance implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Basic(optional = false)
   @Column(name = "id")
   private Integer id;
   @Basic(optional = false)
   @Column(name = "provider_npi")
   private String providerNpi;
   @Column(name = "insurance_id", nullable = false)
   private Integer insuranceId;
   @JoinColumn(name = "insurance_id", insertable = false, updatable = false)
   @ManyToOne
   private Insurance insurance;
   @Column(name = "pin")
   private String pin;
   @Column(name = "effective_date")
   @Temporal(TemporalType.TIMESTAMP)
   private Date effectiveDate;
   @Column(name = "group_effective_date")
   @Temporal(TemporalType.TIMESTAMP)
   private Date groupEffectiveDate;
   @Column(name = "group_id")
   private String groupId;
   @Basic(optional = false)
   @Column(name = "capitated")
   private boolean capitated;
   @Column(name = "office_code")
   private String officeCode;
   @Column(name = "created")
   @Temporal(TemporalType.TIMESTAMP)
   private Date created;
   @Column(name = "notes")
   private String notes;
   @Column(name = "user_id")
   private Integer userId;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getProviderNpi() {
      return providerNpi;
   }

   public void setProviderNpi(String providerNpi) {
      this.providerNpi = providerNpi;
   }

   public Integer getInsuranceId() {
      return insuranceId;
   }

   public void setInsuranceId(Integer insuranceId) {
      this.insuranceId = insuranceId;
   }

   public Insurance getInsurance() {
      return insurance;
   }

   public void setInsurance(Insurance insurance) {
      this.insurance = insurance;
   }

   public String getPin() {
      return pin;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public Date getEffectiveDate() {
      return effectiveDate;
   }

   public void setEffectiveDate(Date effectiveDate) {
      this.effectiveDate = effectiveDate;
   }

   public Date getGroupEffectiveDate() {
      return groupEffectiveDate;
   }

   public void setGroupEffectiveDate(Date groupEffectiveDate) {
      this.groupEffectiveDate = groupEffectiveDate;
   }

   public String getGroupId() {
      return groupId;
   }

   public void setGroupId(String groupId) {
      this.groupId = groupId;
   }

   public boolean getCapitated() {
      return capitated;
   }

   public void setCapitated(boolean capitated) {
      this.capitated = capitated;
   }

   public String getOfficeCode() {
      return officeCode;
   }

   public void setOfficeCode(String officeCode) {
      this.officeCode = officeCode;
   }

   public Date getCreated() {
      return created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public Integer getUserId() {
      return userId;
   }

   public void setUserId(Integer userId) {
      this.userId = userId;
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
      if (!(object instanceof ProviderInsurance)) {
         return false;
      }
      ProviderInsurance other = (ProviderInsurance) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.medicalcare.domain.medenterprise.ProviderInsurance[id=" + id + "]";
   }
}