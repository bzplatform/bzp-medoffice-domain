package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "appointment")
public class Appointment implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private Integer id;
   @Column(name = "user_id")
   private Integer userId;
   @Column(name = "status")
   private String status;
   @Column(name = "category_id")
   private Integer categoryId;
   @JoinColumn(name = "category_id", nullable = false, insertable = false, updatable = false)
   @ManyToOne(cascade = CascadeType.REFRESH)
   private VisitCategory category;
   @Column(name = "specialty_id")
   private Integer specialtyId;
   @JoinColumn(name = "patient_id", nullable = false)
   @ManyToOne(cascade = CascadeType.REFRESH)
   private Patient patient;
   @JoinColumn(name = "office_provider_id", nullable = false)
   @ManyToOne(cascade = CascadeType.REFRESH)
   private OfficeProvider officeProvider;
   @Column(name = "authorization_number")
   private String authorizationNumber;   
   @Column(name = "date")
   @Temporal(TemporalType.TIMESTAMP)
   private Date date;
   @Column(name = "time")
   @Temporal(TemporalType.TIMESTAMP)
   private Date time;
   @Column(name = "duration")
   private Short duration;
   @Column(name = "cyclical_id")
   private Integer cyclicalId;   
   @Column(name = "created")
   @Temporal(TemporalType.TIMESTAMP)
   private Date created;
   @Column(name = "last_updated")
   @Temporal(TemporalType.TIMESTAMP)
   private Date lastUpdated; 
   @Column(name = "notes")
   private String notes;
   @Column(name = "referring_provider_npi")
   private String referringProviderNpi;   

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Integer getUserId() {
      return userId;
   }

   public void setUserId(Integer userId) {
      this.userId = userId;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public Integer getCategoryId() {
      return categoryId;
   }

   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   public VisitCategory getCategory() {
      return category;
   }

   public void setCategory(VisitCategory category) {
      this.category = category;
   }

   public Integer getSpecialtyId() {
      return specialtyId;
   }

   public void setSpecialtyId(Integer specialtyId) {
      this.specialtyId = specialtyId;
   }

   public Patient getPatient() {
      return patient;
   }

   public void setPatient(Patient patient) {
      this.patient = patient;
   }

   public OfficeProvider getOfficeProvider() {
      return officeProvider;
   }

   public void setOfficeProvider(OfficeProvider officeProvider) {
      this.officeProvider = officeProvider;
   }

   public String getAuthorizationNumber() {
      return authorizationNumber;
   }

   public void setAuthorizationNumber(String authorizationNumber) {
      this.authorizationNumber = authorizationNumber;
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

   public Short getDuration() {
      return duration;
   }

   public void setDuration(Short duration) {
      this.duration = duration;
   }

   public Integer getCyclicalId() {
      return cyclicalId;
   }

   public void setCyclicalId(Integer cyclicalId) {
      this.cyclicalId = cyclicalId;
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

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public String getReferringProviderNpi() {
      return referringProviderNpi;
   }

   public void setReferringProviderNpi(String referringProviderNpi) {
      this.referringProviderNpi = referringProviderNpi;
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
      if (!(object instanceof Appointment)) {
         return false;
      }
      Appointment other = (Appointment) object;
      if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.app.patientservice.persistence.Appointment[id=" + id + "]";
   }
}