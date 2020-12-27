package com.own.myhello;

import org.apache.commons.configuration.ConfigurationException;

public class Myhello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("费心了雪");
		Myconf myconf = new Myconf("myconf/heart.properties");
		try {
			myconf.readConf();
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
