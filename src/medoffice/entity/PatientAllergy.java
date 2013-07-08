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
@Table(name = "patient_allergy")
public class PatientAllergy implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private Integer id;
   @Basic(optional = false)
   @Column(name = "patient_id")
   private int patientId;
   @JoinColumn(name = "patient_id", nullable = false, insertable = false, updatable = false)
   @ManyToOne
   private Patient patient;
   @JoinColumn(name = "allergy_id")
   @ManyToOne
   private Allergy allergy;
   @Column(name = "reaction")
   private String reaction;
   @Temporal(TemporalType.TIMESTAMP)
   @Column(name = "datetime")
   private Date datetime;
   @Basic(optional = false)   
   @Column(name = "active")
   private boolean active;
   @Column(name = "user_id")
   private Integer userId;   
   
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

   public Allergy getAllergy() {
      return allergy;
   }

   public void setAllergy(Allergy allergy) {
      this.allergy = allergy;
   }

   public String getReaction() {
      return reaction;
   }

   public void setReaction(String reaction) {
      this.reaction = reaction;
   }

   public Date getDatetime() {
      return datetime;
   }

   public void setDatetime(Date datetime) {
      this.datetime = datetime;
   }

   public boolean getActive() {
      return active;
   }

   public void setActive(boolean active) {
      this.active = active;
   }

   public Integer getUserId() {
      return userId;
   }

   public void setUserId(Integer userId) {
      this.userId = userId;
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
      if (!(object instanceof PatientAllergy)) {
         return false;
      }
      PatientAllergy other = (PatientAllergy) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.PatientAllergy[id=" + id + "]";
   }  
}