package medoffice.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "visit_payment")
public class VisitPayment implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @JoinColumn(name = "visit_id", nullable = false)
   @ManyToOne
   private Visit visit;   
   @Basic(optional = false)
   @Column(name = "payment_type_id")
   private int paymentTypeId;   
   @JoinColumn(name = "payment_type_id", insertable = false, updatable = false)
   @ManyToOne
   private PaymentType paymentType;   
   @JoinColumn(name = "payment_method_id", nullable = false)
   @ManyToOne
   private PaymentMethod paymentMethod;
   @Column(name = "check_number")
   private Integer checkNumber;
   @Basic(optional = false)
   @Column(name = "amount")
   private BigDecimal amount;

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

   public int getPaymentTypeId() {
      return paymentTypeId;
   }

   public void setPaymentTypeId(int paymentTypeId) {
      this.paymentTypeId = paymentTypeId;
   }

   public PaymentType getPaymentType() {
      return paymentType;
   }

   public void setPaymentType(PaymentType paymentType) {
      this.paymentType = paymentType;
   }

   public PaymentMethod getPaymentMethod() {
      return paymentMethod;
   }

   public void setPaymentMethod(PaymentMethod paymentMethod) {
      this.paymentMethod = paymentMethod;
   }

   public Integer getCheckNumber() {
      return checkNumber;
   }

   public void setCheckNumber(Integer checkNumber) {
      this.checkNumber = checkNumber;
   }

   public BigDecimal getAmount() {
      return amount;
   }

   public void setAmount(BigDecimal amount) {
      this.amount = amount;
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
      if (!(object instanceof VisitPayment)) {
         return false;
      }
      VisitPayment other = (VisitPayment) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.VisitPayment[id=" + id + "]";
   }
}