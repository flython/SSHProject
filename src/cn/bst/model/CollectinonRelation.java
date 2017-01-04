package cn.bst.model;



/**
 * CollectinonRelation entity. @author MyEclipse Persistence Tools
 */

public class CollectinonRelation  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer usersId;
     private Integer shearsId;


    // Constructors

    /** default constructor */
    public CollectinonRelation() {
    }

    
    /** full constructor */
    public CollectinonRelation(Integer usersId, Integer shearsId) {
        this.usersId = usersId;
        this.shearsId = shearsId;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsersId() {
        return this.usersId;
    }
    
    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getShearsId() {
        return this.shearsId;
    }
    
    public void setShearsId(Integer shearsId) {
        this.shearsId = shearsId;
    }
   








}