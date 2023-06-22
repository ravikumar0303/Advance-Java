package com.IET.factorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Factorial extends HttpServlet {

	public int fact(int num) {
		int f = 1;

		for (int i = 1; i <= num; i++) {

			f = f * i;
		}
		return f;
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter wrt = resp.getWriter();
		int num1 = Integer.parseInt(req.getParameter("dollar"));

		String btn = req.getParameter("btn");
		switch (btn) {
		case "add":
			int num2 = Integer.parseInt(req.getParameter("inr"));
			wrt.println("<center><h1>Addition-->" + (num1 + num2)+"</h1></center>");
			break;
		case "factorial":

			wrt.println("<center><h1>fact-->" + fact(num1)+"</h1></center>");
			break;
		}
	}
}
