package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "patient_immunization")
public class PatientImmunization implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Basic(optional = false)
   @Column(name = "id")
   private Integer id;
   @Basic(optional = false)
   @Column(name = "patient_id")
   private int patientId;
   @JoinColumn(name = "patient_id", nullable = false, insertable = false, updatable = false)
   @ManyToOne
   private Patient patient;
   @Column(name = "cvx_code")
   private String cvxCode;
   @Column(name = "immunization_type")
   private String immunizationType;
   @Column(name = "dose")
   private String dose;
   @Column(name = "administration_date")
   @Temporal(TemporalType.DATE)
   private Date administrationDate;
   @Column(name = "administration_time")
   @Temporal(TemporalType.TIMESTAMP)
   private Date administrationTime;
   @Column(name = "route")
   private String route;
   @Column(name = "site")
   private String site;
   @Column(name = "reaction")
   private String reaction;
   @Column(name = "lot_number")
   private String lotNumber;
   @Column(name = "expiration_date")
   @Temporal(TemporalType.DATE)
   private Date expirationDate;
   @Column(name = "manufacturer")
   private String manufacturer;
   @Column(name = "created")
   @Temporal(TemporalType.TIMESTAMP)
   private Date created;
   @Column(name = "user_id")
   private Integer userId;
   @Column(name = "last_updated_user_id")
   private Integer lastUpdatedUserId;
   @Column(name = "last_updated")
   @Temporal(TemporalType.TIMESTAMP)
   private Date lastUpdated;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public int getPatientId() {
      return patientId;
   }

   public void setPatientId(int patientId) {
      this.patientId = patientId;
   }

   public Patient getPatient() {
      return patient;
   }

   public void setPatient(Patient patient) {
      this.patient = patient;
   }

   public String getCvxCode() {
      return cvxCode;
   }

   public void setCvxCode(String cvxCode) {
      this.cvxCode = cvxCode;
   }

   public String getImmunizationType() {
      return immunizationType;
   }

   public void setImmunizationType(String immunizationType) {
      this.immunizationType = immunizationType;
   }

   public String getDose() {
      return dose;
   }

   public void setDose(String dose) {
      this.dose = dose;
   }

   public Date getAdministrationDate() {
      return administrationDate;
   }

   public void setAdministrationDate(Date administrationDate) {
      this.administrationDate = administrationDate;
   }

   public Date getAdministrationTime() {
      return administrationTime;
   }

   public void setAdministrationTime(Date administrationTime) {
      this.administrationTime = administrationTime;
   }

   public String getRoute() {
      return route;
   }

   public void setRoute(String route) {
      this.route = route;
   }

   public String getSite() {
      return site;
   }

   public void setSite(String site) {
      this.site = site;
   }

   public String getReaction() {
      return reaction;
   }

   public void setReaction(String reaction) {
      this.reaction = reaction;
   }

   public String getLotNumber() {
      return lotNumber;
   }

   public void setLotNumber(String lotNumber) {
      this.lotNumber = lotNumber;
   }

   public Date getExpirationDate() {
      return expirationDate;
   }

   public void setExpirationDate(Date expirationDate) {
      this.expirationDate = expirationDate;
   }

   public String getManufacturer() {
      return manufacturer;
   }

   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }

   public Date getCreated() {
      return created;
   }

   public void setCreated(Date created) {
      this.created = created;
   }

   public Integer getUserId() {
      return userId;
   }

   public void setUserId(Integer userId) {
      this.userId = userId;
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

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (id != null ? id.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof PatientImmunization)) {
         return false;
      }
      PatientImmunization other = (PatientImmunization) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.PatientImmunization[id=" + id + "]";
   }
}