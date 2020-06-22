package com.xml.digester.anno.demo;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.digester3.annotations.rules.ObjectCreate;
import org.apache.commons.digester3.annotations.rules.SetNext;
import org.apache.commons.digester3.annotations.rules.SetProperty;

@ObjectCreate(pattern="foo")
public class Foo
{
  @SetProperty(pattern="foo")
  private String name;
  private List<Bar> barList = new ArrayList();
  
  @SetNext
  public void addBar(Bar bar)
  {
    this.barList.add(bar);
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public List<Bar> getBarList()
  {
    return this.barList;
  }
  
  public void setBarList(List<Bar> barList)
  {
    this.barList = barList;
  }
  
  public String toString()
  {
    return "Foo [name=" + this.name + ", barList=" + this.barList + "]";
  }
}
