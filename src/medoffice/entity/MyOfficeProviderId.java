package medoffice.entity;

import java.io.Serializable;

public class MyOfficeProviderId implements Serializable {

   private String myOfficeCode;
   private int officeProviderId;

   public MyOfficeProviderId() {
   }

   public MyOfficeProviderId(String myOfficeCode, int officeProviderId) {
      this.myOfficeCode = myOfficeCode;
      this.officeProviderId = officeProviderId;
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
      if (!(object instanceof MyOfficeProviderId)) {
         return false;
      }
      MyOfficeProviderId other = (MyOfficeProviderId) object;
      if ((this.myOfficeCode == null && other.myOfficeCode != null) || (this.myOfficeCode != null && !this.myOfficeCode.equals(other.myOfficeCode))) {
         return false;
      }
      if (this.officeProviderId != other.officeProviderId) {
         return false;
      }
      return true;
   }
}