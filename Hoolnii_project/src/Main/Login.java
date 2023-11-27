package Main;
import MaybeWe.GUI;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField Phonenumber;
    private JPasswordField passwordField;
    private JTextField Line;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Login() {
    	contentPane = new JPanel();
        contentPane.setBackground(new Color(230, 230, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 120, 900, 600);
        setResizable(false);
        setTitle("Login");
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel whitePanel = new JPanel();
        whitePanel.setBounds(402, 93, 353, 249);
		whitePanel.setBackground(new Color(250,250,250));
		whitePanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(whitePanel);
        //left panel
        JPanel leftPanel = new JPanel();
        leftPanel.setBounds(0, 0, 300, 600);
        leftPanel.setBackground(new Color(32, 33, 35));
        contentPane.add(leftPanel);
        leftPanel.setLayout(null);
        
        JLabel Ug1 = new JLabel("New Mongol");
        Ug1.setBounds(100, 290, 119, 36);
        Ug1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Ug1.setForeground(new Color( 216, 217, 219));
        leftPanel.add(Ug1);
        
        
        
        JLabel MyBuuz_1 = new JLabel("MyBuuz");
        MyBuuz_1.setBounds(87, 157, 139, 106);
        MyBuuz_1.setForeground(Color.WHITE);
        MyBuuz_1.setFont(new Font("Dialog", Font.BOLD, 30));
        leftPanel.add(MyBuuz_1);
        
        JLabel Ug2 = new JLabel("College of Technology");
        Ug2.setBounds(74, 314, 167, 36);
        Ug2.setForeground(new Color(216, 217, 219));
        Ug2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        leftPanel.add(Ug2);
        
        JLabel Ug3 = new JLabel(" food ordering app");
        Ug3.setBounds(80, 338, 167, 36);
        Ug3.setForeground(new Color(216, 217, 219));
        Ug3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        leftPanel.add(Ug3);
        
        JLabel ShineUserBurtgel = new JLabel("Login to your account");
        ShineUserBurtgel.setBounds(490, 33, 190, 35);
        ShineUserBurtgel.setFont(new Font("Tahoma", Font.PLAIN, 19));
        contentPane.add(ShineUserBurtgel);
        whitePanel.setLayout(null);
        
        // number panel
        
        JLabel lblphonenumber = new JLabel("Phone number");
        lblphonenumber.setBounds(65, 30, 175, 19);
        lblphonenumber.setForeground(Color.BLACK);
        lblphonenumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
        whitePanel.add(lblphonenumber);
        
        Phonenumber = new JTextField();
        Phonenumber.setBounds(65, 62, 220, 36);
        Phonenumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Phonenumber.setColumns(10);
        whitePanel.add(Phonenumber);
        
        // password panel
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(65, 130, 123, 19);
        lblpassword.setForeground(Color.BLACK);
        lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
        whitePanel.add(lblpassword);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(65, 161, 220, 36);
        whitePanel.add(passwordField);
        
        JButton NewtrehButton = new JButton("LOGIN");
        NewtrehButton.setBounds(449, 376, 267, 41);
        NewtrehButton.setFont(new Font("Arial", Font.PLAIN, 13));
        NewtrehButton.setBackground(Color.BLACK);
        NewtrehButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	String Phone = Phonenumber.getText();
            	String password = passwordField.getText();
            	try {	 
            		Class.forName("com.mysql.cj.jdbc.Driver");
            		Connection con=null;
            		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyBuuz", "root", "Zunsod12");
            		java.sql.Statement stmt=con.createStatement();
            		ResultSet rs=stmt.executeQuery("select * from Accounts where mobile_number='"+Phone+"' and password='"+password+"'");
            		if(rs.next()) {
            			 JOptionPane.showMessageDialog(null, "Successfully logged in!");
            			 dispose();
            			 String Phone1=Phonenumber.getText();
            			 String password1=passwordField.getText();
            			 GUI mm = new GUI(password1);
            			 mm.show();
            			 }else {
            				JOptionPane.showMessageDialog(null, "Incorrect password or phone number!");
            			}
            		}catch(ClassNotFoundException e1) {
            			System.out.println(e1);
            		}
            	catch (Exception e1) {
            			// TODO Auto-generated catch block
            			e1.printStackTrace();
            		}
        	}
                
        });
        contentPane.add(NewtrehButton);
        
        Line = new JTextField();
        Line.setBounds(374, 440, 430, 3);
        Line.setBackground(Color.BLACK);
        contentPane.add(Line);
        Line.setColumns(10);
        // SignUp shiljilt
        JButton BurtguulehButton = new JButton("SIGNUP NOW");
        BurtguulehButton.setBounds(504, 483, 148, 35);
        BurtguulehButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null,"The page has changed!");
        		SignUp guiSign = new SignUp();
        		dispose();
        		try{
        			Thread.sleep(200);
        		}
        		catch(Exception e2 ) {throw new RuntimeException(e2);}
                guiSign.show();
        	}
        });
        BurtguulehButton.setForeground(Color.BLACK);
        BurtguulehButton.setBackground(Color.BLACK);
        BurtguulehButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        contentPane.add(BurtguulehButton);
        
        JLabel lblNewLabel = new JLabel("New user?");
        lblNewLabel.setBounds(548, 455, 78, 16);
        contentPane.add(lblNewLabel);

    }
}