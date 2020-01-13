package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; // �����ͺ��̽� �ּ�
	private String user = "hr";
	private String password = "hr";
	private Connection conn = null;
	private PreparedStatement psmt = null; // 4��
	ResultSet rs = null;
	public int insert(Member member) {
		int rows = 0;
		try { // try catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc������� ȸ�縶�� �̸��� �ٸ���.
			conn = DriverManager.getConnection(url, user, password); // 3���� ���� ���콺 ��Ŭ���� add catch
			// connection �������̽�����
			String sql = "insert into MEMBER values(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql); // 4���� ���� sql���� ��ü�� ����� �غ��ϴ°��� sql�� ���Ͻ�Ŵ
			psmt.setString(1, member.getId());
			psmt.setInt(2, member.getAge());
			psmt.setInt(3, member.getSex());
			psmt.setString(4, member.getName());
			psmt.setString(5, member.getPw());
			rows = psmt.executeUpdate(); // ����Ʈ�� ������ ������ ������Ʈ int�� ����. �̰� ���������� ������ ���� �ο찡 �����̵�.

//			if (rows == 0) {// 5�� rows
//				System.out.println("SQL ���� Ȯ���ϼ���.");
//			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Ŭ���� ��ü�� �����ؼ� �޸𸮿� �÷���
		catch (SQLException e) { // 3���� ����
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
				// �ݴٰ� ���ܰ� �߻��Ҽ� �ֱ⶧���� ��׵� Ʈ���� ĳġ�� �����ش�.
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return rows;
	}

	public Member selectone(Member member) {
		Member loginuser = null;
		try { // try catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc������� ȸ�縶�� �̸��� �ٸ���.
			conn = DriverManager.getConnection(url, user, password); // 3���� ���� ���콺 ��Ŭ���� add catch
			// connection �������̽�����
			String sql = "SELECT * FROM MEMBER WHERE USER_ID=? AND USER_PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getPw());
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				//�ش� ID�� PW�� ���� ����� ����
				String id = rs.getString(1);
				String pw = rs.getString(5);
				String name = rs.getString(4);
				int age = rs.getInt(2);
				int sex = rs.getInt(3);
				
				loginuser = new Member(id);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Ŭ���� ��ü�� �����ؼ� �޸𸮿� �÷���
		catch (SQLException e) { // 3���� ����
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs !=null) rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
				// �ݴٰ� ���ܰ� �߻��Ҽ� �ֱ⶧���� ��׵� Ʈ���� ĳġ�� �����ش�.
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return loginuser;

	}

	public ArrayList<Member> selectAll(String login_id) {
		ArrayList<Member> list = new ArrayList<>();
		//Member loginuser = null;
		try { // try catch ����ó��
			Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc������� ȸ�縶�� �̸��� �ٸ���.
			conn = DriverManager.getConnection(url, user, password); // 3���� ���� ���콺 ��Ŭ���� add catch
			// connection �������̽�����
			String sql = "SELECT * FROM MEMBER WHERE USER_ID !=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, login_id);
			//psmt.setString(2, member.getPw());
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				//�ش� ID�� PW�� ���� ����� ����
				String id = rs.getString(1);
				String pw = rs.getString(5);
				String name = rs.getString(4);
				int age = rs.getInt(2);
				int sex = rs.getInt(3);
				
				list.add(new Member(id))  ;
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Ŭ���� ��ü�� �����ؼ� �޸𸮿� �÷���
		catch (SQLException e) { // 3���� ����
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs !=null) rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
				// �ݴٰ� ���ܰ� �߻��Ҽ� �ֱ⶧���� ��׵� Ʈ���� ĳġ�� �����ش�.
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;
	}
}