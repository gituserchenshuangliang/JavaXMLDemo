package com.xml.dtd.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.RuleSet;
import org.xml.sax.SAXException;

public class ClazzRuleSet implements RuleSet{
    
    public static void main(String[] args) {
        try {
            Digester dig = new Digester();
            ClazzRuleSet cr = new ClazzRuleSet();
            
            cr.addRuleInstances(dig);
            
            Clazz cl = dig.parse(new File("E:\\WKS2019\\JavaXMLDemo\\src\\main\\resources\\dtd\\class.xml"));
            System.out.println(cl.getList());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String getNamespaceURI() {
        return null;
    }

    @Override
    public void addRuleInstances(Digester digester) {
        digester.addObjectCreate("class",Clazz.class);
        digester.addSetProperties("class");
        
        digester.addBeanPropertySetter("class/teacher");
        
        digester.addObjectCreate("class/student", Student.class);
        digester.addSetProperties("class/student");
        
        digester.addBeanPropertySetter("class/student/age");
        digester.addBeanPropertySetter("class/student/name");
        digester.addBeanPropertySetter("class/student/comment");
        
        digester.addSetNext("class/student","addStudent");
    }

}
