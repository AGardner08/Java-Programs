import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 

//GUI java projects uses events and swing imports
public class JFrameTest extends JFrame {

    //Every component must be privated 

    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    
    private JMenuBar menuBar; 
    private JMenu fileMenu;
    private JMenu exitMenu;

    private JMenuItem exitMenuItem;
    private JMenuItem menuItem;
    private JRadioButtonMenuItem radioItem;
    private JCheckBoxMenuItem checkItem;
    
    private JLabel messageLabel;

    private final int PANEL_WIDTH = 300;
    private final int PANEL_HEIGHT = 300;
    

public JFrameTest() {

    //Set title first always
    super("GUI Test");

    setSize(PANEL_WIDTH, PANEL_HEIGHT);

    //add closing function
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //add the message label
    messageLabel = new JLabel("Select any of the buttons below.",
    SwingConstants.TOP);


    //Set a new dimension in the preferred size
    messageLabel.setPreferredSize(new Dimension(250,250));
    
    messageLabel.setForeground(Color.black);

    //add the menu bar method
    buildMenuBar();
    
    //add the buttons
    button1 = new JButton("Button 1");
    button2 = new JButton("Button 2");
    button3 = new JButton("Button 3");
    button4 = new JButton("Button 4");
    button5 = new JButton("Button 5");
    
    //add the button action listener 
    button1.addActionListener(new ButtonListener());
    button2.addActionListener(new ButtonListener());
    button3.addActionListener(new ButtonListener());
    button4.addActionListener(new ButtonListener());
    button5.addActionListener(new ButtonListener());

    //add the panel
    panel = new JPanel();
    //add the buttons to the panel.
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(button4);
    panel.add(button5);

    //add panel to GUI Box
    add(panel);
    add(messageLabel);

    //pack and display window 
    pack();
    setVisible(true);
}

//implement the Actionlistener method
private class ButtonListener implements ActionListener {
    //add the performance method
    public void actionPerformed(ActionEvent e) {

        JOptionPane.showMessageDialog(null, "You've selected "
         + e.getActionCommand());

    }

}

//Implement the Menu Bar method
private void buildMenuBar() {
    //create the bar 
    menuBar = new JMenuBar();

    //Create the item methods in the bar
    buildFileMenu(); //Edit Visibility
    buildExitMenu(); //Close program

    //add to menubar
    menuBar.add(fileMenu);
    menuBar.add(exitMenu);

    //Set the menu bar
    setJMenuBar(menuBar);

}

private void buildFileMenu() {

    menuItem = new JMenuItem("Popup");
    menuItem.addActionListener(new FirstListener());
    fileMenu.add(menuItem);

    //Set true to be checked by default 
    checkItem = new JCheckBoxMenuItem("Visible", true);
    checkItem.addActionListener(new CheckListener());
    fileMenu.add(checkItem);
}

private void buildExitMenu() {

exitMenuItem = new JMenuItem("Exit");

exitMenuItem.addActionListener(new ExitListener());
exitMenu.add(exitMenuItem);   
    }

    private class ExitListener implements ActionListener {
        //Create the action performance method

        public void actionPerformed(ActionEvent e ) {
            System.exit(0);
        }

    }
    
    private class FirstListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "The file button was clicked");
        }
              
    }
        
    private class CheckListener implements ActionListener {
        public void actionPerformed(ActionEvent e ) {
            //use the if condition for the messabe label

            if(checkItem.isSelected()) 
            messageLabel.setVisible(true);
            else
            messageLabel.setVisible(false);

            }
        }
    }

