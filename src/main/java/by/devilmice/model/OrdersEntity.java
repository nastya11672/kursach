package by.devilmice.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "project", catalog = "")
public class OrdersEntity {
    private int id;
    private String fio;
    private String phone;
    private String address;
    private String comment;
    private String date;
    private String status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fio")
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    private NotebookEntity notebookEntity;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "notebook_id", referencedColumnName = "id")
    public NotebookEntity getNotebookEntity() {
        return notebookEntity;
    }

    public void setNotebookEntity(NotebookEntity notebookEntity) {
        this.notebookEntity = notebookEntity;
    }


    private UsersEntity usersEntity;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public UsersEntity getUsersEntity() {
        return usersEntity;
    }

    public void setUsersEntity(UsersEntity usersEntity) {
        this.usersEntity = usersEntity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return id == that.id &&
                Objects.equals(fio, that.fio) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, phone, address, comment, date);
    }



}
