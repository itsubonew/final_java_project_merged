package com.company_mngm_sys.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // A logical grouping of data in rows and columns
// pojo
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // tableになる
    private long employeeID;
    // private String firstName;
    // private String lastName;
    private String fullName;
    private int birthday;

    public Employees() {
    }

    public Employees(String fullName, int birthday) {
        this.fullName = fullName;
        this.birthday = birthday;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    

}
