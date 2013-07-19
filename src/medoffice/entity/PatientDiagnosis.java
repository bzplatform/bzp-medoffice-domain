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
@Table(name = "patient_diagnosis")
public class PatientDiagnosis implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @Column(name = "patient_id")
   private Integer patientId;
   @JoinColumn(name = "patient_id", nullable = false, insertable = false, updatable = false)
   @ManyToOne
   private Patient patient;
   @Column(name = "visit_id")
   private Integer visitId;
   @JoinColumn(name = "code", nullable = false)
   @ManyToOne
   private Diagnosis diagnosis;
   @Column(name = "chronicity")
   private String chronicity;
   @Column(name = "onset")
   private String onset;
   @Column(name = "resolution_date")
   @Temporal(TemporalType.DATE)
   private Date resolutionDate;
   @Column(name = "note")
   private String note;
   @Column(name = "active")
   private boolean active;

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

   public Integer getVisitId() {
      return visitId;
   }

   public void setVisitId(Integer visitId) {
      this.visitId = visitId;
   }

   public Diagnosis getDiagnosis() {
      return diagnosis;
   }

   public void setDiagnosis(Diagnosis diagnosis) {
      this.diagnosis = diagnosis;
   }

   public String getChronicity() {
      return chronicity;
   }

   public void setChronicity(String chronicity) {
      this.chronicity = chronicity;
   }

   public String getOnset() {
      return onset;
   }

   public void setOnset(String onset) {
      this.onset = onset;
   }

   public Date getResolutionDate() {
      return resolutionDate;
   }

   public void setResolutionDate(Date resolutionDate) {
      this.resolutionDate = resolutionDate;
   }

   public String getNote() {
      return note;
   }

   public void setNote(String note) {
      this.note = note;
   }

   public boolean getActive() {
      return active;
   }

   public void setActive(boolean active) {
      this.active = active;
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
      if (!(object instanceof PatientDiagnosis)) {
         return false;
      }
      PatientDiagnosis other = (PatientDiagnosis) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.PatientDiagnosis[id=" + id + "]";
   }
}