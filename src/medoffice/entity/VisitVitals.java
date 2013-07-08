package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "visit_vitals")
public class VisitVitals implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "visit_id")
   private Integer visitId;
   @JoinColumn(name = "visit_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private Visit visit;
   @Column(name = "systolic_blood_pressure")
   private Integer systolicBloodPressure;
   @Column(name = "diastolic_blood_pressure")
   private Integer diastolicBloodPressure;
   @Column(name = "blood_pressure_position")
   private String bloodPressurePosition;
   @Column(name = "blood_pressure_location")
   private String bloodPressureLocation;
   @Column(name = "pulse_rate")
   private Integer pulseRate;
   @Column(name = "pulse_regularity")
   private String pulseRegularity;
   @Column(name = "respiratory_rate")
   private Integer respiratoryRate;
   @Column(name = "oxygen_level")
   private Integer oxygenLevel;
   // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
   @Column(name = "temperature")
   private Double temperature;
   @Column(name = "temperature_unit")
   private String temperatureUnit;
   @Column(name = "temperature_location")
   private String temperatureLocation;
   @Column(name = "height_base")
   private Integer heightBase;
   @Column(name = "height_fraction")
   private Integer heightFraction;
   @Column(name = "height_unit")
   private String heightUnit;
   @Column(name = "weight")
   private Integer weight;
   @Column(name = "weight_unit")
   private String weightUnit;
   @Column(name = "bmi")
   private Double bmi;
   @Transient
   private boolean persisted = true;
   @Column(name = "normal_range_id")
   private Integer normalRangeId = 1;
   @JoinColumn(name = "normal_range_id", insertable = false, updatable = false)
   @ManyToOne(fetch = FetchType.LAZY)
   private VitalsNormalRange normalRange;

   public Integer getVisitId() {
      return visitId;
   }

   public void setVisitId(Integer visitId) {
      this.visitId = visitId;
   }

   public Visit getVisit() {
      return visit;
   }

   public void setVisit(Visit visit) {
      this.visit = visit;
   }

   public Integer getSystolicBloodPressure() {
      return systolicBloodPressure;
   }

   public void setSystolicBloodPressure(Integer systolicBloodPressure) {
      this.systolicBloodPressure = systolicBloodPressure;
   }

   public boolean systolicBloodPressureOutOfNormalRange() {
      if (normalRange != null && systolicBloodPressure != null) {
         return (systolicBloodPressure < normalRange.getSystolicBloodPressureMin() || systolicBloodPressure > normalRange.getSystolicBloodPressureMax());
      }
      return false;
   }
   
   public String systolicBloodPressureNormalRange() {
      if (normalRange != null) {
         return (normalRange.getSystolicBloodPressureMin() + " - " + normalRange.getSystolicBloodPressureMax());
      }
      return null;
   }

   public Integer getDiastolicBloodPressure() {
      return diastolicBloodPressure;
   }

   public void setDiastolicBloodPressure(Integer diastolicBloodPressure) {
      this.diastolicBloodPressure = diastolicBloodPressure;
   }

   public boolean diastolicBloodPressureOutOfNormalRange() {
      if (normalRange != null && diastolicBloodPressure != null) {
         return (diastolicBloodPressure < normalRange.getDiastolicBloodPressureMin() || diastolicBloodPressure > normalRange.getDiastolicBloodPressureMax());
      }
      return false;
   }
   
   public String diastolicBloodPressureNormalRange() {
      if (normalRange != null) {
         return (normalRange.getDiastolicBloodPressureMin() + " - " + normalRange.getDiastolicBloodPressureMax());
      }
      return null;
   }

   public String getBloodPressurePosition() {
      return bloodPressurePosition;
   }

   public void setBloodPressurePosition(String bloodPressurePosition) {
      this.bloodPressurePosition = bloodPressurePosition;
   }

   public String getBloodPressureLocation() {
      return bloodPressureLocation;
   }

   public void setBloodPressureLocation(String bloodPressureLocation) {
      this.bloodPressureLocation = bloodPressureLocation;
   }

   public Integer getPulseRate() {
      return pulseRate;
   }

   public void setPulseRate(Integer pulseRate) {
      this.pulseRate = pulseRate;
   }

   public boolean pulseRateOutOfNormalRange() {
      if (normalRange != null && pulseRate != null) {
         return (pulseRate < normalRange.getPulseRateMin() || pulseRate > normalRange.getPulseRateMax());
      }
      return false;
   }
   
   public String pulseRateNormalRange() {
      if (normalRange != null) {
         return (normalRange.getPulseRateMin() + " - " + normalRange.getPulseRateMax());
      }
      return null;
   }

   public String getPulseRegularity() {
      return pulseRegularity;
   }

   public void setPulseRegularity(String pulseRegularity) {
      this.pulseRegularity = pulseRegularity;
   }

   public Integer getRespiratoryRate() {
      return respiratoryRate;
   }

   public void setRespiratoryRate(Integer respiratoryRate) {
      this.respiratoryRate = respiratoryRate;
   }

   public boolean respiratoryRateOutOfNormalRange() {
      if (normalRange != null && respiratoryRate != null) {
         return (respiratoryRate < normalRange.getRespiratoryRateMin() || respiratoryRate > normalRange.getRespiratoryRateMax());
      }
      return false;
   }
   
   public String respiratoryRateNormalRange() {
      if (normalRange != null) {
         return (normalRange.getRespiratoryRateMin() + " - " + normalRange.getRespiratoryRateMax());
      }
      return null;
   }

   public Integer getOxygenLevel() {
      return oxygenLevel;
   }

   public void setOxygenLevel(Integer oxygenLevel) {
      this.oxygenLevel = oxygenLevel;
   }

   public Double getTemperature() {
      return temperature;
   }

   public void setTemperature(Double temperature) {
      this.temperature = temperature;
   }

   public String getTemperatureUnit() {
      return temperatureUnit;
   }

   public void setTemperatureUnit(String temperatureUnit) {
      this.temperatureUnit = temperatureUnit;
   }

   public String getTemperatureLocation() {
      return temperatureLocation;
   }

   public void setTemperatureLocation(String temperatureLocation) {
      this.temperatureLocation = temperatureLocation;
   }

   public boolean temperatureOutOfNormalRange() {
      if (normalRange != null && temperature != null) {
         if ("F".equals(temperatureUnit)) {
            return (temperature < normalRange.getTemperatureFMin() || temperature > normalRange.getTemperatureFMax());
         } else if ("C".equals(temperatureUnit)) {
            return (temperature < normalRange.getTemperatureCMin() || temperature > normalRange.getTemperatureCMax());
         }
      }
      return false;
   }
   
   public String temperatureNormalRange() {
      if (normalRange != null) {
         if ("F".equals(temperatureUnit)) {
            return (normalRange.getTemperatureFMin() + "F - " + normalRange.getTemperatureFMax() + "F");
         } else if ("C".equals(temperatureUnit)) {
            return (normalRange.getTemperatureCMin() + "C - " + normalRange.getTemperatureCMax() + "C");
         }
      }
      return null;
   }

   public Integer getHeightBase() {
      return heightBase;
   }

   public void setHeightBase(Integer heightBase) {
      this.heightBase = heightBase;
   }

   public Integer getHeightFraction() {
      return heightFraction;
   }

   public void setHeightFraction(Integer heightFraction) {
      this.heightFraction = heightFraction;
   }

   public String getHeightUnit() {
      return heightUnit;
   }

   public String getHeightBaseUnit() {
      return heightUnit == null || heightUnit.indexOf("/") == -1 ? null : heightUnit.substring(0, heightUnit.indexOf("/"));
   }

   public String getHeightFractionUnit() {
      return heightUnit == null ? null : heightUnit.substring(heightUnit.indexOf("/") + 1);
   }

   public void setHeightUnit(String heightUnit) {
      this.heightUnit = heightUnit;
   }

   public Integer getWeight() {
      return weight;
   }

   public void setWeight(Integer weight) {
      this.weight = weight;
   }

   public String getWeightUnit() {
      return weightUnit;
   }

   public void setWeightUnit(String weightUnit) {
      this.weightUnit = weightUnit;
   }

   public Double getBmi() {
      return bmi;
   }

   public void setBmi(Double bmi) {
      this.bmi = bmi;
   }

   public boolean isPersisted() {
      return persisted;
   }

   public void setPersisted(boolean persisted) {
      this.persisted = persisted;
   }

   public Date getDate() {
      if (visit == null) {
         return null;
      }
      return visit.getDate();
   }

   public VitalsNormalRange getNormalRange() {
      return normalRange;
   }

   public int bulletsFilled() {
      int bulletsFilled = 0;
      if (systolicBloodPressure != null) {
         bulletsFilled++;
      }
      if (diastolicBloodPressure != null) {
         bulletsFilled++;
      }
      if (pulseRate != null) {
         bulletsFilled++;
      }
      if (pulseRegularity != null && !pulseRegularity.trim().isEmpty()) {
         bulletsFilled++;
      }
      if (respiratoryRate != null) {
         bulletsFilled++;
      }
      if (oxygenLevel != null) {
         bulletsFilled++;
      }
      if (temperature != null) {
         bulletsFilled++;
      }
      if (heightBase != null) {
         bulletsFilled++;
      }
      if (weight != null) {
         bulletsFilled++;
      }
      return bulletsFilled;
   }

   public boolean emptyData() {
      return (bulletsFilled() == 0);
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (visitId != null ? visitId.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof VisitVitals)) {
         return false;
      }
      VisitVitals other = (VisitVitals) object;
      if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.VisitVitals[visitId=" + visitId + "]";
   }
}