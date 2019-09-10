package com.kaushik.spring5tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DemoBean {

	private static Log Log = LogFactory.getLog(DemoBean.class);
	public DemoBean() {
		Log.info("Demo bean created");
	}

}
