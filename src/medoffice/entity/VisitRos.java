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
@Table(name = "visit_ros")
public class VisitRos implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "visit_id")
   private Integer visitId;
   @JoinColumn(name = "visit_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private Visit visit;
   @Column(name = "constitutional_symptoms")
   private String constitutionalSymptoms;
   @Column(name = "eyes")
   private String eyes;
   @Column(name = "ears_nose_mouth_throat")
   private String earsNoseMouthThroat;
   @Column(name = "cardiovascular")
   private String cardiovascular;
   @Column(name = "respiratory")
   private String respiratory;
   @Column(name = "gastrointestinal")
   private String gastrointestinal;
   @Column(name = "genitourinary")
   private String genitourinary;
   @Column(name = "musculoskeletal")
   private String musculoskeletal;
   @Column(name = "integumentary")
   private String integumentary;
   @Column(name = "neurological")
   private String neurological;
   @Column(name = "psychiatric")
   private String psychiatric;
   @Column(name = "endocrine")
   private String endocrine;
   @Column(name = "hematologic_lymphatic")
   private String hematologicLymphatic;
   @Column(name = "allergic_immunologic")
   private String allergicImmunologic;
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

   public int getRosTotal() {
      int rosTotal = 0;
      if (constitutionalSymptoms != null && !constitutionalSymptoms.isEmpty()) {
         rosTotal++;
      }
      if (eyes != null && !eyes.isEmpty()) {
         rosTotal++;
      }
      if (earsNoseMouthThroat != null && !earsNoseMouthThroat.isEmpty()) {
         rosTotal++;
      }
      if (cardiovascular != null && !cardiovascular.isEmpty()) {
         rosTotal++;
      }
      if (respiratory != null && !respiratory.isEmpty()) {
         rosTotal++;
      }
      if (gastrointestinal != null && !gastrointestinal.isEmpty()) {
         rosTotal++;
      }
      if (genitourinary != null && !genitourinary.isEmpty()) {
         rosTotal++;
      }
      if (musculoskeletal != null && !musculoskeletal.isEmpty()) {
         rosTotal++;
      }
      if (integumentary != null && !integumentary.isEmpty()) {
         rosTotal++;
      }
      if (neurological != null && !neurological.isEmpty()) {
         rosTotal++;
      }
      if (psychiatric != null && !psychiatric.isEmpty()) {
         rosTotal++;
      }
      if (endocrine != null && !endocrine.isEmpty()) {
         rosTotal++;
      }
      if (hematologicLymphatic != null && !hematologicLymphatic.isEmpty()) {
         rosTotal++;
      }
      if (allergicImmunologic != null && !allergicImmunologic.isEmpty()) {
         rosTotal++;
      }
      return rosTotal;
   }

   public String getRosLevel() {
      String level = null;
      int total = getRosTotal();
      if (total == 0) {
         level = "None";
      } else if (total == 1) {
         level = "Pertinent to Problem";
      } else if (total >= 2 && total <= 9) {
         level = "Extended";
      } else if (total > 9) {
         level = "Complete";
      }
      return level;
   }

   public boolean emptyData() {
      return getRosTotal() == 0;
   }

   public String getConstitutionalSymptoms() {
      return constitutionalSymptoms;
   }

   public void setConstitutionalSymptoms(String constitutionalSymptoms) {
      this.constitutionalSymptoms = constitutionalSymptoms;
   }

   public String getEyes() {
      return eyes;
   }

   public void setEyes(String eyes) {
      this.eyes = eyes;
   }

   public String getEarsNoseMouthThroat() {
      return earsNoseMouthThroat;
   }

   public void setEarsNoseMouthThroat(String earsNoseMouthThroat) {
      this.earsNoseMouthThroat = earsNoseMouthThroat;
   }

   public String getCardiovascular() {
      return cardiovascular;
   }

   public void setCardiovascular(String cardiovascular) {
      this.cardiovascular = cardiovascular;
   }

   public String getRespiratory() {
      return respiratory;
   }

   public void setRespiratory(String respiratory) {
      this.respiratory = respiratory;
   }

   public String getGastrointestinal() {
      return gastrointestinal;
   }

   public void setGastrointestinal(String gastrointestinal) {
      this.gastrointestinal = gastrointestinal;
   }

   public String getGenitourinary() {
      return genitourinary;
   }

   public void setGenitourinary(String genitourinary) {
      this.genitourinary = genitourinary;
   }

   public String getMusculoskeletal() {
      return musculoskeletal;
   }

   public void setMusculoskeletal(String musculoskeletal) {
      this.musculoskeletal = musculoskeletal;
   }

   public String getIntegumentary() {
      return integumentary;
   }

   public void setIntegumentary(String integumentary) {
      this.integumentary = integumentary;
   }

   public String getNeurological() {
      return neurological;
   }

   public void setNeurological(String neurological) {
      this.neurological = neurological;
   }

   public String getPsychiatric() {
      return psychiatric;
   }

   public void setPsychiatric(String psychiatric) {
      this.psychiatric = psychiatric;
   }

   public String getEndocrine() {
      return endocrine;
   }

   public void setEndocrine(String endocrine) {
      this.endocrine = endocrine;
   }

   public String getHematologicLymphatic() {
      return hematologicLymphatic;
   }

   public void setHematologicLymphatic(String hematologicLymphatic) {
      this.hematologicLymphatic = hematologicLymphatic;
   }

   public String getAllergicImmunologic() {
      return allergicImmunologic;
   }

   public void setAllergicImmunologic(String allergicImmunologic) {
      this.allergicImmunologic = allergicImmunologic;
   }

   public boolean isPersisted() {
      return persisted;
   }

   public void setPersisted(boolean persisted) {
      this.persisted = persisted;
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
      if (!(object instanceof VisitRos)) {
         return false;
      }
      VisitRos other = (VisitRos) object;
      if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.VisitRos[visitId=" + visitId + "]";
   }
}