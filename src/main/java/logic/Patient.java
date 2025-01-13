package logic;

import java.util.List;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Patient extends Person {
    //private int id_paciente;
    private boolean has_insurance;
    private String blood_type;
    //Relación 1 a 1
    private ResponsiblePerson aResponsible;
    //Relación 1 a N
    private List<Appointment> listAppointment;

    public Patient() {
    }

    public Patient(boolean has_insurance, String blood_type, ResponsiblePerson aResponsible, List<Appointment> listAppointment, String dni, String name, String lastname, String phone, String address, Date date_of_birth) {
        super(dni, name, lastname, phone, address, date_of_birth);
        this.has_insurance = has_insurance;
        this.blood_type = blood_type;
        this.aResponsible = aResponsible;
        this.listAppointment = listAppointment;
    }         

    /*public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }*/

    public ResponsiblePerson getaResponsible() {
        return aResponsible;
    }

    public void setaResponsible(ResponsiblePerson aResponsible) {
        this.aResponsible = aResponsible;
    }

    public List<Appointment> getListAppointment() {
        return listAppointment;
    }

    public void setListAppointment(List<Appointment> listAppointment) {
        this.listAppointment = listAppointment;
    } 

    public boolean isHas_insurance() {
        return has_insurance;
    }

    public void setHas_insurance(boolean has_insurance) {
        this.has_insurance = has_insurance;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }


}
