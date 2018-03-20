/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.TableDAO;
import entity.Schedule;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jorden
 */
@WebServlet(name = "BookingServlet", urlPatterns = {"/BookingServlet"})
public class BookingServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String tableNum = request.getParameter("tableNum");
            String liquor = request.getParameter("liquor");
            String startDatetime = request.getParameter("startDatetime");
            String endDatetime = request.getParameter("endDatetime");
            String hostName = request.getParameter("hostName");
            String hostAge = request.getParameter("hostAge");
            String hostGender = request.getParameter("hostGender");
            String hostRace = request.getParameter("hostRace");
            String hostCost = request.getParameter("hostCost");
            HttpSession session = request.getSession();
            
            TableDAO tableDAO = new TableDAO();
            int tableNo = Integer.parseInt(tableNum);
            
            if(tableDAO.isTableBooked(tableNo, startDatetime, endDatetime)){
                request.setAttribute("message", "The table is booked, please select another timing/table!");
            } else {
                String guestName = (String) session.getAttribute("user");
                
                Schedule schedule = new Schedule(guestName, startDatetime, endDatetime, tableNo);
                
                
                
                request.setAttribute("message", "The booking is made successfully!");
            }
            
            RequestDispatcher view = request.getRequestDispatcher("customerManagement.jsp");
            view.forward(request, response);
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
