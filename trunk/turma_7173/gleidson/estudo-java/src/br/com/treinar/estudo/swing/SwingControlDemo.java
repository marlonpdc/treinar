package br.com.treinar.estudo.swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SwingControlDemo {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public SwingControlDemo() {
		prepareGUI();
	}

	public static void main(String[] args) {
		SwingControlDemo swingControlDemo = new SwingControlDemo();
		swingControlDemo.showEventDemo();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Java SWING Examples");
		mainFrame.setSize(800, 600);
		mainFrame.setLayout(new GridLayout(3, 1));
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);

		statusLabel.setSize(350, 100);
		
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				JOptionPane.showMessageDialog(mainFrame, "Obrigado, epero que tenha gostado de utilizar o sistema");
				System.exit(0);
			}
		});
		
		//mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	private void showEventDemo() {
		headerLabel.setText("Control in action: Button");

		JButton okButton = new JButton("OK");
		JButton submitButton = new JButton("Submit");
		JButton cancelButton = new JButton("Cancel");

		okButton.setActionCommand("OK");
		submitButton.setActionCommand("Submit");
		cancelButton.setActionCommand("Cancel");

		okButton.addActionListener(new ButtonClickListener());
//		opcao para adicionar eventos
//		okButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//			
//		});
		
		submitButton.addActionListener(new ButtonClickListener());
		cancelButton.addActionListener(new ButtonClickListener());

		controlPanel.add(okButton);
		controlPanel.add(submitButton);
		controlPanel.add(cancelButton);

		mainFrame.setVisible(true);
	}

	private class ButtonClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("OK")) {
				statusLabel.setText("Ok Button clicked.");
			} else if (command.equals("Submit")) {
				statusLabel.setText("Submit Button clicked.");
			} else {
				statusLabel.setText("Cancel Button clicked.");
			}
		}
	}
}