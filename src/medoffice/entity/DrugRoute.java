package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "drug_route")
public class DrugRoute implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "code")
   private String code;
   @Basic(optional = false)
   @Column(name = "description")
   private String description;

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

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (code != null ? code.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof DrugRoute)) {
         return false;
      }
      DrugRoute other = (DrugRoute) object;
      if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.DrugRoute[code=" + code + "]";
   }
}