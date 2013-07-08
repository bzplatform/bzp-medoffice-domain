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
@Table(name = "patient_authorization")
public class PatientAuthorization implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Basic(optional = false)
   @Column(name = "id")
   private Integer id;
   @Column(name = "my_office_code")
   private String myOfficeCode;
   @Basic(optional = false)
   @Column(name = "patient_id")
   private int patientId;
   @Basic(optional = false)
   @Column(name = "number")
   private String number;
   @JoinColumn(name = "insurance_id")
   @ManyToOne
   private Insurance insurance;
   @JoinColumn(name = "specialty_id")
   @ManyToOne
   private Specialty specialty;   
   @JoinColumn(name = "provider_id")
   @ManyToOne
   private Provider provider;
   @JoinColumn(name = "cpt_code")
   @ManyToOne
   private Procedure procedure;
   @Column(name = "start_date")
   @Temporal(TemporalType.DATE)
   private Date startDate;
   @Column(name = "expiration_date")
   @Temporal(TemporalType.DATE)
   private Date expirationDate;
   @Column(name = "count")
   private Short count;
   @Column(name = "used_count")
   private Short usedCount;
   @Column(name = "status")
   private String status;   
   @Column(name = "notes")
   private String notes;
   @Basic(optional = false)
   @Column(name = "created")
   @Temporal(TemporalType.TIMESTAMP)
   private Date created;
   @Basic(optional = false)
   @Column(name = "created_user_id")
   private int createdUserId;
   @Basic(optional = false)
   @Column(name = "last_updated_user_id")
   private int lastUpdatedUserId;
   @Basic(optional = false)
   @Column(name = "last_updated")
   @Temporal(TemporalType.TIMESTAMP)
   private Date lastUpdated;
   
   

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getMyOfficeCode() {
      return myOfficeCode;
   }

   public void setMyOfficeCode(String myOfficeCode) {
      this.myOfficeCode = myOfficeCode;
   }

   public int getPatientId() {
      return patientId;
   }

   public void setPatientId(int patientId) {
      this.patientId = patientId;
   }

   public String getNumber() {
      return number;
   }

   public void setNumber(String number) {
      this.number = number;
   }

   public Insurance getInsurance() {
      return insurance;
   }

   public void setInsurance(Insurance insurance) {
      this.insurance = insurance;
   }

   public Specialty getSpecialty() {
      return specialty;
   }

   public void setSpecialty(Specialty specialty) {
      this.specialty = specialty;
   }

   public Provider getProvider() {
      return provider;
   }

   public void setProvider(Provider provider) {
      this.provider = provider;
   }

   public Procedure getProcedure() {
      return procedure;
   }

   public void setProcedure(Procedure procedure) {
      this.procedure = procedure;
   }

   public Date getStartDate() {
      return startDate;
   }

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public Date getExpirationDate() {
      return expirationDate;
   }

   public void setExpirationDate(Date expirationDate) {
      this.expirationDate = expirationDate;
   }

   public Short getCount() {
      return count;
   }

   public void setCount(Short count) {
      this.count = count;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public Short getUsedCount() {
      return usedCount;
   }

   public void setUsedCount(Short usedCount) {
      this.usedCount = usedCount;
   }

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public Date getCreated() {
      return created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public int getCreatedUserId() {
      return createdUserId;
   }

   public void setCreatedUserId(int createdUserId) {
      this.createdUserId = createdUserId;
   }

   public int getLastUpdatedUserId() {
      return lastUpdatedUserId;
   }

   public void setLastUpdatedUserId(int lastUpdatedUserId) {
      this.lastUpdatedUserId = lastUpdatedUserId;
   }

   public Date getLastUpdated() {
      return lastUpdated;
   }

   public void setLastUpdated(Date lastUpdated) {
      this.lastUpdated = lastUpdated;
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
      if (!(object instanceof PatientAuthorization)) {
         return false;
      }
      PatientAuthorization other = (PatientAuthorization) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.PatientAuthorization[id=" + id + "]";
   }
}