package Main;
import Main.Login;
import Main.Mainn;
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
import java.sql.ResultSet;

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


public class SignUp extends JFrame {
	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
	private JTextField Lastname;
    private JTextField Phonenumber;
    private JTextField Firstname;
    private JLabel lblName;
    private JPasswordField passwordField;
    private JTextField Line;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignUp frame = new SignUp();
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

    public SignUp() {
    	contentPane = new JPanel();
        contentPane.setBackground(new Color(230, 230, 230));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 120, 900, 600);
        setResizable(false);
        setTitle("SignUp");
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel whitePanel = new JPanel();
        whitePanel.setBounds(350, 117, 505, 231);
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
        MyBuuz_1.setFont(new Font("Tahoma", Font.BOLD, 30));
        leftPanel.add(MyBuuz_1);
        
        JLabel Ug2 = new JLabel("College of Technology");
        Ug2.setBounds(74, 314, 167, 36);
        Ug2.setForeground(new Color(216, 217, 219));
        Ug2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        leftPanel.add(Ug2);
        
        JLabel Ug3 = new JLabel("food ordering app");
        Ug3.setBounds(80, 338, 167, 36);
        Ug3.setForeground(new Color(216, 217, 219));
        Ug3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        leftPanel.add(Ug3);
        
//        JLabel Logo_box = new JLabel("");
//        Logo_box.setIcon(new ImageIcon("/Users/mac/Downloads/Firefox downloads/dumpling.png"));
//        
//        Logo_box.setForeground(new Color(216, 217, 219));
//        Logo_box.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        Logo_box.setBounds(100, 81, 90, 90);
//        ImageIcon Logo = new ImageIcon("/Users/mac/Downloads/Firefox downloads/dumpling.png");
//		Image Icon =  Logo.getImage();
//		Image modImage = Icon.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
//		Logo = new ImageIcon(modImage);
//        leftPanel.add(Logo_box);
//        
//        JPanel Box = new JPanel();
//        Box.setBounds(0, 0, 10, 10);
//        leftPanel.add(Box);
//        
//        JLabel Logo = new JLabel("");
//        Logo.setBackground(new Color(238, 238, 238));
//        Box.add(Logo);
        

        
        JLabel ShineUserBurtgel = new JLabel("New User Registration ");
        ShineUserBurtgel.setBounds(506, 34, 227, 41);
        ShineUserBurtgel.setFont(new Font("Arial", Font.PLAIN, 19));
        contentPane.add(ShineUserBurtgel);
        whitePanel.setLayout(null);
        
        //name panel
		
        lblName = new JLabel("Lastname");
        lblName.setBounds(51, 114, 123, 19);
        lblName.setFont(new Font("Arial", Font.PLAIN, 15));
        lblName.setForeground(Color.black);
        whitePanel.add(lblName);

        Lastname = new JTextField();
        Lastname.setBounds(51, 145, 150, 29);
        Lastname.setFont(new Font("Tahoma", Font.PLAIN, 15));
        whitePanel.add(Lastname);
        Lastname.setColumns(10);
        
        // number panel
        
        JLabel lblphonenumber = new JLabel("Phone number");
        lblphonenumber.setBounds(298, 24, 175, 19);
        lblphonenumber.setForeground(Color.BLACK);
        lblphonenumber.setFont(new Font("Arial", Font.PLAIN, 15));
        whitePanel.add(lblphonenumber);
        
        Phonenumber = new JTextField();
        Phonenumber.setBounds(298, 55, 150, 29);
        Phonenumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Phonenumber.setColumns(10);
        whitePanel.add(Phonenumber);
        
        // ovog panel
        
        JLabel lblfirstname = new JLabel("Firstname");
        lblfirstname.setBounds(51, 24, 123, 19);
        lblfirstname.setForeground(Color.BLACK);
        lblfirstname.setFont(new Font("Arial", Font.PLAIN, 15));
        whitePanel.add(lblfirstname);
        
        Firstname = new JTextField();
        Firstname.setBounds(51, 55, 150, 29);
        Firstname.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Firstname.setColumns(10);
        whitePanel.add(Firstname);
        
        // password panel
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(298, 114, 123, 19);
        lblpassword.setForeground(Color.BLACK);
        lblpassword.setFont(new Font("Arial", Font.PLAIN, 15));
        whitePanel.add(lblpassword);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(298, 147, 150, 26);
        whitePanel.add(passwordField);
        
        JButton SignUpButton = new JButton("SIGNUP");
        SignUpButton.setFont(new Font("Arial", Font.PLAIN, 13));
        SignUpButton.setBackground(Color.BLACK);
        SignUpButton.setBounds(466, 378, 267, 41);
        SignUpButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		     
                
                try {
                    String detecting = null;
                    String firstname1 = Firstname.getText();
                    String lastName = Lastname.getText();
                    String mobileNumber = Phonenumber.getText();
                    String password = passwordField.getText();   
                    if(firstname1.equals("") || lastName.equals("") || mobileNumber.equals("") || password.equals("")){
                        JOptionPane.showMessageDialog(null,"Something is blank, Please check again!");
                    }else{
                        
                        Class.forName("com.mysql.cj.jdbc.Driver");
            		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/MyBuuz", "root", "Zunsod12");          		
            		java.sql.Statement stmt=con.createStatement();
                        String SQL="select*from Accounts where mobile_number = '"+mobileNumber+"'";
                        ResultSet rs = stmt.executeQuery(SQL);
                        
                        if(rs.next()){
                            JOptionPane.showMessageDialog(null,"Phone number already exists, Please use another number!");
                        }else{                        
                            String query = ("INSERT INTO Accounts(first_name,last_name,mobile_number,password)values(?,?,?,?)");               
                            PreparedStatement sta = con.prepareStatement(query);
                    
                            sta.setString(1, firstname1);
                            sta.setString(2, lastName);
                            sta.setString(3, mobileNumber);
                            sta.setString(4, password);
                            sta.executeUpdate();
                            JOptionPane.showMessageDialog(null,"Successfully registered!");
                            Mainn guiForm=new Mainn();
                            dispose();
                            guiForm.show();
                        }
                    }

                }
                catch (ClassNotFoundException e1) {
                    System.err.println("JDBC driver not found");
                    e1.printStackTrace();
                }
                catch (Exception e1) {
            	System.err.println("Database connection error.");
                e1.printStackTrace();
                }
        }
                
        });
        contentPane.add(SignUpButton);
        
        Line = new JTextField();
        Line.setBounds(390, 441, 430, 3);
        Line.setBackground(Color.BLACK);
        contentPane.add(Line);
        Line.setColumns(10);
        // Login shiljilt
        JButton LoginButton = new JButton("Already have an account?");
        LoginButton.setForeground(Color.BLACK);
        LoginButton.setBackground(Color.BLACK);
        LoginButton.setFont(new Font("Arial", Font.PLAIN, 12));
        LoginButton.setBounds(506, 469, 196, 35);
        contentPane.add(LoginButton);
        LoginButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Login guiLogin = new Login();
        		JOptionPane.showMessageDialog(null,"The page has changed!");
        		dispose();
        		try{
        			Thread.sleep(200);
        		}
        		catch(Exception e2 ) {throw new RuntimeException(e2);}
        		
                guiLogin.show();
        	}
        });
    }
}