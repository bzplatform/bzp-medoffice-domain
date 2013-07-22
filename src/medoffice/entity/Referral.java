package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "referral")
public class Referral implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Basic(optional = false)
   @Column(name = "id")
   private Integer id;
   @Basic(optional = false)
   @Column(name = "patient_id")
   private int patientId;
   @JoinColumn(name = "patient_id", insertable = false, updatable = false)
   @ManyToOne
   private Patient patient;
   @JoinColumn(name = "provider_npi")
   @ManyToOne(optional = false)
   private Provider provider;
   @JoinColumn(name = "office_provider_id")
   @ManyToOne
   private OfficeProvider officeProvider;  
   @JoinColumn(name = "facility_id")
   @ManyToOne(optional = false)
   private ReferralFacility facility;
   @Column(name = "specialty_id")
   private Integer specialtyId;
   @Column(name = "status")
   private String status;
   @Basic(optional = false)
   @Column(name = "created")
   @Temporal(TemporalType.TIMESTAMP)
   private Date created;
   @Column(name = "created_user_id")
   private Integer createdUserId;
   @Column(name = "date", insertable = false, updatable = false)
   @Temporal(TemporalType.DATE)
   private Date date;
   @Basic(optional = false)
   @Column(name = "last_updated")
   @Temporal(TemporalType.TIMESTAMP)
   private Date lastUpdated;
   @Column(name = "last_updated_user_id")
   private Integer lastUpdatedUserId;
   @Column(name = "notes")
   private String notes;
   @Column(name = "cancel_reason")
   private String cancelReason;
   @ManyToMany
   @JoinTable(
      name = "referral_referral_diagnosis",
      joinColumns = @JoinColumn(name = "referral_id"),
      inverseJoinColumns = @JoinColumn(name = "code", referencedColumnName = "code")
   )
   private List<Diagnosis> diagnosisList;
   @ManyToMany
   @JoinTable(
      name = "referral_referral_procedure",
      joinColumns = @JoinColumn(name = "referral_id"),
      inverseJoinColumns = @JoinColumn(name = "procedure_id", referencedColumnName = "id")
   )
   private List<ReferralProcedure> procedureList;
   
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

   public Provider getProvider() {
      return provider;
   }

   public void setProvider(Provider provider) {
      this.provider = provider;
   }

   public OfficeProvider getOfficeProvider() {
      return officeProvider;
   }

   public void setOfficeProvider(OfficeProvider officeProvider) {
      this.officeProvider = officeProvider;
   }

   public ReferralFacility getFacility() {
      return facility;
   }

   public void setFacility(ReferralFacility facility) {
      this.facility = facility;
   }

   public Integer getSpecialtyId() {
      return specialtyId;
   }

   public void setSpecialtyId(Integer specialtyId) {
      this.specialtyId = specialtyId;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public Date getCreated() {
      return created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public Integer getCreatedUserId() {
      return createdUserId;
   }

   public void setCreatedUserId(Integer createdUserId) {
      this.createdUserId = createdUserId;
   }

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public Date getLastUpdated() {
      return lastUpdated;
   }

   public void setLastUpdated(Date lastUpdated) {
      this.lastUpdated = lastUpdated;
   }

   public Integer getLastUpdatedUserId() {
      return lastUpdatedUserId;
   }

   public void setLastUpdatedUserId(Integer lastUpdatedUserId) {
      this.lastUpdatedUserId = lastUpdatedUserId;
   }

   public List<Diagnosis> getDiagnosisList() {
      return diagnosisList;
   }

   public void setDiagnosisList(List<Diagnosis> diagnosisList) {
      this.diagnosisList = diagnosisList;
   }

   public List<ReferralProcedure> getProcedureList() {
      return procedureList;
   }

   public void setProcedureList(List<ReferralProcedure> procedureList) {
      this.procedureList = procedureList;
   }

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public String getCancelReason() {
      return cancelReason;
   }

   public void setCancelReason(String cancelReason) {
      this.cancelReason = cancelReason;
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
      if (!(object instanceof Referral)) {
         return false;
      }
      Referral other = (Referral) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.Referral[id=" + id + "]";
   }  
}