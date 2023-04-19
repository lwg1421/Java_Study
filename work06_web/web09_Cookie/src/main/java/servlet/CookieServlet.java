package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 쿠키 생성
		Cookie c1 = new Cookie("id", "KBStar");
		Cookie c2 = new Cookie("today", "2023-04-19");
		
		// 2. 
		c1.setMaxAge(24*60*60); // 하루동안 정보 보관 -> 브라우저에서 저장
		c2.setMaxAge(0); // 쿠키 사용 못함 -> 저장 안하는 것
		
		// 3. 서버로 다시 전송
		response.addCookie(c1);
		response.addCookie(c2);
		
		// 4. 페이지 이동
		response.sendRedirect("getCookie.jsp"); // 왜 redirect일까? 고민해보자
	}

}
