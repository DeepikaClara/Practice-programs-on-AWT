package hibernate_projects.project_study_1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_association {
	AWT_association()
	{
		//VirtualKeyboard vk=new VirtualKeyboard();
		Frame f=new Frame();
		Label l=new Label("Employee id");
		TextField t=new TextField();
		Button b=new Button("click");
		l.setBounds(20, 80, 80, 30);
		t.setBounds(20, 110, 80, 40);
		b.setBounds(100, 110, 80, 30);
		f.add(l);
		f.add(b);
		f.add(t);
		f.addWindowListener(new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
               System.exit(0); //stops java virtual machine   
            }    
		});
//addwindowListener():adds the window listener to receive the window event from the window.
//WindowAdapter():This is the constructor of the WindowAdapter class of the java.awt.event.*; package. 
		        //This is an abstract class used for receiving window events.
//windowClosing():invoked when the frame is attempted to close from the window's 
		       //system menu or close button. This method receives the WindowEvent object.
        f.setSize(300,300);
        f.setTitle("Employee info");
        f.setLayout(null);
        f.setVisible(true);
        
        }
	public static void main(String[] args) {
		AWT_association s=new AWT_association();

	}
	

}
