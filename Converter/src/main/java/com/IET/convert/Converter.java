package com.IET.convert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Converter extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String dollar=req.getParameter("dollar");
		String inr=req.getParameter("inr");
		
//		String btn=req.getParameter("con");
//		switch(btn) {
//		case "convert":
//		
//		
//		}
		
		if(dollar.equals("")) {
			int d=Integer.parseInt(inr)/80;
			out.print("<center><h1>INR-->"+d+"</h1></center>");
		}
		else {
			int d=Integer.parseInt(dollar)*80;
			out.print("<center><h1>Dollar-->"+d+"</h1></center>");
		}
	}

}
