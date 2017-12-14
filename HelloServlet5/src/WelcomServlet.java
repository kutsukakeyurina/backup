

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WelcomServlet")
public class WelcomServlet extends HttpServlet {

    /**
	 *
	 */
	private static final long serialVersionUID = 8342764103456374602L;

	public WelcomServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String name=request.getParameter("username");

		System.out.println(name);

		PrintWriter out=response.getWriter();
		out.println("<html><head></head><body><br>"+name+"さん、ようこそ！</body></html>");
	}


	}


