package com.yejh.coronovirus.entity;

import org.hibernate.annotations.Proxy;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author yejh
 * @create 2020-04_16 20:14
 */

@Entity
@Table(name = "t_news")
@Proxy(lazy = false)
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @Column(name = "location_id")
    private Integer locationId;

    @Lob
    @Column(columnDefinition = "BLOB")
    private String Content;

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", date=" + date +
                ", locationId=" + locationId +
                ", Content='" + Content + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
