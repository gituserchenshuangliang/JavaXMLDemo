package com.xml.digester.demo;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.RuleSet;
import org.xml.sax.SAXException;

public class DigesterWebapp
  implements RuleSet
{
  public static void main(String[] args)
  {
    Digester digester = new Digester();
    
    digester.setValidating(false);
    new DigesterWebapp().addRuleInstances(digester);
  }
  
  public String getNamespaceURI()
  {
    return null;
  }
  
  public void addRuleInstances(Digester digester)
  {
    try
    {
      digester.addObjectCreate("web-app/servlet", ServletBean.class);
      digester.addCallMethod("web-app/servlet/servlet-name", "setServletName", 0);
      digester.addCallMethod("web-app/servlet/servlet-class", "setServletClass", 0);
      digester.addCallMethod("web-app/servlet/init-param", "addInitParam", 2);
      digester.addCallParam("web-app/servlet/init-param/param-name", 0);
      digester.addCallParam("web-app/servlet/init-param/param-value", 1);
      
      ServletBean bean = (ServletBean)digester.parse(new File("E:\\WKS2019\\JavaXMLDemo\\src\\main\\resources\\digester\\demo\\web-app.xml"));
      
      System.out.println((String)bean.getInitParams().get("config"));
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    catch (SAXException e)
    {
      e.printStackTrace();
    }
  }
}
