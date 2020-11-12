package com.ghac.myspilder.myspilder3.entity.po;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 新闻内容
 * @author 常青
 *
 */
@Entity
@Table(name = "yang_guang_page_content")
public class YangGuangPageContent {

    //新闻内容id
    @Id
    private String id;

    //新闻正文
    private String content;

    //新闻作者
    private String author;

    //列表的新闻类型
    private String type;

    //新闻发表地点
    private String address;

    //新闻标题
    private String title;

    //新闻的被关注状态
    private String status;

    //新闻发表时间
    @Column(name = "publish_time")
    private String publishTime;

    //新闻抓取时间
    @Column(name = "created_time")
    private Date createdTime;

    //新闻抓取者
    @Column(name = "created_by")
    private String createdBy;

    //列表的正文指向url
    @Column(name = "content_url")
    private String contentUrl;

    //新闻抓取时间
    @Column(name = "updated_time")
    private Date updatedTime;

    //新闻抓取者
    @Column(name = "updated_by")
    private String updatedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }



}