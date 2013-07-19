package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@IdClass(MyOfficeProviderId.class)
@Table(name = "myoffice_provider")
public class MyOfficeProvider implements Serializable {
   private static final long serialVersionUID = 1L;

   @Id
   @Basic(optional = false)
   @Column(name = "myoffice_code", insertable = false, updatable = false)
   private String myOfficeCode;
   @JoinColumn(name = "myoffice_code")
   @ManyToOne(optional = false)
   private MyOffice myOffice;
   @Id
   @Basic(optional = false)
   @Column(name = "office_provider_id", updatable = false, insertable = false)
   private int officeProviderId;
   @JoinColumn(name = "office_provider_id", referencedColumnName = "id")
   @OneToOne(optional = false)
   private OfficeProvider officeProvider;

   public String getMyOfficeCode() {
      return myOfficeCode;
   }

   public void setMyOfficeCode(String myOfficeCode) {
      this.myOfficeCode = myOfficeCode;
   }

   public MyOffice getMyOffice() {
      return myOffice;
   }

   public void setMyOffice(MyOffice myOffice) {
      this.myOffice = myOffice;
   }

   public int getOfficeProviderId() {
      return officeProviderId;
   }

   public void setOfficeProviderId(int officeProviderId) {
      this.officeProviderId = officeProviderId;
   }

   public OfficeProvider getOfficeProvider() {
      return officeProvider;
   }

   public void setOfficeProvider(OfficeProvider officeProvider) {
      this.officeProvider = officeProvider;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (myOfficeCode != null ? myOfficeCode.hashCode() : 0);
      hash += (int) officeProviderId;
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof MyOfficeProvider)) {
         return false;
      }
      MyOfficeProvider other = (MyOfficeProvider) object;
      if ((this.myOfficeCode == null && other.myOfficeCode != null) || (this.myOfficeCode != null && !this.myOfficeCode.equals(other.myOfficeCode))) {
         return false;
      }
      if (this.officeProviderId != other.officeProviderId) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.MyOfficeProvider[myOfficeCode=" + myOfficeCode + ", officeProviderId=" + officeProviderId + "]";
   }
}