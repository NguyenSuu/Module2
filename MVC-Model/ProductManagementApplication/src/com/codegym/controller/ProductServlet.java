package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductJDBCServiceImpl;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductService productService=new ProductJDBCServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                createProduct(request,response);
                break;
            case "edit":
                updateProduct(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action){
            case "create":
                showCreateProductForm(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "delete":
                showDeleteForm(request,response);
                break;
            case "view":
                viewProduct(request,response);
                break;
            case "search":
                search(request,response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }
    protected void search(HttpServletRequest request,HttpServletResponse response){
        String name=request.getParameter("name");
        List<Product> product=this.productService.findByName(name);
        RequestDispatcher dispatcher;
        if(product==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }
        else {
            request.setAttribute("product",product);
            dispatcher=request.getRequestDispatcher("product/search.jsp");
        }
        try {
            dispatcher.forward(request,response);
        }
        catch (ServletException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    protected void updateProduct(HttpServletRequest request,HttpServletResponse response){
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        float cost=Float.parseFloat(request.getParameter("cost"));
        String description=request.getParameter("description");
        String manufacturer=request.getParameter("manufacturer");
        Product product=this.productService.findById(id);
        RequestDispatcher dispatcher;
        if(product==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }
        else {
            product.setName(name);
            product.setCost(cost);
            product.setDescription(description);
            product.setManufacturer(manufacturer);
            this.productService.update(id,product);
            request.setAttribute("product",product);
            request.setAttribute("message","Product information was updated");
            dispatcher=request.getRequestDispatcher("product/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        }
        catch (ServletException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    protected void deleteProduct(HttpServletRequest request,HttpServletResponse response){
        int id=Integer.parseInt(request.getParameter("id"));
        RequestDispatcher dispatcher;
        Product product=this.productService.findById(id);
        if(product==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }
        else {
            this.productService.remove(id);
            dispatcher=request.getRequestDispatcher("product/delete.jsp");
        }
        try {
            dispatcher.forward(request,response);
        }
        catch (ServletException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    protected void showDeleteForm(HttpServletRequest request, HttpServletResponse response){
        int id=Integer.parseInt(request.getParameter("id"));
        RequestDispatcher dispatcher;
        Product product=this.productService.findById(id);
        if (product==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }
        else {
            request.setAttribute("product",product);
            dispatcher=request.getRequestDispatcher("product/delete.jsp");
        }
        try {
            dispatcher.forward(request,response);
        }
        catch (ServletException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    protected void createProduct(HttpServletRequest request,HttpServletResponse response){
        String name=request.getParameter("name");
        float cost= Float.parseFloat(request.getParameter("cost"));
        String description=request.getParameter("description");
        String manufacturer=request.getParameter("manufacturer");
        int id=(int)(Math.random()*10000);
        Product product=new Product(id,name,cost,description,manufacturer);
        this.productService.save(product);
        RequestDispatcher dispatcher=request.getRequestDispatcher("product/create.jsp");
        request.setAttribute("message","New product was created ");
        try{
            dispatcher.forward(request,response);
        }
        catch (ServletException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    protected void showCreateProductForm(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher dispatcher=request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request,response);
        }
        catch (ServletException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    protected void viewProduct(HttpServletRequest request, HttpServletResponse response){
        int id=Integer.parseInt(request.getParameter("id"));
        Product product=this.productService.findById(id);
        RequestDispatcher dispatcher;
        if( product==null){
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }
        else {
            request.setAttribute("product",product);
            dispatcher=request.getRequestDispatcher("product/view.jsp");

        }
        try {
            dispatcher.forward(request,response);
        }
        catch (ServletException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    protected void showEditForm(HttpServletRequest request, HttpServletResponse response){
        RequestDispatcher dispatcher=request.getRequestDispatcher("product/edit.jsp");
        try {
            dispatcher.forward(request,response);
        }
        catch (ServletException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    protected void listProduct(HttpServletRequest request,HttpServletResponse response){
        List<Product> products=this.productService.findAll();
        request.setAttribute("products",products);
        RequestDispatcher dispatcher=request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request,response);
        }
        catch (ServletException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}