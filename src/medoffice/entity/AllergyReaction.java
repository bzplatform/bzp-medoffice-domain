package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "allergy_reaction")
public class AllergyReaction implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "description")
   private String description;

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (description != null ? description.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof AllergyReaction)) {
         return false;
      }
      AllergyReaction other = (AllergyReaction) object;
      if ((this.description == null && other.description != null) || (this.description != null && !this.description.equals(other.description))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.AllergyReaction[description=" + description + "]";
   }
}