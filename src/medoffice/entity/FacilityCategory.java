package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facility_category")
public class FacilityCategory implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "name")
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (name != null ? name.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof FacilityCategory)) {
         return false;
      }
      FacilityCategory other = (FacilityCategory) object;
      if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.FacilityCategory[code=" + name + "]";
   }
}