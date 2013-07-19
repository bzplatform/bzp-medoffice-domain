package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "office_provider")
public class OfficeProvider implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;
   @Column(name = "associated_office_provider_id")
   private Integer associatedOfficeProviderId;
   @JoinColumn(name = "associated_npi")
   @ManyToOne
   private Provider associatedProvider;
   @Basic
   @Column(name = "associated_npi", updatable = false, insertable = false)
   private String associatedNpi;
   @JoinColumn(name = "referring_npi")
   @ManyToOne
   private Provider referringProvider;
   @Basic(optional = false)
   @Column(name = "specialty_id")
   private Integer specialtyId;
   @Basic(optional = false)
   @Column(name = "alias")
   private String alias;
   @Column(name = "role")
   private String role;
   @Basic(optional = false)
   @Column(name = "active")
   private boolean active;
   @Column(name = "cpt_code")
   private String cptCode;
   @Column(name = "last_updated")
   @Temporal(TemporalType.TIMESTAMP)
   private Date lastUpdated;
   @ManyToMany
   @JoinTable(name = "myoffice_provider",
   joinColumns =
   @JoinColumn(name = "office_provider_id"),
   inverseJoinColumns =
   @JoinColumn(name = "myoffice_code", referencedColumnName = "code"))
   private List<MyOffice> myOfficeList;   

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getAssociatedNpi() {
      return associatedNpi;
   }

   public void setAssociatedNpi(String associatedNpi) {
      this.associatedNpi = associatedNpi;
   }

   public Provider getAssociatedProvider() {
      return associatedProvider;
   }

   public void setAssociatedProvider(Provider associatedProvider) {
      this.associatedProvider = associatedProvider;
   }

   public Integer getSpecialtyId() {
      return specialtyId;
   }

   public void setSpecialtyId(Integer specialtyId) {
      this.specialtyId = specialtyId;
   }

   public Integer getAssociatedOfficeProviderId() {
      return associatedOfficeProviderId;
   }

   public void setAssociatedOfficeProviderId(Integer associatedOfficeProviderId) {
      this.associatedOfficeProviderId = associatedOfficeProviderId;
   }

   public Provider getReferringProvider() {
      return referringProvider;
   }

   public void setReferringProvider(Provider referringProvider) {
      this.referringProvider = referringProvider;
   }

   public String getAlias() {
      return alias;
   }

   public void setAlias(String alias) {
      this.alias = alias;
   }

   public String getRole() {
      return role;
   }

   public void setRole(String role) {
      this.role = role;
   }

   public boolean getActive() {
      return active;
   }

   public void setActive(boolean active) {
      this.active = active;
   }

   public String getCptCode() {
      return cptCode;
   }

   public void setCptCode(String cptCode) {
      this.cptCode = cptCode;
   }

   public Date getLastUpdated() {
      return lastUpdated;
   }

   public void setLastUpdated(Date lastUpdated) {
      this.lastUpdated = lastUpdated;
   }

   public List<MyOffice> getMyOfficeList() {
      return myOfficeList;
   }

   public void setMyOfficeList(List<MyOffice> myOfficeList) {
      this.myOfficeList = myOfficeList;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (id != null ? id.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof OfficeProvider)) {
         return false;
      }
      OfficeProvider other = (OfficeProvider) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.OfficeProvider[id=" + id + "]";
   }
}