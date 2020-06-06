package FinalProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Test.TitleScreen;


public class MainFrame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private CardLayout cl;
	private JPanel panel;

	public MainFrame()
	{
		super("Better Player");

		cl = new CardLayout();

		JPanel cardPanel = new JPanel();
		cardPanel.setLayout(cl);
		cardPanel.setPreferredSize(new Dimension(1000,400));

		Input inputPanel = new Input();
		Player playerPanel = new Player();
		TitleScreen titlePanel = new TitleScreen();
		cardPanel.add(titlePanel, "Title");
		cardPanel.add(playerPanel, "Player");
		cardPanel.add(inputPanel, "Input");

		JPanel buttonPanel = new JPanel();
		
		JButton homeButton = new JButton("Home");
		JButton inputButton = new JButton("Player 1");
		JButton PlayerButton = new JButton("Player 2");
		buttonPanel.add(inputButton);
		buttonPanel.add(PlayerButton);

		inputButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, "input");
				inputPanel.startinput();
				playerPanel.endplayer();
			}
		});
		PlayerButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e) {
						cl.show(cardPanel, "Player");
						playerPanel.startplayer();
				}
			});
		homeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				
				cl.show(cardPanel, "title");
				buttonPanel.remove(homeButton);
				buttonPanel.revalidate();
				buttonPanel.repaint();
			}
		});

		add(cardPanel);
		add(buttonPanel, BorderLayout.PAGE_END);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
		setLocationRelativeTo(null);

	}

	public static void main( String args[] )
	{
		new MainFrame();
	}
}
