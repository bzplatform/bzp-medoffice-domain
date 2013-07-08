package medoffice.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.*;

@Entity
@Table(name = "provider_schedule_time")
public class ProviderScheduleTime implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;
   @JoinColumn(name = "provider_schedule_id", nullable = false)
   @ManyToOne
   private ProviderSchedule providerSchedule;   
   @Basic(optional = false)
   @Column(name = "start_time")
   @Temporal(TemporalType.TIMESTAMP)
   private Date startTime;
   @Basic(optional = false)
   @Column(name = "end_time")
   @Temporal(TemporalType.TIMESTAMP)
   private Date endTime;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public ProviderSchedule getProviderSchedule() {
      return providerSchedule;
   }

   public void setProviderSchedule(ProviderSchedule providerSchedule) {
      this.providerSchedule = providerSchedule;
   }

   public Date getStartTime() {
      return startTime;
   }

   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   public Date getEndTime() {
      return endTime;
   }

   public void setEndTime(Date endTime) {
      this.endTime = endTime;
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
      if (!(object instanceof ProviderScheduleTime)) {
         return false;
      }
      ProviderScheduleTime other = (ProviderScheduleTime) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.ProviderScheduleTime[id=" + id + "]";
   }
   
   static Date normalizeTime(Date time) {
      if (time == null) {
         return null;
      }
      Calendar calendar = new GregorianCalendar();
      calendar.setTime(time);
      calendar.set(Calendar.YEAR, 1899);
      calendar.set(Calendar.MONTH, 11);
      calendar.set(Calendar.DAY_OF_MONTH, 30);
      return calendar.getTime();
   }
}