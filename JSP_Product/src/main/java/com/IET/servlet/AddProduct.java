package com.IET.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.IET.service.*;
import com.IET.service.ProductServiceImp;
import com.IET.beans.*;

@WebServlet("/addproduct")
public class AddProduct extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService ps=new ProductServiceImp();
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pnm=request.getParameter("pname");
		int qty=Integer.parseInt(request.getParameter("qty"));
		float price=Float.parseFloat(request.getParameter("price"));
		Product p=new Product(pid,pnm,qty,price);
		ps.addProduct(p);
		RequestDispatcher rd=request.getRequestDispatcher("product");
		rd.forward(request, response);
		
	}

}