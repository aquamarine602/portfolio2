package portfolio;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.border.*;

public class Layout_window2 implements ActionListener {
	JFrame this_frame;
	JPanel contentPane;
	FlowLayout f_layout;
	GridLayout g_layout;
	BorderLayout bLayout;
	BoxLayout xLayout;
	JPanel this_panel;
	
	JButton pear = new JButton("Pear");
	JButton orange = new JButton("Orange");
	JButton apple = new JButton("Apple");
	JButton banana = new JButton("Banana");

	public static void main(String[] args) {
		new Layout_window2();

	}
	
	public Layout_window2() {
		this_frame = new JFrame();
		this_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this_panel = (JPanel)this_frame.getContentPane();
		this_frame.setSize(200,200);
		this_frame.setLocation(200,300);
		this_panel.setLayout(new BoxLayout(this_panel, BoxLayout.Y_AXIS));
		
		// child jpanel
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

		// label that will go in the top child jpanel
		JLabel myLabel = new JLabel("What is your favoirte fruit?");
		topPanel.add(myLabel);
		
		// second child panel -- for bottom area
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(2,2,2,2));
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		// buutons that will go in the bottom child jpanel
		bottomPanel.add(apple);
		bottomPanel.add(orange);
		bottomPanel.add(pear);
		bottomPanel.add(banana);
		
		// adds action listener to the buttons
		apple.addActionListener(this);
		orange.addActionListener(this);
		pear.addActionListener(this);
		banana.addActionListener(this);
		
		// 
		this_panel.add(topPanel);
		this_panel.add(bottomPanel);
		
		this_frame.setVisible(true);
		
	}
	
	// tries to open a webpage
	public void open_web(String url) {
		try {
			Desktop.getDesktop().browse(java.net.URI.create(url));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	// if the buttons are pressed -- do this
	public void actionPerformed(ActionEvent event) {
		Object control = event.getSource();
			
		if (control == apple) {
			open_web("https://goo.gl/images/oSce7v");
		} else if (control == orange) {
			open_web("https://goo.gl/images/gaJFVU");
		} else if (control == pear) {
			open_web("https://goo.gl/images/J6PRGx");
		} else if (control == banana) {
				open_web("https://goo.gl/images/e5C6us");
		} else {
			System.out.println("A problem occurred.");
		}
			
	}

}
