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
@Table(name = "patient_family_history")
public class PatientFamilyHistory implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;
   @Basic(optional = false)
   @Column(name = "patient_id")
   private int patientId;
   @JoinColumn(name = "patient_id", nullable = false, insertable = false, updatable = false)
   @ManyToOne
   private Patient patient;   
   @Column(name = "created")
   @Temporal(TemporalType.TIMESTAMP)
   private Date created;
   @Column(name = "family_member")
   private String familyMember;
   @Column(name = "coding_schema")
   private String codingSchema;
   @Column(name = "code")
   private String code;   
   @Column(name = "condition")
   private String condition;
   @Column(name = "note")
   private String note;
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

   public Date getCreated() {
      return created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public String getFamilyMember() {
      return familyMember;
   }

   public void setFamilyMember(String familyMember) {
      this.familyMember = familyMember;
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

   public String getCondition() {
      return condition;
   }

   public void setCondition(String condition) {
      this.condition = condition;
   }

   public String getNote() {
      return note;
   }

   public void setNote(String note) {
      this.note = note;
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
      if (!(object instanceof PatientFamilyHistory)) {
         return false;
      }
      PatientFamilyHistory other = (PatientFamilyHistory) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.PatientFamilyHistory[id=" + id + "]";
   }  
}