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
@Table(name = "patient_medication")
public class PatientMedication implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Basic(optional = false)
   @Column(name = "id")
   private Integer id;
   @Basic(optional = false)
   @Column(name = "patient_id")
   private int patientId;
   @JoinColumn(name = "patient_id", nullable = false, insertable = false, updatable = false)
   @ManyToOne
   private Patient patient;
   @JoinColumn(name = "visit_id")
   @ManyToOne
   private Visit visit;   
   @Column(name = "prev_id")
   private Integer prevId;
   @Column(name = "next_id")
   private Integer nextId;
   @JoinColumn(name = "prescriber_npi")
   @ManyToOne(optional = false)
   private ReferringProvider prescriber;
   @Column(name = "prescribing_date")
   @Temporal(TemporalType.DATE)
   private Date prescribingDate;
   @Column(name = "start_date")
   @Temporal(TemporalType.DATE)
   private Date startDate;
   @Column(name = "primary_diagnosis_code")
   private String primaryDiagnosisCode;
   @Column(name = "drug_code")
   private String drugCode;
   @Column(name = "drug")
   private String drug;
   @Column(name = "tty")
   private String tty;
   @Column(name = "strength")
   private String strength;
   @Column(name = "dose_form")
   private String doseForm;
   @Column(name = "dispense_qty")
   private Integer dispenseQty;
   @Column(name = "refills")
   private Integer refills;
   // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
   @Column(name = "dose")
   private Double dose;
   @Column(name = "dose_unit")
   private String doseUnit;
   @Column(name = "route")
   private String route;
   @Column(name = "frequency")
   private String frequency;
   @Column(name = "days")
   private Integer days;
   @Column(name = "note")
   private String note;
   @Column(name = "warning_overriding_reason")
   private String warningOverridingReason;
   @Column(name = "lot_number")
   private String lotNumber;
   @Column(name = "expiration_date")
   @Temporal(TemporalType.DATE)
   private Date expirationDate;
   @Column(name = "status_date")
   @Temporal(TemporalType.DATE)
   private Date statusDate;
   @Column(name = "[status]")
   private String status;
   @Basic(optional = false)
   @Column(name = "active")
   private boolean active;
   @Column(name = "created")
   @Temporal(TemporalType.TIMESTAMP)
   private Date created;
   @Column(name = "user_id")
   private Integer userId;
   @Column(name = "last_updated_user_id")
   private Integer lastUpdatedUserId;
   @Column(name = "last_updated")
   @Temporal(TemporalType.TIMESTAMP)
   private Date lastUpdated;
   @Column(name = "favorite")
   private boolean favorite;   

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public int getPatientId() {
      return patientId;
   }

   public void setPatientId(int patientId) {
      this.patientId = patientId;
   }

   public Patient getPatient() {
      return patient;
   }

   public void setPatient(Patient patient) {
      this.patient = patient;
   }

   public Visit getVisit() {
      return visit;
   }

   public void setVisit(Visit visit) {
      this.visit = visit;
   }

   public Integer getPrevId() {
      return prevId;
   }

   public void setPrevId(Integer prevId) {
      this.prevId = prevId;
   }

   public Integer getNextId() {
      return nextId;
   }

   public void setNextId(Integer nextId) {
      this.nextId = nextId;
   }

   public ReferringProvider getPrescriber() {
      return prescriber;
   }

   public void setPrescriber(ReferringProvider prescriber) {
      this.prescriber = prescriber;
   }

   public Date getPrescribingDate() {
      return prescribingDate;
   }

   public void setPrescribingDate(Date prescribingDate) {
      this.prescribingDate = prescribingDate;
   }

   public Date getStartDate() {
      return startDate;
   }

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public String getPrimaryDiagnosisCode() {
      return primaryDiagnosisCode;
   }

   public void setPrimaryDiagnosisCode(String primaryDiagnosisCode) {
      this.primaryDiagnosisCode = primaryDiagnosisCode;
   }

   public String getDrugCode() {
      return drugCode;
   }

   public void setDrugCode(String drugCode) {
      this.drugCode = drugCode;
   }

   public String getDrug() {
      return drug;
   }

   public void setDrug(String drug) {
      this.drug = drug;
   }

   public String getTty() {
      return tty;
   }

   public void setTty(String tty) {
      this.tty = tty;
   }

   public String getStrength() {
      return strength;
   }

   public void setStrength(String strength) {
      this.strength = strength;
   }

   public String getDoseForm() {
      return doseForm;
   }

   public void setDoseForm(String doseForm) {
      this.doseForm = doseForm;
   }

   public Integer getDispenseQty() {
      return dispenseQty;
   }

   public void setDispenseQty(Integer dispenseQty) {
      this.dispenseQty = dispenseQty;
   }

   public Integer getRefills() {
      return refills;
   }

   public void setRefills(Integer refills) {
      this.refills = refills;
   }

   public Double getDose() {
      return dose;
   }

   public void setDose(Double dose) {
      this.dose = dose;
   }

   public String getDoseUnit() {
      return doseUnit;
   }

   public void setDoseUnit(String doseUnit) {
      this.doseUnit = doseUnit;
   }

   public String getRoute() {
      return route;
   }

   public void setRoute(String route) {
      this.route = route;
   }

   public String getFrequency() {
      return frequency;
   }

   public void setFrequency(String frequency) {
      this.frequency = frequency;
   }

   public Integer getDays() {
      return days;
   }

   public void setDays(Integer days) {
      this.days = days;
   }

   public String getNote() {
      return note;
   }

   public void setNote(String note) {
      this.note = note;
   }

   public String getWarningOverridingReason() {
      return warningOverridingReason;
   }

   public void setWarningOverridingReason(String warningOverridingReason) {
      this.warningOverridingReason = warningOverridingReason;
   }

   public String getLotNumber() {
      return lotNumber;
   }

   public void setLotNumber(String lotNumber) {
      this.lotNumber = lotNumber;
   }

   public Date getExpirationDate() {
      return expirationDate;
   }

   public void setExpirationDate(Date expirationDate) {
      this.expirationDate = expirationDate;
   }

   public Date getStatusDate() {
      return statusDate;
   }

   public void setStatusDate(Date statusDate) {
      this.statusDate = statusDate;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public boolean getActive() {
      return active;
   }

   public void setActive(boolean active) {
      this.active = active;
   }

   public Date getCreated() {
      return created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public Integer getUserId() {
      return userId;
   }

   public void setUserId(Integer userId) {
      this.userId = userId;
   }

   public Integer getLastUpdatedUserId() {
      return lastUpdatedUserId;
   }

   public void setLastUpdatedUserId(Integer lastUpdatedUserId) {
      this.lastUpdatedUserId = lastUpdatedUserId;
   }

   public Date getLastUpdated() {
      return lastUpdated;
   }

   public void setLastUpdated(Date lastUpdated) {
      this.lastUpdated = lastUpdated;
   }

   public boolean getFavorite() {
      return favorite;
   }

   public void setFavorite(boolean favorite) {
      this.favorite = favorite;
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
      if (!(object instanceof PatientMedication)) {
         return false;
      }
      PatientMedication other = (PatientMedication) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.PatientMedication[id=" + id + "]";
   }  
}