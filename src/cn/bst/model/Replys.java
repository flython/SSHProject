package cn.bst.model;

import java.sql.Timestamp;


/**
 * Replys entity. @author MyEclipse Persistence Tools
 */

public class Replys  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer shearsId;
     private Integer usersId;
     private String content;
     private Timestamp replysTime;


    // Constructors

    /** default constructor */
    public Replys() {
    }

	/** minimal constructor */
    public Replys(Integer shearsId, Integer usersId, String content) {
        this.shearsId = shearsId;
        this.usersId = usersId;
        this.content = content;
    }
    
    /** full constructor */
    public Replys(Integer shearsId, Integer usersId, String content, Timestamp replysTime) {
        this.shearsId = shearsId;
        this.usersId = usersId;
        this.content = content;
        this.replysTime = replysTime;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShearsId() {
        return this.shearsId;
    }
    
    public void setShearsId(Integer shearsId) {
        this.shearsId = shearsId;
    }

    public Integer getUsersId() {
        return this.usersId;
    }
    
    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getReplysTime() {
        return this.replysTime;
    }
    
    public void setReplysTime(Timestamp replysTime) {
        this.replysTime = replysTime;
    }
   








}