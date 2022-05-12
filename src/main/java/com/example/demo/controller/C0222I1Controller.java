package com.example.demo.controller;

import com.example.demo.model.C0222I1;
import com.example.demo.service.C0222I1ServiceImpl;
import com.example.demo.service.IC0222I1Service;

import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = {"/c0222i1"})
public class C0222I1Controller extends HttpServlet {
    private IC0222I1Service ic0222I1Service = new C0222I1ServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String action = req.getParameter("action");
//        if(action==null){
//            action = "";
//        }
//        switch (action){
//            default: showListC0222I1(req,resp);
//            break;
//        }
        List<C0222I1> c0222I1List = ic0222I1Service.findAll();
        System.out.println("list == "+c0222I1List);
        req.setAttribute("c0222i1", c0222I1List);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/c0222i1/list.jsp");
        try {
            requestDispatcher.forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    private void showListC0222I1(HttpServletRequest request, HttpServletResponse response){
//        List<C0222I1> c0222I1List = ic0222I1Service.findAll();
//        request.setAttribute("c0222i1", c0222I1List);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
//        try {
//            requestDispatcher.forward(request,response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}