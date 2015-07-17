package br.com.treinar.bb.visao;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipalBB {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public TelaPrincipalBB(){
      prepareGUI();
   }

   public static void main(String[] args){
      TelaPrincipalBB swingLayoutDemo = new TelaPrincipalBB();  
      swingLayoutDemo.showGridLayoutDemo();       
   }
      
   private void prepareGUI(){
      mainFrame = new JFrame("Java SWING Examples");
      mainFrame.setSize(800, 600);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        

      statusLabel.setSize(350, 100);
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   
   private void showGridLayoutDemo(){
      
	  headerLabel.setText("Layout in action: GridLayout");      

      JPanel panel = new JPanel();
      //panel.setBackground(Color.GREEN);
      panel.setSize(800, 600);
      GridLayout layout = new GridLayout(0,2);
      layout.setHgap(5);
      layout.setVgap(5);
      
      panel.setLayout(layout);        
      panel.add(new JButton("Button 1"));
      panel.add(new JButton("Button 2")); 
      panel.add(new JButton("Button 3")); 
      panel.add(new JButton("Button 4")); 
      panel.add(new JButton("Button 5")); 
      controlPanel.add(panel);
      mainFrame.setVisible(true);
      
   }
}