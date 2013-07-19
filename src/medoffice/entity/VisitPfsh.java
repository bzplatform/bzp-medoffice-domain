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
@Table(name = "visit_pfsh")
public class VisitPfsh implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "visit_id")
   private Integer visitId;
   @JoinColumn(name = "visit_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private Visit visit;
   @Column(name = "past_history")
   private String pastHistory;
   @Column(name = "family_history")
   private String familyHistory;
   @Column(name = "social_history")
   private String socialHistory;
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

   public int getPfshTotal() {
      int total = 0;
      if (pastHistory != null && !pastHistory.isEmpty()) {
         total++;
      }
      if (familyHistory != null && !familyHistory.isEmpty()) {
         total++;
      }
      if (socialHistory != null && !socialHistory.isEmpty()) {
         total++;
      }
      return total;
   }

   public String getPfshLevel() {
      String level = null;
      int total = getPfshTotal();
      if (total == 0) {
         level = "None";
      } else if (total == 1) {
         level = "Pertinent to problem";
      } else if (total > 1) {
         level = "Complete";
      }
      return level;
   }

   public boolean emptyData() {
      return getPfshTotal() == 0;
   }

   public String getPastHistory() {
      return pastHistory;
   }

   public void setPastHistory(String pastHistory) {
      this.pastHistory = pastHistory;
   }

   public String getFamilyHistory() {
      return familyHistory;
   }

   public void setFamilyHistory(String familyHistory) {
      this.familyHistory = familyHistory;
   }

   public String getSocialHistory() {
      return socialHistory;
   }

   public void setSocialHistory(String socialHistory) {
      this.socialHistory = socialHistory;
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
      if (!(object instanceof VisitPfsh)) {
         return false;
      }
      VisitPfsh other = (VisitPfsh) object;
      if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.VisitPfsh[visitId=" + visitId + "]";
   }
}