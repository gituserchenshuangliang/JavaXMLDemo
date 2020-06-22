package com.xml.xsd.demo;

public class Student
{
  private String name;
  private int age;
  private String comment;
  private String addr;
  private String studentID;
  private String sex;
  private String classID;
  private String lesson;
  private String friend;
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public int getAge()
  {
    return this.age;
  }
  
  public void setAge(int age)
  {
    this.age = age;
  }
  
  public String getComment()
  {
    return this.comment;
  }
  
  public void setComment(String comment)
  {
    this.comment = comment;
  }
  
  public String getAddr()
  {
    return this.addr;
  }
  
  public void setAddr(String addr)
  {
    this.addr = addr;
  }
  
  public String getStudentID()
  {
    return this.studentID;
  }
  
  public void setStudentID(String studentID)
  {
    this.studentID = studentID;
  }
  
  public String getSex()
  {
    return this.sex;
  }
  
  public void setSex(String sex)
  {
    this.sex = sex;
  }
  
  public String getClassID()
  {
    return this.classID;
  }
  
  public void setClassID(String classID)
  {
    this.classID = classID;
  }
  
  public String getLesson()
  {
    return this.lesson;
  }
  
  public void setLesson(String lesson)
  {
    this.lesson = lesson;
  }
  
  public String getFriend()
  {
    return this.friend;
  }
  
  public void setFriend(String friend)
  {
    this.friend = friend;
  }
  
  public String toString()
  {
    return 
    
      "Student [name=" + this.name + ", age=" + this.age + ", comment=" + this.comment + ", addr=" + this.addr + ", studentID=" + this.studentID + ", sex=" + this.sex + ", classID=" + this.classID + ", lesson=" + this.lesson + ", friend=" + this.friend + "]";
  }
}
