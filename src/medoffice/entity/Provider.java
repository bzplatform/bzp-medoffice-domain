package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "provider")
public class Provider implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "npi")
   private String npi;
   @Basic(optional = false)
   @Column(name = "last_name")
   private String lastName;
   @Basic(optional = false)
   @Column(name = "first_name")
   private String firstName;
   @Column(name = "middle_initial")
   private Character middleInitial;
   @Basic(optional = false)
   @Column(name = "active")
   private boolean active;
   @Column(name = "state_license_num")
   private String stateLicenseNum;
   @Column(name = "upin")
   private String upin;
   @Basic(optional = false)
   @Column(name = "specialty_id")
   private int specialtyId;
   @Column(name = "taxonomy_code")
   private String taxonomyCode;
   @Column(name = "extra_taxonomy_codes")
   private String extraTaxonomyCodes;
   @Basic(optional = false)
   @Column(name = "sex")
   private char sex;
   @Column(name = "suffix")
   private String suffix;
   @Basic(optional = false)
   @Column(name = "primary_care_physician")
   private boolean primaryCarePhysician;
   @Column(name = "address")
   private String address;
   @Column(name = "city")
   private String city;
   @Column(name = "state")
   private String state;
   @Column(name = "zip_code")
   private String postalCode;
   @Column(name = "mobile_phone")
   private String mobilePhone;
   @Column(name = "home_phone")
   private String homePhone;
   @Column(name = "work_phone")
   private String workPhone;
   @Column(name = "work_phone_ext")
   private String workPhoneExt;
   @Column(name = "email")
   private String email;
   @Column(name = "last_updated_user_id")
   private Integer lastUpdatedUserId;
   @Column(name = "last_updated")
   @Temporal(TemporalType.TIMESTAMP)
   private Date lastUpdated;
   @Lob
   @Column(name = "signature")
   private byte[] signature;
   @Column(name = "signature_css")
   private String signatureCss;

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public Character getMiddleInitial() {
      return middleInitial;
   }

   public void setMiddleInitial(Character middleInitial) {
      this.middleInitial = middleInitial;
   }

   public String getName() {
      return lastName + ", " + firstName;
   }
   
   public boolean getActive() {
      return active;
   }

   public void setActive(boolean active) {
      this.active = active;
   }

   public String getNpi() {
      return npi;
   }

   public void setNpi(String npi) {
      this.npi = npi;
   }

   public String getStateLicenseNum() {
      return stateLicenseNum;
   }

   public void setStateLicenseNum(String stateLicenseNum) {
      this.stateLicenseNum = stateLicenseNum;
   }

   public String getUpin() {
      return upin;
   }

   public void setUpin(String upin) {
      this.upin = upin;
   }

   public int getSpecialtyId() {
      return specialtyId;
   }

   public void setSpecialtyId(int specialtyId) {
      this.specialtyId = specialtyId;
   }

   public String getExtraTaxonomyCodes() {
      return extraTaxonomyCodes;
   }

   public void setExtraTaxonomyCodes(String extraTaxonomyCodes) {
      this.extraTaxonomyCodes = extraTaxonomyCodes;
   }

   public String getTaxonomyCode() {
      return taxonomyCode;
   }

   public void setTaxonomyCode(String taxonomyCode) {
      this.taxonomyCode = taxonomyCode;
   }

   public char getSex() {
      return sex;
   }

   public void setSex(char sex) {
      this.sex = sex;
   }

   public String getSuffix() {
      return suffix;
   }

   public void setSuffix(String suffix) {
      this.suffix = suffix;
   }

   public boolean getPrimaryCarePhysician() {
      return primaryCarePhysician;
   }

   public void setPrimaryCarePhysician(boolean primaryCarePhysician) {
      this.primaryCarePhysician = primaryCarePhysician;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
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

   public String getPostalCode() {
      return postalCode;
   }

   public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
   }

   public String getMobilePhone() {
      return mobilePhone;
   }

   public void setMobilePhone(String mobilePhone) {
      this.mobilePhone = mobilePhone;
   }

   public String getHomePhone() {
      return homePhone;
   }

   public void setHomePhone(String homePhone) {
      this.homePhone = homePhone;
   }

   public String getWorkPhone() {
      return workPhone;
   }

   public void setWorkPhone(String workPhone) {
      this.workPhone = workPhone;
   }

   public String getWorkPhoneExt() {
      return workPhoneExt;
   }

   public void setWorkPhoneExt(String workPhoneExt) {
      this.workPhoneExt = workPhoneExt;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Integer getLastUpdatedUserId() {
      return lastUpdatedUserId;
   }

   public void setLastUpdatedUserId(Integer lastUpdatedUserId) {
      this.lastUpdatedUserId = lastUpdatedUserId;
   }

   public Date getLastUpdated() {
      return lastUpdated;
   }

   public void setLastUpdated(Date lastUpdated) {
      this.lastUpdated = lastUpdated;
   }

   public byte[] getSignature() {
      return signature;
   }

   public void setSignature(byte[] signature) {
      this.signature = signature;
   }

   public String getSignatureCss() {
      return signatureCss;
   }

   public void setSignatureCss(String signatureCss) {
      this.signatureCss = signatureCss;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (npi != null ? npi.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof Provider)) {
         return false;
      }
      Provider other = (Provider) object;
      if ((this.npi == null && other.npi != null) || (this.npi != null && !this.npi.equals(other.npi))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.Provider[code=" + npi + "]";
   }
}