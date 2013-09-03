package medoffice.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "svg_source")
public class SvgSource implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "name")
   private String name;
   @Basic(optional = false)
   @Column(name = "version")
   private int version;
   @Basic(optional = false)
   @Lob
   @Column(name = "source")
   private String source;

   public SvgSource() {
   }

   public SvgSource(String name) {
      this.name = name;
   }

   public SvgSource(String name, String source) {
      this.name = name;
      this.source = source;
   }

   public int getVersion() {
      return version;
   }

   public void setVersion(int version) {
      this.version = version;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSource() {
      return source;
   }

   public void setSource(String source) {
      this.source = source;
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
      if (!(object instanceof SvgSource)) {
         return false;
      }
      SvgSource other = (SvgSource) object;
      if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.SvgSource[code=" + name + "]";
   }  
}