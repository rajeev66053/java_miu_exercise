import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


class MyFrame extends JFrame {

	//make the text field and label instance variables in MyFrame
	private JTextField namefield,streetfield,cityfield,statefield,zipfield;
	private JLabel namelabel,streetlabel,citylabel,statelabel,ziplabel;
	private JButton submitbutton;
	private JPanel mainPanel;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				MyFrame mf = new MyFrame();
				mf.setVisible(true);
			}
		});
	}
	


	public MyFrame() {
		//put initializations like setSize, setTitle, centerFrame here
		initializeWindow();	

		namelabel = new JLabel("Name");
		namefield = new JTextField(10);

		namelabel.setVerticalAlignment(SwingConstants.TOP);

		streetfield = new JTextField(10);
		streetlabel = new JLabel("Street");

		cityfield = new JTextField(10);
		citylabel = new JLabel("City");

		statefield = new JTextField(10);
		statelabel = new JLabel("State");

		zipfield = new JTextField(10);
		ziplabel = new JLabel("Zip");


		mainPanel = new JPanel();
		
		JPanel panel1 = new JPanel();
		panel1.add(namelabel);
		panel1.add(namefield);

		JPanel panel2 = new JPanel();
		panel2.add(streetlabel);
		panel2.add(streetfield);

		JPanel panel3 = new JPanel();
		panel3.add(citylabel);
		panel3.add(cityfield);

		JPanel panel4 = new JPanel();
		panel4.add(statelabel);
		panel4.add(statefield);

		JPanel panel5 = new JPanel();
		panel5.add(ziplabel);
		panel5.add(zipfield);
		
		submitbutton = new JButton("Submit");

		JPanel panel6 = new JPanel();
		panel6.add(submitbutton);
		
		
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);
		mainPanel.add(panel5);
		mainPanel.add(panel6);
		getContentPane().add(mainPanel);
		
		submitbutton.addActionListener(new MyButtonListener(namefield,streetfield,cityfield,statefield,zipfield));

	}

	//define the listener class
	public class MyButtonListener implements ActionListener {
		//the text field we are listening to
		private JTextField namefield;
		private JTextField streetfield;
		private JTextField cityfield;
		private JTextField statefield;
		private JTextField zipfield;
		public MyButtonListener(JTextField namefield,JTextField streetfield,JTextField cityfield,JTextField statefield,JTextField zipfield) {
			
			this.namefield=namefield;
			this.streetfield=streetfield;
			this.cityfield=cityfield;
			this.statefield=statefield;
			this.zipfield=zipfield;
		}
		public void actionPerformed(ActionEvent evt){
			String namefieldVal = namefield.getText();
			String streetfieldVal = streetfield.getText();
			String cityfieldVal = cityfield.getText();
			String statefieldVal = statefield.getText();
			String zipfieldVal = zipfield.getText();
			
			System.out.println(namefieldVal+"\n"+streetfieldVal+"\n"+cityfieldVal+", "+statefieldVal+" "+ zipfieldVal);
		}
	} 

	private void initializeWindow() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Address Form");
		setSize(320,240);
		centerFrameOnDesktop(this);
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