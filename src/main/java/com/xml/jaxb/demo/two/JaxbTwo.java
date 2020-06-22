package com.xml.jaxb.demo.two;

import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Jaxb
 * @author Cherry
 * 2020年6月22日
 */
public class JaxbTwo {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Clazz.class);
        byte[] file = Files.readAllBytes(Paths.get("E:\\WKS2019\\JavaXMLDemo\\src\\main\\resources\\jaxb\\class.xml"));
        
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        Clazz cz = (Clazz) unmarshaller.unmarshal(new StringReader(new String(file)));
        
        System.out.println(cz);
    }
}
