package com.xml.xsd.demo;

public class Teacher
{
  private int age;
  private String sex;
  private String name;
  
  public int getAge()
  {
    return this.age;
  }
  
  public void setAge(int age)
  {
    this.age = age;
  }
  
  public String getSex()
  {
    return this.sex;
  }
  
  public void setSex(String sex)
  {
    this.sex = sex;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String toString()
  {
    return "Teacher [age=" + this.age + ", sex=" + this.sex + ", name=" + this.name + "]";
  }
}
