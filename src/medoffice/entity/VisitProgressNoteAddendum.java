package medoffice.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "[visit:progress_note_addendum]")
public class VisitProgressNoteAddendum implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;
   @JoinColumn(name = "visit_id")
   @OneToOne(fetch = FetchType.LAZY)
   private VisitProgressNote progressNote;   
   @Column(name = "datetime")
   @Temporal(TemporalType.TIMESTAMP)
   private Date datetime;
   @Column(name = "user_id")
   private Integer userId;
   @Column(name = "addendum")
   private String text;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public VisitProgressNote getProgressNote() {
      return progressNote;
   }

   public void setProgressNote(VisitProgressNote progressNote) {
      this.progressNote = progressNote;
   }

   public Date getDatetime() {
      return datetime;
   }

   public void setDatetime(Date datetime) {
      this.datetime = datetime;
   }

   public Integer getUserId() {
      return userId;
   }

   public void setUserId(Integer userId) {
      this.userId = userId;
   }

   public String getText() {
      return text;
   }

   public void setText(String text) {
      this.text = text;
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
      if (!(object instanceof VisitProgressNoteAddendum)) {
         return false;
      }
      VisitProgressNoteAddendum other = (VisitProgressNoteAddendum) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "com.medenterprise.domain.entity.VisitProgressNoteAddendum[id=" + id + "]";
   }  
}