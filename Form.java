import java.awt.*;  
import java.awt.event.*;  
public class SimpleForm extends Frame implements ActionListener{  
    Frame f;
    Label l,l2;  
    TextField tf; 
    Button b; 
    SimpleForm(){  
        f = new Frame("DCPE HVPM"); 
        l=new Label("Enter your name :");  
        l.setBounds(20,50,100,20); 
	l2 = new Label();
	l2.setBounds(20,100,100,20); 
        tf=new TextField();  
        tf.setBounds(20,80,150, 20);  
        b = new Button("Click me!");
        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
            String input = tf.getText();
            l2.setText("Welcome "+input); 
	} 
       });         
        add(l);add(tf);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
  

    public static void main(String[] args) {  
        new SimpleForm();  
    }  
}  