/******************************************************/

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

/*************************************************************/

//Sale 类为处理每一次的销售活动，包括处理，显示，记录，以及清除

/************************************************************/

class Sale {

String	name = new String();

String code = new String();

String temcode = new String();

String quantity = new String();

int codenum,quantitynum,temp;

static int serialnum=1;

int exception=0;

public Sale( String name, String code,String quantity){

temcode= code;

if(name.isEmpty())

JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"please input the Staff name!");

else{

codenum=Integer.parseInt(temcode);

JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"please input a product code!");

quantitynum = Integer.parseInt(quantity);

JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"please input a product quantity!");

if(exception==0){

if(codenum<=0||codenum>Toy.kindsum)

JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"this product is not available!");

else

{

if (Toy.Toysum[codenum-1]<quantitynum)

JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"please input a quantity not above"+Toy.Toysum[codenum-1]);

else {

Toy.Toysum[codenum-1]=Toy.Toysum[codenum-1]-quantitynum;

ToyalesFrame.middle.append(" "+serialnum);

ToyalesFrame.middle.append(" "+Toy.Toycode[codenum-1]);

ToyalesFrame.middle.append(" "+name);

ToyalesFrame.middle.append(" "+Toy.Toyprice[codenum-1]);

ToyalesFrame.middle.append(" "+quantitynum);

java.text.DecimalFormat myformat=new java.text.DecimalFormat("#0.00");

ToyalesFrame.middle.append(" "+Float.parseFloat(myformat.format(Toy.Toyprice[codenum-1]*quantitynum)));

ToyalesFrame.middle.append("\n");

serialnum++;

}

}

}

}

}

}