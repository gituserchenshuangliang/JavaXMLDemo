package com.xml.digester.demo;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.binder.AbstractRulesModule;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.apache.commons.digester3.binder.LinkedRuleBuilder;
import org.apache.commons.digester3.binder.ObjectCreateBuilder;
import org.apache.commons.digester3.binder.RulesModule;
import org.xml.sax.SAXException;

public class DigesterFooModule
  extends AbstractRulesModule
{
  public static void main(String[] args) {}
  
  public static void show2()
  {
    try
    {
      DigesterLoader loader = DigesterLoader.newLoader(new RulesModule[] { new DigesterFooModule() })
        .setNamespaceAware(true)
        .setXIncludeAware(true);
      Digester digester = loader.newDigester();
      Foo foo = (Foo)digester.parse(new File("E:/WKS2019/JavaXMLDemo/src/com/xml/digester/demo/foo.xml"));
      System.out.println(foo);
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
  
  public static void show()
  {
    try
    {
      Digester digester = new Digester();
      
      digester.setValidating(false);
      
      digester.addObjectCreate("foo", Foo.class);
      digester.addSetProperties("foo");
      
      digester.addObjectCreate("foo/bar", Bar.class);
      digester.addSetProperties("foo/bar");
      digester.addSetNext("foo/bar", "addBar");
      
      Foo foo = (Foo)digester.parse(new File("./src/com/xml/digester/demo/foo.xml"));
      
      System.out.println(foo);
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
  
  protected void configure()
  {
    forPattern("foo").createObject().ofType(Foo.class);
    forPattern("foo").setProperties();
    
    forPattern("foo/bar").createObject().ofType(Bar.class);
    forPattern("foo/bar").setProperties();
    
    forPattern("foo/bar").setNext("addBar");
  }
}
