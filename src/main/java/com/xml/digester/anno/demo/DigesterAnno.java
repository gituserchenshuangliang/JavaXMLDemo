package com.xml.digester.anno.demo;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.annotations.FromAnnotationsRuleModule;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.apache.commons.digester3.binder.RulesModule;
import org.xml.sax.SAXException;

public class DigesterAnno {
    public static void main(String[] args) throws IOException, SAXException {
        DigesterLoader loader = DigesterLoader
                .newLoader(new RulesModule[] { new FromAnnotationsRuleModule() {
                    protected void configureRules() {
                        bindRulesFrom(Foo.class);
                    }
                } });
        Digester dig = loader.newDigester();
        dig.setValidating(true);

        Foo foo = (Foo) dig.parse(new File(
                "E:\\WKS2019\\JavaXMLDemo\\src\\main\\resources\\anno\\foo.xml"));

        System.out.println(foo);
    }
}
