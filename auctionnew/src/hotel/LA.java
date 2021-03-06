package hotel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import model.Member;
import model.����â;
import view.Act;
import view.flight;

public class LA {
	private JFrame frame;
	private Member loginuser;

	public LA(Member member) {
		this.loginuser = member;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(156, 44, 718, 387);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 718, 387);
		panel.add(scrollPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 245));
		scrollPane.setViewportView(panel_1);
		frame.setBounds(100, 100, 890, 466);
		panel_1.setPreferredSize(new Dimension(680, 600));
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("New label");
		String imgPath = this.getClass().getResource(".").getPath() + "..//..//img//����//LA//1.jpg";

		JButton LA1 = new JButton("\uC608\uC57D\uD558\uAE30");
		LA1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				����â bill = new ����â();
				
				
			}
		});
		LA1.setFont(new Font("���� ���� Semilight", Font.BOLD, 18));
		LA1.setBackground(Color.WHITE);
		LA1.setBounds(532, 85, 175, 55);
		panel_1.add(LA1);

		JButton LA2 = new JButton("\uC608\uC57D\uD558\uAE30");
		LA2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				����â bill = new ����â();
				
			}
		});
		LA2.setFont(new Font("���� ���� Semilight", Font.BOLD, 18));
		LA2.setBackground(Color.WHITE);
		LA2.setBounds(532, 253, 175, 62);
		panel_1.add(LA2);

		JButton LA3 = new JButton("\uC608\uC57D\uD558\uAE30");
		LA3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					����â bill = new ����â();
			
			}
		});
		LA3.setFont(new Font("���� ���� Semilight", Font.BOLD, 18));
		LA3.setBackground(Color.WHITE);
		LA3.setBounds(532, 474, 175, 62);
		panel_1.add(LA3);
		lblNewLabel_1.setIcon(new ImageIcon(imgPath));
		lblNewLabel_1.setBounds(12, 10, 160, 157);
		panel_1.add(lblNewLabel_1);

		JTextPane txtpnJwIn = new JTextPane();
		txtpnJwIn.setFont(new Font("���� ���� Semilight", Font.BOLD, 20));
		txtpnJwIn.setText(
				"JW \uBA54\uB9AC\uC5B4\uD2B8 in L.A\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnJwIn.setBounds(231, 10, 476, 157);
		panel_1.add(txtpnJwIn);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 10, 695, 182);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("New label");
		String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//img//����//LA//2.jpg";
		lblNewLabel_2.setIcon(new ImageIcon(imgPath1));
		lblNewLabel_2.setBounds(12, 205, 160, 157);
		panel_1.add(lblNewLabel_2);

		JTextPane txtpnTheGrandHotel = new JTextPane();
		txtpnTheGrandHotel.setFont(new Font("���� ���� Semilight", Font.BOLD, 20));
		txtpnTheGrandHotel.setText(
				"Embassy Suites by Hilton L.A(\uD790\uD2BC)\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnTheGrandHotel.setBounds(231, 202, 476, 157);
		panel_1.add(txtpnTheGrandHotel);

		JLabel label = new JLabel("New label");
		label.setBounds(12, 202, 695, 169);
		panel_1.add(label);

		JLabel lblNewLabel_4 = new JLabel("New label");
		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//img//����//LA//3.jpg";
		lblNewLabel_4.setIcon(new ImageIcon(imgPath2));
		lblNewLabel_4.setBounds(12, 394, 160, 157);
		panel_1.add(lblNewLabel_4);

		JTextPane txtpnInLa = new JTextPane();
		txtpnInLa.setFont(new Font("���� ���� Semilight", Font.BOLD, 20));
		txtpnInLa.setText("\uC250\uB77C\uD1A4 in L.A\r\n\r\nBreakfast Included\r\nFree WiFi\r\nFree Airport Shuttle");
		txtpnInLa.setBounds(231, 394, 476, 157);
		panel_1.add(txtpnInLa);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(12, 394, 695, 182);
		panel_1.add(lblNewLabel_3);

		JLabel label_1 = new JLabel("New label");
		String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//img//���.png";

		JTextPane txtpnSameDayTo_1 = new JTextPane();
		txtpnSameDayTo_1.setBackground(Color.WHITE);
		txtpnSameDayTo_1.setText("    Same day\r\n    to go LA");
		txtpnSameDayTo_1.setOpaque(false);
		txtpnSameDayTo_1.setForeground(Color.WHITE);
		txtpnSameDayTo_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		txtpnSameDayTo_1.setBounds(10, 163, 134, 48);
		frame.getContentPane().add(txtpnSameDayTo_1);
		label_1.setIcon(new ImageIcon(imgPath5));
		label_1.setBounds(0, 0, 180, 43);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("New label");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				flight bill = new flight();
			}
		});
		String imgPath8 = this.getClass().getResource(".").getPath() + "..//..//img//la1.jpg";

		JTextPane txtpnSameDayTo = new JTextPane();
		txtpnSameDayTo.setText("    Same day\r\n    to go LA");
		txtpnSameDayTo.setOpaque(false);
		txtpnSameDayTo.setForeground(Color.WHITE);
		txtpnSameDayTo.setFont(new Font("SansSerif", Font.BOLD, 16));
		txtpnSameDayTo.setBounds(10, 338, 134, 48);
		frame.getContentPane().add(txtpnSameDayTo);
		label_2.setIcon(new ImageIcon(imgPath8));
		label_2.setBounds(10, 60, 132, 150);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("New label");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Act ac = new Act(loginuser);
			}
		});
		String imgPath9 = this.getClass().getResource(".").getPath() + "..//..//img//la2.jpg";
		label_3.setIcon(new ImageIcon(imgPath9));
		label_3.setBounds(10, 236, 132, 150);
		frame.getContentPane().add(label_3);

//<<<<<<< HEAD
//		JTextArea textArea_3 = new JTextArea();
//		textArea_3.setBounds(384, 618, 512, 150);
//		frame.getContentPane().add(textArea_3);
//		
//		JLabel label_2 = new JLabel("\uB354 \uB2C8\uAEBC \uBF40\uAEBC \uD638\uD154\r\n\r\nbreakfast included\r\nFree WIFI\r\nFree PARKING");
//		label_2.setFont(new Font("���� ���� Semilight", Font.BOLD, 20));
//		label_2.setBounds(201, 620, 691, 148);
//		frame.getContentPane().add(label_2);
//		String imgPath21 = this.getClass().getResource(".").getPath() + "..//..//img//����//LA//1.jpg";
//		String imgPath31 = this.getClass().getResource(".").getPath() + "..//..//img//����//LA//2.jpg";
//		String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//img//����//LA//4.jpg";
//		String imgPath6 = this.getClass().getResource(".").getPath() + "..//..//img//����//LA//5.jpg";
//		String imgPath7 = this.getClass().getResource(".").getPath() + "..//..//img//����//LA//6.jpg";
//		String imgPath8 = this.getClass().getResource(".").getPath() + "..//..//img//����//LA//7.jpg";
//		String imgPath9 = this.getClass().getResource(".").getPath() + "..//..//img//����//LA//8.jpg";
//		String imgPath10 = this.getClass().getResource(".").getPath() + "..//..//img//����//LA//9.jpg";
//		String imgPath11 = this.getClass().getResource(".").getPath() + "..//..//img//����//LA//10.jpg";
//=======
//>>>>>>> branch 'master' of https://github.com/khornejp/auctionsystemnew.git
	}
}
