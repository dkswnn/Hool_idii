package MaybeWe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public GUI(String lastName) {
		setTitle("Шинэ Монгол Коосэн Сургууль");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		
		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(228, 228, 228));
		bottom.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		
		JPanel sidebar = new JPanel();
		sidebar.setForeground(new Color(0, 0, 0));
		sidebar.setBackground(new Color(46, 46, 46));
		sidebar.setBorder(new EmptyBorder(0, 0, 0, 0));
		sidebar.setBounds(0, 0, 340, 900);
		
		JPanel top = new JPanel();
		top.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(sidebar, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(top, GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(bottom, GroupLayout.DEFAULT_SIZE, 1289, Short.MAX_VALUE)
							.addGap(1))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(top, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(bottom, GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE))
				.addComponent(sidebar, GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
		);
		sidebar.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("@Mybuuz");
		lblNewLabel.setBounds(30, 23, 145, 52);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		sidebar.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Нүүр");
		lblNewLabel_2.setBounds(50, 127, 61, 20);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		sidebar.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Үнэлгээ");
		lblNewLabel_2_1.setBounds(46, 170, 88, 20);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sidebar.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Хоолны цэс");
		lblNewLabel_2_2.setBounds(45, 212, 110, 20);
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sidebar.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Захиалгийн түүх");
		lblNewLabel_2_2_1.setBounds(45, 255, 120, 20);
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sidebar.add(lblNewLabel_2_2_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 360, 145, 2);
		panel.setBackground(new Color(114, 114, 114));
		sidebar.add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Тохиргоо");
		lblNewLabel_3.setBounds(45, 381, 89, 20);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		sidebar.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Таны туслах");
		lblNewLabel_3_1.setBounds(30, 668, 89, 26);
		lblNewLabel_3_1.setForeground(new Color(114, 114, 114));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sidebar.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Холбогдох хаяг");
		lblNewLabel_3_1_1.setBounds(30, 706, 120, 26);
		lblNewLabel_3_1_1.setForeground(new Color(114, 114, 114));
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sidebar.add(lblNewLabel_3_1_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 127, 28, 20);
		panel_8.setBackground(new Color(147, 147, 147));
		sidebar.add(panel_8);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setBounds(10, 170, 28, 20);
		panel_8_1.setBackground(new Color(147, 147, 147));
		sidebar.add(panel_8_1);
		
		JPanel panel_8_2 = new JPanel();
		panel_8_2.setBounds(10, 212, 28, 20);
		panel_8_2.setBackground(new Color(147, 147, 147));
		sidebar.add(panel_8_2);
		
		JPanel panel_8_2_1 = new JPanel();
		panel_8_2_1.setBounds(10, 255, 28, 20);
		panel_8_2_1.setBackground(new Color(147, 147, 147));
		sidebar.add(panel_8_2_1);
		
		JPanel panel_8_2_2 = new JPanel();
		panel_8_2_2.setBounds(10, 381, 28, 20);
		panel_8_2_2.setBackground(new Color(147, 147, 147));
		sidebar.add(panel_8_2_2);
		bottom.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 46, 46));
		panel_1.setBounds(72, 41, 393, 227);
		bottom.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Дансны үлдэгдэл");
		lblNewLabel_6.setBounds(114, 40, 156, 25);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_6);	
		
		JLabel lblNewLabel_6_1 = new JLabel("9,000₮");
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblNewLabel_6_1.setBounds(110, 93, 181, 48);
		panel_1.add(lblNewLabel_6_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(147, 147, 147));
		panel_2.setBounds(247, 167, 114, 34);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Цэнэглэх");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(34, 0, 80, 34);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("+");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(10, 0, 14, 34);
		panel_2.add(lblNewLabel_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(147, 147, 147));
		panel_3.setBounds(42, 32, 54, 48);
		panel_1.add(panel_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(46, 46, 46));
		panel_1_1.setBounds(549, 41, 605, 227);
		bottom.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_6_2 = new JLabel("Өнөөдрийн сэт хоол");
		lblNewLabel_6_2.setForeground(Color.WHITE);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6_2.setBounds(106, 11, 236, 89);
		panel_1_1.add(lblNewLabel_6_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(147, 147, 147));
		panel_3_1.setBounds(42, 32, 54, 48);
		panel_1_1.add(panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(147, 147, 147));
		panel_3_2.setBounds(343, 32, 228, 170);
		panel_1_1.add(panel_3_2);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Цуйван сэт");
		lblNewLabel_6_1_1.setForeground(Color.WHITE);
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_6_1_1.setBounds(106, 92, 236, 54);
		panel_1_1.add(lblNewLabel_6_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(147, 147, 147));
		panel_2_1.setBounds(42, 168, 119, 34);
		panel_1_1.add(panel_2_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Захиалах");
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7_1.setBounds(34, 1, 92, 34);
		panel_2_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("+");
		lblNewLabel_8_1.setForeground(Color.WHITE);
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8_1.setBounds(10, 0, 14, 34);
		panel_2_1.add(lblNewLabel_8_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(255, 255, 255), 0, true));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(73, 311, 721, 303);
		bottom.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Сүүлд идсэн түүх");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(36, 22, 188, 25);
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Захиалсан хоол");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(54, 68, 127, 29);
		panel_4.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Он, Сар, Өдөр");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10_1.setBounds(233, 68, 127, 29);
		panel_4.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Тоо ширхэг");
		lblNewLabel_10_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10_2.setBounds(403, 70, 127, 25);
		panel_4.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_3 = new JLabel("Нийт дүн");
		lblNewLabel_10_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10_3.setBounds(554, 71, 127, 22);
		panel_4.add(lblNewLabel_10_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(36, 116, 645, 2);
		panel_4.add(panel_6);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.LIGHT_GRAY);
		panel_6_1.setBounds(36, 164, 645, 2);
		panel_4.add(panel_6_1);
		
		JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setForeground(Color.LIGHT_GRAY);
		panel_6_1_1.setBackground(Color.LIGHT_GRAY);
		panel_6_1_1.setBounds(38, 218, 645, 2);
		panel_4.add(panel_6_1_1);
		
		JLabel lblNewLabel_10_4_1_1 = new JLabel("Тактуритан");
		lblNewLabel_10_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1.setBounds(54, 231, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1);
		
		JLabel lblNewLabel_10_4_1_1_1 = new JLabel("Онигири");
		lblNewLabel_10_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_1.setBounds(54, 180, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_1);
		
		JLabel lblNewLabel_10_4_1_1_2 = new JLabel("Будаатай хуурга");
		lblNewLabel_10_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2.setBounds(54, 129, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2);
		
		JLabel lblNewLabel_10_4_1_1_2_1 = new JLabel("2021.10.17\r\n");
		lblNewLabel_10_4_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_1.setBounds(233, 129, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_1);
		
		JLabel lblNewLabel_10_4_1_1_2_2 = new JLabel("2021.10.16");
		lblNewLabel_10_4_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_2.setBounds(233, 177, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_2);
		
		JLabel lblNewLabel_10_4_1_1_2_3 = new JLabel("2021.10.15");
		lblNewLabel_10_4_1_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_3.setBounds(233, 231, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_3);
		
		JLabel lblNewLabel_10_4_1_1_2_5 = new JLabel("1");
		lblNewLabel_10_4_1_1_2_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_5.setBounds(442, 129, 89, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_5);
		
		JLabel lblNewLabel_10_4_1_1_2_6 = new JLabel("4");
		lblNewLabel_10_4_1_1_2_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_6.setBounds(442, 180, 89, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_6);
		
		JLabel lblNewLabel_10_4_1_1_2_7 = new JLabel("1");
		lblNewLabel_10_4_1_1_2_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_7.setBounds(442, 231, 89, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_7);
		
		JLabel lblNewLabel_10_4_1_1_2_9 = new JLabel("8,000₮");
		lblNewLabel_10_4_1_1_2_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_9.setBounds(554, 126, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_9);
		
		JLabel lblNewLabel_10_4_1_1_2_10 = new JLabel("8,000₮");
		lblNewLabel_10_4_1_1_2_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_10.setBounds(554, 180, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_10);
		
		JLabel lblNewLabel_10_4_1_1_2_11 = new JLabel("8,000₮");
		lblNewLabel_10_4_1_1_2_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_11.setBounds(554, 231, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_11);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(855, 311, 299, 303);
		bottom.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_9_1 = new JLabel("Хамгийн их идсэн хоол\r\n");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9_1.setBounds(40, 11, 241, 25);
		panel_5.add(lblNewLabel_9_1);
		top.setLayout(null);
		
		JLabel toptext = new JLabel("Сайн байна уу,");
		toptext.setBounds(41, 27, 261, 42);
		toptext.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		toptext.setLabelFor(toptext);
		top.add(toptext);
		toptext.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel_1 = new JLabel("Өлсөж байна уу ?");
		lblNewLabel_1.setBounds(41, 70, 238, 22);
		lblNewLabel_1.setForeground(new Color(114, 114, 114));
		lblNewLabel_1.setFont(new Font("Tahoma",	 Font.PLAIN, 18));
		top.add(lblNewLabel_1);
		
		JLabel dynamic = new JLabel(lastName);
		dynamic.setBounds(268, 16, 155, 65);
		dynamic.setFont(new Font("Tahoma", Font.PLAIN, 30));
		top.add(dynamic);
		
		JLabel dynamic_1 = new JLabel(lastName);
		dynamic_1.setBounds(1035, 16, 93, 65);
		dynamic_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		top.add(dynamic_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("/Users/mac/Downloads/Firefox downloads/avatar(1).png"));
		lblNewLabel_4.setBounds(1105, 27, 50, 54);
		top.add(lblNewLabel_4);
		contentPane.setLayout(gl_contentPane);
	}
}