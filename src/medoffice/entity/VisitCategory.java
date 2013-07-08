package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "visit_category")
public class VisitCategory implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "code")
   private String code;
   @Basic(optional = false)
   @Column(name = "name")
   private String name;
   @Column(name = "css")
   private String css;   

   public VisitCategory() {
   }

   public VisitCategory(String code) {
      this.code = code;
   }

   public VisitCategory(String code, String name) {
      this.code = code;
      this.name = name;
   }

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getCss() {
      return css;
   }

   public void setCss(String css) {
      this.css = css;
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
      if (!(object instanceof VisitCategory)) {
         return false;
      }
      VisitCategory other = (VisitCategory) object;
      if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.medicalcare.domain.medenterprise.VisitCategory[code=" + code + "]";
   }
}
