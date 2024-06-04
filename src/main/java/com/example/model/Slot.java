package com.example.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t02_slot")
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C02_SLOT_ID")
    private int id;

    @Column(name = "C02_SLOT_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date slotDate;

    @Column(name = "C02_SLOT_START_TIME", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date slotStartTime;

    @Column(name = "C02_SLOT_END_TIME", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date slotEndTime;

    @ManyToOne
    @JoinColumn(name = "C02_COURSE_ID", nullable = false)
    private Manager course;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSlotDate() {
        return slotDate;
    }

    public void setSlotDate(Date slotDate) {
        this.slotDate = slotDate;
    }

    public Date getSlotStartTime() {
        return slotStartTime;
    }

    public void setSlotStartTime(Date slotStartTime) {
        this.slotStartTime = slotStartTime;
    }

    public Date getSlotEndTime() {
        return slotEndTime;
    }

    public void setSlotEndTime(Date slotEndTime) {
        this.slotEndTime = slotEndTime;
    }

    public Manager getCourse() {
        return course;
    }

    public void setCourse(Manager course) {
        this.course = course;
    }
}
