package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.CongDanBean;
import bo.CongDanBo;

/**
 * Servlet implementation class CongDan
 */
@WebServlet("/CongDanController")
public class CongDanController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CongDanController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	CongDanBo congDanBo = new CongDanBo();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");

		String cmndID = request.getParameter("txtCMND");
		String ten = request.getParameter("txtTen");
		String ho = request.getParameter("txtHo");
		Date ngaySinh = null;
		if (request.getParameter("datNgaySinh") != null) {
			String temp = request.getParameter("datNgaySinh");
			System.out.println("date: " + temp);
			try {
				ngaySinh = new SimpleDateFormat("yyyy-MM-dd").parse(temp);
				System.out.println("date parse: " + ngaySinh);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		boolean gioiTinh = request.getParameter("cbGioiTinh") != null ? true : false;
		String noiSinh = request.getParameter("txtNoiSinh");
		String tinhTrangHonNhan = request.getParameter("txtTinhTrangHonNhan");
		String ngheNghiep = request.getParameter("txtNgheNghiep");
		String btnTaoMoi = request.getParameter("btnTaoMoi");
		System.out.println(btnTaoMoi);
		if (btnTaoMoi != null) {
			Date date = new Date();
			if (date.getTime() > ngaySinh.getTime()) {
				CongDanBean congDan = new CongDanBean(cmndID, ten, ho, ngaySinh, gioiTinh, noiSinh, tinhTrangHonNhan,
						ngheNghiep);
				congDanBo.themCongDan(congDan);
				request.setAttribute("themCongDan", "1");
			} else {
				request.setAttribute("themCongDan", "2");
			}
		} else {
			request.setAttribute("themCongDan", "0");
		}

		RequestDispatcher rd = request.getRequestDispatcher("ThemCongDan.jsp");
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
