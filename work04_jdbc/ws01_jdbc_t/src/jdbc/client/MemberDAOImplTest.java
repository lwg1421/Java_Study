package jdbc.client;

import java.sql.Connection;
import java.sql.PreparedStatement;

import config.ServerInfo;
import jdbc.dao.impl.MemberDAOImpl;
import jdbc.dto.Member;
import jdbc.exception.RecordNotFoundException;

public class MemberDAOImplTest {

	public static void main(String[] args){
		MemberDAOImpl dao = MemberDAOImpl.getInstance();
		
		System.out.println("\n=============insertMember===================\n");
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();
			String query = "INSERT INTO member(id, name, email, phone) VALUES(seq_id.nextval,?,?,?)";
			dao.insertMember(new Member("길복순", "kill@daum.kr", "4444"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n==============deleteMember====================\n");
		try {
			conn = getConnect();
			if(idExist(id,conn)) {
				String query = "DELETE member WHERE id = ?";
				ps = conn.prepareStatement(query);
				ps.setInt(1, id);
				int row = ps.executeUpdate();
				System.out.println(row + "ROW DELETe OK~!!");
			} else {
				throw new RecordNotFoundException("삭제대상의 회원님이 존재하지 않습니다.");
			}
		}finally{
			closeAll(conn,ps);
		}
		
		System.out.println("\n==============updateMember====================\n");
		
//		try {
//			dao.updateMember(new Member(3, "길복순", "kill@google.com", "777"));
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		System.out.println("\n===============getMember====================\n");
//		try {
//			Member member = dao.getMember(3);
//			System.out.println(member);
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		System.out.println("\n===============getMember=====================\n");
		
//		try {
//			ArrayList<Member> list=dao.getMember();
//			for(Member m : list) System.out.println(m);
//		}catch(Exception e) {
//			
//		}
		
	}
	
	static {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println("드라이버 로딩 성공..");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패..");
		}
	}
}
