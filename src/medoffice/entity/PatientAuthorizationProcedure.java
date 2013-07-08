package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "[patient:authorization_procedure]")
public class PatientAuthorizationProcedure implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "cpt_code", insertable = false, updatable = false)
   private String code;
   @JoinColumn(name = "cpt_code")
   @ManyToOne
   private Procedure procedure;

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public Procedure getProcedure() {
      return procedure;
   }

   public void setProcedure(Procedure procedure) {
      this.procedure = procedure;
   }   

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (code != null ? code.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof PatientAuthorizationProcedure)) {
         return false;
      }
      PatientAuthorizationProcedure other = (PatientAuthorizationProcedure) object;
      if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.PatientAuthorizationProcedure[code=" + code + "]";
   }  
}