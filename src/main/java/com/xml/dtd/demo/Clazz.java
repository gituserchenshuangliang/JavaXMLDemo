package com.xml.dtd.demo;

import java.util.ArrayList;
import java.util.List;

public class Clazz
{
  private String id;
  private String classroom;
  private String teacher;
  private List<Student> list = new ArrayList();
  
  public void addStudent(Student student)
  {
    this.list.add(student);
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public void setId(String id)
  {
    this.id = id;
  }
  
  public String getClassroom()
  {
    return this.classroom;
  }
  
  public void setClassroom(String classroom)
  {
    this.classroom = classroom;
  }
  
  public String getTeacher()
  {
    return this.teacher;
  }
  
  public void setTeacher(String teacher)
  {
    this.teacher = teacher;
  }
  
  public List<Student> getList()
  {
    return this.list;
  }
  
  public void setList(List<Student> list)
  {
    this.list = list;
  }
  
  public String toString()
  {
    return 
      "Clazz [id=" + this.id + ", classroom=" + this.classroom + ", teacher=" + this.teacher + ", list=" + this.list + "]";
  }
}
