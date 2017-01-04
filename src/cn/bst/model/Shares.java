package cn.bst.model;

import java.sql.Timestamp;


/**
 * Shares entity. @author MyEclipse Persistence Tools
 */

public class Shares  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String title;
     private String shearImage;
     private String content;
     private Integer masterId;
     private String tagArray;
     private Timestamp shareTime;
     private Integer replysCount;
     private Integer likeCount;


    // Constructors

    /** default constructor */
    public Shares() {
    }

	/** minimal constructor */
    public Shares(String title, Integer masterId) {
        this.title = title;
        this.masterId = masterId;
    }
    
    /** full constructor */
    public Shares(String title, String shearImage, String content, Integer masterId, String tagArray, Timestamp shareTime, Integer replysCount, Integer likeCount) {
        this.title = title;
        this.shearImage = shearImage;
        this.content = content;
        this.masterId = masterId;
        this.tagArray = tagArray;
        this.shareTime = shareTime;
        this.replysCount = replysCount;
        this.likeCount = likeCount;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getShearImage() {
        return this.shearImage;
    }
    
    public void setShearImage(String shearImage) {
        this.shearImage = shearImage;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Integer getMasterId() {
        return this.masterId;
    }
    
    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public String getTagArray() {
        return this.tagArray;
    }
    
    public void setTagArray(String tagArray) {
        this.tagArray = tagArray;
    }

    public Timestamp getShareTime() {
        return this.shareTime;
    }
    
    public void setShareTime(Timestamp shareTime) {
        this.shareTime = shareTime;
    }

    public Integer getReplysCount() {
        return this.replysCount;
    }
    
    public void setReplysCount(Integer replysCount) {
        this.replysCount = replysCount;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }
    
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }
   








}