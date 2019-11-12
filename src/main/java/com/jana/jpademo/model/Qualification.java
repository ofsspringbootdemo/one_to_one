package com.jana.jpademo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "QUALIFICATION")
public class Qualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "COURSE")
    private String course;

    @Column(name = "PERCENTAGE")
    private float percentage;

    @Column(name = "YEAR_OF_COMPLETION")
    private String yearOfCompletion;

    @Column(name = "UNIVERSITY")
    private String university;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;

    public Qualification() {
    }

    @Override
    public String toString() {
        return "[course=" + course +  ", percentage=" + percentage + ", yearOfCompletion=" +
                yearOfCompletion + ", university=" + university + "]";
    }
}
