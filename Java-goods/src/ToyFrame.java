import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
 
public class ToyFrame extends JFrame {
	JPanel jPanel3;
	static JTextArea middle2;
	int i;
	public ToyFrame() {
		middle2 = new JTextArea();
		 jPanel3=new JPanel();
		middle2.setText("玩具编号 名称 单价 总数量");
		middle2.append("\n");
		for(i=0;i<4;i++)
		{
	

		middle2.append(" "+Toy.Toycode[i]);

		middle2.append(" "+Toy.Toyname[i]);
		middle2.append(" "+Toy.Toyprice[i]);
		middle2.append(" "+Toy.Toysum[i]);
		middle2.append("\n");}

		java.text.DecimalFormat myformat=new java.text.DecimalFormat("#0.00");

		

		

		middle2.setEditable(false);
		this.setBounds(0,0,800,600);
		Container c= this.getContentPane();

		c.setLayout(new BorderLayout(8,8));
		c.add(middle2);
	}

}
