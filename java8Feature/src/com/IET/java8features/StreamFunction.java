package com.IET.java8features;

import java.util.ArrayList;

public class StreamFunction {
	
	public static void main(String[] args) {
		ArrayList<String> st=new ArrayList();
		
		st.add("ravi");
		st.add("vishal");
		st.add("pankaj");
		
		
		st.stream().forEach(System.out::print);
	}

}
