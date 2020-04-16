package com.sy.spring_1.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.sy.util.DBConnect;

@Repository
public class MemberDAO {

	//update
	public int memberUpdate(MemberVO memberVO) throws Exception{
		
		int result = 0;
		
		Connection con = DBConnect.getConnection();
		String sql = "update member set name=?,age=?,phone=?,email=? where id=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, memberVO.getName());
		st.setInt(2, memberVO.getAge());
		st.setString(3, memberVO.getPhone());
		st.setString(4, memberVO.getEmail());
		st.setString(5, memberVO.getId());

		result = st.executeUpdate();
	
		st.close();
		con.close();
		
		return result;
		
	
	}
	
	
	//delete
	public int memberDelete(MemberVO memberVO) throws Exception{
		//String id 해도 되지만 dto받아서 get으로 받아올수있다.
		int result=0;//db 행
		
		Connection con = DBConnect.getConnection();
		String sql = "delete member where id=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,memberVO.getId());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	//join
	public int memberJoin(MemberVO memberVO) throws Exception{
		int result=0;
		
		Connection con = DBConnect.getConnection();
		String sql = "INSERT INTO MEMBER VALUES (?,?,?,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, memberVO.getId());
		st.setString(2, memberVO.getPw());
		st.setString(3, memberVO.getName());
		st.setString(4, memberVO.getPhone());
		st.setInt(5, memberVO.getAge());
		st.setString(6, memberVO.getEmail());
		
		//이거작성할때 순서를 초반에 만든 그대로 적어야 에러가 나지 않는다.
		
		
		result = st.executeUpdate();

		st.close();
		con.close();
		
		return result;
	}
	
	//login
	public MemberVO memberLogin(MemberVO memberVO) throws Exception{
		
		Connection con = DBConnect.getConnection();
		String sql = "select * from member where id=? and pw=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, memberVO.getId());
		st.setString(2, memberVO.getPw());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			memberVO.setName(rs.getString("name"));
			memberVO.setEmail(rs.getString("email"));
			memberVO.setPhone(rs.getString("phone"));
			memberVO.setAge(rs.getInt("age"));
		}else {
			memberVO=null;
		}
			
		st.close();
		con.close();
		
		return memberVO;
	}
	
	//MyPage
	
}
