package com.xml.digester.anno.demo;

import org.apache.commons.digester3.annotations.rules.ObjectCreate;
import org.apache.commons.digester3.annotations.rules.SetProperty;

@ObjectCreate(pattern="foo/bar")
public class Bar
{
  @SetProperty(pattern="foo/bar")
  private int id;
  @SetProperty(pattern="foo/bar")
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
