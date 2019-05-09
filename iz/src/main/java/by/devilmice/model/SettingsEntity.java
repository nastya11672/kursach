package by.devilmice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "settings", schema = "project", catalog = "")
public class SettingsEntity {
    private int id;
    private String title;
    private String keywords;
    private String description;
    private int offline;

    @Id
    @Column(name = "id")
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
    @Column(name = "keywords")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "offline")
    public int getOffline() {
        return offline;
    }

    public void setOffline(int offline) {
        this.offline = offline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SettingsEntity that = (SettingsEntity) o;
        return id == that.id &&
                offline == that.offline &&
                Objects.equals(title, that.title) &&
                Objects.equals(keywords, that.keywords) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, keywords, description, offline);
    }
}
