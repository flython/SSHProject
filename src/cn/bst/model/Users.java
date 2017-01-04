package cn.bst.model;

import java.sql.Timestamp;


/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String account;
     private String psw;
     private Integer sex;
     private Integer age;
     private String phoneNumber;
     private String headImage;
     private Timestamp regTime;
     private Timestamp lastLoginTime;
     private String personalCheck;
     private String email;
     private Integer likeCount;
     private Integer shareCount;


    // Constructors

    /** default constructor */
    public Users() {
    }

	/** minimal constructor */
    public Users(String account, String psw, Timestamp regTime) {
        this.account = account;
        this.psw = psw;
        this.regTime = regTime;
    }
    
    /** full constructor */
    public Users(String account, String psw, Integer sex, Integer age, String phoneNumber, String headImage, Timestamp regTime, Timestamp lastLoginTime, String personalCheck, String email, Integer likeCount, Integer shareCount) {
        this.account = account;
        this.psw = psw;
        this.sex = sex;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.headImage = headImage;
        this.regTime = regTime;
        this.lastLoginTime = lastLoginTime;
        this.personalCheck = personalCheck;
        this.email = email;
        this.likeCount = likeCount;
        this.shareCount = shareCount;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return this.account;
    }
    
    public void setAccount(String account) {
        this.account = account;
    }

    public String getPsw() {
        return this.psw;
    }
    
    public void setPsw(String psw) {
        this.psw = psw;
    }

    public Integer getSex() {
        return this.sex;
    }
    
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHeadImage() {
        return this.headImage;
    }
    
    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Timestamp getRegTime() {
        return this.regTime;
    }
    
    public void setRegTime(Timestamp regTime) {
        this.regTime = regTime;
    }

    public Timestamp getLastLoginTime() {
        return this.lastLoginTime;
    }
    
    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getPersonalCheck() {
        return this.personalCheck;
    }
    
    public void setPersonalCheck(String personalCheck) {
        this.personalCheck = personalCheck;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }
    
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getShareCount() {
        return this.shareCount;
    }
    
    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }
   








}