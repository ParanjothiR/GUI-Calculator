import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

class CalCulator implements ActionListener{
      JFrame f;
      JTextField t;
      JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,beq,bdot;
      static double a=0,b=0,result=0;
      static int operator=0;

      CalCulator(){
       f=new JFrame("Calc2");
       f.setSize(300,400);
       f.getContentPane().setBackground(Color.green);
       JPanel k=new JPanel();
       k.setBounds(6,0,273,60);
       Border border = new LineBorder(Color.BLACK,1, true);
       k.setBorder(border);
       k.setLayout(null);
       f.add(k);
       JPanel p1=new JPanel();
       p1.setBounds(6,63,273,293);
       //Border border = new LineBorder(Color.BLACK,1, true);
       p1.setBorder(border);
       p1.setLayout(null);
       f.add(p1);
       f.setLayout(null);
       
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setResizable(false);
       Font fo=new Font("Arial",Font.BOLD,20);
       t=new JTextField();
       t.setFont(fo);
       t.setBackground(Color.white);
       t.setForeground(Color.black);
       t.setBounds(1,0,272,60);
       k.add(t);
       b1=new JButton("1");
       b2=new JButton("2");
       b3=new JButton("3");
       b4=new JButton("4");
       b5=new JButton("5");
       b6=new JButton("6");
       b7=new JButton("7");
       b8=new JButton("8");
      b9=new JButton("9");
      b0=new JButton("0");
      badd=new JButton("+");
      bdiv=new JButton("/");
      bmul=new JButton("*");
      bsub=new JButton("-");
      bdot=new JButton(".");
      beq=new JButton("=");
      b7.setBounds(0,0,68,73);
      p1.add(b7);
      b8.setBounds(68,0,68,73);
      p1.add(b8);
      b9.setBounds(136,0,68,73);
      p1.add(b9);
      badd.setBounds(204,0,68,73);
      p1.add(badd);
      b4.setBounds(0,73,68,73);
      p1.add(b4);
      b1.setBounds(0,146,68,73);
      p1.add(b1);
      b0.setBounds(0,219,68,73);
      p1.add(b0);
      b5.setBounds(68,73,68,73);
      p1.add(b5);
      b2.setBounds(68,146,68,73);
      p1.add(b2);
      bdot.setBounds(68,219,68,73);
      p1.add(bdot);
      b6.setBounds(136,73,68,73);
      p1.add(b6);
      b3.setBounds(136,146,68,73);
      p1.add(b3);
      bdiv.setBounds(136,219,68,73);
      p1.add(bdiv);
      bsub.setBounds(204,73,68,73);
      p1.add(bsub);
      bmul.setBounds(204,146,68,73);
      p1.add(bmul);
      beq.setBounds(204,219,68,73);
      p1.add(beq);

     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this); 
     b6.addActionListener(this);
     b7.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);
     badd.addActionListener(this);
     bsub.addActionListener(this);
     bmul.addActionListener(this);
     bdiv.addActionListener(this);
     bdot.addActionListener(this);
     beq.addActionListener(this);





      }
      public static void main(String arg[]){
      new CalCulator();  

    
      }
     public void actionPerformed(ActionEvent e){
         if(e.getSource()==b1){
                t.setText(t.getText().concat("1"));

        }
        if(e.getSource()==b2){
                t.setText(t.getText().concat("2"));

        }
        if(e.getSource()==b3){
                t.setText(t.getText().concat("3"));

        }
        if(e.getSource()==b4){
                t.setText(t.getText().concat("4"));

        }
        if(e.getSource()==b5){
                t.setText(t.getText().concat("5"));

        }
        if(e.getSource()==b6){
                t.setText(t.getText().concat("6"));

        }
        if(e.getSource()==b7){
                t.setText(t.getText().concat("7"));

        }
        if(e.getSource()==b8){
                t.setText(t.getText().concat("8"));

        }
        if(e.getSource()==b9){
                t.setText(t.getText().concat("9"));

        }
        if(e.getSource()==b0){
                t.setText(t.getText().concat("0"));

        }
        if(e.getSource()==bdot){
                t.setText(t.getText().concat("."));

        }
        if(e.getSource()==badd){
                a=Double.parseDouble(t.getText());
                operator=1;
                t.setText("");

        }
      if(e.getSource()==bsub){
                a=Double.parseDouble(t.getText());
                operator=2;
                t.setText("");

        }
       if(e.getSource()==bmul){
                a=Double.parseDouble(t.getText());
                operator=3;
                t.setText("");

        }if(e.getSource()==bdiv){
                a=Double.parseDouble(t.getText());
                operator=4;
                t.setText("");

        }if(e.getSource()==beq){
                b=Double.parseDouble(t.getText());
                switch(operator){
                 case 1:
                 result=a+b;
                 break;
                 case 2:
                 result=a-b;
                 break;
                 case 3:
                 result=a*b;
                 break;
                 case 4:
                 result=a/b;
                 break;
                 }
                t.setText(""+result);


        }
        

    }
}