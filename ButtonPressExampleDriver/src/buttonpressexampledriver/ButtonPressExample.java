package buttonpressexampledriver; 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class ButtonPressExample extends JFrame{ 
    private JPanel p; 
    private JLabel ell; 
    private JButton red; 
    private JButton black; 
    private JButton green; 
    private final int  WIDTH = 250; 
    private final int LENGTH = 350; 
    //constructor 
    public ButtonPressExample(){ 
        setTitle("Button Press Example"); 
        setSize(WIDTH,LENGTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ell = new JLabel("Press Button or Die!"); 
        red= new JButton("RED"); 
        black = new JButton("BLACK"); 
        green = new JButton("GREEN"); 
        red.addActionListener(new redButtonPress()); 
        black.addActionListener(new blackButtonPress()); 
        green.addActionListener(new greenButtonPress()); 
        p = new JPanel(); 
        p.add(ell); 
        p.add(red); 
        p.add(black); 
        p.add(green); 
        add(p); 
        setVisible(true); 
    } 
    private class redButtonPress implements ActionListener{ 
        public void actionPerformed(ActionEvent e){ 
            p.setBackground(Color.RED); 
        } 
    } 
    private class blackButtonPress implements ActionListener{ 
        public void actionPerformed(ActionEvent e){ 
            p.setBackground(Color.black); 
        } 
    }    
    private class greenButtonPress implements ActionListener{ 
        public void actionPerformed(ActionEvent e){ 
            p.setBackground(Color.green); 
        } 
    }    
} 