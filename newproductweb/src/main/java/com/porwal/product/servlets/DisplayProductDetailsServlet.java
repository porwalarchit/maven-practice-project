package com.porwal.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.porwal.product.dto.Product;
import com.porwal.product.bo.ProductBO;
import com.porwal.product.bo.ProductBOImpl;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductBO  bo = new ProductBOImpl();
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out  = response.getWriter();	
//		System.out.print(product.getId());
		
		out.println("Product Details: ");
		try {
			out.println("Product ID:" + product.getId());
			out.println("Product Name:"+ product.getName());
			out.println("Product Description:"+ product.getDescription());
			out.println("Product Price:"+ product.getPrice());
		}catch(NullPointerException e) {
			out.print("Product is Null");
		}
		
	}

}
