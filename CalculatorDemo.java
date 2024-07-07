package calculator;
import java.awt.*;
import java.awt.event.*;

class FrameDemo extends Frame implements ActionListener {
	
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bper,bdot,
	bplus,bminus,bm,bdiv,bequal,bac,bdel;
	TextField tf;
	
	FrameDemo(){
		
		tf = new TextField();
		tf.setBounds(100, 100, 400, 100);
		
		bac = new Button("AC");
		bac.setBounds(100,200, 100,70);
		bac.addActionListener(this);
		bdiv = new Button("/");
		bdiv.setBounds(200,200, 100,70);
		bdiv.addActionListener(this);
		bm = new Button("X");
		bm.setBounds(300,200, 100,70);
		bm.addActionListener(this);
		bdel = new Button("del");
		bdel.setBounds(400,200,100,70);
		bdel.addActionListener(this);
		
		b7 = new Button("7");
		b7.setBounds(100,270, 100,70);
		b7.addActionListener(this);
		b8 = new Button("8");
		b8.setBounds(200,270, 100,70);
		b8.addActionListener(this);
		b9 = new Button("9");
		b9.setBounds(300,270, 100,70);
		b9.addActionListener(this);
		bminus = new Button("-");
		bminus.setBounds(400,270,100,70);
		bminus.addActionListener(this);
		
		
		b4 = new Button("4");
		b4.setBounds(100,340, 100,70);
		b4.addActionListener(this);
		b5 = new Button("5");
		b5.setBounds(200,340, 100,70);
		b5.addActionListener(this);
		b6 = new Button("6");
		b6.setBounds(300,340, 100,70);
		b6.addActionListener(this);
		bplus = new Button("+");
		bplus.setBounds(400,340,100,70);
		bplus.addActionListener(this);
		
		
		b1 = new Button("1");
		b1.setBounds(100,410, 100,70);
		b1.addActionListener(this);
		b2 = new Button("2");
		b2.setBounds(200,410, 100,70);
		b2.addActionListener(this);
		b3 = new Button("3");
		b3.setBounds(300,410, 100,70);
		b3.addActionListener(this);
		bequal = new Button("=");
		bequal.setBounds(400,410,100,140);
		bequal.addActionListener(this);
		
		bper = new Button("%");
		bper.setBounds(100, 480, 100, 70);
		bper.addActionListener(this);
		b0 = new Button("0");
		b0.setBounds(200, 480, 100, 70);
		b0.addActionListener(this);
		bdot = new Button(".");
		bdot.setBounds(300, 480, 100, 70);
		bdot.addActionListener(this);
		
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(bac);
		this.add(bdiv);
		this.add(bdel);
		this.add(bminus);
		this.add(bplus);
		this.add(bequal);
		this.add(bper);
		this.add(b0);
		this.add(bdot);
		this.add(bm);
		this.add(tf);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		String s1 =" ";
		if(e.getSource() == b1) {
			s1 = tf.getText() + "1";
			tf.setText(s1);
		}
		else if(e.getSource() == b2) {
			 s1 = tf.getText() + "2";
			tf.setText(s1);
		}
		else if(e.getSource() == b3) {
			s1 = tf.getText() + "3";
			tf.setText(s1);
		}
		else if(e.getSource() == b4) {
			s1 = tf.getText() + "4";
			tf.setText(s1);
		}
		else if(e.getSource() == b5) {
			s1 = tf.getText() + "5";
			tf.setText(s1);
		}
		else if(e.getSource() == b6) {
			s1 = tf.getText() + "6";
			tf.setText(s1);
		}
		else if(e.getSource() == b7) {
			s1 = tf.getText() + "7";
			tf.setText(s1);
		}
		else if(e.getSource() == b8) {
			s1 = tf.getText() + "8";
			tf.setText(s1);
		}
		else if(e.getSource() == b9) {
			s1 = tf.getText() + "9";
			tf.setText(s1);
		}
		else if(e.getSource() == b0) {
			s1 = tf.getText() + "0";
			tf.setText(s1);
		}
		else if(e.getSource() == bper) {
			s1 = tf.getText() + "%";
			tf.setText(s1);
		}
		else if(e.getSource() == bdot) {
			s1 = tf.getText() + ".";
			tf.setText(s1);
		}
		else if(e.getSource() == bac) {
			s1 = " ";
			tf.setText(s1);
		}
		else if(e.getSource() == bminus) {
			s1 = tf.getText() + "-";
			tf.setText(s1);
		}
		else if(e.getSource() == bplus) {
			s1 = tf.getText() + "+";
			tf.setText(s1);
		}
		else if(e.getSource() == bm) {
			s1 = tf.getText() + "*";
			tf.setText(s1);
		}
		else if(e.getSource() == bdiv) {
			s1 = tf.getText() + "/";
			tf.setText(s1);
		}
		else if(e.getSource() == bdel) {
			s1 = tf.getText();
			String str = s1.substring(0, s1.length()-1);
			tf.setText(str);
		}
		else if(e.getSource() == bequal) {
			s1 = tf.getText();
			
			
		}
		
		
	}
	
	
}

public class CalculatorDemo {

	public static void main(String[] args) {
		
		FrameDemo f = new FrameDemo();
		
		f.setSize(600,700);
		f.setLayout(null);
		f.setBackground(Color.white);
		f.setTitle(" Calcutator ");
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
