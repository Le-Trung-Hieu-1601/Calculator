package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorListener;
import model.MiniCaculatorModel;

public class MiniCaculatorView extends JFrame {
	private MiniCaculatorModel miniCaculatorModel;
	private JTextField jTextField_first;
	private JTextField jTextField_second;
	private JTextField jTextField_answer;
  public MiniCaculatorView() {
	// TODO Auto-generated constructor stub
	  this.miniCaculatorModel=new MiniCaculatorModel();
	  this.init();
	  
}
private void init() {
	// TODO Auto-generated method stub
	this.setTitle("MiniCaculator");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500,300);
	this.setLocationRelativeTo(null);
	Font font =new Font("Arial", Font.BOLD, 40);
	MiniCalculatorListener ac= new MiniCalculatorListener(this);
	JLabel jLabel_firstvalue =new JLabel("1st Value");
	jLabel_firstvalue.setFont(font);
	JLabel jLabel_secondvalue =new JLabel("2nd Value");
	jLabel_secondvalue.setFont(font);
	JLabel jLabel_answervalue =new JLabel("Answer");
	jLabel_answervalue.setFont(font);
	
	 jTextField_first =new JTextField(50);
	jTextField_first.setFont(font);
	 jTextField_second=new JTextField(50);
	jTextField_second.setFont(font);
	 jTextField_answer=new JTextField(50);
	jTextField_answer.setFont(font);
	
	JPanel jPanelIO =new JPanel();
	jPanelIO.setLayout(new GridLayout(3,2,10,10));
	jPanelIO.add(jLabel_firstvalue);
	jPanelIO.add(jTextField_first);
	jPanelIO.add(jLabel_secondvalue);
	jPanelIO.add(jTextField_second);
	jPanelIO.add(jLabel_answervalue);
	jPanelIO.add(jTextField_answer);
	
	JButton jButton_plus =new JButton("+");
	jButton_plus.addActionListener(ac);
	jButton_plus.setFont(font);
	JButton jButton_divide =new JButton("/");
	jButton_divide.addActionListener(ac);
	jButton_divide.setFont(font);
	JButton jButton_multiply =new JButton("*");
	jButton_multiply.addActionListener(ac);
	jButton_multiply.setFont(font);
	JButton jButton_pow =new JButton("Pow");
	jButton_pow.addActionListener(ac);
	jButton_pow.setFont(font);
	JButton jButton_mod =new JButton("%");
	jButton_mod.addActionListener(ac);
	jButton_mod.setFont(font);
	JButton jButton_minius =new JButton("-");
	jButton_minius.addActionListener(ac);
	jButton_minius.setFont(font);
	
	JPanel jPanel_buttons=new JPanel();
	jPanel_buttons.setLayout(new GridLayout(2,3));
	jPanel_buttons.add(jButton_plus);
	jPanel_buttons.add(jButton_minius);
	jPanel_buttons.add(jButton_multiply);
	jPanel_buttons.add(jButton_divide);
	jPanel_buttons.add(jButton_pow);
	jPanel_buttons.add(jButton_mod);
	
	
	
	
	
	
	
	this.setLayout(new BorderLayout(10,10));
	this.add(jPanelIO,BorderLayout.CENTER);
	this.add(jPanel_buttons,BorderLayout.SOUTH);
	this.setVisible(true);
	
	
}
public void plus() {
	// TODO Auto-generated method stub
	double first_value=Double.valueOf(jTextField_first.getText());
	double second_value=Double.valueOf(jTextField_second.getText());
	this.miniCaculatorModel.setFirstValue(first_value);
	this.miniCaculatorModel.setSecondValue(second_value);
	this.miniCaculatorModel.plus();
	this.jTextField_answer.setText(this.miniCaculatorModel.getAnswer()+"");
}
public void minius() {
	// TODO Auto-generated method stub
	double first_value=Double.valueOf(jTextField_first.getText());
	double second_value=Double.valueOf(jTextField_second.getText());
	this.miniCaculatorModel.setFirstValue(first_value);
	this.miniCaculatorModel.setSecondValue(second_value);
	this.miniCaculatorModel.minius();
	this.jTextField_answer.setText(this.miniCaculatorModel.getAnswer()+"");
}
public void divide() {
	// TODO Auto-generated method stub
	double first_value=Double.valueOf(jTextField_first.getText());
	double second_value=Double.valueOf(jTextField_second.getText());
	this.miniCaculatorModel.setFirstValue(first_value);
	this.miniCaculatorModel.setSecondValue(second_value);
	this.miniCaculatorModel.divide();
	this.jTextField_answer.setText(this.miniCaculatorModel.getAnswer()+"");
}
public void multiply() {
	// TODO Auto-generated method stub
	double first_value=Double.valueOf(jTextField_first.getText());
	double second_value=Double.valueOf(jTextField_second.getText());
	this.miniCaculatorModel.setFirstValue(first_value);
	this.miniCaculatorModel.setSecondValue(second_value);
	this.miniCaculatorModel.multiply();
	this.jTextField_answer.setText(this.miniCaculatorModel.getAnswer()+"");
}
public void pow() {
	// TODO Auto-generated method stub
	double first_value=Double.valueOf(jTextField_first.getText());
	double second_value=Double.valueOf(jTextField_second.getText());
	this.miniCaculatorModel.setFirstValue(first_value);
	this.miniCaculatorModel.setSecondValue(second_value);
	this.miniCaculatorModel.pow();
	this.jTextField_answer.setText(this.miniCaculatorModel.getAnswer()+"");
}
public void mod() {
	// TODO Auto-generated method stub
	double first_value=Double.valueOf(jTextField_first.getText());
	double second_value=Double.valueOf(jTextField_second.getText());
	this.miniCaculatorModel.setFirstValue(first_value);
	this.miniCaculatorModel.setSecondValue(second_value);
	this.miniCaculatorModel.mod();
	this.jTextField_answer.setText(this.miniCaculatorModel.getAnswer()+"");
}

}
