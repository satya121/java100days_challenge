import java.awt.*;
import java.awt.event.*;
public class Flag implements ActionListener
{
	Label l1,l2,l3;
	Frame f;

	public Flag()
	{
		f=new Frame("FLag");
		l1=new Label();
		l1.setBounds(150,50,150,30);
		l1.setBackground(Color.orange);
		l2=new Label();
		l2.setBounds(150,80,150,30);
		l2.setBackground(Color.white);
		l3=new Label();
		l3.setBounds(150,110,150,30);
		l3.setBackground(Color.green);
		f.add(l1);
		f.add(l2);
		f.add(l3);
	}
	public void paint(Graphics g)
	{
		try
		{
		g.setColor(Color.black);
		g.drawLine(150,50,150,300);
		}
		catch(Exception e){ }

		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);

	}
	
	public void actionPerformed(ActionEvent ae){ }
	{
		Flag fg=new Flag();
	}
	public boolean action(Event eve,Object obj)
	{
		repaint();
		return true;
	}
}
