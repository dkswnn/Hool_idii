package MaybeWe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.*;
 
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class hoolnitses extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hoolnitses frame = new hoolnitses();
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
	public hoolnitses() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 900);
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
					.addComponent(sidebar, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(top, GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(bottom, GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
							.addGap(1))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(top, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(bottom, GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
				.addComponent(sidebar, GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
		);
		sidebar.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("@Mybuuz");
		lblNewLabel.setBounds(30, 23, 88, 52);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		sidebar.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Нүүр");
		lblNewLabel_2.setBounds(45, 127, 61, 20);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(160, 160, 160));
		sidebar.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Үнэлгээ");
		lblNewLabel_2_1.setForeground(new Color(160, 160, 160));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(46, 170, 88, 20);
		sidebar.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Хоолны цэс");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(45, 212, 110, 20);
		sidebar.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Захиалгийн түүх");
		lblNewLabel_2_2_1.setForeground(new Color(160, 160, 160));
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(45, 255, 120, 20);
		sidebar.add(lblNewLabel_2_2_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(114, 114, 114));
		panel.setBounds(10, 360, 145, 2);
		sidebar.add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Тохиргоо");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(45, 381, 89, 14);
		sidebar.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Таны туслах");
		lblNewLabel_3_1.setForeground(new Color(114, 114, 114));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(30, 723, 89, 14);
		sidebar.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Холбогдох хаяг");
		lblNewLabel_3_1_1.setForeground(new Color(114, 114, 114));
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(30, 755, 120, 14);
		sidebar.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Гарах");
		lblNewLabel_3_1_2.setForeground(new Color(114, 114, 114));
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_2.setBounds(66, 802, 89, 14);
		sidebar.add(lblNewLabel_3_1_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(147, 147, 147));
		panel_8.setBounds(10, 127, 28, 20);
		sidebar.add(panel_8);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(new Color(147, 147, 147));
		panel_8_1.setBounds(10, 170, 28, 20);
		sidebar.add(panel_8_1);
		
		JPanel panel_8_2 = new JPanel();
		panel_8_2.setBackground(new Color(147, 147, 147));
		panel_8_2.setBounds(10, 212, 28, 20);
		sidebar.add(panel_8_2);
		
		JPanel panel_8_2_1 = new JPanel();
		panel_8_2_1.setBackground(new Color(147, 147, 147));
		panel_8_2_1.setBounds(10, 255, 28, 20);
		sidebar.add(panel_8_2_1);
		
		JPanel panel_8_2_2 = new JPanel();
		panel_8_2_2.setBackground(new Color(147, 147, 147));
		panel_8_2_2.setBounds(10, 381, 28, 20);
		sidebar.add(panel_8_2_2);
		
		JPanel panel_8_2_2_1 = new JPanel();
		panel_8_2_2_1.setBackground(new Color(147, 147, 147));
		panel_8_2_2_1.setBounds(28, 802, 28, 20);
		sidebar.add(panel_8_2_2_1);
		bottom.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(72, 57, 1049, 633);
		bottom.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 224, 224));
		panel_1.setBounds(374, 40, 87, 67);
		panel_4.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(0, 0, 87, 67);
		panel_1.add(lblNewLabel_6);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(665, 40, 87, 67);
		panel_4.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(568, 40, 87, 67);
		panel_4.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(471, 40, 87, 67);
		panel_4.add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(762, 40, 87, 67);
		panel_4.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"date", "10/17", "10/16", "10/15", "10/15"}));
		comboBox.setMaximumRowCount(10);
		comboBox.setBounds(100, 40, 137, 67);
		panel_4.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(100, 200, 296, 214);
		panel_4.add(panel_2);
		panel_2.setLayout(null);
		top.setLayout(null);
		
		JLabel toptext = new JLabel("Сайн байна уу, Дөлгөөн ");
		toptext.setFont(new Font("Tahoma", Font.PLAIN, 30));
		toptext.setBounds(41,27,416,42);
		
		toptext.setLabelFor(toptext);
		top.add(toptext);
		toptext.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel_1 = new JLabel("Өлсөж байна уу ?");
		lblNewLabel_1.setForeground(new Color(114, 114, 114));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(41, 62, 238, 22);
		top.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Дөлгөөн");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(978, 27, 69, 22);
		top.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ку-3 анги");
		lblNewLabel_5.setForeground(new Color(114, 114, 114));
		lblNewLabel_5.setBounds(978, 49, 62, 14);
		top.add(lblNewLabel_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBounds(1065, 27, 50, 42);
		top.add(panel_7);
		contentPane.setLayout(gl_contentPane);
	}
}