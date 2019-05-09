package by.devilmice.model;

import javax.persistence.*;

@Entity
@Table(name = "notebook_images", schema = "project", catalog = "")
public class NotebookImagesEntity {
    private int id;
    private String src;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "src")
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    private NotebookEntity notebookEntity;

    @ManyToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "notebook_id", referencedColumnName = "id")
    public NotebookEntity getNotebookEntity() {
        return notebookEntity;
    }

    public void setNotebookEntity(NotebookEntity notebookEntity) {
        this.notebookEntity = notebookEntity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NotebookImagesEntity that = (NotebookImagesEntity) o;

        if (id != that.id) return false;
        if (src != that.src) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        return result;
    }


}
