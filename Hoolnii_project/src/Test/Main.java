package Test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import MaybeWe.GUI;
import Main.Login;
import Main.SignUp;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main(null);
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
	public Main(String lastName) {
		getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 103, 272);
		panel_1.setBackground(Color.BLACK);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton tab1 = new JButton("Tab1");
		tab1.setForeground(Color.WHITE);
		tab1.setBounds(22, 59, 75, 19);
		panel_1.add(tab1);
		
		JButton tab2 = new JButton("Tab2");
		tab2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tab2.setForeground(Color.WHITE);
		tab2.setBounds(22, 99, 75, 19);
		panel_1.add(tab2);
		
		JButton tab3 = new JButton("Tab3");
		tab3.setForeground(Color.WHITE);
		tab3.setBounds(22, 149, 75, 19);
		panel_1.add(tab3);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(107, 30, 343, 236);
		getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label1");
		lblNewLabel.setBounds(17, 44, 61, 16);
		panel_3.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
}
}