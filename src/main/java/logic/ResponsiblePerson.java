package logic;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class ResponsiblePerson extends Person {
    //private int id_responsible;
    private String responsible_type;

    public ResponsiblePerson() {
    }

    public ResponsiblePerson(String responsible_type, String dni, String name, String lastname, String phone, String address, Date date_of_birth) {
        super(dni, name, lastname, phone, address, date_of_birth);
        this.responsible_type = responsible_type;
    }    

    public String getResponsible_type() {
        return responsible_type;
    }

    public void setResponsible_type(String responsible_type) {
        this.responsible_type = responsible_type;
    }    
    
}
