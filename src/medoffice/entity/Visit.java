package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import org.eclipse.persistence.annotations.PrivateOwned;

@Entity
@Table(name = "visit")
public class Visit implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private Integer id;
   @JoinColumn(name = "patient_id", nullable = false)
   @ManyToOne(cascade = CascadeType.REFRESH)
   private Patient patient;
   @Column(name = "specialty_id")
   private Integer specialtyId;
   @JoinColumn(name = "office_provider_id", nullable = false)
   @ManyToOne
   private OfficeProvider officeProvider;
   @PrivateOwned
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "visit")
   private List<VisitPayment> paymentList;
   @PrivateOwned
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "visit")
//   @OrderBy("id ASC")
   @OrderColumn(name="position")
   private List<VisitProcedure> procedureList;
   @ManyToMany
   @JoinTable(name = "visit_diagnosis",
   joinColumns =
   @JoinColumn(name = "id"),
   inverseJoinColumns =
   @JoinColumn(name = "code", referencedColumnName = "code"))
   @OrderColumn(name="position")
   private List<Diagnosis> diagnosisList;
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "visit")
   @OrderColumn(name="position")
   private List<VisitDiagnosis> visitDiagnosisList;
   @Column(name = "date")
   @Temporal(TemporalType.TIMESTAMP)
   private Date date;
   @Column(name = "time")
   @Temporal(TemporalType.TIMESTAMP)
   private Date time;
   @Column(name = "user_id")
   private Integer userId;
   @Column(name = "appointment_id")
   private Integer appointmentId;
   @Column(name = "status")
   private String status;
   @Column(name = "category_code")
   private String categoryCode;
   @JoinColumn(name = "category_code", updatable = false, insertable = false)
   @ManyToOne
   private VisitCategory category;   
   @Column(name = "referring_provider_npi")
   private String referringProviderNpi;
   @Column(name = "primary_insurance_id")
   private Integer primaryInsuranceId;
   @Column(name = "secondary_insurance_id")
   private Integer secondaryInsuranceId;
   @Column(name = "service_payment_type_id")
   private Integer servicePaymentTypeId;
   @JoinColumn(name = "service_payment_type_id", insertable = false, updatable = false)
   @ManyToOne
   private ServicePaymentType servicePaymentType;
   @Column(name = "duration")
   private Short duration;
   @Column(name = "created")
   @Temporal(TemporalType.TIMESTAMP)
   private Date created;   
   @Column(name = "last_updated")
   @Temporal(TemporalType.TIMESTAMP)
   private Date lastUpdated;
   @Column(name = "authorization_number")
   private String authorizationNumber;
   @Column(name = "notes")
   private String notes;
   @JoinColumn(name = "id", insertable = false, updatable = false)
   @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
   private VisitProgressNote progressNote;
   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
   @JoinColumn(name = "id", insertable = false, updatable = false)
   private VisitVitals vitals;
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "visit")
   private List<PatientMedication> medicationList;

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

   public Integer getSpecialtyId() {
      return specialtyId;
   }

   public void setSpecialtyId(Integer specialtyId) {
      this.specialtyId = specialtyId;
   }

   public OfficeProvider getOfficeProvider() {
      return officeProvider;
   }

   public void setOfficeProvider(OfficeProvider officeProvider) {
      this.officeProvider = officeProvider;
   }

   public List<VisitPayment> getPaymentList() {
      return paymentList;
   }

   public void setPaymentList(List<VisitPayment> paymentList) {
      this.paymentList = paymentList;
   }

   public List<VisitProcedure> getProcedureList() {
      return procedureList;
   }

   public void setProcedureList(List<VisitProcedure> procedureList) {
      this.procedureList = procedureList;
   }

   public List<Diagnosis> getDiagnosisList() {
      return diagnosisList;
   }

   public void setDiagnosisList(List<Diagnosis> diagnosisList) {
      this.diagnosisList = diagnosisList;
   }

   public List<VisitDiagnosis> getVisitDiagnosisList() {
      return visitDiagnosisList;
   }

   public void setVisitDiagnosisList(List<VisitDiagnosis> visitDiagnosisList) {
      this.visitDiagnosisList = visitDiagnosisList;
   }

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public Date getTime() {
      return time;
   }

   public void setTime(Date time) {
      this.time = time;
   }

   public Integer getUserId() {
      return userId;
   }

   public void setUserId(Integer userId) {
      this.userId = userId;
   }

   public Integer getAppointmentId() {
      return appointmentId;
   }

   public void setAppointmentId(Integer appointmentId) {
      this.appointmentId = appointmentId;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getCategoryCode() {
      return categoryCode;
   }

   public void setCategoryCode(String categoryCode) {
      this.categoryCode = categoryCode;
   }

   public VisitCategory getCategory() {
      return category;
   }

   public void setCategory(VisitCategory category) {
      this.category = category;
   }

   public String getReferringProviderNpi() {
      return referringProviderNpi;
   }

   public void setReferringProviderNpi(String referringProviderNpi) {
      this.referringProviderNpi = referringProviderNpi;
   }

   public Integer getPrimaryInsuranceId() {
      return primaryInsuranceId;
   }

   public void setPrimaryInsuranceId(Integer primaryInsuranceId) {
      this.primaryInsuranceId = primaryInsuranceId;
   }

   public Integer getSecondaryInsuranceId() {
      return secondaryInsuranceId;
   }

   public void setSecondaryInsuranceId(Integer secondaryInsuranceId) {
      this.secondaryInsuranceId = secondaryInsuranceId;
   }

   public Integer getServicePaymentTypeId() {
      return servicePaymentTypeId;
   }

   public void setServicePaymentTypeId(Integer servicePaymentTypeId) {
      this.servicePaymentTypeId = servicePaymentTypeId;
   }

   public ServicePaymentType getServicePaymentType() {
      return servicePaymentType;
   }

   public void setServicePaymentType(ServicePaymentType servicePaymentType) {
      this.servicePaymentType = servicePaymentType;
   }

   public Short getDuration() {
      return duration;
   }

   public void setDuration(Short duration) {
      this.duration = duration;
   }

   public Date getCreated() {
      return created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public Date getLastUpdated() {
      return lastUpdated;
   }

   public void setLastUpdated(Date lastUpdated) {
      this.lastUpdated = lastUpdated;
   }

   public String getAuthorizationNumber() {
      return authorizationNumber;
   }

   public void setAuthorizationNumber(String authorizationNumber) {
      this.authorizationNumber = authorizationNumber;
   }

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public VisitProgressNote getProgressNote() {
      if (id == null) {
         return null;
      }
      if (progressNote == null) {
         progressNote = new VisitProgressNote();
         progressNote.setVisitId(id);
         progressNote.setVisit(this);
         progressNote.setPersisted(false);
      }
      return progressNote;
   }

   public void setProgressNote(VisitProgressNote progressNote) {
      this.progressNote = progressNote;
   }

   public VisitVitals getVitals() {
      if (vitals == null) {
         vitals = new VisitVitals();
         vitals.setVisitId(id);
         vitals.setVisit(this);
         vitals.setPersisted(false);
      }
      return vitals;
   }

   public boolean getVitalsEmpty() {
      if (vitals == null) {
         return true;
      }
      return false;
   }

   public void setVitals(VisitVitals vitals) {
      this.vitals = vitals;
   }

   public List<PatientMedication> getMedicationList() {
      return medicationList;
   }

   public void setMedicationList(List<PatientMedication> medicationList) {
      this.medicationList = medicationList;
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
      if (!(object instanceof Visit)) {
         return false;
      }
      Visit other = (Visit) object;
      if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.Visits[visitID=" + id + "]";
   }
}