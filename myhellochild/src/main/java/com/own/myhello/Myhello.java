package com.own.myhello;

import org.apache.commons.configuration.ConfigurationException;

public class Myhello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Myfrist maven HelloWorld");
		Myconf myconf = new Myconf("myconf/heart.properties");
		try {
			myconf.readConf();
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyLog mylog = new MyLog();
		mylog.PrintLog();
		Mythread mythread=new Mythread();
		System.out.println("主线程开始时间="+System.currentTimeMillis());
		mythread.start();
		System.out.println("主线程结束时间="+System.currentTimeMillis());
	}

}
