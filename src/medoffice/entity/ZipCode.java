package medoffice.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "zip_code")
public class ZipCode implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "code")
   private String code;
   @Basic(optional = false)
   @Column(name = "city")
   private String city;
   @Basic(optional = false)
   @Column(name = "state")
   private String state;

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
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
      if (!(object instanceof ZipCode)) {
         return false;
      }
      ZipCode other = (ZipCode) object;
      if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.ZipCode[code=" + code + "]";
   }
}