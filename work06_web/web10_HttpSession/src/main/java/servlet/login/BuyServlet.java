package servlet.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.MemberVO;

/**
 * Servlet implementation class BuyServlet
 */
@WebServlet("/BuyServlet")
public class BuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//다시 요청이 들어가면 새로운 세션이 생길 수 있지만...세션을 죽이지 않는 이상 쿠키를 통해서
		//jsessionid 값이 다시 서버로 날라갈 것이고 서버는 이 값을 열어봐서 기존의 세션으로 요청을 유지한다.
		//이러한 요청이 바로 로그인이다. 즉 로그인 유지기간이다.
		HttpSession session = request.getSession(); //새로운 세션이 아니라 기존의 세션으로 연결된다...세션을 죽여야지만 새로운 세션으로 연결된다.
		if (session.getAttribute("vo")!=null) {		//vo가 null이 아니라면.. 즉 로그인 된 생태라면..즉 세션이 기존의 것이라면
			//MemberVO vo = (MemberVO)session.getAttribute("vo");
			System.out.println("jsessionid : " + session.getId());
			session.setAttribute("pname", "book");
			request.getRequestDispatcher("buy_result.jsp").forward(request, response);
		}else {	//vo가 null이라면.. 즉 로그인 된 상태가 아니라면..즉 기존 세션이 죽었다면
			response.sendRedirect("login.html");
		}
	}

	

}
