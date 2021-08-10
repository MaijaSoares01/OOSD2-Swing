package swing;

import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class MainWindow extends JFrame {
	
	private JLabel nameLabel = new JLabel("Name");
	private JTextField nameTextField = new JTextField(20);
	private JCheckBox lockedCheckBox = new JCheckBox("locked");
	private JRadioButton redRadioButton = new JRadioButton("Red");
	private JRadioButton amberRadioButton = new JRadioButton("Amber");
	private JRadioButton greenRadioButton = new JRadioButton("Green");
	private ButtonGroup trafficLightButtons = new ButtonGroup();
	private JButton okButton = new JButton("OK");
	private JButton cancelButton = new JButton("Cancel");
	private JSlider percentSlider = new JSlider(0, 100);

	public MainWindow(String title) throws HeadlessException {
		super(title);
		this.setLayout(new FlowLayout());
		this.add(nameLabel);
		this.add(nameTextField);
		//nameTextField.setText("Sergio Aguero");
		this.add(lockedCheckBox);
		trafficLightButtons.add(redRadioButton);
		trafficLightButtons.add(amberRadioButton);
		trafficLightButtons.add(greenRadioButton);
		this.add(redRadioButton);
		this.add(amberRadioButton);
		this.add(greenRadioButton);
		this.add(okButton);
		this.add(cancelButton);
		this.add(percentSlider);
		//percentSlider.setValue(10);
		//System.out.println(percentSlider.getValue());
		//lockedCheckBox.setEnabled(false);
		//lockedCheckBox.setEnabled(false);BRB!!!!!!!
		//System.out.println(nameTextField.getText());
		
	}


}
