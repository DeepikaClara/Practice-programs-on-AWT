package hibernate_projects.project_study_1;

import java.awt.Button;
import java.awt.Frame;
//extending Frame class to our class
public class AWT1_inheritance extends Frame {
	AWT1_inheritance()//initializing constructor
	{
	Button b=new Button("click me");//creating button
	//setting button position on screen
	b.setBounds(20,80,60,40);//setbounds(int x-axis,int y-axis,int width,int height)
	//adding button to frame
    add(b);
    //setting frame size
    setSize(205,205);//setSize(int width,int height)
    //setting frame title
    setTitle("This is AWT example on inheritance");
    //setting no layout manager
    setLayout(null);
    //setting frame to be visible,by default it is invisible
    setVisible(true);
	}
	public static void main(String[] args) {
		AWT1_inheritance f=new AWT1_inheritance();	

	}

}
