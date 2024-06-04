package com.example.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "t01_COURSE")
public class Manager {

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Slot> slots;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C01_COURSE_ID")
    private int id;

    @Column(name = "C01_COURSE_NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "C01_COURSE_CODE", nullable = false, unique = true)
    private int code;

    @Column(name = "C01_COURSE_DESC", nullable = false)
    private String description;

    @Column(name = "C01_COURSE_START_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "C01_COURSE_END_DATE", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "C01_AMOUNT_OF_STUDENTS", nullable = false)
    private int amountOfStudents;

    @Column(name = "C01_COURSE_FEE", nullable = false)
    private float fee;

    @Column(name = "C01_CENTER_ID", nullable = false)
    private int centerId;

    @Column(name = "C01_SUBJECT_ID", nullable = false)
    private int subjectId;

    @Column(name = "C01_TEACHER_ID", nullable = false)
    private int teacherId;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(int amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public int getCenterId() {
        return centerId;
    }

    public void setCenterId(int centerId) {
        this.centerId = centerId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
