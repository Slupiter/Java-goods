import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

/******************************************************/

//TestProg ��Ϊ�����࣬����main����

//������ʵ�ִ���������Ҫ����Toy��Ķ���toy�Լ�ToyalesFrame���mine����

/*****************************************************/

public class TestProg{

public static void main(String args[]){

Toy toy = new Toy();

ToyalesFrame mine = new ToyalesFrame();

mine.setVisible(true);

}

}

/***********************************************/

/**************************************************/

//����Ϊʵ�ֳ���������棬������ʾ�����֣������Լ��¼���������Ϊ��������¼������ṩ����

//����δʵ���κ�ʵ�ʹ���

/**************************************************/

class ToyalesFrame extends JFrame{

JPanel up; //�������������ĳЩ����������������

JPanel down;

static JTextArea middle;

JButton buttons[];

JTextField fields[];

String names1[]={

"Show Toy","Show Chart","Save and Exit"

};

private final String names2[]={

"Process Sale","Clear","Staff Name:","Toy Code:","Quantity:"

};

public ToyalesFrame(){ //����GUI��ע���¼�����

super("Toys Sales");

this.setBounds(0,0,800,600);

Container c= this.getContentPane();

c.setLayout(new BorderLayout(8,8));

up = new JPanel();

down = new JPanel();

up.setOpaque(false);

up.setBackground(Color.gray);

up.setLayout(new GridLayout(1,3,60,0));

Buttonhandler handler1= new Buttonhandler();

buttons = new JButton [5];

for(int count=0;count<names1.length;count++){ //��Ӿֲ���������������¼�����

buttons[count] = new JButton(names1[count]);

up.add(buttons[count]);

buttons[count].addActionListener(handler1);

}

down.setBackground(Color.gray);

down.setLayout(new FlowLayout(1,50,0));

fields = new JTextField[3];

Box vertical1 = Box.createVerticalBox();

Box vertical2 = Box.createVerticalBox();

Box vertical3 = Box.createVerticalBox();

for(int count=3;count<5;count++)

{ buttons[count]= new JButton(""+names2[count-3]);

buttons[count].addActionListener(handler1);

vertical1.add(buttons[count]);

}

for(int count=2;count<5;count++)

vertical2.add(new JLabel(""+names2[count]));

for(int count=0;count<3;count++){

fields[count]= new JTextField(15);

vertical3 .add(fields[count]);

}

down.add(vertical1);

down.add(vertical2);

down.add(vertical3);

middle = new JTextArea();

middle.setText("���к� ��߱�� �ۻ�Ա ���� �۳����� �����۶�(Ԫ)");

middle.append("\n");

middle.setEditable(false);

//table(false);

c.add(up,BorderLayout.NORTH);

c.add(middle,BorderLayout.CENTER);

c.add(down,BorderLayout.SOUTH);

}

private class Buttonhandler implements ActionListener{ //�ṩ�¼���������

public void actionPerformed(ActionEvent event){

if(event.getSource()==buttons[0]){

ToyFrame stock = new ToyFrame();
      stock.setVisible(true);

}

if(event.getSource()==buttons[1]){

//ChartFrame chart = new ChartFrame();

}

if(event.getSource()==buttons[2]){

//	Salelist list =new Salelist();

//Toylist list = new Toylist();

}

if(event.getSource()==buttons[3]) {

Sale dealsale = new Sale(fields[0].getText(),fields[1].getText(),fields[2].getText());

}

if(event.getSource()==buttons[4]){

fields[0].setText("");

fields[1].setText("");

fields[2].setText("");

}

}

}

}