package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 쿠키생성
		Cookie c1 = new Cookie("id","KBStar");
		Cookie c2 = new Cookie("today","2023-04-19");
		
		//2.
		c1.setMaxAge(24*60*60);	//하루동안 정보 보관	//브라우저에 저장됨 //ex..오늘 본 상품 정보가 저장됨
		c2.setMaxAge(0); //설정을 0으로 두면 쿠키 사용이 불가능함.
		
		//3. 서버로 다시 전송
		response.addCookie(c1);
		response.addCookie(c2);
		
		//4. 페이지 이동
		response.sendRedirect(getServletInfo());
	}

}
