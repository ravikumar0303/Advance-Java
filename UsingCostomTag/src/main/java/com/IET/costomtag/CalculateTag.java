package com.IET.costomtag;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CalculateTag extends TagSupport {
	
	private String n1,n2;

	public CalculateTag() {
		super();
	}

	public CalculateTag(String n1, String n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	public String getN1() {
		return n1;
	}

	public void setN1(String n1) {
		this.n1 = n1;
	}

	public String getN2() {
		return n2;
	}

	public void setN2(String n2) {
		this.n2 = n2;
	}
	
	public int doStartTag() {
		return EVAL_BODY_INCLUDE;
	}
	
	public int doEndTag() {
		JspWriter out=pageContext.getOut();
		try {
			
			int sum=Integer.parseInt(n1)+Integer.parseInt(n2);
			out.println("Sum : "+sum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EVAL_PAGE;
	}
   

}
