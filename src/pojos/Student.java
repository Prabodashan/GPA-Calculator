package pojos;
// Generated Dec 22, 2019 10:32:27 AM by Hibernate Tools 4.3.1



/**
 * Student generated by hbm2java
 */
public class Student  implements java.io.Serializable {


     private String sid;
     private String fname;
     private String lname;
     private String nic;
     private String email;
     private String address;

    public Student() {
    }

    public Student(String sid, String fname, String lname, String nic, String email, String address) {
       this.sid = sid;
       this.fname = fname;
       this.lname = lname;
       this.nic = nic;
       this.email = email;
       this.address = address;
    }
   
    public String getSid() {
        return this.sid;
    }
    
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getNic() {
        return this.nic;
    }
    
    public void setNic(String nic) {
        this.nic = nic;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }




}

