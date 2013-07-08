package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "visit_diagnosis_status")
public class VisitDiagnosisStatus implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @Column(name = "name")
   private String name;
   @Column(name = "evaluation_points")
   private Integer evaluationPoints;
   @Column(name = "evaluation_max")
   private Integer evaluationMax;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getEvaluationPoints() {
      return evaluationPoints;
   }

   public void setEvaluationPoints(Integer evaluationPoints) {
      this.evaluationPoints = evaluationPoints;
   }

   public Integer getEvaluationMax() {
      return evaluationMax;
   }

   public void setEvaluationMax(Integer evaluationMax) {
      this.evaluationMax = evaluationMax;
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
      if (!(object instanceof VisitDiagnosisStatus)) {
         return false;
      }
      VisitDiagnosisStatus other = (VisitDiagnosisStatus) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.VisitDiagnosisStatus[id=" + id + "]";
   }
}