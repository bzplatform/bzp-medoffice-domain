package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "edi_account")
public class EdiAccount implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "code")
   private String code;
   @Column(name = "name")
   private String name;
   @Column(name = "win_outbox")
   private String winOutbox;
   @Column(name = "unix_outbox")
   private String unixOutbox;
   @Column(name = "win_temp")
   private String winTemp;
   @Column(name = "unix_temp")
   private String unixTemp;

   public EdiAccount() {
   }

   public EdiAccount(String code) {
      this.code = code;
   }

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getWinOutbox() {
      return winOutbox;
   }

   public void setWinOutbox(String winOutbox) {
      this.winOutbox = winOutbox;
   }

   public String getUnixOutbox() {
      return unixOutbox;
   }

   public void setUnixOutbox(String unixOutbox) {
      this.unixOutbox = unixOutbox;
   }

   public String getWinTemp() {
      return winTemp;
   }

   public void setWinTemp(String winTemp) {
      this.winTemp = winTemp;
   }

   public String getUnixTemp() {
      return unixTemp;
   }

   public void setUnixTemp(String unixTemp) {
      this.unixTemp = unixTemp;
   }

   public String getOutbox() {
      return System.getProperty("os.name").contains("Windows") ? getWinOutbox() : getUnixOutbox();

   }

   public String getTemp() {
      return System.getProperty("os.name").contains("Windows") ? getWinTemp() : getUnixTemp();
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
      if (!(object instanceof EdiAccount)) {
         return false;
      }
      EdiAccount other = (EdiAccount) object;
      if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.EdiAccount[code=" + code + "]";
   }
}