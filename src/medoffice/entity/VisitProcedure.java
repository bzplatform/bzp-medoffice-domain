package medoffice.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "visit_procedure")
public class VisitProcedure implements Serializable {

   @Id
   @Column(name = "id", nullable = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @JoinColumn(name = "visit_id", nullable = false)
   @ManyToOne
   private Visit visit;
   @Column(name = "code", insertable = false, updatable = false)
   private String code;
   @JoinColumn(name = "code", nullable = false)
   @ManyToOne
   private Procedure procedure;
   @Column(name = "modifier1")
   private String modifier1;
   @Column(name = "modifier2")
   private String modifier2;
   @Column(name = "modifier3")
   private String modifier3;
   @Column(name = "pointers")
   private String pointers;
   @Column(name = "units")
   private Short units;

   public VisitProcedure() {
      this.units = (short) 1;
   }

   public VisitProcedure(Integer id) {
      this.id = id;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Visit getVisit() {
      return visit;
   }

   public void setVisit(Visit visit) {
      this.visit = visit;
   }

   public Procedure getProcedure() {
      return procedure;
   }

   public void setProcedure(Procedure procedure) {
      this.procedure = procedure;
   }

   public String getModifier1() {
      return modifier1;
   }

   public void setModifier1(String modifier1) {
      this.modifier1 = modifier1;
   }

   public String getModifier2() {
      return modifier2;
   }

   public void setModifier2(String modifier2) {
      this.modifier2 = modifier2;
   }

   public String getModifier3() {
      return modifier3;
   }

   public void setModifier3(String modifier3) {
      this.modifier3 = modifier3;
   }

   public String getPointers() {
      return pointers;
   }

   public void setPointers(String pointers) {
      this.pointers = pointers;
   }

   public Short getUnits() {
      return units;
   }

   public void setUnits(Short units) {
      this.units = units;
   }

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
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
      if (!(object instanceof VisitProcedure)) {
         return false;
      }
      VisitProcedure other = (VisitProcedure) object;
      if ((this.code == null && other.code != null) || !this.code.equals(other.code)) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.VisitProcedure[id=" + id + "]";
   }
}