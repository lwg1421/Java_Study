package servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로직은 여기서 작성
	
		//1.양방향 한글처리
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        
        //2.폼값 받아서
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String path = "index.html";
        try {
        	MemberVO rvo = MemberDAOImpl.getInstance().login(id, password);
        	HttpSession session= request.getSession();
        	if (rvo != null) {
        		session.setAttribute("vo", rvo);
        		System.out.println("JSESSIONID : " + session.getId());
        	}
        	path = "login_result.jsp";
        } catch (Exception e) {
        	path = "login_fail.jsp";
        	System.out.println(e);
        }
        
        request.getRequestDispatcher(path).forward(request, response);
        
        //3.VO 생성
        
        //4.DAO 리턴 받아서 비지니스 로직 호출. 반환값 있음
        
        //5.session 받아와서 / session에 바인딩(req, session, context)
        
        //6.네비게이션
        
	}

}
