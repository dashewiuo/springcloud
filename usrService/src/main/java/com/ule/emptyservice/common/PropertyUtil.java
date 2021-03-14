package com.ule.emptyservice.common;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
	private final static Logger logger = Logger.getLogger(PropertyUtil.class);
	private static Properties properties;		
	static{
		InputStream in = PropertyUtil.class.getResourceAsStream("/ulecard.properties");
		properties = new Properties();
		try{
			properties.load(in);
		} catch (IOException e){
			throw new RuntimeException("ulecard.properties  no exists");
		}finally{
		    if(in != null){
		        try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } 
		    }
		}
	}
	
	public static String get(String  remoteUrl){
		String  value = properties.getProperty(remoteUrl);
		if (StringUtils.isEmpty(value)) {
			logger.error(remoteUrl + " find value is null");
			throw new RuntimeException(remoteUrl + " get value is null.");
		}
		return value;
	}

	public static void main(String[] args) {
		System.out.println(PropertyUtil.get("ULECARD_COUPON_CHECK_BETA"));
	
	}

}
