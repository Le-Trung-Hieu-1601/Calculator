package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame {
	public MyCalculator() {
		this.setTitle("My Calculator");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField jTextField = new JTextField(50);
		JPanel jPannel_head = new JPanel();
		jPannel_head.setLayout(new BorderLayout());
		jPannel_head.add(jTextField, BorderLayout.CENTER);

		JButton jButton_0 = new JButton("0");
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		JButton jButton_6 = new JButton("6");
		JButton jButton_7 = new JButton("7");
		JButton jButton_8 = new JButton("8");
		JButton jButton_9 = new JButton("9");
		JButton jButton_cong = new JButton("+");
		JButton jButton_tru = new JButton("-");
		JButton jButton_nhan = new JButton("*");
		JButton jButton_chia = new JButton("/");
        JButton jButton_bang = new JButton("=");
		JPanel jPannel_buttons = new JPanel();
		jPannel_buttons.setLayout(new GridLayout(5, 3));
		jPannel_buttons.add(jButton_0);
		jPannel_buttons.add(jButton_1);
		jPannel_buttons.add(jButton_2);
		jPannel_buttons.add(jButton_3);
		jPannel_buttons.add(jButton_4);
		jPannel_buttons.add(jButton_5);
		jPannel_buttons.add(jButton_6);
		jPannel_buttons.add(jButton_7);
		jPannel_buttons.add(jButton_8);
		jPannel_buttons.add(jButton_9);
		jPannel_buttons.add(jButton_cong);
		jPannel_buttons.add(jButton_tru);
		jPannel_buttons.add(jButton_nhan);
		jPannel_buttons.add(jButton_chia);
		jPannel_buttons.add(jButton_bang);

		this.setLayout(new BorderLayout());
		this.add(jPannel_head, BorderLayout.NORTH);
		this.add(jPannel_buttons, BorderLayout.CENTER);

		this.setVisible(true);

	}

	public static void main(String[] args) {
		
		try {
//			com.sun.java.swing.plaf.gtk.GTKLookAndFeel
//			com.sun.java.swing.plaf.motif.MotifLookAndFeel
//			com.sun.java.swing.plaf.windows.WindowsLookAndFeel

//	UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCalculator();
		} catch (Exception ex) {
			ex.printStackTrace();
		
	}
	}
}
