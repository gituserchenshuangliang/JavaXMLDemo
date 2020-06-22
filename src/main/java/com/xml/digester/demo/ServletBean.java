package com.xml.digester.demo;

import java.util.HashMap;
import java.util.Map;

public class ServletBean
{
  private String servletName;
  private String servletClass;
  private Map<String, String> initParams = new HashMap();
  
  public void addInitParam(String paramName, String paramValue)
  {
    this.initParams.put(paramName, paramValue);
  }
  
  public String getServletName()
  {
    return this.servletName;
  }
  
  public void setServletName(String servletName)
  {
    this.servletName = servletName;
  }
  
  public String getServletClass()
  {
    return this.servletClass;
  }
  
  public void setServletClass(String servletClass)
  {
    this.servletClass = servletClass;
  }
  
  public Map<String, String> getInitParams()
  {
    return this.initParams;
  }
  
  public void setInitParams(Map<String, String> initParams)
  {
    this.initParams = initParams;
  }
  
  public String toString()
  {
    return 
      "ServletBean [servletName=" + this.servletName + ", servletClass=" + this.servletClass + ", initParams=" + this.initParams + "]";
  }
}
