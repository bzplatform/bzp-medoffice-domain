package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "patient_past_medical_history")
public class PatientPastMedicalHistory implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;
   @Column(name = "patient_id")
   private Integer patientId;
   @JoinColumn(name = "patient_id", nullable = false, insertable = false, updatable = false)
   @ManyToOne
   private Patient patient;
   @Column(name = "created")
   @Temporal(TemporalType.TIMESTAMP)
   private Date created;
   @Column(name = "type")
   private String type;
   @Column(name = "coding_schema")
   private String codingSchema;
   @Column(name = "code")
   private String code;
   @Column(name = "onset")
   private String onset;
   @Column(name = "description")
   private String description;
   @Column(name = "abnormal")
   private Boolean abnormal;   
   @Column(name = "user_id")
   private Integer userId;
   @Column(name = "last_updated_user_id")
   private Integer lastUpdatedUserId;
   @Column(name = "last_updated")
   @Temporal(TemporalType.TIMESTAMP)
   private Date lastUpdated;
   @Column(name = "archive")
   private Boolean archive;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Integer getPatientId() {
      return patientId;
   }

   public void setPatientId(Integer patientId) {
      this.patientId = patientId;
   }

   public Patient getPatient() {
      return patient;
   }

   public void setPatient(Patient patient) {
      this.patient = patient;
   }

   public Date getCreated() {
      return created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getCodingSchema() {
      return codingSchema;
   }

   public void setCodingSchema(String codingSchema) {
      this.codingSchema = codingSchema;
   }

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getOnset() {
      return onset;
   }

   public void setOnset(String onset) {
      this.onset = onset;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Boolean getAbnormal() {
      return abnormal;
   }

   public void setAbnormal(Boolean abnormal) {
      this.abnormal = abnormal;
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

   public Boolean getArchive() {
      return archive;
   }

   public void setArchive(Boolean archive) {
      this.archive = archive;
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
      if (!(object instanceof PatientPastMedicalHistory)) {
         return false;
      }
      PatientPastMedicalHistory other = (PatientPastMedicalHistory) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.PatientPastMedicalHistory[id=" + id + "]";
   }
}