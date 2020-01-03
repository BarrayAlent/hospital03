package com.ujiuye.bean;


public class Hospitalization {

  private int hid;
  private int rno;
  private String bedNo;
  private double deposit;
  private String description;
  private String inDate;
  private String protect;


  public int getHid() {
    return hid;
  }

  public void setHid(int hid) {
    this.hid = hid;
  }


  public int getRno() {
    return rno;
  }

  public void setRno(int rno) {
    this.rno = rno;
  }


  public String getBedNo() {
    return bedNo;
  }

  public void setBedNo(String bedNo) {
    this.bedNo = bedNo;
  }


  public double getDeposit() {
    return deposit;
  }

  public void setDeposit(double deposit) {
    this.deposit = deposit;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getInDate() {
    return inDate;
  }

  public void setInDate(String inDate) {
    this.inDate = inDate;
  }


  public String getProtect() {
    return protect;
  }

  public void setProtect(String protect) {
    this.protect = protect;
  }

}
