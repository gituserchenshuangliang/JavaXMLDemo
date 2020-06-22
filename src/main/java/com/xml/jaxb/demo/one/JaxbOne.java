package com.xml.jaxb.demo.one;

import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
/**
 * Jaxb
 * @author Cherry
 * 2020年6月22日
 */
public class JaxbOne {

	public static void main(String[] args) throws Exception {
	    JAXBContext context = JAXBContext.newInstance(CityList.class);
	    byte[] file = Files.readAllBytes(Paths.get("E:\\WKS2019\\JavaXMLDemo\\src\\main\\resources\\citylist.xml"));
	    
        // XML 转为对象的接口
	    Unmarshaller unmarshaller = context.createUnmarshaller();
	    
        try(Reader reader = new StringReader(new String(file));){
            // XML转为Java对象
            CityList cityList = (CityList)unmarshaller.unmarshal(reader);
            
            System.out.println(cityList.getCityList());
        }
	}

}
