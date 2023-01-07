package javakadai;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 現在日時を取得する
		String message="時刻取得したよ！";
		String date3="";
		String date4="";

		Date time1 = new Date();

		SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat dateFormat4 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		date3 = dateFormat3.format(time1);
		date4 = dateFormat4.format(time1);
		
		//【JSP→Servlet→JSPの形式】
		// リクエストにデータを追加する
		request.setAttribute("message", message);
		request.setAttribute("date3", date3);
		request.setAttribute("date4", date4);
		// result.jspへ転送
		request.getRequestDispatcher("/gettime.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
