package medoffice.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.eclipse.persistence.annotations.PrivateOwned;

@Entity
@Table(name = "visit_progress_note")
public class VisitProgressNote implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "visit_id")
   private Integer visitId;
   @JoinColumn(name = "visit_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private Visit visit;
   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "cc_id")
   private VisitCc cc;
   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "hpi_id")
   private VisitHpi hpi;
   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "ros_id")
   private VisitRos ros;
   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "pfsh_id")
   private VisitPfsh pfsh;
   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "exam_id")
   private VisitExam exam;
   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "treatment_id")
   private VisitTreatment treatment;
   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "mdm_id")
   private VisitMdm mdm;
   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "service_level_id")
   private VisitServiceLevel serviceLevel;
   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "template_state_id")
   private VisitTemplateState templateState;
   @PrivateOwned
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "progressNote")
   @OrderBy("datetime")
   private List<VisitProgressNoteAddendum> addendumList;
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

   public VisitCc getCc() {
      if (cc == null) {
         cc = new VisitCc();
         cc.setVisitId(visitId);
         cc.setVisit(visit);
         cc.setPersisted(false);
      }
      return cc;
   }

   public boolean getCcEmpty() {
      if (cc == null) {
         return true;
      }
      return false;
   }

   public void setCc(VisitCc cc) {
      this.cc = cc;
   }

   public VisitHpi getHpi() {
      if (hpi == null) {
         hpi = new VisitHpi();
         hpi.setVisitId(visitId);
         hpi.setVisit(visit);
         hpi.setPersisted(false);
      }
      return hpi;
   }

   public boolean getHpiEmpty() {
      if (hpi == null) {
         return true;
      }
      return false;
   }

   public void setHpi(VisitHpi hpi) {
      this.hpi = hpi;
   }

   public VisitRos getRos() {
      if (ros == null) {
         ros = new VisitRos();
         ros.setVisitId(visitId);
         ros.setVisit(visit);
         ros.setPersisted(false);
      }
      return ros;
   }

   public boolean getRosEmpty() {
      if (ros == null) {
         return true;
      }
      return false;
   }

   public void setRos(VisitRos ros) {
      this.ros = ros;
   }

   public VisitPfsh getPfsh() {
      if (pfsh == null) {
         pfsh = new VisitPfsh();
         pfsh.setVisitId(visitId);
         pfsh.setVisit(visit);
         pfsh.setPersisted(false);
      }
      return pfsh;
   }

   public boolean getPfshEmpty() {
      if (pfsh == null) {
         return true;
      }
      return false;
   }

   public void setPfsh(VisitPfsh pfsh) {
      this.pfsh = pfsh;
   }

   public VisitExam getExam() {
      if (exam == null) {
         exam = new VisitExam();
         exam.setVisitId(visitId);
         exam.setVisit(visit);
         exam.setPersisted(false);
      }
      return exam;
   }

   public boolean getExamEmpty() {
      if (exam == null) {
         return true;
      }
      return false;
   }

   public void setExam(VisitExam exam) {
      this.exam = exam;
   }

   public VisitTreatment getTreatment() {
      if (treatment == null) {
         treatment = new VisitTreatment();
         treatment.setVisitId(visitId);
         treatment.setVisit(visit);
         treatment.setPersisted(false);
      }
      return treatment;
   }

   public boolean getTreatmentEmpty() {
      if (treatment == null) {
         return true;
      }
      return false;
   }

   public void setTreatment(VisitTreatment treatment) {
      this.treatment = treatment;
   }

   public VisitMdm getMdm() {
      if (mdm == null) {
         mdm = new VisitMdm();
         mdm.setVisitId(visitId);
         mdm.setVisit(visit);
         mdm.setPersisted(false);
      }
      return mdm;
   }

   public boolean getMdmEmpty() {
      if (mdm == null) {
         return true;
      }
      return false;
   }

   public void setMdm(VisitMdm mdm) {
      this.mdm = mdm;
   }

   public VisitServiceLevel getServiceLevel() {
      if (serviceLevel == null) {
         serviceLevel = new VisitServiceLevel();
         serviceLevel.setVisitId(visitId);
         serviceLevel.setVisit(visit);
         serviceLevel.setPersisted(false);
      }
      return serviceLevel;
   }

   public void setServiceLevel(VisitServiceLevel serviceLevel) {
      this.serviceLevel = serviceLevel;
   }

   public List<VisitProgressNoteAddendum> getAddendumList() {
      if (addendumList == null) {
         addendumList = new ArrayList();
      }
      return addendumList;
   }

   public void setAddendumList(List<VisitProgressNoteAddendum> addendumList) {
      this.addendumList = addendumList;
   }

   public VisitTemplateState getTemplateState() {
      if (templateState == null) {
         templateState = new VisitTemplateState();
         templateState.setVisitId(visitId);
         templateState.setVisit(visit);
         templateState.setPersisted(false);
      }
      return templateState;
   }

   public void setTemplateState(VisitTemplateState templateState) {
      this.templateState = templateState;
   }

   public boolean isPersisted() {
      return persisted;
   }

   public void setPersisted(boolean persisted) {
      this.persisted = persisted;
   }
   
   static boolean emptyField(String field) {
      return (field == null || field.trim().isEmpty());
   }
   
   static boolean emptyField(Object field) {
      return (field == null);
   }
   
   public VisitProgressNote cleaned() {
      if (cc != null && cc.emptyData()) {
         cc = null;
      }
      if (exam != null && exam.emptyData()) {
         exam = null;
      }
      if (hpi != null && hpi.emptyData()) {
         hpi = null;
      }
      if (mdm != null && mdm.emptyData()) {
         mdm = null;
      }
      if (ros != null && ros.emptyData()) {
         ros = null;
      }
      if (serviceLevel != null && serviceLevel.emptyData()) {
         serviceLevel = null;
      }
      if (treatment != null && treatment.emptyData()) {
         treatment = null;
      }
      return this;
   }

   public String plenum() {
      int i = 0;
      if (cc != null && ! cc.emptyData()) {
         i++;
      }
      if (exam != null && ! exam.emptyData()) {
         i++;
      }
      if (hpi != null && ! hpi.emptyData()) {
         i++;
      }
      if (mdm != null && ! mdm.emptyData()) {
         i++;
      }
      if (ros != null && ! ros.emptyData()) {
         i++;
      }
      if (serviceLevel != null && ! serviceLevel.emptyData()) {
         i++;
      }
      if (treatment != null && ! treatment.emptyData()) {
         i++;
      }
      if (i == 0) {
         return null;
      }
      return i + "/7";
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
      if (!(object instanceof VisitProgressNote)) {
         return false;
      }
      VisitProgressNote other = (VisitProgressNote) object;
      if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.VisitProgressNote[visitId=" + visitId + "]";
   }
}