package javakadai;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet1")
public class SampleServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 変数宣言
		int i =0;
		//上限値
		int l =11;
		String message = "変数iの上限は"+Integer.toString(l-1)+"とします。";
		// 保持させる箱
		StringBuilder sb = new StringBuilder();
		
		for (i=0;i<l;i++) {
			sb.append(i);
			
			if (i != (l-1)) {
				sb.append(",");
			}
		}

		
		//【JSP→Servlet→JSPの形式】
		// リクエストにデータを追加する
		request.setAttribute("message", message);
		request.setAttribute("sb", sb.toString());
		// result.jspへ転送
		request.getRequestDispatcher("/showint.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
