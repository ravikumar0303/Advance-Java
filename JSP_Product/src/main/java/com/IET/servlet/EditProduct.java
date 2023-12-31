package com.IET.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.IET.beans.Product;
import com.IET.service.*;

@WebServlet("/edit")
public class EditProduct extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pid=Integer.parseInt(request.getParameter("pid"));
		ProductService ps=new ProductServiceImp();
		Product p=ps.getById(pid);
		request.setAttribute("product", p);

		RequestDispatcher rd=request.getRequestDispatcher("editproduct.jsp");
		rd.forward(request, response);
	}

}
