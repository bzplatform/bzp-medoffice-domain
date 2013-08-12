package medoffice.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "visit_doc")
public class VisitDoc implements Serializable {

   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "id")
   private Integer id;
   @Column(name = "type")
   private String type;
   @JoinColumn(name = "specialty_id")
   @ManyToOne(optional = false)
   private Specialty specialty;
   @Column(name = "title")
   private String title;
   @Column(name = "name")
   private String name;
   @Column(name = "pos")
   private Integer pos;
   @Column(name = "pages")
   private Integer pages;
   @Column(name = "batch")
   private Boolean batch;
   @Column(name = "static")
   private boolean static_;
   

   public VisitDoc() {
   }

   public VisitDoc(Integer id) {
      this.id = id;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public Specialty getSpecialty() {
      return specialty;
   }

   public void setSpecialty(Specialty specialty) {
      this.specialty = specialty;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getPages() {
      return pages;
   }

   public void setPages(Integer pages) {
      this.pages = pages;
   }

   public Integer getPos() {
      return pos;
   }

   public void setPos(Integer pos) {
      this.pos = pos;
   }

   public Boolean getBatch() {
      return batch;
   }

   public void setBatch(Boolean batch) {
      this.batch = batch;
   }

   public boolean isStatic_() {
      return static_;
   }

   public void setStatic_(boolean static_) {
      this.static_ = static_;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (id != null ? id.hashCode() : 0);
      return hash;
   }

   public String getPath(int page) {
      String path = null;
      path = specialty.getName().replace(" ", "").toLowerCase() + "/" + name + "-p" + page + "." + type;
      return path;
   }
   
   public List<String> getPageList() {
      List<String> pageList = new ArrayList();
      for (int i = 1; i <= pages; i++) {
         pageList.add(i + "");
      }
      return pageList;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof VisitDoc)) {
         return false;
      }
      VisitDoc other = (VisitDoc) object;
      if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "medoffice.entity.VisitDoc[id=" + id + "]";
   }
}
