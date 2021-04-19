import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LetterOperation extends JFrame {
	

	private JButton countLettersbutton,reverseLettersbutton,removeDuplicatebutton;
	private JTextField inputfield,outputfield;
	private JLabel inputlabel,outputlabel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				LetterOperation lo = new LetterOperation();
				lo.setVisible(true);
			}
		});
	}
	
	public LetterOperation() {
		//put initializations like setSize, setTitle, centerFrame here
		initializeWindow();			

		countLettersbutton = new JButton("Count Letters");
		reverseLettersbutton = new JButton("Reverse Letters");
		removeDuplicatebutton = new JButton("Remove Duplicate");

		inputlabel = new JLabel("Input");
		inputfield = new JTextField(10);


		outputfield = new JTextField(10);
		outputlabel = new JLabel("Output");

		JPanel mainPanel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		

		panel1.add(countLettersbutton);
		panel2.add(reverseLettersbutton);
		panel3.add(removeDuplicatebutton);
		
		panel4.add(inputlabel);
		panel4.add(inputfield);

		panel5.add(outputlabel);
		panel5.add(outputfield);

	
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);
		mainPanel.add(panel5);
		getContentPane().add(mainPanel);
		
		
		
		//because our text field is stored as an instance variable
		//we can pass it in to the listener like this:
		countLettersbutton.addActionListener(evt->{
				String inputfieldVal = inputfield.getText();
		        int stringLength = inputfieldVal.length();
		        outputfield.setText(Integer.toString(stringLength));
	        });
		reverseLettersbutton.addActionListener(evt->{
			String inputfieldVal = inputfield.getText();
			char str[]=inputfieldVal.toCharArray();
	        int stringLength = str.length; 
	        String reversedLetterString=reverseLetter(str, stringLength);
	        outputfield.setText(reversedLetterString);
		});
		removeDuplicatebutton.addActionListener(evt->{
			String inputfieldVal = inputfield.getText();
			char str[]=inputfieldVal.toCharArray();
	        int stringLength = str.length; 
	        String removedDuplicateString=removeDuplicate(str, stringLength);
	        outputfield.setText(removedDuplicateString);
		});
	
	}

	
	private String removeDuplicate(char[] str, int stringLength) {
		// TODO Auto-generated method stub
		// Used as index in the modified string 
        int index = 0; 
  
        // Traverse through all characters 
        for (int i = 0; i < stringLength; i++) 
        { 
  
            // Check if str[i] is present before it  
            int j; 
            for (j = 0; j < i; j++)  
            { 
                if (str[i] == str[j]) 
                { 
                    break; 
                } 
            } 
  
            // If not present, then add it to 
            // result. 
            if (j == i)  
            { 
                str[index++] = str[i]; 
            } 
        } 
        return String.valueOf(Arrays.copyOf(str, index));
	}

	private String reverseLetter(char[] str, int stringLength) {
		// TODO Auto-generated method stub
		String reverse = "";				 
		 
		 for(int i = stringLength - 1; i >= 0; i--)
		 {
			 reverse = reverse + str[i];				 
		 }
		return reverse;
	}

	private void initializeWindow() {
		// TODO Auto-generated method stub
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("String Utility");
		setSize(320,240);
//		centerFrameOnDesktop(this);
		setResizable(false);

	}


	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width-frameWidth)/2),
				(height-frameHeight)/3);
	}

}
