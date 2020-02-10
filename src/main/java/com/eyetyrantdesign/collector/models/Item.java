package com.eyetyrantdesign.collector.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Item {

  @Id
  @GeneratedValue
  private Integer id;

  private Integer year;
  private String name;
  private String brand;
  private String mfr;

  public Item(){}

  public Item(Integer year, String name, String brand, String mfr) {
    this.year = year;
    this.name = name;
    this.brand = brand;
    this.mfr = mfr;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getMfr() {
    return mfr;
  }

  public void setMfr(String mfr) {
    this.mfr = mfr;
  }

  public Integer getId() {
    return id;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Item)) return false;
    Item item = (Item) o;
    return getYear().equals(item.getYear()) &&
        getName().equals(item.getName()) &&
        getBrand().equals(item.getBrand()) &&
        getMfr().equals(item.getMfr());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getYear(), getName(), getBrand(), getMfr());
  }
}
