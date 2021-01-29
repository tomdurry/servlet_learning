import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample
 */
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Sample() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jsp = "/WEB-INF/login.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(jsp);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		String userId = request.getParameter("userid");
		String passWord = request.getParameter("password");
		if (userId.equals("admin") && passWord.equals("admin")) {
			RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/loginSuccess.jsp");
			req.forward(request, response);
		} else {
			RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/login.jsp");
			req.include(request, response);
		}
	}

	protected String createHTML(String methodType) {
		StringBuffer sb = new StringBuffer();

		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>サンプル</title>");
		sb.append("</head>");
		sb.append("<body>");

		sb.append("<p>");
		sb.append(methodType);
		sb.append("メソッドで呼び出されました</p>");

		sb.append("<p><a href='Sample'>リンク</a></p>");

		sb.append("<form action='Sample' method='get'>");
		sb.append("<input type='submit' value='GETで送信'>");
		sb.append("</form>");

		sb.append("<form action='Sample' method='post'>");
		sb.append("<input type='submit' value='POSTで送信'>");
		sb.append("</form>");

		sb.append("</body>");
		sb.append("</html>");

		return (new String(sb));
	}
}
