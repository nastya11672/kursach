package by.devilmice.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.*;

@Entity
@Table(name = "news", schema = "project", catalog = "")
public class NewsEntity {
    private int id;
    private String title;
    private String story;
    private String date;
    private String img;
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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "story")
    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Basic
    @Column(name = "date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "img")
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewsEntity that = (NewsEntity) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (story != null ? !story.equals(that.story) : that.story != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (story != null ? story.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }


}
