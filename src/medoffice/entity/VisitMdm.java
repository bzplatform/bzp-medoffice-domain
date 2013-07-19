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
@Table(name = "visit_mdm")
public class VisitMdm implements Serializable {
   
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "visit_id")
   private Integer visitId;
   @JoinColumn(name = "visit_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private Visit visit;
   @Column(name = "diagnostic_tests_ordered")
   private String diagnosticTestsOrdered;
   @Column(name = "diagnostic_test_results_reviewed")
   private String diagnosticTestResultsReviewed;
   @Column(name = "diagnostic_test_results_discussion")
   private String diagnosticTestResultsDiscussion;
   @Column(name = "obtain_old_records_additional_history")
   private String obtainOldRecordsAdditionalHistory;
   @Column(name = "review_old_records")
   private String reviewOldRecords;
   @Column(name = "independent_visualization")
   private String independentVisualization;
   @Column(name = "lab_tests_ordered")
   private Boolean labTestsOrdered;
   @Column(name = "lab_tests_reviewed")
   private Boolean labTestsReviewed;
   @Column(name = "radiology_tests_ordered")
   private Boolean radiologyTestsOrdered;
   @Column(name = "radiology_tests_reviewed")
   private Boolean radiologyTestsReviewed;
   @Column(name = "medicine_tests_ordered")
   private Boolean medicineTestsOrdered;
   @Column(name = "medicine_tests_reviewed")
   private Boolean medicineTestsReviewed;
   @Column(name = "risk_level")
   private String riskLevel;
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
   
   public int getMdmDataComplexity() {
      int dataComplexity = 0;
      if ((labTestsOrdered != null && labTestsOrdered) || (labTestsReviewed != null && labTestsReviewed)) {
         dataComplexity++;
      }
      if ((radiologyTestsOrdered != null && radiologyTestsOrdered) || (labTestsReviewed != null && labTestsReviewed)) {
         dataComplexity++;
      }
      if ((medicineTestsOrdered != null && medicineTestsOrdered) || (medicineTestsReviewed != null && medicineTestsReviewed)) {
         dataComplexity++;
      }
      if (diagnosticTestResultsDiscussion != null && !diagnosticTestResultsDiscussion.trim().isEmpty()) {
         dataComplexity++;
      }
      if (obtainOldRecordsAdditionalHistory != null && !obtainOldRecordsAdditionalHistory.trim().isEmpty()) {
         dataComplexity++;
      }
      if (reviewOldRecords != null && !reviewOldRecords.trim().isEmpty()) {
         dataComplexity += 2;
      }
      if (independentVisualization != null && !independentVisualization.trim().isEmpty()) {
         dataComplexity += 2;
      }      
      return dataComplexity;
   }
   
   public boolean emptyData() {
      return (getMdmDataComplexity() == 0 && VisitProgressNote.emptyField(riskLevel) && VisitProgressNote.emptyField(diagnosticTestsOrdered) && VisitProgressNote.emptyField(diagnosticTestResultsReviewed));
   }
   
   public String getDiagnosticTestsOrdered() {
      return diagnosticTestsOrdered;
   }
   
   public void setDiagnosticTestsOrdered(String diagnosticTestsOrdered) {
      this.diagnosticTestsOrdered = diagnosticTestsOrdered;
   }
   
   public String getDiagnosticTestResultsReviewed() {
      return diagnosticTestResultsReviewed;
   }
   
   public void setDiagnosticTestResultsReviewed(String diagnosticTestResultsReviewed) {
      this.diagnosticTestResultsReviewed = diagnosticTestResultsReviewed;
   }
   
   public String getDiagnosticTestResultsDiscussion() {
      return diagnosticTestResultsDiscussion;
   }
   
   public void setDiagnosticTestResultsDiscussion(String diagnosticTestResultsDiscussion) {
      this.diagnosticTestResultsDiscussion = diagnosticTestResultsDiscussion;
   }
   
   public String getObtainOldRecordsAdditionalHistory() {
      return obtainOldRecordsAdditionalHistory;
   }
   
   public void setObtainOldRecordsAdditionalHistory(String obtainOldRecordsAdditionalHistory) {
      this.obtainOldRecordsAdditionalHistory = obtainOldRecordsAdditionalHistory;
   }
   
   public String getReviewOldRecords() {
      return reviewOldRecords;
   }
   
   public void setReviewOldRecords(String reviewOldRecords) {
      this.reviewOldRecords = reviewOldRecords;
   }
   
   public String getIndependentVisualization() {
      return independentVisualization;
   }
   
   public void setIndependentVisualization(String independentVisualization) {
      this.independentVisualization = independentVisualization;
   }
   
   public Boolean getLabTestsOrdered() {
      return labTestsOrdered;
   }
   
   public void setLabTestsOrdered(Boolean labTestsOrdered) {
      this.labTestsOrdered = labTestsOrdered;
   }
   
   public Boolean getLabTestsReviewed() {
      return labTestsReviewed;
   }
   
   public void setLabTestsReviewed(Boolean labTestsReviewed) {
      this.labTestsReviewed = labTestsReviewed;
   }
   
   public Boolean getRadiologyTestsOrdered() {
      return radiologyTestsOrdered;
   }
   
   public void setRadiologyTestsOrdered(Boolean radiologyTestsOrdered) {
      this.radiologyTestsOrdered = radiologyTestsOrdered;
   }
   
   public Boolean getRadiologyTestsReviewed() {
      return radiologyTestsReviewed;
   }
   
   public void setRadiologyTestsReviewed(Boolean radiologyTestsReviewed) {
      this.radiologyTestsReviewed = radiologyTestsReviewed;
   }
   
   public Boolean getMedicineTestsOrdered() {
      return medicineTestsOrdered;
   }
   
   public void setMedicineTestsOrdered(Boolean medicineTestsOrdered) {
      this.medicineTestsOrdered = medicineTestsOrdered;
   }
   
   public Boolean getMedicineTestsReviewed() {
      return medicineTestsReviewed;
   }
   
   public void setMedicineTestsReviewed(Boolean medicineTestsReviewed) {
      this.medicineTestsReviewed = medicineTestsReviewed;
   }
   
   public String getRiskLevel() {
      return riskLevel;
   }
   
   public void setRiskLevel(String riskLevel) {
      this.riskLevel = riskLevel;
   }
   
   public boolean isPersisted() {
      return persisted;
   }
   
   public void setPersisted(boolean persisted) {
      this.persisted = persisted;
   }
   
   public String getOrdered() {
      String ordered = "";
      if ((labTestsOrdered != null && labTestsOrdered)) {
         ordered += "lab tests, ";
      }
      if ((radiologyTestsOrdered != null && radiologyTestsOrdered)) {
         ordered += "radiology tests, ";
      }
      if ((medicineTestsOrdered != null && medicineTestsOrdered)) {
         ordered += "other tests";
      }
      return ordered.replaceFirst(", $", "");
   }
   
   public String getReviewed() {
      String reviewed = "";
      if ((labTestsReviewed != null && labTestsReviewed)) {
         reviewed += "lab tests, ";
      }
      if ((radiologyTestsReviewed != null && radiologyTestsReviewed)) {
         reviewed += "radiology tests, ";
      }
      if ((medicineTestsReviewed != null && medicineTestsReviewed)) {
         reviewed += "other tests";
      }
      return reviewed.replaceFirst(", $", "");
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
      if (!(object instanceof VisitMdm)) {
         return false;
      }
      VisitMdm other = (VisitMdm) object;
      if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
         return false;
      }
      return true;
   }
   
   @Override
   public String toString() {
      return "medoffice.entity.VisitMdm[visitId=" + visitId + "]";
   }
}
