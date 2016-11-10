package hipster.view;

import hipster.controller.HipsterController;
import hipster.modle.Hipster;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private JButton myButton;
	private JComboBox dropDown;
	private JLabel wordsLabel;
	private SpringLayout baseLayout;
	private JTextField textBox;

	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;
		myButton = new JButton("Click here!");
		wordsLabel = new JLabel("Such words");
		baseLayout = new SpringLayout();
		dropDown = new JComboBox(baseController.getWords());
		textBox = new JTextField();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(myButton);
		this.add(wordsLabel);
		this.add(dropDown);
		this.add(textBox);
		}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, myButton, 113, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, wordsLabel, 34, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, wordsLabel, -186, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textBox, -66, SpringLayout.NORTH, myButton);
		baseLayout.putConstraint(SpringLayout.WEST, textBox, 67, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textBox, -31, SpringLayout.NORTH, myButton);
		baseLayout.putConstraint(SpringLayout.EAST, textBox, 153, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 82, SpringLayout.SOUTH, wordsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, dropDown, -52, SpringLayout.EAST, wordsLabel);
		baseLayout.putConstraint(SpringLayout.EAST, dropDown, 74, SpringLayout.EAST, wordsLabel);
	}

	private void setupListeners()
	{
		textBox.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println(baseController.getWords()[dropDown.getSelectedIndex()]);
				String a = e.getActionCommand();
				System.out.println(baseController.getWords()[dropDown.getSelectedIndex()]);
				dropDown.setSelectedItem(a);
			}
		});
		myButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			}
		});
	}
}