package com.xml.jaxb.demo.one;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * City.
 */
@XmlRootElement(name = "d")
@XmlAccessorType(XmlAccessType.FIELD)
public class City {
	@XmlAttribute(name = "d1")
	private String cityId;
	
	@XmlAttribute(name = "d2")
	private String cityName;
	
	@XmlAttribute(name = "d3")
	private String cityCode;
	
	@XmlAttribute(name = "d4")
	private String province;

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName  + 
				", cityCode=" + cityCode + ", province=" + province +"]";
	}
	
	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
}
