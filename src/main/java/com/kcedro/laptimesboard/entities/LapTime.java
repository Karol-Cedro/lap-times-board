package com.kcedro.laptimesboard.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "lap_times")
public class LapTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "time")
    private Time time;

    @Column(name = "vehicle")
    private String vehicle;

    @Column(name = "driver")
    private String driver;

    @Column(name = "date")
    private Date date;

    @Column(name = "notes")
    private String notes;

    public LapTime() {
    }

    public LapTime(Time time, String vehicle, String driver, Date date, String notes) {
        this.time = time;
        this.vehicle = vehicle;
        this.driver = driver;
        this.date = date;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "LapTime{" +
                "id=" + id +
                ", time=" + time +
                ", vehicle='" + vehicle + '\'' +
                ", driver='" + driver + '\'' +
                ", date=" + date +
                ", notes='" + notes + '\'' +
                '}';
    }
}
