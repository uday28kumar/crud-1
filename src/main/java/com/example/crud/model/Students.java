package com.example.crud.model;

import javax.persistence.*;

@Entity
@Table
public class Students {
  @Id
  @Column
  private int studentid;
  @Column
  private String studentname;
  @Column
  private String address;
  @Column
  private int rollno;

  public int getStudentid() {
    return studentid;
  }

  public void setStudentid(int studentid) {
    this.studentid = studentid;
  }

  public String getStudentname() {
    return studentname;
  }

  public void setStudentname(String studentname) {
    this.studentname = studentname;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getRollno() {
    return rollno;
  }

  public void setRollno(int rollno) {
    this.rollno = rollno;
  }
}