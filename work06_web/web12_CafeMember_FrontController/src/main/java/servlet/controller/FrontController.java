package servlet.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/front.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopro..request..");
		String command = request.getParameter("command");
		String path = "index.jsp";
		if(command.equals("register")) {
			path = register(request,response);
		} else if (command.equals("find")) {
			System.out.println("find...");
			path = find(request,response);
		} else if (command.equals("login")) {
			path = login(request,response);
		} else if (command.equals("showAll")) {
			path = showAll(request,response);
		} else if (command.equals("update")) {
			path = update(request,response);
		}
		request.getRequestDispatcher(path).forward(request, response);
	}	//doProcess
	
	
	//회원 가입 비지니스 로직
	private String register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.양방향 한글처리
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        
        //2. 폼값 받는다
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        
        //3. (VO객체 생성)
        MemberVO pvo = new MemberVO(id, password, name, address);
        
        // 4. DAO 리턴받아서 비지니스 로직 호출
        String path = "index.jsp";	//기본값으로 하나 만들어둠
        try {
        	MemberDAOImpl.getInstance().registerMember(pvo);
        	path = "register_result.jsp";
        }catch(Exception e) {
        	
        }
        return path;
        
	}
	
	//회원 검색 비지니스 로직
	private String find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로직은 여기서 작성
		
			//1.양방향 한글처리
			request.setCharacterEncoding("utf-8");
	        response.setContentType("text/html;charset=utf-8");
	        
	        //2. 폼값 받아서
	        String id = request.getParameter("id");
	        		
	        //3. DAO리턴받고 비지니스 로직 호출....반환값있다
	        //4. 반환값을 바인딩
	        String path = "find_fail.jsp";
	        try {
	        	MemberVO rvo=MemberDAOImpl.getInstance().findByIdMember(id);
	        	request.setAttribute("vo", rvo);
	        	path = "find_ok.jsp";
	        }catch(Exception e) {
	        	
	        }            
	        return path;
		
	}
	
	private String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.양방향 한글처리
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        
        //2.폼값 받아서
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String path = "index.jsp";
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
        return path;
	}
	
	
	private String showAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.양방향 한글처리
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        
        String path = "";
        try {
        	ArrayList<MemberVO> list=MemberDAOImpl.getInstance().showAllMember();
        	request.setAttribute("list", list);
        	path = "allView.jsp";
        }catch(Exception e) {
        	
        }
        return path;
	}
	
	//쿠키는 서블릿이 생성되는 시점에 같이 생성된다.
	
	
	private String update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.양방향 한글처리
		request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        
        //2. 폼값 받는다
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        
        //3. (VO객체 생성)
        MemberVO pvo = new MemberVO(id, password, name, address);
        
        // 4. DAO 리턴받아서 비지니스 로직 호출
        String path = "index.jsp";	//기본값으로 하나 만들어둠
        try {
        	MemberDAOImpl.getInstance().updateMember(pvo);
        	//수정된 객체의 내용을 반드시 바인딩..세션
        	HttpSession session=request.getSession();
        	if(session.getAttribute("vo")!=null) {
        		session.setAttribute("vo", pvo);
        	}
        	path = "update_result.jsp";
        }catch(Exception e) {
        	
        }
        return path;
        
	}
	
	
	

}
