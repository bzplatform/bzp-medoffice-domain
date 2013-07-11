package medoffice.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "provider_appointment_category")
public class ProviderAppointmentCategory implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;
   @Basic(optional = false)
   @Column(name = "office_provider_id")
   private int officeProviderId;
   @JoinColumn(name = "visit_category_code", nullable = false)
   @ManyToOne
   private VisitCategory visitCategory;
   @Column(name = "duration")
   private Short duration;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public int getOfficeProviderId() {
      return officeProviderId;
   }

   public void setOfficeProviderId(int officeProviderId) {
      this.officeProviderId = officeProviderId;
   }

   public VisitCategory getVisitCategory() {
      return visitCategory;
   }

   public void setVisitCategory(VisitCategory visitCategory) {
      this.visitCategory = visitCategory;
   }

   public Short getDuration() {
      return duration;
   }

   public void setDuration(Short duration) {
      this.duration = duration;
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
      if (!(object instanceof ProviderAppointmentCategory)) {
         return false;
      }
      ProviderAppointmentCategory other = (ProviderAppointmentCategory) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.ProviderAppointmentCategory[id=" + id + "]";
   }  
}