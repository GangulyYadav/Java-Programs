import javax.swing.*;
import java.awt.*;

class DataForm extends JFrame
{
	JPanel pan;
	JLabel lname,ladd,lage,lcity,lstate,lgender,lqual;
	JTextField tname,tadd,tage;
	JCheckBox dip,grad,pg;
	JRadioButton male,female;
	JButton submit,cancel;
	// String cities[]= {"Delhi","Mumbai","Chennai","Banglor","Hydrabad","Shri Nagar","Pune"};
	// String states[]= {"Maharastra","NCR","Tamil Nadu","Kranataka","telangana","Kashmir"};
	DefaultListModel<String> ccity = new DefaultListModel<>();  
	DefaultListModel<String> cstate = new DefaultListModel<>();  

//	ButtonGroup bg;
	
	public DataForm() 
	{
		super("Biodata in Swing");
		pan =new JPanel();
		lname= new JLabel("Enter Name");
		ladd= new JLabel("Enter Address");
		lage= new JLabel("Enter Age");
		
        ccity.addElement("Delhi");  
        ccity.addElement("Chennai");  
        ccity.addElement("Mumbai");  
        ccity.addElement("Kolkata");  
        JList<String> list = new JList<>(ccity); 
		cstate.addElement("Gujarat");  
        cstate.addElement("Maharashtra");  
        cstate.addElement("Rajasthan");  
        cstate.addElement("UP");  
        JList<String> state = new JList<>(cstate);
		
		dip= new JCheckBox("Diploma in any field");
		grad= new JCheckBox("Graduated");
		pg= new JCheckBox("Post graduted");
		
		male=new JRadioButton("male");
		female=new JRadioButton("female");
		
		submit=new JButton("Submit");
		cancel=new JButton("Cancel");
		
		pan.add(lname); pan.add(tname);
		pan.add(ladd);pan.add(tadd);
		pan.add(lage);pan.add(tage);
		pan.add(lcity);//pan.add(ccity);
		pan.add(lstate);//pan.add(cstate);
		pan.add(lgender);pan.add(male);pan.add(female);
		pan.add(lqual);pan.add(dip);pan.add(grad);pan.add(pg);
		pan.add(submit);pan.add(cancel);
		
		add(pan);
		setSize(600,600);
		setVisible(true);

	
}
}
public class SwingProgram3 {
	public static void main(String args[])
	{
		new DataForm();
	}

}