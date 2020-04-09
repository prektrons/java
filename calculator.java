import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Slip6.class" width=300 height=300>
</applet>
*/

public class Slip6 extends Applet implements ActionListener
{

	int a,b,result;
	TextField tf;
	char operator;
	Button b[]=new Button[10];
	Button add,sub,mul,div,mod,equals,clear; 
	public Slip6() 
	{
		tf=new TextField();
		for(int i=0;i<10;i++)
		{
			b[i]=new Button(""+i);
		}
		add=new Button("add");
		sub=new Button("sub");
		mul=new Button("mul");
		div=new Button("div");
		mod=new Button("mod");
		equals=new Button("=");
		clear=new Button("clear");
		setLayout(new GridLayout(5,4));
		add(tf);

		for(int i=0;i<10;i++)
		{
			add(b[i]);
		}

		add(add);add(sub);add(mul);add(div);add(mod);add(equals);
		add(clear);
		
		for(int i=0;i<10;i++)
		{
			b[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		equals.addActionListener(this);
		clear.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		char ch=str.charAt(0);
		if(Character.isDigit(ch))
		tf.setText(tf.getText()+str);
		else if(str.equals("add"))
		{
			a=Integer.parseInt(tf.getText());
			operator='+';
			tf.setText("");
		}
		else if(str.equals("sub"))
		{
			a=Integer.parseInt(tf.getText());
			operator="sub";
			tf.setText("");
		}
		else if(str.equals("mul"))
		{
			a=Integer.parseInt(tf.getText());
			operator="mul";
			tf.setText("");
		}
		else if(str.equals("div"))
		{
			a=Integer.parseInt(tf.getText());
			operator="div";
			tf.setText("");
		}
		else if(str.equals("mod"))
		{
			a=Integer.parseInt(tf.getText());
			operator="mod";
			tf.setText("");
		}
		if(str=="=")
		{
		b=Integer.parseInt(tf.getText());
		if(operator=='+')
			result=a+b;
		else if(operator=='-')
			result=a-b;
		else if(operator=='*')
			result=a*b;
		else if(operator=='/')
			result=a/b;
		else if(operator=='%')
			result=a%b;
		  tf.setText(""+result);
		}
		else if(str.equals("clear"))
		tf.setText("");
	}
}
