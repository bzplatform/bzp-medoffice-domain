package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "visit_diagnosis")
public class VisitDiagnosis implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @Basic(optional = false)
   @Column(name = "visit_id")
   private int visitId;
   @JoinColumn(name = "visit_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private Visit visit;
   @JoinColumn(name = "code", nullable = false)
   @ManyToOne
   private Diagnosis diagnosis;
   @Column(name = "position")
   private Integer position;
   @Column(name = "chronicity")
   private String chronicity;
   @Column(name = "onset")
   private String onset;
   @Column(name = "resolution_date")
   @Temporal(TemporalType.DATE)
   private Date resolutionDate;
   @Column(name = "notes")
   private String notes;   
   @JoinColumn(name = "status_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private VisitDiagnosisStatus status;   
   @Column(name = "status_id")
   private Integer statusId;   

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public int getVisitId() {
      return visitId;
   }

   public void setVisitId(int visitId) {
      this.visitId = visitId;
   }

   public Visit getVisit() {
      return visit;
   }

   public void setVisit(Visit visit) {
      this.visit = visit;
   }

   public Diagnosis getDiagnosis() {
      return diagnosis;
   }

   public void setDiagnosis(Diagnosis diagnosis) {
      this.diagnosis = diagnosis;
   }

   public Integer getPosition() {
      return position;
   }

   public void setPosition(Integer position) {
      this.position = position;
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

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }

   public VisitDiagnosisStatus getStatus() {
      return status;
   }

   public void setStatus(VisitDiagnosisStatus status) {
      this.status = status;
   }

   public Integer getStatusId() {
      return statusId;
   }

   public void setStatusId(Integer statusId) {
      this.statusId = statusId;
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
      if (!(object instanceof VisitDiagnosis)) {
         return false;
      }
      VisitDiagnosis other = (VisitDiagnosis) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.VisitDiagnosis[id=" + id + "]";
   }
}