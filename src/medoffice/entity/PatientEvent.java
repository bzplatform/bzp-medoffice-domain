package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "patient_event")
public class PatientEvent implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id   
   @Column(name = "id")
   private Integer id;
   @JoinColumn(name = "patient_id", nullable = false)
   @ManyToOne(cascade = CascadeType.REFRESH)
   private Patient patient;   
   @Column(name = "datetime")
   @Temporal(TemporalType.TIMESTAMP)
   private Date datetime;
   @Column(name = "event")
   private String event;
   @Column(name = "submitted")
   private boolean submitted;
   @Column(name = "notes")
   private String notes;

   public PatientEvent() {
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Patient getPatient() {
      return patient;
   }

   public void setPatient(Patient patient) {
      this.patient = patient;
   }

   public Date getDatetime() {
      return datetime;
   }

   public void setDatetime(Date datetime) {
      this.datetime = datetime;
   }

   public String getEvent() {
      return event;
   }

   public void setEvent(String event) {
      this.event = event;
   }

   public boolean isSubmitted() {
      return submitted;
   }

   public void setSubmitted(boolean submitted) {
      this.submitted = submitted;
   }

   public String getNotes() {
      return notes;
   }

   public void setNotes(String notes) {
      this.notes = notes;
   }
   
   @Override
   public int hashCode() {
      int hash = 0;
      hash += (this.id != null ? this.id.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof PatientEvent)) {
         return false;
      }
      PatientEvent other = (PatientEvent) object;
      if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.PatientEvent[id=" + id + "]";
   }   
}
