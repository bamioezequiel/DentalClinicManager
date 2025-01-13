package logic;

import java.util.Date;

public class Appointment {
    private int id_appointment;
    private Date appointment_date;
    private String appointment_time;
    private String condition;

    public Appointment() {
    }

    public Appointment(int id_appointment, Date appointment_date, String appointment_time, String condition) {
        this.id_appointment = id_appointment;
        this.appointment_date = appointment_date;
        this.appointment_time = appointment_time;
        this.condition = condition;
    }

    public int getId_appointment() {
        return id_appointment;
    }

    public void setId_appointment(int id_appointment) {
        this.id_appointment = id_appointment;
    }

    public Date getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(String appointment_time) {
        this.appointment_time = appointment_time;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    
    
}
