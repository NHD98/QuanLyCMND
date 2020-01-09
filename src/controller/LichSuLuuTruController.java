package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.CongDanBean;
import bean.LichSuLuuTruChiTiet;
import bo.CongDanBo;
import bo.LichSuLuuTruBo;

/**
 * Servlet implementation class CongDan
 */
@WebServlet("/LichSuLuuTruController")
public class LichSuLuuTruController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LichSuLuuTruController() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    CongDanBo congDanBo = new CongDanBo();
    LichSuLuuTruBo lichSuBo = new LichSuLuuTruBo();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("utf8");
        response.setCharacterEncoding("utf8");
        ArrayList<LichSuLuuTruChiTiet> list = new ArrayList<LichSuLuuTruChiTiet>();
        String cmndID = request.getParameter("txtCmndID");
        String cmndID2 = request.getParameter("cmndID");
        String hoKhauID = request.getParameter("HoKhauID");
        String thoiGianBatDauLT = request.getParameter("ThoiGianBatDauLT");
        if (cmndID2 != null && hoKhauID != null && thoiGianBatDauLT != null) {
            try {
                int kq = lichSuBo.xoaLichSuLuuTru(cmndID2, hoKhauID, thoiGianBatDauLT);
                System.out.println("xoa record " + kq);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try {
            if (cmndID != null) {
                list = lichSuBo.getLichSuLuuTru(cmndID);
                System.out.println("get danh sach");
            } else if (cmndID2 != null) {
                list = lichSuBo.getLichSuLuuTru(cmndID2);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        request.setAttribute("list", list);
        RequestDispatcher rd = request.getRequestDispatcher("LichSuLuuTru.jsp");
        rd.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
