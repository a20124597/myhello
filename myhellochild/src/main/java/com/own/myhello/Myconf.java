package com.own.myhello;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class Myconf {

	private String filename;

	public Myconf(String filename) {
		this.setFilename(filename);
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public void readConf() throws ConfigurationException {
		PropertiesConfiguration propsConfig = new PropertiesConfiguration();
		propsConfig.setEncoding("UTF-8");
		System.out.println("文件名:" + this.filename);
		propsConfig.load(this.filename);
		String name = propsConfig.getString("name", "xue xue");
		String like = propsConfig.getString("like", "dong dong");
		String y_like = propsConfig.getString("y_like", "pppp");
		System.out.println(name);
		System.out.println(like);
		System.out.println(y_like);
		return;
	}
}
