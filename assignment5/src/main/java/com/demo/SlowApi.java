package com.demo;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class SlowApi {

	public String getCityName(String pinCode) {
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		return "delhi";
	}
}
