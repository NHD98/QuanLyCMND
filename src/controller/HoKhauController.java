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
 * Servlet implementation class HoKhauController
 */
@WebServlet("/HoKhauController")
public class HoKhauController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HoKhauController() {
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
		RequestDispatcher rd;
//		String id = request.getParameter("id");
		System.out.println(request.getParameter("id"));
		if (request.getParameter("id") == null) {
			request.setAttribute("listHoKhau", hoKhauBo.getHoKhau());
			rd = request.getRequestDispatcher("HoKhau.jsp");
		} else {
			request.setAttribute("hoKhauDetail", hoKhauBo.getHoKhauByID(request.getParameter("id")));
			rd = request.getRequestDispatcher("SuaHoKhau.jsp;");
		}

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
