package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "patient_record_log")
public class PatientRecordLog implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @Column(name = "datetime")
   @Temporal(TemporalType.TIMESTAMP)
   private Date datetime;
   @Column(name = "user_id")
   private Integer userId;
   @Column(name = "patient_id")
   private Integer patientId;
   @Column(name = "source")
   private String source;
   @Column(name = "source_record_id")
   private Integer sourceRecordId;
   @Column(name = "event")
   private String event;
   @Column(name = "application")
   private String application;
   @Column(name = "office_code")
   private String officeCode;
   @Column(name = "log_")
   private String log;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Date getDatetime() {
      return datetime;
   }

   public void setDatetime(Date datetime) {
      this.datetime = datetime;
   }

   public Integer getUserId() {
      return userId;
   }

   public void setUserId(Integer userId) {
      this.userId = userId;
   }

   public Integer getPatientId() {
      return patientId;
   }

   public void setPatientId(Integer patientId) {
      this.patientId = patientId;
   }

   public String getSource() {
      return source;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public Integer getSourceRecordId() {
      return sourceRecordId;
   }

   public void setSourceRecordId(Integer sourceRecordId) {
      this.sourceRecordId = sourceRecordId;
   }

   public String getEvent() {
      return event;
   }

   public void setEvent(String event) {
      this.event = event;
   }

   public String getApplication() {
      return application;
   }

   public void setApplication(String application) {
      this.application = application;
   }

   public String getOfficeCode() {
      return officeCode;
   }

   public void setOfficeCode(String officeCode) {
      this.officeCode = officeCode;
   }

   public String getLog() {
      return log;
   }

   public void setLog(String log) {
      this.log = log;
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
      if (!(object instanceof PatientRecordLog)) {
         return false;
      }
      PatientRecordLog other = (PatientRecordLog) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.medicalcare.domain.medenterprise.PatientRecordLog[id=" + id + "]";
   }
}