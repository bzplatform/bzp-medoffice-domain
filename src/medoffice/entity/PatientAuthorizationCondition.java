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
@Table(name = "patient_authorization_condition")
public class PatientAuthorizationCondition implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Basic(optional = false)
   @Column(name = "id")
   private Integer id;
   @Column(name = "specialty_id")
   private Integer specialtyId;
   @Column(name = "cpt_code")
   private String cptCode;   
   @Column(name = "insurance_id")
   private Integer insuranceId;
   @Column(name = "not_count")
   private Integer notCount;   

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Integer getSpecialtyId() {
      return specialtyId;
   }

   public void setSpecialtyId(Integer specialtyId) {
      this.specialtyId = specialtyId;
   }

   public String getCptCode() {
      return cptCode;
   }

   public void setCptCode(String cptCode) {
      this.cptCode = cptCode;
   }

   public Integer getInsuranceId() {
      return insuranceId;
   }

   public void setInsuranceId(Integer insuranceId) {
      this.insuranceId = insuranceId;
   }

   public Integer getNotCount() {
      return notCount;
   }

   public void setNotCount(Integer notCount) {
      this.notCount = notCount;
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
      if (!(object instanceof PatientAuthorizationCondition)) {
         return false;
      }
      PatientAuthorizationCondition other = (PatientAuthorizationCondition) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.PatientAuthorizationCondition[id=" + id + "]";
   }
}