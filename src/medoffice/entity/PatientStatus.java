package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "patient_status")
public class PatientStatus implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "patient_id")
   private Integer patientId;
   @JoinColumn(name = "patient_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private Patient patient;
   @Column(name = "smoking")
   private Boolean smoking;
   @Column(name = "nkda")
   private Boolean nkda;
   @Column(name = "takes_no_medication")
   private Boolean takesNoMedication;
   @Column(name = "exempt_from_reporting")
   private Boolean exemptFromReporting;
   @Column(name = "last_updated_user_id")
   private Integer lastUpdatedUserId;
   @Column(name = "last_updated")
   @Temporal(TemporalType.TIMESTAMP)
   private Date lastUpdated;
   @Transient
   private boolean persisted = true;

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

   public Boolean getSmoking() {
      return smoking;
   }

   public void setSmoking(Boolean smoking) {
      this.smoking = smoking;
   }

   public Boolean getNkda() {
      return nkda;
   }

   public void setNkda(Boolean nkda) {
      this.nkda = nkda;
   }

   public Boolean getTakesNoMedication() {
      return takesNoMedication;
   }

   public void setTakesNoMedication(Boolean takesNoMedication) {
      this.takesNoMedication = takesNoMedication;
   }

   public Boolean getExemptFromReporting() {
      return exemptFromReporting;
   }

   public void setExemptFromReporting(Boolean exemptFromReporting) {
      this.exemptFromReporting = exemptFromReporting;
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

   public boolean isPersisted() {
      return persisted;
   }

   public void setPersisted(boolean persisted) {
      this.persisted = persisted;
   }

   public String getField(String field) {
      try {
         Object valObj = PatientStatus.class.getDeclaredField(field).get(this);
         return valObj == null ? null : valObj.toString();
      } catch (Exception ex) {
         Logger.getLogger(PatientStatus.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (patientId != null ? patientId.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof PatientStatus)) {
         return false;
      }
      PatientStatus other = (PatientStatus) object;
      if ((this.patientId == null && other.patientId != null) || (this.patientId != null && !this.patientId.equals(other.patientId))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.PatientStatus[patientId=" + patientId + "]";
   }
}