package FinalProject;

import javax.swing.*;

import static java.lang.Character.toUpperCase;

import java.awt.*;
import java.awt.event.*;

public class TitleScreen extends JPanel
{
	public void starttitle() {
		setVisible(true);
	}
	// Constructor
	public TitleScreen()
	{
    	setBackground(Color.white);
    	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    	
    	JLabel title = new JLabel("Better Player");
    	title.setAlignmentX(CENTER_ALIGNMENT);
    	title.setFont(new Font("DialogInput Bold", Font.BOLD, 100));
    	
    	JLabel creator = new JLabel("Author: Derek Yin");
    	creator.setAlignmentX(CENTER_ALIGNMENT);
    	creator.setFont(new Font("DialogInput", Font.PLAIN, 20));

    	JLabel InstructionTitle = new JLabel("Instructions");
    	InstructionTitle.setAlignmentX(CENTER_ALIGNMENT);
    	InstructionTitle.setFont(new Font("DialogInput Bold", Font.BOLD, 50));

    	JLabel InstructionTxt = new JLabel("<html><p style='text-align: center'>Click on either player one or two and enter information on how many kills, deaths, and assits they have. The program will return the kda for both players and you will be able to figure out who the better player is.</p></html>");
    	InstructionTxt.setAlignmentX(CENTER_ALIGNMENT);
    	InstructionTxt.setFont(new Font("DialogInput", Font.PLAIN, 20));


		add(title);
		add(creator);
		add(Box.createRigidArea(new Dimension(0,50)));
		add(InstructionTitle);
		add(InstructionTxt);
		setPreferredSize(new Dimension (972,576));
		
	}
	


	

	
}