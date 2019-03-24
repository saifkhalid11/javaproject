package guisproject; 
import javax.swing.*; 
import java.awt.event.*;
public class GuisProjectDriver extends JFrame { 
   private JPanel p;
    private JLabel ell;
    private JLabel ell1;
    private JButton b;
    private JTextField tF;
    private JTextField tF1;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 250;    
    
    public GuisProjectDriver(){ 
        setTitle("Panel Project");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p=new JPanel();
        ell=new JLabel("Enter kilometers here:");
        ell1=new JLabel("The number of miles is:");
        b= new JButton("Push Me!");
        b.addActionListener(new ButtonListener());
        tF = new JTextField(10);
        tF1 = new JTextField(10);
        p.add(ell);
        p.add(tF);
        p.add(ell1);
        p.add(tF1);        
        p.add(b);
        add(p);
        setVisible(true);
    }
    
    public class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String input, output;
            Double miles;
            input = tF.getText();
            miles = Double.parseDouble(input);
            miles = miles*.6214;
            output = miles.toString();
            tF1.setText(output);
        }
    }
    
    
}