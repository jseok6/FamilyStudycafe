package Function;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class SeatSelectAvailability {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeatSelectAvailability window = new SeatSelectAvailability();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SeatSelectAvailability() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	// 1층 배치도 자리 선택 예시 만들기
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setMaximizedBounds(new Rectangle(0, 0, 0, 0));
		frame.setAlwaysOnTop(true);
		frame.setTitle("자리 선택 화면");
		frame.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\dita810\\Desktop\\D팀 프로젝트 자료\\FamilyStudycafe\\src\\img\\family.jpg"));
		frame.setBounds(104, 40, 969, 783);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel contentPane = new JPanel();
		contentPane.validate();
		contentPane.setBounds(0, 0, 953, 744);
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(249, 228, 166));
		frame.getContentPane().add(contentPane);

		ImageIcon logoIcon = new ImageIcon(
				"C:\\Users\\dita810\\Desktop\\D팀 프로젝트 자료\\FamilyStudycafe\\src\\img\\family.jpg");
		Image logoImg = logoIcon.getImage(); // ImageIcon 객체에서 Image 추출
		Image updateLogoImg = logoImg.getScaledInstance(70, 69, Image.SCALE_SMOOTH); // 추출된 Image의 크기 조절하여 새로운 Image 객체
																						// 생성
		ImageIcon updateLogoIcon = new ImageIcon(updateLogoImg); // 새로운 Image 객체로 ImageIcon 객체 생성
		ImageIcon trashcanIcon = new ImageIcon(
				"C:\\Users\\dita810\\Desktop\\D팀 프로젝트 자료\\FamilyStudycafe\\src\\img\\trashcan.png");
		Image trashcanImg = trashcanIcon.getImage();
		Image updateTrashcanImg = trashcanImg.getScaledInstance(57, 54, Image.SCALE_SMOOTH);
		ImageIcon updatetrashcanIcon = new ImageIcon(updateTrashcanImg);
		ImageIcon waterPFIcon = new ImageIcon(
				"C:\\Users\\dita810\\Desktop\\D팀 프로젝트 자료\\FamilyStudycafe\\src\\img\\water.png");
		Image waterPFImg = waterPFIcon.getImage();
		Image updateWaterPFImg = waterPFImg.getScaledInstance(35, 54, Image.SCALE_SMOOTH);
		ImageIcon updateWaterPFIcon = new ImageIcon(updateWaterPFImg);

		setVisible(true);

		JPanel panel1F = new JPanel();
		panel1F.setLayout(null);
		panel1F.setBounds(0, 141, 953, 603);
		contentPane.add(panel1F);
		JButton seat101Btn = new JButton("101");
		seat101Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat101Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat101Btn.setFocusPainted(false);
		seat101Btn.setBackground(new Color(0, 128, 255));
		seat101Btn.setBounds(113, 0, 72, 60);
		panel1F.add(seat101Btn);

		JButton seat102Btn = new JButton("102");
		seat102Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat102Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat102Btn.setFocusPainted(false);
		seat102Btn.setBackground(new Color(0, 128, 255));
		seat102Btn.setBounds(186, 0, 72, 60);
		panel1F.add(seat102Btn);

		JButton seat103Btn = new JButton("103");
		seat103Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat103Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat103Btn.setFocusPainted(false);
		seat103Btn.setBackground(new Color(0, 128, 255));
		seat103Btn.setBounds(259, 0, 72, 60);
		panel1F.add(seat103Btn);

		JButton seat104Btn = new JButton("104");
		seat104Btn.setEnabled(false);
		seat104Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat104Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat104Btn.setFocusPainted(false);
		seat104Btn.setBackground(new Color(255, 0, 0));
		seat104Btn.setBounds(402, 0, 72, 60);
		panel1F.add(seat104Btn);

		JButton seat105Btn = new JButton("105");
		seat105Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat105Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat105Btn.setFocusPainted(false);
		seat105Btn.setBackground(new Color(0, 128, 255));
		seat105Btn.setBounds(475, 0, 72, 60);
		panel1F.add(seat105Btn);

		JButton seat106Btn = new JButton("106");
		seat106Btn.setEnabled(false);
		seat106Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat106Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat106Btn.setFocusPainted(false);
		seat106Btn.setBackground(new Color(255, 165, 0));
		seat106Btn.setBounds(548, 0, 72, 60);
		panel1F.add(seat106Btn);

		JButton seat107Btn = new JButton("107");
		seat107Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat107Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat107Btn.setFocusPainted(false);
		seat107Btn.setBackground(new Color(0, 128, 255));
		seat107Btn.setBounds(621, 0, 72, 60);
		panel1F.add(seat107Btn);

		JButton seat108Btn = new JButton("108");
		seat108Btn.setEnabled(false);
		seat108Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat108Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat108Btn.setFocusPainted(false);
		seat108Btn.setBackground(new Color(255, 165, 0));
		seat108Btn.setBounds(694, 0, 72, 60);
		panel1F.add(seat108Btn);

		JButton seat109Btn = new JButton("109");
		seat109Btn.setEnabled(false);
		seat109Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat109Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat109Btn.setFocusPainted(false);
		seat109Btn.setBackground(new Color(255, 165, 0));
		seat109Btn.setBounds(147, 241, 72, 60);
		panel1F.add(seat109Btn);

		JButton seat110Btn = new JButton("110");
		seat110Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat110Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat110Btn.setFocusPainted(false);
		seat110Btn.setBackground(new Color(0, 128, 255));
		seat110Btn.setBounds(147, 303, 72, 60);
		panel1F.add(seat110Btn);

		JButton seat111Btn = new JButton("111");
		seat111Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat111Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat111Btn.setFocusPainted(false);
		seat111Btn.setBackground(new Color(0, 128, 255));
		seat111Btn.setBounds(329, 241, 72, 60);
		panel1F.add(seat111Btn);

		JButton seat112Btn = new JButton("112");
		seat112Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat112Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat112Btn.setFocusPainted(false);
		seat112Btn.setBackground(new Color(0, 128, 255));
		seat112Btn.setBounds(402, 241, 72, 60);
		panel1F.add(seat112Btn);

		JButton seat113Btn = new JButton("113");
		seat113Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat113Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat113Btn.setFocusPainted(false);
		seat113Btn.setBackground(new Color(0, 128, 255));
		seat113Btn.setBounds(329, 303, 72, 60);
		panel1F.add(seat113Btn);

		JButton seat114Btn = new JButton("114");
		seat114Btn.setEnabled(false);
		seat114Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat114Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat114Btn.setFocusPainted(false);
		seat114Btn.setBackground(new Color(255, 165, 0));
		seat114Btn.setBounds(402, 303, 72, 60);
		panel1F.add(seat114Btn);

		JButton seat115Btn = new JButton("115");
		seat115Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat115Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat115Btn.setFocusPainted(false);
		seat115Btn.setBackground(new Color(0, 128, 255));
		seat115Btn.setBounds(576, 241, 72, 60);
		panel1F.add(seat115Btn);

		JButton seat116Btn = new JButton("116");
		seat116Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat116Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat116Btn.setFocusPainted(false);
		seat116Btn.setBackground(new Color(0, 128, 255));
		seat116Btn.setBounds(576, 303, 72, 60);
		panel1F.add(seat116Btn);

		JButton seat117Btn = new JButton("117");
		seat117Btn.setEnabled(false);
		seat117Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat117Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat117Btn.setFocusPainted(false);
		seat117Btn.setBackground(new Color(255, 165, 0));
		seat117Btn.setBounds(0, 253, 72, 60);
		panel1F.add(seat117Btn);

		JButton seat118Btn = new JButton("118");
		seat118Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat118Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat118Btn.setFocusPainted(false);
		seat118Btn.setBackground(new Color(0, 128, 255));
		seat118Btn.setBounds(0, 314, 72, 60);
		panel1F.add(seat118Btn);

		JButton seat119Btn = new JButton("119");
		seat119Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat119Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat119Btn.setFocusPainted(false);
		seat119Btn.setBackground(new Color(0, 128, 255));
		seat119Btn.setBounds(0, 375, 72, 60);
		panel1F.add(seat119Btn);

		JButton seat120Btn = new JButton("120");
		seat120Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat120Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat120Btn.setFocusPainted(false);
		seat120Btn.setBackground(new Color(0, 128, 255));
		seat120Btn.setBounds(0, 437, 72, 60);
		panel1F.add(seat120Btn);

		JButton seat121Btn = new JButton("121");
		seat121Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat121Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat121Btn.setFocusPainted(false);
		seat121Btn.setBackground(new Color(0, 128, 255));
		seat121Btn.setBounds(98, 539, 72, 60);
		panel1F.add(seat121Btn);

		JButton seat122Btn = new JButton("122");
		seat122Btn.setEnabled(false);
		seat122Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat122Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat122Btn.setFocusPainted(false);
		seat122Btn.setBackground(new Color(255, 0, 0));
		seat122Btn.setBounds(171, 539, 72, 60);
		panel1F.add(seat122Btn);

		JButton seat123Btn = new JButton("123");
		seat123Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat123Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat123Btn.setFocusPainted(false);
		seat123Btn.setBackground(new Color(0, 128, 255));
		seat123Btn.setBounds(329, 539, 72, 60);
		panel1F.add(seat123Btn);

		JButton seat124Btn = new JButton("124");
		seat124Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat124Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat124Btn.setFocusPainted(false);
		seat124Btn.setBackground(new Color(0, 128, 255));
		seat124Btn.setBounds(402, 539, 72, 60);
		panel1F.add(seat124Btn);

		JButton seat125Btn = new JButton("125");
		seat125Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat125Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat125Btn.setFocusPainted(false);
		seat125Btn.setBackground(new Color(0, 128, 255));
		seat125Btn.setBounds(475, 539, 72, 60);
		panel1F.add(seat125Btn);

		JButton seat126Btn = new JButton("126");
		seat126Btn.setEnabled(false);
		seat126Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat126Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat126Btn.setFocusPainted(false);
		seat126Btn.setBackground(new Color(255, 165, 0));
		seat126Btn.setBounds(648, 539, 72, 60);
		panel1F.add(seat126Btn);

		JButton seat127Btn = new JButton("127");
		seat127Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat127Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat127Btn.setFocusPainted(false);
		seat127Btn.setBackground(new Color(0, 128, 255));
		seat127Btn.setBounds(721, 539, 72, 60);
		panel1F.add(seat127Btn);

		JButton seat128Btn = new JButton("128");
		seat128Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat128Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat128Btn.setFocusPainted(false);
		seat128Btn.setBackground(new Color(0, 128, 255));
		seat128Btn.setBounds(871, 480, 72, 60);
		panel1F.add(seat128Btn);

		JButton seat129Btn = new JButton("129");
		seat129Btn.setEnabled(false);
		seat129Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat129Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat129Btn.setFocusPainted(false);
		seat129Btn.setBackground(new Color(255, 165, 0));
		seat129Btn.setBounds(871, 419, 72, 60);
		panel1F.add(seat129Btn);

		JButton seat130Btn = new JButton("130");
		seat130Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat130Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat130Btn.setFocusPainted(false);
		seat130Btn.setBackground(new Color(0, 128, 255));
		seat130Btn.setBounds(871, 358, 72, 60);
		panel1F.add(seat130Btn);

		JButton seat131Btn = new JButton("131");
		seat131Btn.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		seat131Btn.setFont(new Font("Dialog", Font.BOLD, 16));
		seat131Btn.setFocusPainted(false);
		seat131Btn.setBackground(new Color(0, 128, 255));
		seat131Btn.setBounds(871, 241, 72, 60);
		panel1F.add(seat131Btn);

		JLabel toiletLabel1_1 = new JLabel("<html><body><center>화<br>장<br>실</center></body></html>");
		toiletLabel1_1.setOpaque(true);
		toiletLabel1_1.setHorizontalAlignment(SwingConstants.CENTER);
		toiletLabel1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		toiletLabel1_1.setBackground(new Color(255, 210, 0));
		toiletLabel1_1.setBounds(0, 60, 72, 160);
		panel1F.add(toiletLabel1_1);

		JLabel doorLabel1_1 = new JLabel("\uBB38");
		doorLabel1_1.setOpaque(true);
		doorLabel1_1.setHorizontalAlignment(SwingConstants.CENTER);
		doorLabel1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		doorLabel1_1.setBackground(new Color(128, 0, 0));
		doorLabel1_1.setBounds(884, 70, 61, 69);
		panel1F.add(doorLabel1_1);

		JLabel wallLabel1_1 = new JLabel();
		wallLabel1_1.setOpaque(true);
		wallLabel1_1.setBackground(Color.GRAY);
		wallLabel1_1.setBounds(0, 496, 72, 103);
		panel1F.add(wallLabel1_1);

		JLabel wallLabel1_2 = new JLabel();
		wallLabel1_2.setOpaque(true);
		wallLabel1_2.setBackground(Color.GRAY);
		wallLabel1_2.setBounds(26, 539, 72, 60);
		panel1F.add(wallLabel1_2);

		JLabel wallLabel1_3 = new JLabel();
		wallLabel1_3.setOpaque(true);
		wallLabel1_3.setBackground(Color.GRAY);
		wallLabel1_3.setBounds(241, 539, 90, 60);
		panel1F.add(wallLabel1_3);

		JLabel wallLabel1_4 = new JLabel();
		wallLabel1_4.setOpaque(true);
		wallLabel1_4.setBackground(Color.GRAY);
		wallLabel1_4.setBounds(536, 539, 112, 60);
		panel1F.add(wallLabel1_4);

		JLabel wallLabel1_5 = new JLabel();
		wallLabel1_5.setOpaque(true);
		wallLabel1_5.setBackground(Color.GRAY);
		wallLabel1_5.setBounds(787, 539, 156, 60);
		panel1F.add(wallLabel1_5);

		JLabel wallLabel1_6 = new JLabel();
		wallLabel1_6.setOpaque(true);
		wallLabel1_6.setBackground(Color.GRAY);
		wallLabel1_6.setBounds(871, 294, 72, 69);
		panel1F.add(wallLabel1_6);

		JLabel wallLabel1_7 = new JLabel();
		wallLabel1_7.setOpaque(true);
		wallLabel1_7.setBackground(Color.GRAY);
		wallLabel1_7.setBounds(871, 143, 72, 103);
		panel1F.add(wallLabel1_7);

		JLabel wallLabel1_8 = new JLabel();
		wallLabel1_8.setOpaque(true);
		wallLabel1_8.setBackground(Color.GRAY);
		wallLabel1_8.setBounds(0, 209, 72, 60);
		panel1F.add(wallLabel1_8);

		JLabel wallLabel1_9 = new JLabel();
		wallLabel1_9.setOpaque(true);
		wallLabel1_9.setBackground(Color.GRAY);
		wallLabel1_9.setBounds(0, 0, 117, 60);
		panel1F.add(wallLabel1_9);

		JLabel wallLabel1_10 = new JLabel();
		wallLabel1_10.setOpaque(true);
		wallLabel1_10.setBackground(Color.GRAY);
		wallLabel1_10.setBounds(329, 0, 79, 60);
		panel1F.add(wallLabel1_10);

		JLabel wallLabel1_11 = new JLabel();
		wallLabel1_11.setOpaque(true);
		wallLabel1_11.setBackground(Color.GRAY);
		wallLabel1_11.setBounds(126, 241, 21, 122);
		panel1F.add(wallLabel1_11);

		JLabel wallLabel1_12 = new JLabel();
		wallLabel1_12.setOpaque(true);
		wallLabel1_12.setBackground(Color.GRAY);
		wallLabel1_12.setBounds(126, 358, 93, 18);
		panel1F.add(wallLabel1_12);

		JLabel wallLabel1_13 = new JLabel();
		wallLabel1_13.setOpaque(true);
		wallLabel1_13.setBackground(Color.GRAY);
		wallLabel1_13.setBounds(126, 228, 93, 18);
		panel1F.add(wallLabel1_13);

		JLabel wallLabel1_14 = new JLabel();
		wallLabel1_14.setOpaque(true);
		wallLabel1_14.setBackground(Color.GRAY);
		wallLabel1_14.setBounds(648, 241, 21, 122);
		panel1F.add(wallLabel1_14);

		JLabel wallLabel1_15 = new JLabel();
		wallLabel1_15.setOpaque(true);
		wallLabel1_15.setBackground(Color.GRAY);
		wallLabel1_15.setBounds(576, 358, 93, 18);
		panel1F.add(wallLabel1_15);

		JLabel wallLabel1_16 = new JLabel();
		wallLabel1_16.setOpaque(true);
		wallLabel1_16.setBackground(Color.GRAY);
		wallLabel1_16.setBounds(576, 228, 93, 18);
		panel1F.add(wallLabel1_16);

		JLabel wallLabel1_17 = new JLabel();
		wallLabel1_17.setOpaque(true);
		wallLabel1_17.setBackground(Color.GRAY);
		wallLabel1_17.setBounds(765, 0, 50, 60);
		panel1F.add(wallLabel1_17);
		// 쓰레기통 이미지
		JLabel trashcanLabel1_1 = new JLabel(); // 화장실옆
		trashcanLabel1_1.setBounds(70, 53, 57, 54);
		trashcanLabel1_1.setIcon(updatetrashcanIcon);
		panel1F.add(trashcanLabel1_1);

		JLabel trashcanLabel1_2 = new JLabel(); // 문옆
		trashcanLabel1_2.setBounds(814, 0, 57, 54);
		trashcanLabel1_2.setIcon(updatetrashcanIcon);
		panel1F.add(trashcanLabel1_2);

		// 정수기 이미지
		JLabel waterPFLabel1_1 = new JLabel(); // 화장실옆
		waterPFLabel1_1.setBounds(70, 166, 35, 54);
		waterPFLabel1_1.setIcon(updateWaterPFIcon);
		panel1F.add(waterPFLabel1_1);

		JLabel waterPFLabel1_2 = new JLabel(); // 문옆
		waterPFLabel1_2.setBounds(876, 6, 57, 54);
		waterPFLabel1_2.setIcon(updateWaterPFIcon);
		panel1F.add(waterPFLabel1_2);

		JPanel 사용가능 = new JPanel();
		사용가능.setBounds(174, 10, 80, 75);
		contentPane.add(사용가능);
		사용가능.setBorder(new LineBorder(Color.BLACK, 2));
		사용가능.setBackground(Color.CYAN);
		사용가능.setLayout(null);

		JLabel lblNewLabel1 = new JLabel("사용 가능");
		lblNewLabel1.setBounds(174, 95, 80, 36);
		contentPane.add(lblNewLabel1);
		lblNewLabel1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblNewLabel2 = new JLabel("사용 중");
		lblNewLabel2.setBounds(334, 95, 80, 36);
		contentPane.add(lblNewLabel2);
		lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel2.setFont(new Font("굴림", Font.PLAIN, 15));

		JPanel 사용중 = new JPanel();
		사용중.setBounds(334, 10, 80, 75);
		contentPane.add(사용중);
		사용중.setBorder(new LineBorder(Color.BLACK, 2));
		사용중.setBackground(Color.ORANGE);
		사용중.setLayout(null);

		JPanel 사용불가능 = new JPanel();
		사용불가능.setBounds(494, 10, 80, 75);
		contentPane.add(사용불가능);
		사용불가능.setBorder(new LineBorder(Color.BLACK, 2));
		사용불가능.setBackground(Color.RED);

		JLabel lblNewLabel3 = new JLabel("사용 불가능");
		lblNewLabel3.setBounds(494, 95, 80, 36);
		contentPane.add(lblNewLabel3);
		lblNewLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel3.setFont(new Font("굴림", Font.PLAIN, 15));

		JLabel lblNewLabel4 = new JLabel("자리 선택 완료");
		lblNewLabel4.setBounds(643, 95, 105, 36);
		contentPane.add(lblNewLabel4);
		lblNewLabel4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel4.setFont(new Font("굴림", Font.PLAIN, 15));

		JPanel 자리선택완료 = new JPanel();
		자리선택완료.setBounds(654, 10, 80, 75);
		contentPane.add(자리선택완료);
		자리선택완료.setBorder(new LineBorder(Color.BLACK, 2));
		자리선택완료.setBackground(new Color(0, 0, 128));
		자리선택완료.setLayout(null);
	}

	protected void dispose() {

	}

	private void setVisible(boolean b) {

	}

}