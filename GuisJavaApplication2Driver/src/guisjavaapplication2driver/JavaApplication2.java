package guisjavaapplication2driver; 
import javax.swing.*; 
import java.awt.event.*; 
import java.awt.*; 

public class JavaApplication2 extends JFrame{ 
    private JPanel panel; 
    private JLabel messageLabel; 
    private JRadioButton milesButton; 
    private JRadioButton feetButton; 
    private JRadioButton inchesButton; 
    private ButtonGroup radioButtonGroup; 
    private JTextField kiloTextField; 
    private final int WINDOW_WIDTH = 450; 
    private final int WINDOW_HEIGHT = 100; 
     
    public JavaApplication2(){ 
    setTitle("Metric Converter"); 
    setSize(WINDOW_WIDTH,WINDOW_HEIGHT); 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    buildPanel(); 
    add(panel); 
    setVisible(true); 
} 
     
    private void buildPanel(){ 
        messageLabel = new JLabel("Enter a distance in kilometers! "); 
        kiloTextField = new JTextField(10); 
        milesButton = new JRadioButton("Convert to miles"); 
        feetButton = new JRadioButton("Convert to feet"); 
        inchesButton = new JRadioButton("Convert to inches"); 
         
        radioButtonGroup = new ButtonGroup(); 
        radioButtonGroup.add(milesButton); 
        radioButtonGroup.add(feetButton); 
        radioButtonGroup.add(inchesButton); 
         
        milesButton.addActionListener(new RadioButtonListener()); 
        feetButton.addActionListener(new RadioButtonListener()); 
        inchesButton.addActionListener(new RadioButtonListener()); 
         
        panel = new JPanel(); 
         
        panel.add(messageLabel); 
        panel.add(kiloTextField); 
        panel.add(milesButton); 
        panel.add(feetButton); 
        panel.add(inchesButton); 
        add(panel); 
    } 
        private class RadioButtonListener implements ActionListener{ 
            public void actionPerformed(ActionEvent e){ 
            String input; 
            String convertTo = ""; 
            double result = 0.0; 
             
            input = kiloTextField.getText(); 
             
            if(e.getSource()==milesButton){ 
                convertTo=" miles."; 
                result = Double.parseDouble(input) * .6214; 
            } 
            else if (e.getSource()==feetButton){ 
                convertTo= " feet."; 
                result  = Double.parseDouble(input)*3281; 
            } 
            else if (e.getSource()==inchesButton){ 
                convertTo= " inches."; 
                result= Double.parseDouble(input)* 39370; 
            } 
            JOptionPane.showMessageDialog(null, input + " kilometers is " + result + convertTo); 
        } 


        }
}

