package logic;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Dentist extends Person {
    //private int id_dentist;
    private String specialist;
    @OneToOne
    private User user;
    @OneToOne
    private Schedule aSchedule;
    @OneToMany
    private List<Appointment> listAppointment;

    public Dentist() {
    }

    public Dentist(String specialist, User user, Schedule aSchedule, List<Appointment> listAppointment, String dni, String name, String lastname, String phone, String address, Date date_of_birth) {
        super(dni, name, lastname, phone, address, date_of_birth);
        this.specialist = specialist;
        this.user = user;
        this.aSchedule = aSchedule;
        this.listAppointment = listAppointment;
    }    

    /*public int getId_dentist() {
        return id_dentist;
    }

    public void setId_dentist(int id_dentist) {
        this.id_dentist = id_dentist;
    }*/

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Schedule getaSchedule() {
        return aSchedule;
    }

    public void setaSchedule(Schedule aSchedule) {
        this.aSchedule = aSchedule;
    }

    public List<Appointment> getListAppointment() {
        return listAppointment;
    }

    public void setListAppointment(List<Appointment> listAppointment) {
        this.listAppointment = listAppointment;
    }

    
    
}
