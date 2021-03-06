//Sammy Student: programmer
import java.awt.*;			//to use class Container 
import javax.swing.*;			//to use swing components
import java.awt.event.*;
import javax.swing.JOptionPane;

class BasicGu extends JFrame implements ActionListener 
{
	//class definition, which inherits from class JFrame

	//define interface components
	JLabel numberLabel;
	JTextField numberTextField;
	JButton displayButton;

    public BasicGu()
    {
	  //class constructor will "construct" the user interface
	  //components to a content pane are placed in the order 	  //that they are added
	  Container pane = getContentPane();
	  pane.setLayout(new FlowLayout());
	  //The getContentPane() method sets up the content pane. 	  //The FlowLayout manager lays out the components in a 	  //free flowing, left to right order.
	  numberLabel = new JLabel("Enter a number:");
	  numberTextField = new JTextField(4);
	  displayButton = new JButton("Enter");

	  pane.add(numberLabel);
	  pane.add(numberTextField);
	  pane.add(displayButton);
	  displayButton.addActionListener(this);
	  
	  //The add() method adds components into the content pane

	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setTitle("GUI Example");
	  pack();
	  setVisible(true);
	}

    public void actionPerformed(ActionEvent event)
    { 

      Object source = event.getSource();

      if (source == displayButton)
      {  
    	  try{
    		  double result = Integer.parseInt(numberTextField.getText());
    		  JOptionPane.showMessageDialog(null, "you entered " + 	(int)(result), "Hello", JOptionPane.PLAIN_MESSAGE);
    	        System.exit(0);	
    	  }catch(NumberFormatException ex){
    		  System.out.println("Hi");
		      JOptionPane.showMessageDialog(null, "Please enter a number", "Error!", JOptionPane.PLAIN_MESSAGE);
    	  }
  
      }
    }
    	

    
	public static void main(String[] args)
	{
	  new BasicGu();
	}
}

