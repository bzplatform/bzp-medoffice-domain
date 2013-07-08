package medoffice.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "procedure_cpt_modifier_set")
public class ProcedureCptModifierSet implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "cpt_code")
   private String cptCode;
   @Basic(optional = false)
   @Column(name = "modifier_set_code")
   private String modifierSetCode;
    @JoinTable(
      name = "procedure_modifier_set",
      joinColumns = @JoinColumn(name = "code", referencedColumnName = "modifier_set_code"),
      inverseJoinColumns = @JoinColumn(name = "modifier_code", referencedColumnName = "code")
   )
   @ManyToMany
   private List<ProcedureModifier> modifierList;

   public ProcedureCptModifierSet() {
   }

   public ProcedureCptModifierSet(String cptCode) {
      this.cptCode = cptCode;
   }

   public ProcedureCptModifierSet(String cptCode, String modifierSetCode) {
      this.cptCode = cptCode;
      this.modifierSetCode = modifierSetCode;
   }

   public String getCptCode() {
      return cptCode;
   }

   public void setCptCode(String cptCode) {
      this.cptCode = cptCode;
   }

   public String getModifierSetCode() {
      return modifierSetCode;
   }

   public void setModifierSetCode(String modifierSetCode) {
      this.modifierSetCode = modifierSetCode;
   }

   public List<ProcedureModifier> getModifierList() {
      return modifierList;
   }

   public void setModifierList(List<ProcedureModifier> modifierList) {
      this.modifierList = modifierList;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (cptCode != null ? cptCode.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof ProcedureCptModifierSet)) {
         return false;
      }
      ProcedureCptModifierSet other = (ProcedureCptModifierSet) object;
      if ((this.cptCode == null && other.cptCode != null) || (this.cptCode != null && !this.cptCode.equals(other.cptCode))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.medicalcare.domain.healthcare.ProcedureCptModifierSet[cptCode=" + cptCode + "]";
   }
}