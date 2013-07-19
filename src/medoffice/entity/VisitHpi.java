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
@Table(name = "visit_hpi")
public class VisitHpi implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "visit_id")
   private Integer visitId;
   @JoinColumn(name = "visit_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private Visit visit;
   @Column(name = "location")
   private String location;
   @Column(name = "quality")
   private String quality;
   @Column(name = "severity")
   private Integer severity;
   @Column(name = "duration")
   private String duration;
   @Column(name = "timing")
   private String timing;
   @Column(name = "context")
   private String context;
   @Column(name = "modifying_factors")
   private String modifyingFactors;
   @Column(name = "associated_signs_and_symptoms")
   private String associatedSignsAndSymptoms;
   @Column(name = "radiation")
   private String radiation;
   @Column(name = "free_form_text")
   private String freeFormText;
   
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
      return (getHpiTotal() == 0 && freeFormText == null);
   }

   public int getHpiTotal() {
      int total = 0;
      if (location != null && !location.isEmpty()) {
         total++;
      }
      if (quality != null && !quality.isEmpty()) {
         total++;
      }
      if (severity != null) {
         total++;
      }
      if (duration != null && !duration.isEmpty()) {
         total++;
      }
      if (timing != null && !timing.isEmpty()) {
         total++;
      }
      if (context != null && !context.isEmpty()) {
         total++;
      }
      if (modifyingFactors != null && !modifyingFactors.isEmpty()) {
         total++;
      }
      if (associatedSignsAndSymptoms != null && !associatedSignsAndSymptoms.isEmpty()) {
         total++;
      }
      if (radiation != null && !radiation.isEmpty()) {
         total++;
      }
      return total;
   }

   public String getHpiLevel() {
      String level = null;
      int total = getHpiTotal();
      if (total == 0) {
         level = "None";
      } else if (total >= 1 && total <= 3) {
         level = "Brief";
      } else if (total >= 4) {
         level = "Extended";
      }
      return level;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public String getQuality() {
      return quality;
   }

   public void setQuality(String quality) {
      this.quality = quality;
   }

   public Integer getSeverity() {
      return severity;
   }

   public void setSeverity(Integer severity) {
      this.severity = severity;
   }

   public String getDuration() {
      return duration;
   }

   public void setDuration(String duration) {
      this.duration = duration;
   }

   public String getTiming() {
      return timing;
   }

   public void setTiming(String timing) {
      this.timing = timing;
   }

   public String getContext() {
      return context;
   }

   public void setContext(String context) {
      this.context = context;
   }

   public String getModifyingFactors() {
      return modifyingFactors;
   }

   public void setModifyingFactors(String modifyingFactors) {
      this.modifyingFactors = modifyingFactors;
   }

   public String getAssociatedSignsAndSymptoms() {
      return associatedSignsAndSymptoms;
   }

   public void setAssociatedSignsAndSymptoms(String associatedSignsAndSymptoms) {
      this.associatedSignsAndSymptoms = associatedSignsAndSymptoms;
   }

   public String getRadiation() {
      return radiation;
   }

   public void setRadiation(String radiation) {
      this.radiation = radiation;
   }

   public String getFreeFormText() {
      return freeFormText;
   }

   public void setFreeFormText(String freeFormText) {
      this.freeFormText = freeFormText;
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
      if (!(object instanceof VisitHpi)) {
         return false;
      }
      VisitHpi other = (VisitHpi) object;
      if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.VisitHpi[visitId=" + visitId + "]";
   }
}