package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.HoKhauBo;

/**
 * Servlet implementation class SuaHoKhauController
 */
@WebServlet("/SuaHoKhauController")
public class SuaHoKhauController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SuaHoKhauController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	HoKhauBo hoKhauBo = new HoKhauBo();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");
		String hoKhauID = request.getParameter("txtHoKhauID");
		String tinh_TP = request.getParameter("txtTinhTP");
		String quan_Huyen = request.getParameter("txtQuanHuyen");
		String phuong_Xa = request.getParameter("txtPhuongXa");
		String to_Thon = request.getParameter("txtToThon");

		int check = hoKhauBo.suaHoKhauByID(hoKhauID, tinh_TP, quan_Huyen, phuong_Xa, to_Thon);
		if (check > 0) {
			response.sendRedirect("HoKhauController");
		} else {
			request.setAttribute("hoKhauDetail", hoKhauBo.getHoKhauByID(request.getParameter("txtHoKhauID")));
			RequestDispatcher rd = request.getRequestDispatcher("SuaHoKhau.jsp");
			rd.forward(request, response);
		}
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
