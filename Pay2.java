package study;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Pay2 extends JFrame{
	private JButton btntime;//시간권버튼
	private JButton btnperiod;//기간권 버튼
	private JLabel label;//배경이미지
	private JLabel label2;
	
	private JLabel payresult;
	

	private JButton btntime1;
	private JButton btntime2;
	private JButton btntime4;
	private JButton btntime6;
	private JButton btntime9;
	private JButton btntime12;
	
	private JButton btncardpay;
	private JButton btncashpay;
	private JButton back;
	
	ImageIcon img=new ImageIcon("./Button_Image/image_exitButton.jpg");
	ImageIcon img2=new ImageIcon("./Button_Image/image_exitButton2.jpg");
	ImageIcon imgtime=new ImageIcon("./Button_Image/time.jpg");
	ImageIcon imageperiod=new ImageIcon("./Button_Image/time2.jpg");
	
	Font font=new Font("맑은 고딕", Font.PLAIN, 17);
	
	
	
	public Pay2() {
		setTitle("시간제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setVisible(true);
		
		// panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        PayUI(panel);
		
		
		//initGUI
		this.setSize(1100,700);
		this.setLocationRelativeTo(null);
		
        //배경이미지
        label = new JLabel();
//        label.setIcon(new ImageIcon("C:\\Java\\eclipse-workspace\\myjava\\study\\family.jpg"));
        label.setBounds(0, 0, 1100, 700);
        panel.add(label);
        
        label2=new JLabel();
        label2.setBounds(0,0,1100,100);
        label2.setOpaque(true);
        label2.setBackground(Color.pink);
        label2.setText("                                                                            원하는 메뉴를 선택하세요.");
        label2.setFont(font);
        panel.add(label2);

        // add
        getContentPane().add(panel);
       
        // visible
        setVisible(true);
        
        //시간권버튼
        
        btntime.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				Pay pay=new Pay();
				pay.setVisible(true);
				dispose();
				
			}
		});
        
        //뒤로가기버튼
        back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				UI1 ui1=new UI1();
				ui1.setVisible(true);
				dispose();
			}
		});
        
        //현금결제
        btncashpay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
        //카드결제
        btncardpay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	public void PayUI(JPanel panel){
		panel.setLayout(null);
		
		
		
//		btntime=new JButton(imgtime);
//		btntime.setBounds(0,100, 550,67);
//		btntime.setBorderPainted(false);
//		btntime.setPreferredSize(new Dimension(300,50));
//
//		btntime.setBackground(Color.yellow);
//		panel.add(btntime);
		
//		btnperiod=new JButton("기간권");
//		btnperiod.setBounds(550, 100, 550, 67);
//		btnperiod.setBackground(Color.yellow);
//		btnperiod.setFont(font);
//		panel.add(btnperiod);
		
		btntime1=new JButton("1일권");
		btntime1.setBounds(0,167,367,196);
		btntime1.setBackground(Color.yellow);
		btntime1.setFont(font);
		panel.add(btntime1);
		btntime1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				payresult.setText("가격:11000");
			}
		});
		
		
		btntime2=new JButton("3일권");
		btntime2.setBounds(367,167,367,196);
		btntime2.setBackground(Color.yellow);
		btntime2.setFont(font);
		panel.add(btntime2);
		btntime2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				payresult.setText("가격:28000");
			}
		});
		
		btntime4=new JButton("7일권");
		btntime4.setBounds(734,167,367,196);
		btntime4.setBackground(Color.yellow);
		btntime4.setFont(font);
		panel.add(btntime4);
		btntime4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				payresult.setText("가격:45000");
			}
		});
		
		
		btntime6=new JButton("10일권");
		btntime6.setBounds(0,363,367,196);
		btntime6.setBackground(Color.yellow);
		btntime6.setFont(font);
		panel.add(btntime6);
		btntime6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				payresult.setText("가격:50000");
			}
		});
		
		btntime9=new JButton("15일권권");
		btntime9.setBounds(367,363,367,196);
		btntime9.setBackground(Color.yellow);
		btntime9.setFont(font);
		panel.add(btntime9);
		btntime9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				payresult.setText("가격:75000");
			}
		});
		
		btntime12=new JButton("30일권");
		btntime12.setBounds(734,363,367,196);
		btntime12.setBackground(Color.yellow);
		btntime12.setFont(font);
		panel.add(btntime12);
		btntime12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				payresult.setText("가격:100000");
			}
		});
		
		btncardpay=new JButton("카드결제");
		btncardpay.setBounds(800,560,300,100);
		btncardpay.setBackground(Color.red);
		btncardpay.setFont(font);
		panel.add(btncardpay);
		
		btncashpay=new JButton("현금결제");
		btncashpay.setBounds(500,560,300,100);
		btncashpay.setBackground(Color.cyan);
		btncashpay.setFont(font);
		panel.add(btncashpay);
		
		back = new JButton(img);
		back.setBounds(0, 610, 300, 50);
		back.setRolloverIcon(img2);
		back.setBorderPainted(false);

		panel.add(back);
		
		btntime=new JButton(imgtime);
		btntime.setBounds(0,70, 550,98);
		panel.add(btntime);
		
		btnperiod=new JButton(imageperiod);
		btnperiod.setBounds(550, 70, 550, 98);
		panel.add(btnperiod);
		
		payresult=new JLabel();
		payresult.setText("가격:0");
		payresult.setBounds(330, 618, 100, 50);
		payresult.setFont(font);
		panel.add(payresult);
		

	
	}
	public static void main(String[] args) {
		new Pay();
	}
	
	

}
