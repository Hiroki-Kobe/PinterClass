package week02;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * Testing a Swing button
 * @author snoopy
 * 
 */

public class ButtonTest extends JButton implements ActionListener{
	
	static int counter = 0;
	
	public ButtonTest(String text){
		super(text); // new JButton(text)
		
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		ButtonTest.counter++;
		this.setText(""+counter);
	}
	
	public static void main(String[] args) {
		final JButton btn = new ButtonTest("Click me");
		JFrame frame = new JFrame("Button test");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridBagLayout());
		frame.getContentPane().add(btn);
		frame.setSize(400, 400);
		
		frame.setVisible(true);
		
		System.out.println("Proggram ends here");
		
	}

}
