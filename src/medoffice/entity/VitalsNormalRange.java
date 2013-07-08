package medoffice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vitals_normal_range")
public class VitalsNormalRange implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "id")
   private Integer id;
   @Column(name = "systolic_blood_pressure_min")
   private Integer systolicBloodPressureMin;
   @Column(name = "systolic_blood_pressure_max")
   private Integer systolicBloodPressureMax;
   @Column(name = "diastolic_blood_pressure_min")
   private Integer diastolicBloodPressureMin;
   @Column(name = "diastolic_blood_pressure_max")
   private Integer diastolicBloodPressureMax;
   @Column(name = "pulse_rate_min")
   private Integer pulseRateMin;
   @Column(name = "pulse_rate_max")
   private Integer pulseRateMax;
   @Column(name = "respiratory_rate_min")
   private Integer respiratoryRateMin;
   @Column(name = "respiratory_rate_max")
   private Integer respiratoryRateMax;
   // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
   @Column(name = "temperature_f_min")
   private Double temperatureFMin;
   @Column(name = "temperature_f_max")
   private Double temperatureFMax;
   @Column(name = "temperature_c_min")
   private Double temperatureCMin;
   @Column(name = "temperature_c_max")
   private Double temperatureCMax;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Integer getSystolicBloodPressureMin() {
      return systolicBloodPressureMin;
   }

   public void setSystolicBloodPressureMin(Integer systolicBloodPressureMin) {
      this.systolicBloodPressureMin = systolicBloodPressureMin;
   }

   public Integer getSystolicBloodPressureMax() {
      return systolicBloodPressureMax;
   }

   public void setSystolicBloodPressureMax(Integer systolicBloodPressureMax) {
      this.systolicBloodPressureMax = systolicBloodPressureMax;
   }

   public Integer getDiastolicBloodPressureMin() {
      return diastolicBloodPressureMin;
   }

   public void setDiastolicBloodPressureMin(Integer diastolicBloodPressureMin) {
      this.diastolicBloodPressureMin = diastolicBloodPressureMin;
   }

   public Integer getDiastolicBloodPressureMax() {
      return diastolicBloodPressureMax;
   }

   public void setDiastolicBloodPressureMax(Integer diastolicBloodPressureMax) {
      this.diastolicBloodPressureMax = diastolicBloodPressureMax;
   }

   public Integer getPulseRateMin() {
      return pulseRateMin;
   }

   public void setPulseRateMin(Integer pulseRateMin) {
      this.pulseRateMin = pulseRateMin;
   }

   public Integer getPulseRateMax() {
      return pulseRateMax;
   }

   public void setPulseRateMax(Integer pulseRateMax) {
      this.pulseRateMax = pulseRateMax;
   }

   public Integer getRespiratoryRateMin() {
      return respiratoryRateMin;
   }

   public void setRespiratoryRateMin(Integer respiratoryRateMin) {
      this.respiratoryRateMin = respiratoryRateMin;
   }

   public Integer getRespiratoryRateMax() {
      return respiratoryRateMax;
   }

   public void setRespiratoryRateMax(Integer respiratoryRateMax) {
      this.respiratoryRateMax = respiratoryRateMax;
   }

   public Double getTemperatureFMin() {
      return temperatureFMin;
   }

   public void setTemperatureFMin(Double temperatureFMin) {
      this.temperatureFMin = temperatureFMin;
   }

   public Double getTemperatureFMax() {
      return temperatureFMax;
   }

   public void setTemperatureFMax(Double temperatureFMax) {
      this.temperatureFMax = temperatureFMax;
   }

   public Double getTemperatureCMin() {
      return temperatureCMin;
   }

   public void setTemperatureCMin(Double temperatureCMin) {
      this.temperatureCMin = temperatureCMin;
   }

   public Double getTemperatureCMax() {
      return temperatureCMax;
   }

   public void setTemperatureCMax(Double temperatureCMax) {
      this.temperatureCMax = temperatureCMax;
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
      if (!(object instanceof VitalsNormalRange)) {
         return false;
      }
      VitalsNormalRange other = (VitalsNormalRange) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.VitalsNormalRange[id=" + id + "]";
   }
}