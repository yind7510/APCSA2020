package FinalProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.text.*;

public class Player extends JPanel
                                    implements PropertyChangeListener {

	private String name = "Player 2";
    private int kills = 30;
    private int Deaths = 20; 
    private int Assists = 10;

    private JLabel nameLabel;
    private JLabel killsLabel;
    private JLabel DeathsLabel;
    private JLabel AssistsLabel;
    private JLabel OverallLabel;

    private static String nameString = "Name: ";
    private static String killsString = "Kills: ";
    private static String DeathsString = "Deaths: ";
    private static String AssistsString = "Assists: ";
    private static String OverallString = "Overall Rating : ";

    private JFormattedTextField nameField;
    private JFormattedTextField killsField;
    private JFormattedTextField DeathsField;
    private JFormattedTextField AssistsField;
    private JFormattedTextField OverallField;
 
    private NumberFormat killsFormat;
    private NumberFormat percentFormat;
    private NumberFormat OverallFormat;
 
    @SuppressWarnings("deprecation")
	public Player() {
    super(new BorderLayout());
    setUpFormats();
    double Overall = computeOverall(kills, Deaths,Assists);
 
        nameLabel = new JLabel(nameString);
        killsLabel = new JLabel(killsString);
        DeathsLabel = new JLabel(DeathsString);
        AssistsLabel = new JLabel(AssistsString);
        OverallLabel = new JLabel(OverallString);
 
        nameField = new JFormattedTextField(name);
        nameField.setValue(new String(name));
        nameField.setColumns(10);
        nameField.addPropertyChangeListener("value", this);
 
        killsField = new JFormattedTextField(killsFormat);
        killsField.setValue(new Integer(kills));
        killsField.setColumns(10);
        killsField.addPropertyChangeListener("value", this);
 
        DeathsField = new JFormattedTextField(percentFormat);
        DeathsField.setValue(new Integer(Deaths));
        DeathsField.setColumns(10);
        DeathsField.addPropertyChangeListener("value", this);
 
        AssistsField = new JFormattedTextField();
        AssistsField.setValue(new Integer(Assists));
        AssistsField.setColumns(10);
        AssistsField.addPropertyChangeListener("value", this);
 
        OverallField = new JFormattedTextField(OverallFormat);
        OverallField.setValue(new Double(Overall));
        OverallField.setColumns(10);
        OverallField.setEditable(false);
        OverallField.setForeground(Color.black);
 
        nameLabel.setLabelFor(nameField);
        killsLabel.setLabelFor(killsField);
        DeathsLabel.setLabelFor(DeathsField);
        AssistsLabel.setLabelFor(AssistsField);
        OverallLabel.setLabelFor(OverallField);

        JPanel labelPane = new JPanel(new GridLayout(0,1));
        labelPane.add(nameLabel);
        labelPane.add(killsLabel);
        labelPane.add(DeathsLabel);
        labelPane.add(AssistsLabel);
        labelPane.add(OverallLabel);

        JPanel fieldPane = new JPanel(new GridLayout(0,1));
        fieldPane.add(nameField);
        fieldPane.add(killsField);
        fieldPane.add(DeathsField);
        fieldPane.add(AssistsField);
        fieldPane.add(OverallField);
 

        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(labelPane, BorderLayout.WEST);
        add(fieldPane, BorderLayout.LINE_END);
    }
 
    public void propertyChange(PropertyChangeEvent e) {
        Object source = e.getSource();
        if (source == killsField) {
            kills = ((Number)killsField.getValue()).intValue();
        } else if (source == DeathsField) {
            Deaths = ((Number)DeathsField.getValue()).intValue();
        } else if (source == AssistsField) {
            Assists = ((Number)AssistsField.getValue()).intValue();
        }
 
        double Overall = computeOverall(kills, Deaths, Assists);
        OverallField.setValue(new Double(Overall));
    }
 
    private static void createAndShowGUI() {

        JFrame frame = new JFrame("player");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        frame.add(new Player());

        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
 
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

            UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }
 

    double computeOverall(double Kills, double Deaths, int Assists) {
        double answer;
 
        answer = (Kills + (Assists*.5)) / Deaths;
        return answer;
    }
 

    private void setUpFormats() {
    	
        killsFormat = NumberFormat.getNumberInstance();
 
        percentFormat = NumberFormat.getNumberInstance();
 
        OverallFormat = NumberFormat.getNumberInstance();
    }
	public void startplayer() {
		setVisible(true);
	}
	public void endplayer() {
		setVisible(false);
	}
	
}