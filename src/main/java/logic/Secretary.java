package logic;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Secretary extends Person {
    //private int id_secretary;
    private String area;
    private User user;

    public Secretary() {
        
    }   

    public Secretary(String area, User user, String dni, String name, String lastname, String phone, String address, Date date_of_birth) {
        super(dni, name, lastname, phone, address, date_of_birth);
        this.area = area;
        this.user = user;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
}
