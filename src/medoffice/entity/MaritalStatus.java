package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marital_status")
public class MaritalStatus implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "code")
   private Character code;
   @Basic(optional = false)
   @Column(name = "name")
   private String name;

   public Character getCode() {
      return code;
   }

   public void setCode(Character code) {
      this.code = code;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
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
      if (!(object instanceof MaritalStatus)) {
         return false;
      }
      MaritalStatus other = (MaritalStatus) object;
      if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.MaritalStatus[code=" + code + "]";
   }  
}