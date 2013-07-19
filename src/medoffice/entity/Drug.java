package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "drug")
public class Drug implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "code")
   private String code;
   @Basic(optional = false)
   @Column(name = "description")
   private String description;
   @Column(name = "name")
   private String name;
   @Column(name = "tty")
   private String tty;
   @Column(name = "strength")
   private String strength;
   @Column(name = "dose_form")
   private String doseForm;

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getTty() {
      return tty;
   }

   public void setTty(String tty) {
      this.tty = tty;
   }

   public String getStrength() {
      return strength;
   }

   public void setStrength(String strength) {
      this.strength = strength;
   }

   public String getDoseForm() {
      return doseForm;
   }

   public void setDoseForm(String doseForm) {
      this.doseForm = doseForm;
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
      if (!(object instanceof Drug)) {
         return false;
      }
      Drug other = (Drug) object;
      if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.Drug[code=" + code + "]";
   }
}