package com.xml.digester.demo;

public class Bar
{
  private int id;
  private String title;
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public void setTitle(String title)
  {
    this.title = title;
  }
  
  public String toString()
  {
    return "Bar [id=" + this.id + ", title=" + this.title + "]";
  }
}
