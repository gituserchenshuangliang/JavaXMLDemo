package com.xml.digester.demo;

import java.util.ArrayList;
import java.util.List;

public class Foo
{
  private String name;
  private List<Bar> barList = new ArrayList();
  
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
