/***********************************/

import java.io.*;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

/****************************************************/

//Toy ��Ϊ�ӳ�ʼ���ļ�toy.txt�ж�ȡ��߳�ʼ��Ϣ��������Ӧ�ĵ���������洢�����࣬

//�Լ����ַ���Ԫ��ת���ɿ��Խ�����ѧ�����int��float������

/*****************************************************/

class Toy{

String line;

static String[]	Toycode = new String[5];

static String[] Toyname = new String[5];

String[] Toysum1 = new String[5];

static String[] Toyprice1= new String[5];

static int[] Toysum = new int[5];

static Float[] Toyprice= new Float[5];

static int kindsum=0;

public Toy(){

try{

FileInputStream infile= new FileInputStream("Toys.txt");

InputStreamReader fis = new InputStreamReader(infile);

BufferedReader bReader= new BufferedReader(fis);

while(kindsum<4){
	line = bReader.readLine();
int j=0;

String[] lines = line.split("\\ ");

//while(lines[j].length()==0) j++;

Toycode[kindsum] = lines[j];

System.out.println("read:"+Toycode[kindsum]);

++j;

//while(lines[j].length()==0) j++;

Toyname[kindsum] = lines[j];

System.out.println("read:"+Toyname[kindsum]);

j++;

//while(lines[j].length()==0)

//j++;

Toyprice1[kindsum] = lines[j];

Toyprice[kindsum] = Float.parseFloat(Toyprice1[kindsum]);

System.out.println("read:"+Toyprice[kindsum]);

j++;

//while(lines[j].length()==0) j++;

Toysum1[kindsum] = lines[j];

Toysum[kindsum] = Integer.parseInt(Toysum1[kindsum]);

System.out.println("read:"+Toysum[kindsum]);

kindsum++;

}

fis.close();

}

catch(FileNotFoundException e){

System.out.println("FileStreamTest1:"+e);

}

catch(IOException e){

System.out.println("FileStreamTest1:"+e);

}

}

}