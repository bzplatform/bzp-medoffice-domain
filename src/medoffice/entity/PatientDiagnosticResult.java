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
@Table(name = "patient_diagnostic_result")
public class PatientDiagnosticResult implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Basic(optional = false)
   @Column(name = "id")
   private Integer id;
   @Basic(optional = false)
   @Column(name = "patient_id")
   private int patientId;
   @Column(name = "my_office_code")
   private String myOfficeCode;
   @JoinColumn(name = "facility_id")
   @ManyToOne
   private ReferralFacility facility;
   @JoinColumn(name = "specialty_id")
   @ManyToOne
   private Specialty specialty;
   @JoinColumn(name = "category_id")
   @ManyToOne
   private DiagnosticResultCategory category;
   @JoinColumn(name = "referral_id")
   @ManyToOne
   private Referral referral;
   @JoinColumn(name = "provider_id")
   @ManyToOne
   private Provider provider;
   @JoinColumn(name = "office_provider_id")
   @ManyToOne
   private OfficeProvider officeProvider;
   @JoinColumn(name = "procedure_id")
   @ManyToOne
   private ReferralProcedure procedure;
   @Column(name = "service_date")
   @Temporal(TemporalType.DATE)
   private Date serviceDate;
   @Basic(optional = false)
   @Column(name = "created")
   @Temporal(TemporalType.TIMESTAMP)
   private Date created;
   @Column(name = "created_user_id")
   private Integer createdUserId;
   @Basic(optional = false)
   @Column(name = "last_updated")
   @Temporal(TemporalType.TIMESTAMP)
   private Date lastUpdated;
   @Column(name = "last_updated_user_id")
   private Integer lastUpdatedUserId;
   @Column(name = "notes")
   private String notes;   

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

   public String getMyOfficeCode() {
      return myOfficeCode;
   }

   public void setMyOfficeCode(String myOfficeCode) {
      this.myOfficeCode = myOfficeCode;
   }

   public ReferralFacility getFacility() {
      return facility;
   }

   public void setFacility(ReferralFacility facility) {
      this.facility = facility;
   }

   public Specialty getSpecialty() {
      return specialty;
   }

   public void setSpecialty(Specialty specialty) {
      this.specialty = specialty;
   }

   public DiagnosticResultCategory getCategory() {
      return category;
   }

   public void setCategory(DiagnosticResultCategory category) {
      this.category = category;
   }

   public Referral getReferral() {
      return referral;
   }

   public void setReferral(Referral referral) {
      this.referral = referral;
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

   public ReferralProcedure getProcedure() {
      return procedure;
   }

   public void setProcedure(ReferralProcedure procedure) {
      this.procedure = procedure;
   }

   public Date getServiceDate() {
      return serviceDate;
   }

   public void setServiceDate(Date serviceDate) {
      this.serviceDate = serviceDate;
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

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
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
      if (!(object instanceof PatientDiagnosticResult)) {
         return false;
      }
      PatientDiagnosticResult other = (PatientDiagnosticResult) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.medicalcare.domain.referral.ReferralResult[id=" + id + "]";
   }
}