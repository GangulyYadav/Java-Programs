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
	l2.setBounds(20,170,200,20); 
        tf=new TextField();  
        tf.setBounds(20,80,150, 20);  
        b = new Button("Click me!");
        b.setBounds(20,120,80,20);
        b.addActionListener(this);       
        add(l);add(l2);add(tf);
	add(b);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
     

  public void actionPerformed(ActionEvent e){ 
             String input = tf.getText();
		//if(e.getSource()==b)
           	 l2.setText("Welcome "+input);   
  }  
  

    public static void main(String[] args) {  
        new SimpleForm();  
    }  
}  