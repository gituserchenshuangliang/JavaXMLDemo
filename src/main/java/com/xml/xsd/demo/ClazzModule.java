package com.xml.xsd.demo;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.binder.AbstractRulesModule;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.apache.commons.digester3.binder.LinkedRuleBuilder;
import org.apache.commons.digester3.binder.ObjectCreateBuilder;
import org.apache.commons.digester3.binder.RulesModule;
import org.apache.commons.digester3.binder.SetPropertiesBuilder;
import org.xml.sax.SAXException;

public class ClazzModule
  extends AbstractRulesModule
{
  public static void main(String[] args)
    throws IOException, SAXException
  {
    DigesterLoader loader = DigesterLoader.newLoader(new RulesModule[] { new ClazzModule() });
    
    Digester dig = loader.newDigester();
    dig.setValidating(true);
    
    Clazz c = (Clazz)dig.parse(new File("E:\\WKS2019\\JavaXMLDemo\\src\\main\\resources\\xsd\\class.xml"));
    
    System.out.println(c);
  }
  
  protected void configure()
  {
    forPattern("class").createObject().ofType(Clazz.class).then().setProperties();
    
    forPattern("class/student").createObject().ofType(Student.class)
      .then().setProperties()
      .then().setNext("addStudent");
    forPattern("class/student/name").setBeanProperty();
    forPattern("class/student/age").setBeanProperty();
    forPattern("class/student/comment").setBeanProperty();
    
    forPattern("class/teacher").createObject().ofType(Teacher.class)
      .then().setProperties()
      .then().setNext("addTeacher");
  }
}
