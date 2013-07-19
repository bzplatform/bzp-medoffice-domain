package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "visit_treatment")
public class VisitTreatment implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "visit_id")
   private Integer visitId;
   @JoinColumn(name = "visit_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private Visit visit;
   @Column(name = "assessment")
   private String assessment;
   @Column(name = "treatment")
   private String treatment;
   @Column(name = "patient_instruction_education")
   private String patientInstructionEducation;
   @Column(name = "time_total")
   private Integer timeTotal;
   @Column(name = "time_counseling")
   private Integer timeCounseling;
   @Transient
   private boolean persisted = true;

   public Integer getVisitId() {
      return visitId;
   }

   public void setVisitId(Integer visitId) {
      this.visitId = visitId;
   }

   public Visit getVisit() {
      return visit;
   }

   public void setVisit(Visit visit) {
      this.visit = visit;
   }

   public String getAssessment() {
      return assessment;
   }

   public void setAssessment(String assessment) {
      this.assessment = assessment;
   }

   public String getTreatment() {
      return treatment;
   }

   public void setTreatment(String treatment) {
      this.treatment = treatment;
   }

   public String getPatientInstructionEducation() {
      return patientInstructionEducation;
   }

   public void setPatientInstructionEducation(String patientInstructionEducation) {
      this.patientInstructionEducation = patientInstructionEducation;
   }

   public Integer getTimeTotal() {
      return timeTotal;
   }

   public void setTimeTotal(Integer timeTotal) {
      this.timeTotal = timeTotal;
   }

   public Integer getTimeCounseling() {
      return timeCounseling;
   }

   public void setTimeCounseling(Integer timeCounseling) {
      this.timeCounseling = timeCounseling;
   }

   public boolean isPersisted() {
      return persisted;
   }

   public void setPersisted(boolean persisted) {
      this.persisted = persisted;
   }
   
   public boolean emptyData() {
      return (VisitProgressNote.emptyField(assessment) && VisitProgressNote.emptyField(treatment) && VisitProgressNote.emptyField(patientInstructionEducation)
              && VisitProgressNote.emptyField(timeTotal) && VisitProgressNote.emptyField(timeCounseling));
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (visitId != null ? visitId.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof VisitTreatment)) {
         return false;
      }
      VisitTreatment other = (VisitTreatment) object;
      if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.VisitTreatment[visitId=" + visitId + "]";
   }
}