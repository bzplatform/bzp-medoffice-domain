package medoffice.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@Table(name = "visit_service_level")
public class VisitServiceLevel implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "visit_id")
   private Integer visitId;
   @JoinColumn(name = "visit_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private Visit visit;
   @Column(name = "hpi_total")
   private Integer hpiTotal;
   @Column(name = "hpi_level")
   private String hpiLevel;
   @Column(name = "ros_total")
   private Integer rosTotal;
   @Column(name = "ros_level")
   private String rosLevel;
   @Column(name = "pfsh_total")
   private Integer pfshTotal;
   @Column(name = "pfsh_level")
   private String pfshLevel;
   @Column(name = "history_level")
   private String historyLevel;
   @Column(name = "examination_total")
   private Integer examinationTotal;
   @Column(name = "examination_area_number")
   private Integer examinationAreaNumber;
   @Column(name = "examination_area_2b_number")
   private Integer examinationArea2bNumber;
   @Column(name = "examination_area_12b_number")
   private Integer examinationArea12bNumber;
   @Column(name = "examination_level")
   private String examinationLevel;
   @Column(name = "dto_total")
   private Integer dtoTotal;
   @Column(name = "complexity_total")
   private Integer dataComplexityTotal;
   @Column(name = "risk_level")
   private String riskLevel;
   @Column(name = "decision_type")
   private String decisionType;
   @Column(name = "time_total")
   private Integer timeTotal;
   @Column(name = "time_counseling")
   private Integer timeCounseling;
   @Column(name = "patient_type")
   private String patientType;
   @Column(name = "service_level")
   private Integer serviceLevel;
   @Column(name = "cpt_code")
   private String cptCode;
   @Column(name = "submitted_cpt_code")
   private String submittedCptCode;
   @Column(name = "created")
   @Temporal(TemporalType.TIMESTAMP)
   private Date created;
   @Column(name = "signed_user_id")
   private Integer signedUserId;
   @Column(name = "signed_datetime")
   @Temporal(TemporalType.TIMESTAMP)
   private Date signedDatetime;
   @Column(name = "signed_from_ip")
   private String signedFromIp;
   @Column(name = "signed")
   private Boolean signed;
   @Column(name = "report")
   private String report;
   @Column(name = "state")
   private String state;
   @Column(name = "issues")
   private String issues;
   @Transient
   private boolean persisted = true;
   @Transient
   private List<String> errorList;

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

   public Integer getHpiTotal() {
      return hpiTotal;
   }

   public void setHpiTotal(Integer hpiTotal) {
      this.hpiTotal = hpiTotal;
   }

   public String getHpiLevel() {
      return hpiLevel;
   }

   public void setHpiLevel(String hpiLevel) {
      this.hpiLevel = hpiLevel;
   }

   public Integer getRosTotal() {
      return rosTotal;
   }

   public void setRosTotal(Integer rosTotal) {
      this.rosTotal = rosTotal;
   }

   public String getRosLevel() {
      return rosLevel;
   }

   public void setRosLevel(String rosLevel) {
      this.rosLevel = rosLevel;
   }

   public Integer getPfshTotal() {
      return pfshTotal;
   }

   public void setPfshTotal(Integer pfshTotal) {
      this.pfshTotal = pfshTotal;
   }

   public String getPfshLevel() {
      return pfshLevel;
   }

   public void setPfshLevel(String pfshLevel) {
      this.pfshLevel = pfshLevel;
   }

   public String getHistoryLevel() {
      return historyLevel;
   }

   public void setHistoryLevel(String historyLevel) {
      this.historyLevel = historyLevel;
   }

   public Integer getExaminationTotal() {
      return examinationTotal;
   }

   public void setExaminationTotal(Integer examinationTotal) {
      this.examinationTotal = examinationTotal;
   }

   public Integer getExaminationAreaNumber() {
      return examinationAreaNumber;
   }

   public void setExaminationAreaNumber(Integer examinationAreaNumber) {
      this.examinationAreaNumber = examinationAreaNumber;
   }

   public Integer getExaminationArea2bNumber() {
      return examinationArea2bNumber;
   }

   public void setExaminationArea2bNumber(Integer examinationArea2bNumber) {
      this.examinationArea2bNumber = examinationArea2bNumber;
   }

   public Integer getExaminationArea12bNumber() {
      return examinationArea12bNumber;
   }

   public void setExaminationArea12bNumber(Integer examinationArea12bNumber) {
      this.examinationArea12bNumber = examinationArea12bNumber;
   }

   public String getExaminationLevel() {
      return examinationLevel;
   }

   public void setExaminationLevel(String examinationLevel) {
      this.examinationLevel = examinationLevel;
   }

   public Integer getDtoTotal() {
      return dtoTotal;
   }

   public void setDtoTotal(Integer dtoTotal) {
      this.dtoTotal = dtoTotal;
   }

   public Integer getDataComplexityTotal() {
      return dataComplexityTotal;
   }

   public void setDataComplexityTotal(Integer dataComplexityTotal) {
      this.dataComplexityTotal = dataComplexityTotal;
   }

   public String getRiskLevel() {
      return riskLevel;
   }

   public void setRiskLevel(String riskLevel) {
      this.riskLevel = riskLevel;
   }

   public String getDecisionType() {
      return decisionType;
   }

   public void setDecisionType(String decisionType) {
      this.decisionType = decisionType;
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

   public String getPatientType() {
      return patientType;
   }

   public void setPatientType(String patientType) {
      this.patientType = patientType;
   }

   public Integer getServiceLevel() {
      return serviceLevel;
   }

   public void setServiceLevel(Integer serviceLevel) {
      this.serviceLevel = serviceLevel;
   }

   public String getCptCode() {
      return cptCode;
   }

   public void setCptCode(String cptCode) {
      this.cptCode = cptCode;
   }

   public String getSubmittedCptCode() {
      return submittedCptCode;
   }

   public void setSubmittedCptCode(String submittedCptCode) {
      this.submittedCptCode = submittedCptCode;
   }

   public Date getCreated() {
      return created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public Integer getSignedUserId() {
      return signedUserId;
   }

   public void setSignedUserId(Integer signedUserId) {
      this.signedUserId = signedUserId;
   }

   public Date getSignedDatetime() {
      return signedDatetime;
   }

   public void setSignedDatetime(Date signedDatetime) {
      this.signedDatetime = signedDatetime;
   }

   public String getSignedFromIp() {
      return signedFromIp;
   }

   public void setSignedFromIp(String signedFromIp) {
      this.signedFromIp = signedFromIp;
   }

   public Boolean getSigned() {
      return signed;
   }

   public void setSigned(Boolean signed) {
      this.signed = signed;
   }

   public String getReport() {
      return report;
   }

   public void setReport(String report) {
      this.report = report;
   }

   public boolean isPersisted() {
      return persisted;
   }

   public void setPersisted(boolean persisted) {
      this.persisted = persisted;
   }

   public List<String> getErrorList() {
      return errorList;
   }

   public void setErrorList(List<String> errorList) {
      this.errorList = errorList;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   public String getIssues() {
      return issues;
   }

   public void setIssues(String issues) {
      this.issues = issues;
   }

   public boolean emptyData() {
      return signed == null;
   }

   public void recalculate() {
      this.setCreated(new Date());
      if (visit.getCategoryCode().equals("NEW")) {
         this.setPatientType("New");
      } else {
         this.setPatientType("Established");
      }
      errorList = new ArrayList();
      state = "ESTIMATED";
      final String ERROR_MESSAGE = " section is not completed";
      if (visit.getProgressNote().getTreatmentEmpty() || !visit.getProgressNote().getTreatment().isPersisted()) {
         errorList.add("DX/Treatment" + ERROR_MESSAGE);
         state = "NO_ESTIMATION";
      }
//      if (visit.getVitalsEmpty() || visit.getVitals().emptyData()) {
//         errorList.add("Vitals" + ERROR_MESSAGE);
//         state = "INCONSISTENT";
//      }
      if (visit.getProgressNote().getHpiEmpty() || !visit.getProgressNote().getHpi().isPersisted()) {
         errorList.add("HPI" + ERROR_MESSAGE);
      }
//      if (visit.getProgressNote().getRosEmpty() || !visit.getProgressNote().getRos().isPersisted()) {
//         errorList.add("ROS" + ERROR_MESSAGE);
//      }
      if (visit.getProgressNote().getExamEmpty() || !visit.getProgressNote().getRos().isPersisted()) {
         errorList.add("Phys. Exam" + ERROR_MESSAGE);
      }
      if (visit.getProgressNote().getMdmEmpty() || !visit.getProgressNote().getMdm().isPersisted()) {
         errorList.add("MDM" + ERROR_MESSAGE);
      }
      this.setTimeTotal(visit.getProgressNote().getTreatment().getTimeTotal());
      this.setTimeCounseling(visit.getProgressNote().getTreatment().getTimeCounseling());
      if (state.equals("ESTIMATED") && this.getTimeTotal() != null && this.getTimeCounseling() != null
              && this.getTimeTotal() < this.getTimeCounseling() * 2) {
         int serviceLevel = 5;
         if (this.getPatientType().equals("New")) {
            if (this.getTimeTotal() < 20) {
               serviceLevel = 1;
            } else if (this.getTimeTotal() < 30) {
               serviceLevel = 2;
            } else if (this.getTimeTotal() < 45) {
               serviceLevel = 3;
            } else if (this.getTimeTotal() < 60) {
               serviceLevel = 4;
            }
            if (serviceLevel == 1) {
               this.setCptCode("99201");
            } else if (serviceLevel == 2) {
               this.setCptCode("99202");
            } else if (serviceLevel == 3) {
               this.setCptCode("99203");
            } else if (serviceLevel == 4) {
               this.setCptCode("99204");
            } else if (serviceLevel == 5) {
               this.setCptCode("99205");
            }
         }
         if (this.getPatientType().equals("Established")) {
            if (this.getTimeTotal() < 10) {
               serviceLevel = 1;
            } else if (this.getTimeTotal() < 15) {
               serviceLevel = 2;
            } else if (this.getTimeTotal() < 25) {
               serviceLevel = 3;
            } else if (this.getTimeTotal() < 40) {
               serviceLevel = 4;
            }
            if (serviceLevel == 1) {
               this.setCptCode("99211");
            } else if (serviceLevel == 2) {
               this.setCptCode("99212");
            } else if (serviceLevel == 3) {
               this.setCptCode("99213");
            } else if (serviceLevel == 4) {
               this.setCptCode("99214");
            } else if (serviceLevel == 5) {
               this.setCptCode("99215");
            }
         }
         this.setServiceLevel(serviceLevel);
         submittedCptCode = cptCode;
         state = "ESTIMATED_BY_TIME";
         return;
      }
      if (this.getVisit().getVisitDiagnosisList() == null) {
         errorList.add("Empty Diagnosis list" + ERROR_MESSAGE);
      } else {
         for (VisitDiagnosis visitDiagnosis : this.getVisit().getVisitDiagnosisList()) {
            if (visitDiagnosis.getStatus() == null) {
               errorList.add("Diagnosis " + visitDiagnosis.getDiagnosis().getCode() + " has no status");
            }
         }
      }
      if (visit.getProgressNote().getMdm().getRiskLevel() == null) {
         errorList.add("Undefined Risk Level");
      } else {
         riskLevel = visit.getProgressNote().getMdm().getRiskLevel();
      }
      if (!errorList.isEmpty()) {
         issues = "";
         for (String error : errorList) {
            issues += error + "<br/>";
         }
         issues = issues.replaceFirst("<br/>$", "");
         state = "NO_ESTIMATION";
         return;
      }
      this.setHpiTotal(visit.getProgressNote().getHpi().getHpiTotal());
      this.setHpiLevel(visit.getProgressNote().getHpi().getHpiLevel());
      this.setRosTotal(visit.getProgressNote().getRos().getRosTotal());
      this.setRosLevel(visit.getProgressNote().getRos().getRosLevel());
      this.setPfshTotal(visit.getProgressNote().getPfsh().getPfshTotal());
      this.setPfshLevel(visit.getProgressNote().getPfsh().getPfshLevel());
      int historyLevelIndex = 4;
      if (this.getHpiLevel().equals("None")) {
         historyLevelIndex = 1;
      } else if (this.getHpiLevel().equals("Brief")) {
         historyLevelIndex = Math.min(historyLevelIndex, 2);
      }
      if (this.getRosLevel().equals("None")) {
         historyLevelIndex = 1;
      } else if (this.getRosLevel().equals("Pertinent to Problem")) {
         historyLevelIndex = Math.min(historyLevelIndex, 2);
      } else if (this.getRosLevel().equals("Extended")) {
         historyLevelIndex = Math.min(historyLevelIndex, 3);
      }
      if (this.getPfshLevel().equals("None")) {
         historyLevelIndex = Math.min(historyLevelIndex, 2);
      } else if (this.getPfshLevel().equals("Pertinent to Problem")) {
         historyLevelIndex = Math.min(historyLevelIndex, 3);
      }
      if (historyLevelIndex == 1) {
         this.setHistoryLevel("Problem Focused");
      } else if (historyLevelIndex == 2) {
         this.setHistoryLevel("Expanded Problem Focused");
      } else if (historyLevelIndex == 3) {
         this.setHistoryLevel("Detailed");
      } else if (historyLevelIndex == 4) {
         this.setHistoryLevel("Comprehensive");
      }
      VisitExam.Stats stats = visit.getProgressNote().getExam().getExamStats();
      this.setExaminationTotal(stats.total);
      this.setExaminationAreaNumber(stats.areaNumber);
      this.setExaminationArea2bNumber(stats.area2bNumber);
      this.setExaminationArea12bNumber(stats.area12bNumber);
      this.setExaminationLevel(stats.level);
      dtoTotal = 0;
      Map<VisitDiagnosisStatus, Integer> statusMap = new HashMap();
      for (VisitDiagnosis visitDiagnosis : this.getVisit().getVisitDiagnosisList()) {
         if (!statusMap.containsKey(visitDiagnosis.getStatus())) {
            statusMap.put(visitDiagnosis.getStatus(), 0);
         }
         if (visitDiagnosis.getStatus().getEvaluationMax() == null || statusMap.get(visitDiagnosis.getStatus()) < visitDiagnosis.getStatus().getEvaluationMax()) {
            statusMap.put(visitDiagnosis.getStatus(), statusMap.get(visitDiagnosis.getStatus()) + 1);
            dtoTotal += visitDiagnosis.getStatus().getEvaluationPoints();
         }
      }
      this.setDataComplexityTotal(visit.getProgressNote().getMdm().getMdmDataComplexity());
      int[] decisionTypeGrid = new int[4];
      initGrid(decisionTypeGrid);
      if (this.getDtoTotal() <= 1) {
         up(decisionTypeGrid, 1);
      } else if (this.getDtoTotal() == 2) {
         up(decisionTypeGrid, 2);
      } else if (this.getDtoTotal() == 3) {
         up(decisionTypeGrid, 3);
      } else {
         up(decisionTypeGrid, 4);
      }
      if (this.getRiskLevel().equals("Minimal")) {
         up(decisionTypeGrid, 1);
      } else if (this.getRiskLevel().equals("Low")) {
         up(decisionTypeGrid, 2);
      } else if (this.getRiskLevel().equals("Moderate")) {
         up(decisionTypeGrid, 3);
      } else if (this.getRiskLevel().equals("High")) {
         up(decisionTypeGrid, 4);
      }
      if (this.getDataComplexityTotal() <= 1) {
         up(decisionTypeGrid, 1);
      } else {
         up(decisionTypeGrid, this.getDataComplexityTotal());
      }
      int decisionTypeIndex = maxLevel(decisionTypeGrid, 2);
      if (decisionTypeIndex == 1) {
         this.setDecisionType("Straight Forward");
      } else if (decisionTypeIndex == 2) {
         this.setDecisionType("Low Complexity");
      } else if (decisionTypeIndex == 3) {
         this.setDecisionType("Moderate Complexity");
      } else if (decisionTypeIndex == 4) {
         this.setDecisionType("High Complexity");
      }
      serviceLevel = 5;
      if (this.getPatientType().equals("New")) {
         if (this.getHistoryLevel().equals("Problem Focused")) {
            serviceLevel = 1;
         } else if (this.getHistoryLevel().equals("Expanded Problem Focused")) {
            serviceLevel = Math.min(serviceLevel, 2);
         } else if (this.getHistoryLevel().equals("Detailed")) {
            serviceLevel = Math.min(serviceLevel, 3);
         }
         if (this.getExaminationLevel().equals("Problem Focused")) {
            serviceLevel = 1;
         } else if (this.getExaminationLevel().equals("Expanded Problem Focused")) {
            serviceLevel = Math.min(serviceLevel, 2);
         } else if (this.getExaminationLevel().equals("Detailed")) {
            serviceLevel = Math.min(serviceLevel, 3);
         }
         if (this.getDecisionType().equals("Straight Forward")) {
            serviceLevel = Math.min(serviceLevel, 2);
         } else if (this.getDecisionType().equals("Low Complexity")) {
            serviceLevel = Math.min(serviceLevel, 3);
         } else if (this.getDecisionType().equals("Moderate Complexity")) {
            serviceLevel = Math.min(serviceLevel, 4);
         }
         if (serviceLevel == 1) {
            this.setCptCode("99201");
         } else if (serviceLevel == 2) {
            this.setCptCode("99202");
         } else if (serviceLevel == 3) {
            this.setCptCode("99203");
         } else if (serviceLevel == 4) {
            this.setCptCode("99204");
         } else if (serviceLevel == 5) {
            this.setCptCode("99205");
         }
      } else if (this.getPatientType().equals("Established")) {
         if (this.getHistoryLevel().equals("Problem Focused")) {
            serviceLevel = Math.min(serviceLevel, 2);
         } else if (this.getHistoryLevel().equals("Expanded Problem Focused")) {
            serviceLevel = Math.min(serviceLevel, 3);
         } else if (this.getHistoryLevel().equals("Detailed")) {
            serviceLevel = Math.min(serviceLevel, 4);
         }
         if (this.getExaminationLevel().equals("Problem Focused")) {
            serviceLevel = Math.min(serviceLevel, 2);
         } else if (this.getExaminationLevel().equals("Expanded Problem Focused")) {
            serviceLevel = Math.min(serviceLevel, 3);
         } else if (this.getExaminationLevel().equals("Detailed")) {
            serviceLevel = Math.min(serviceLevel, 4);
         }
         if (serviceLevel == 1) {
            this.setCptCode("99211");
         } else if (serviceLevel == 2) {
            this.setCptCode("99212");
         } else if (serviceLevel == 3) {
            this.setCptCode("99213");
         } else if (serviceLevel == 4) {
            this.setCptCode("99214");
         } else if (serviceLevel == 5) {
            this.setCptCode("99215");
         }
      }
      submittedCptCode = cptCode;
      state = "ESTIMATED";
   }

   public String visitCptCode() {
      for (VisitProcedure visitProcedure : visit.getProcedureList()) {
         if (visitProcedure.getCode().startsWith("992")) {
            return visitProcedure.getCode();
         }
      }
      return null;
   }

   private void initGrid(int[] grid) {
      for (int i = 0; i < grid.length; i++) {
         grid[i] = 0;
      }
   }

   private void up(int[] grid, int level) {
      for (int i = 0; i < level && i < grid.length; i++) {
         grid[i] += 1;
      }
   }

   private int maxLevel(int[] grid, int sensitivity) {
      for (int i = grid.length - 1; i >= 0; i--) {
         if (grid[i] >= sensitivity) {
            return i + 1;
         }
      }
      return 1;
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
      if (!(object instanceof VisitServiceLevel)) {
         return false;
      }
      VisitServiceLevel other = (VisitServiceLevel) object;
      if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.VisitServiceLevel[visitId=" + visitId + "]";
   }
}