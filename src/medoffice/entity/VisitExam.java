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
@Table(name = "visit_exam")
public class VisitExam implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "visit_id")
   private Integer visitId;
   @JoinColumn(name = "visit_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private Visit visit;
   @Column(name = "ba_head")
   private String baHead;
   @Column(name = "ba_chest")
   private String baChest;
   @Column(name = "ba_abdomen")
   private String baAbdomen;
   @Column(name = "ba_neck")
   private String baNeck;
   @Column(name = "ba_back")
   private String baBack;
   @Column(name = "ba_genitalia_groin_buttocks")
   private String baGenitaliaGroinButtocks;
   @Column(name = "ba_each_extremity")
   private String baEachExtremity;
   @Column(name = "os_constitutional")
   private String osConstitutional;
   @Column(name = "os_eyes")
   private String osEyes;
   @Column(name = "os_ears_nose_mouth_and_throat")
   private String osEarsNoseMouthThroat;
   @Column(name = "os_cardiovascular")
   private String osCardiovascular;
   @Column(name = "os_respiratory")
   private String osRespiratory;
   @Column(name = "os_gastrointestinal")
   private String osGastrointestinal;
   @Column(name = "os_genitourinary")
   private String osGenitourinary;
   @Column(name = "os_musculoskeletal")
   private String osMusculoskeletal;
   @Column(name = "os_skin")
   private String osSkin;
   @Column(name = "os_neurological")
   private String osNeurological;
   @Column(name = "os_psychiatric")
   private String osPsychiatric;
   @Column(name = "os_hematologic_lymphatic_immunologic")
   private String osHematologicLymphaticImmunologic;
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

   public boolean emptyData() {
      return (getExamStats().total == 0);
   }

   public Stats getExamStats() {
      Stats stats = new Stats();
      checkField(baHead, stats, 12);
      checkField(baChest, stats, 12);
      checkField(baAbdomen, stats, 12);
      checkField(baNeck, stats, 12);
      checkField(baBack, stats, 12);
      checkField(baGenitaliaGroinButtocks, stats, 12);
      checkField(baEachExtremity, stats, 12);
      checkField(osConstitutional, stats, 12, visit.getVitalsEmpty() ? 0 : visit.getVitals().bulletsFilled());
      checkField(osEyes, stats, 9);
      checkField(osEarsNoseMouthThroat, stats, 12);
      checkField(osCardiovascular, stats, 12);
      checkField(osRespiratory, stats, 12);
      checkField(osGastrointestinal, stats, 12);
      checkField(osGenitourinary, stats, 12);
      checkField(osMusculoskeletal, stats, 12);
      checkField(osSkin, stats, 12);
      checkField(osNeurological, stats, 12);
      checkField(osPsychiatric, stats, 9);
      checkField(osHematologicLymphaticImmunologic, stats, 12);
      if (stats.total == 0) {
         stats.level = "None";
      } else if (stats.total >= 1 && stats.total <= 5) {
         stats.level = "Problem Focused";
      } else if (stats.total >= 6) {
         if (stats.area2bNumber >= 9) {
            stats.level = "Comprehensive";
         } else if (stats.area2bNumber >= 6 || stats.area2bNumber >= 2) {
            stats.level = "Detailed";
         } else {
            stats.level = "Expanded Problem Focused";
         }
      }
      return stats;
   }

   public class Stats {

      int total = 0;
      int areaNumber = 0;
      int area2bNumber = 0;
      int area12bNumber = 0;
      String level;
   }

   private void checkField(String field, Stats stats, int area12bTreshold) {
      checkField(field, stats, area12bTreshold, 0);
   }

   private void checkField(String field, Stats stats, int area12bTreshold, int totalInit) {
      if (field == null || field.trim().isEmpty()) {
         return;
      }
      String[] components = field.split("[\\.;]+");
      int total = totalInit;
      for (String component : components) {
         if (!component.trim().isEmpty()) {
            total++;
         }
      }
      stats.total += total;
      if (total >= 1) {
         stats.areaNumber++;
      }
      if (total >= 2) {
         stats.area2bNumber++;
      }
      if (total >= area12bTreshold) {
         stats.area12bNumber++;
      }
   }

   public String getBaHead() {
      return baHead;
   }

   public void setBaHead(String baHead) {
      this.baHead = baHead;
   }

   public String getBaChest() {
      return baChest;
   }

   public void setBaChest(String baChest) {
      this.baChest = baChest;
   }

   public String getBaAbdomen() {
      return baAbdomen;
   }

   public void setBaAbdomen(String baAbdomen) {
      this.baAbdomen = baAbdomen;
   }

   public String getBaNeck() {
      return baNeck;
   }

   public void setBaNeck(String baNeck) {
      this.baNeck = baNeck;
   }

   public String getBaBack() {
      return baBack;
   }

   public void setBaBack(String baBack) {
      this.baBack = baBack;
   }

   public String getBaGenitaliaGroinButtocks() {
      return baGenitaliaGroinButtocks;
   }

   public void setBaGenitaliaGroinButtocks(String baGenitaliaGroinButtocks) {
      this.baGenitaliaGroinButtocks = baGenitaliaGroinButtocks;
   }

   public String getBaEachExtremity() {
      return baEachExtremity;
   }

   public void setBaEachExtremity(String baEachExtremity) {
      this.baEachExtremity = baEachExtremity;
   }

   public String getOsConstitutional() {
      return osConstitutional;
   }

   public void setOsConstitutional(String osConstitutional) {
      this.osConstitutional = osConstitutional;
   }

   public String getOsEyes() {
      return osEyes;
   }

   public void setOsEyes(String osEyes) {
      this.osEyes = osEyes;
   }

   public String getOsEarsNoseMouthThroat() {
      return osEarsNoseMouthThroat;
   }

   public void setOsEarsNoseMouthThroat(String osEarsNoseMouthThroat) {
      this.osEarsNoseMouthThroat = osEarsNoseMouthThroat;
   }

   public String getOsCardiovascular() {
      return osCardiovascular;
   }

   public void setOsCardiovascular(String osCardiovascular) {
      this.osCardiovascular = osCardiovascular;
   }

   public String getOsRespiratory() {
      return osRespiratory;
   }

   public void setOsRespiratory(String osRespiratory) {
      this.osRespiratory = osRespiratory;
   }

   public String getOsGastrointestinal() {
      return osGastrointestinal;
   }

   public void setOsGastrointestinal(String osGastrointestinal) {
      this.osGastrointestinal = osGastrointestinal;
   }

   public String getOsGenitourinary() {
      return osGenitourinary;
   }

   public void setOsGenitourinary(String osGenitourinary) {
      this.osGenitourinary = osGenitourinary;
   }

   public String getOsMusculoskeletal() {
      return osMusculoskeletal;
   }

   public void setOsMusculoskeletal(String osMusculoskeletal) {
      this.osMusculoskeletal = osMusculoskeletal;
   }

   public String getOsSkin() {
      return osSkin;
   }

   public void setOsSkin(String osSkin) {
      this.osSkin = osSkin;
   }

   public String getOsNeurological() {
      return osNeurological;
   }

   public void setOsNeurological(String osNeurological) {
      this.osNeurological = osNeurological;
   }

   public String getOsPsychiatric() {
      return osPsychiatric;
   }

   public void setOsPsychiatric(String osPsychiatric) {
      this.osPsychiatric = osPsychiatric;
   }

   public String getOsHematologicLymphaticImmunologic() {
      return osHematologicLymphaticImmunologic;
   }

   public void setOsHematologicLymphaticImmunologic(String osHematologicLymphaticImmunologic) {
      this.osHematologicLymphaticImmunologic = osHematologicLymphaticImmunologic;
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
      if (!(object instanceof VisitExam)) {
         return false;
      }
      VisitExam other = (VisitExam) object;
      if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.VisitExam[visitId=" + visitId + "]";
   }
}