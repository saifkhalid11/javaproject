package guisgetactioncommandexampledriver; 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class GetActionCommandExample extends JFrame{ 
    private JPanel p; 
    private JLabel ell; 
    private JButton red; 
    private JButton black; 
    private JButton green; 
    private final int  WIDTH = 250; 
    private final int LENGTH = 350; 
    //constructor 
    public GetActionCommandExample(){ 
      setTitle("Button Press Example"); 
        setSize(WIDTH,LENGTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ell = new JLabel("Press Button or Die!"); 
        red = new JButton("RED"); 
        black = new JButton("BLACK"); 
        green = new JButton("GREEN"); 
        red.addActionListener(new buttonPress()); 
        black.addActionListener(new buttonPress()); 
        green.addActionListener(new buttonPress()); 
        p = new JPanel(); 
        p.add(ell); 
        p.add(red); 
        p.add(black); 
        p.add(green); 
        add(p); 
        setVisible(true);   
    } 
    private class buttonPress implements ActionListener{ 
        public void actionPerformed(ActionEvent e){ 
            if(e.getActionCommand()=="RED") {
                p.setBackground(Color.red); 
                ell.setForeground(Color.BLUE);
            }
            
            else if(e.getActionCommand()=="BLACK") {
                p.setBackground(Color.black); 
                ell.setForeground(Color.white);
            }
            else {
                p.setBackground(Color.green); 
                ell.setForeground(Color.BLUE);
            }
        } 
    } 
} 

