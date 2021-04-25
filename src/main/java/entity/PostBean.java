package entity;

import model.AdminLogin;
import java.util.Date;

public class PostBean {
    private Long id;
    private String title;
    private AdminLogin author;
    private String description;
    private Date createdAt;

    public PostBean(Long id, String title, AdminLogin author, String description, Date createdAt) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.createdAt = createdAt;
    }

    public PostBean(Long id, String title, UserBean currentUser, String description, Object createdAt) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AdminLogin getAuthor() {
        return author;
    }

    public void setAuthor(AdminLogin author) {
        this.author = author;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
