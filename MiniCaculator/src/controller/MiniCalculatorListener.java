package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiniCaculatorView;

public class MiniCalculatorListener implements ActionListener {
    private MiniCaculatorView miniCaculatorView;
	public MiniCalculatorListener(MiniCaculatorView miniCaculatorView) {
		
		this.miniCaculatorView = miniCaculatorView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String ac= e.getActionCommand();
		if(ac.equals("+"))
		{
			this.miniCaculatorView.plus();
		}else if(ac.equals("-"))
		{
			this.miniCaculatorView.minius();
		}
		else if(ac.equals("*"))
		{
			this.miniCaculatorView.multiply();
		}
		else if(ac.equals("/"))
		{
			this.miniCaculatorView.divide();
		}
		else if(ac.equals("Pow"))
		{
			this.miniCaculatorView.pow();
		}
		else if(ac.equals("%"))
		{
			this.miniCaculatorView.mod();
		}
	}

}
