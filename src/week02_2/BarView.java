package week02_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class BarView extends JFrame implements ActionListener{

	static int counter = 0;
	final  JProgressBar bar;
	final  JButton startButton;
	final  JButton stopButton;
	static String status;

	
	public BarView(){
		bar = new JProgressBar();
		startButton = new JButton("Start");
		stopButton  = new JButton("Stop");
		
		bar.setStringPainted(true);
		bar.setForeground(Color.GREEN);
		bar.setSize(700, 30);
		
		stopButton.setSize(100, 50);
		startButton.setSize(100, 50);

		startButton.addActionListener(this);
		startButton.setActionCommand("restart");
		startButton.setEnabled(false);
		
		stopButton.addActionListener(this);
		stopButton.setActionCommand("stop");

		
	}
	
	
	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
		
		if(cmd.equals("restart")){
			startButton.setEnabled(false);
			stopButton.setEnabled(true);
			this.status = "restart";

		}else if(cmd.equals("stop")){
			startButton.setEnabled(true);
			stopButton.setEnabled(false);
			this.status = "stop";
		}
		
	}
	
	public void setValue(int progress){
		this.bar.setValue(progress);
		this.bar.setString(progress +"%");
	}
	
	public String StartStop(){
		return status;
	}
		

	
	public void startProgram(){
		
        JFrame frame = new JFrame("Bar test");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 400);
		frame.setLayout(new GridLayout(3, 1));
		frame.add(bar);
		frame.add(startButton);
		frame.add(stopButton);
//		
//		frame.getContentPane().add("Center", bar);
//		frame.getContentPane().add("East", startButton);
//		frame.getContentPane().add("West",stopButton);
		frame.setVisible(true);	
	}
}
