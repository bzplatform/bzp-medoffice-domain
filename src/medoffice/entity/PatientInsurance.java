package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "patient_insurance")
public class PatientInsurance implements Serializable {
   @Id
   @Column(name = "id", nullable = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @JoinColumn(name = "patient_id", nullable = false)
   @ManyToOne
   private Patient patient;
   @JoinColumn(name = "insurance_id")
   @ManyToOne
   private Insurance insurance;
   @Column(name = "group_id")
   private String groupId;
   @Column(name = "member_id")
   private String memberId;
   @Column(name = "effectiveDate")
   @Temporal(TemporalType.TIMESTAMP)
   private Date effectiveDate;
   @Column(name = "expiredDate")
   @Temporal(TemporalType.TIMESTAMP)
   private Date expirationDate;
   @Column(name = "relationToGuarantor")
   private Character relationToGuarantor;
   @JoinColumn(name = "guarantor_id")
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
   private Guarantor guarantor;
   @Column(name = "copay")
   private Float copay;
   @Column(name = "specialist_copay")
   private Float specialistCopay;
   @Column(name = "deductible")
   private Float deductible;
   @Column(name = "account_index", nullable = false)
   private short accountIndex;
   @Column(name = "pcp_npi")
   private String pcpNpi;
   @Column(name = "active", nullable = false)
   private boolean active;
   @Column(name = "notes")
   private String notes;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Patient getPatient() {
      return patient;
   }

   public void setPatient(Patient patient) {
      this.patient = patient;
   }

   public Insurance getInsurance() {
      return insurance;
   }

   public void setInsurance(Insurance insurance) {
      this.insurance = insurance;
   }

   public String getGroupId() {
      return groupId;
   }

   public void setGroupId(String groupId) {
      this.groupId = groupId;
   }

   public String getMemberId() {
      return memberId;
   }

   public void setMemberId(String memberId) {
      this.memberId = memberId;
   }

   public Date getEffectiveDate() {
      return effectiveDate;
   }

   public void setEffectiveDate(Date effectiveDate) {
      this.effectiveDate = effectiveDate;
   }

   public Date getExpirationDate() {
      return expirationDate;
   }

   public void setExpirationDate(Date expirationDate) {
      this.expirationDate = expirationDate;
   }

   public Character getRelationToGuarantor() {
      return relationToGuarantor;
   }

   public void setRelationToGuarantor(Character relationToGuarantor) {
      this.relationToGuarantor = relationToGuarantor;
   }

   public Guarantor getGuarantor() {
      return guarantor;
   }

   public void setGuarantor(Guarantor guarantor) {
      this.guarantor = guarantor;
   }

   public Float getCopay() {
      return copay;
   }

   public void setCopay(Float copay) {
      this.copay = copay;
   }

   public Float getSpecialistCopay() {
      return specialistCopay;
   }

   public void setSpecialistCopay(Float specialistCopay) {
      this.specialistCopay = specialistCopay;
   }

   public Float getDeductible() {
      return deductible;
   }

   public void setDeductible(Float deductible) {
      this.deductible = deductible;
   }

   public short getAccountIndex() {
      return accountIndex;
   }

   public void setAccountIndex(short accountIndex) {
      this.accountIndex = accountIndex;
   }

   public String getPcpNpi() {
      return pcpNpi;
   }

   public void setPcpNpi(String pcpNpi) {
      this.pcpNpi = pcpNpi;
   }

   public boolean isActive() {
      return active;
   }

   public void setActive(boolean active) {
      this.active = active;
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
      hash += (this.id != null ? this.id.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof PatientInsurance)) {
         return false;
      }
      PatientInsurance other = (PatientInsurance) object;
      if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.app.patientservice.persistence.PatientInsurance[id=" + id + "]";
   }
}