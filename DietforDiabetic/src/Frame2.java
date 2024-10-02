import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import sun.jvm.hotspot.ui.FrameWrapper;

public class Frame2 extends JFrame implements ActionListener{
	JButton button1,button2, button3, button4, button5;
	JButton button6, button7, button8;
	JRadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, rb13, rb14, rb15,
	rb16, rb17, rb18, rb19, rb20, rb21, rb22, rb23, rb24, rb25, rb26, rb27, rb28, rb29, rb30, rb31, rb32, rb33, rb34, rb35,
	rb36, rb37, rb38, rb39, rb40, rb41;
	JTextField a , b;
	JFrame frame1 = new JFrame();
	JFrame frame = new JFrame();
	JFrame frame2 = new JFrame();
	JFrame frame3 = new JFrame();
	JFrame frame4 = new JFrame();
	Double weightt, hightt, bmi;
	JLabel label11, label12, label13, label14, label15, label16, label17;
	int Catagory=0;
	Double limit=0.00;
	Double total=0.00;
	Double remaining=0.00;
	
		Frame2()
		{
		frame = new JFrame();
		frame1 = new JFrame();
		frame2 = new JFrame();
		frame3 = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		button1 = new JButton("Calculate BMI");
		button2 = new JButton("Exit");
		JLabel label1 = new JLabel("Weight in KG:");
		JLabel label2 = new JLabel("     Hight in cm:");
		JLabel label2_1 = new JLabel("BMI TABLE");
		JLabel label3 = new JLabel(".....................................Severe Thinness=Less than 16....................................");
		JLabel label4 = new JLabel(".....................................Moderate Thinness = 16---17.....................................");
		JLabel label5 = new JLabel(".....................................Mild Thinness = 17---18.4.....................................");
		JLabel label6 = new JLabel(".....................................NORMAL = 18.5---24.9.....................................");
		JLabel label7 = new JLabel(".....................................Overweight  = 25---30.....................................");
		JLabel label8 = new JLabel(".....................................Obese Class 1  = 30---35.....................................");
		JLabel label9 = new JLabel(".....................................Obese Class 2  = 35---40.....................................");
		JLabel label10 = new JLabel(".....................................Obese Class 3  = Above 40.....................................");
	
		
		
		label3.setOpaque(true);
		label3.setBackground(Color.pink);
		label4.setOpaque(true);
		label4.setBackground(Color.pink);
		label5.setOpaque(true);
		label5.setBackground(Color.pink);
		label6.setOpaque(true);
		label6.setBackground(Color.GREEN);
		label7.setOpaque(true);
		label7.setBackground(Color.orange);
		label8.setOpaque(true);
		label8.setBackground(Color.orange);
		label9.setOpaque(true);
		label9.setBackground(Color.orange);
		label10.setOpaque(true);
		label10.setBackground(Color.orange);
		label2_1.setOpaque(true);
		label2_1.setBackground(Color.BLUE);
		
		
		label2_1.setFont(new Font("Calibri", Font.BOLD, 90));
		getForeground();
		label2_1.setForeground(Color.BLACK);
		
		
		frame.add(label1);
		
		a=new JTextField(15);
		a.setBackground(Color.WHITE);
		a.setForeground(Color.RED);
		a.setFont(new Font(null, Font.BOLD,24));
		
		frame.add(a);
		
		b=new JTextField(15);
		
		b.setBackground(Color.WHITE);
		b.setForeground(Color.RED);
		b.setFont(new Font(null, Font.BOLD,24));
		frame.add(label2);
		frame.add(b);
		
		
		button1.setBackground(Color.GREEN);
		button2.setBackground(Color.RED);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		frame.add(button1);
		frame.add(button2);
		
		
		frame.add(label2_1);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(label7);
		frame.add(label8);
		frame.add(label9);
		frame.add(label10);
		
		//Catagory 1
		rb1= new JRadioButton("1 Cup Tea-----30 cal");
		rb2= new JRadioButton("Half Anda Amlate-----75 cal");
		rb3= new JRadioButton("1 Slice-----60 cal");
		rb4= new JRadioButton("Half Apple-----35 cal");
		rb5= new JRadioButton("2 Biscuits-----65 cal");
		rb6= new JRadioButton("Half Plate Vegitable-----30 cal");
		rb7= new JRadioButton("1 Roti/Chupati-----100 cal");
		rb8= new JRadioButton("Small Plate Salad-----30 cal");
		rb9= new JRadioButton("Small Apple-----30 cal");
		rb10= new JRadioButton("1/4 Kg Fruits-----70 cal");
		rb11= new JRadioButton("Half Plate Daal-----30 cal");
		rb12= new JRadioButton("Few Spoon Custard-----50 cal");
		rb13= new JRadioButton("Half Cup Milk with Ispaghol-----100 cal");
		
		//Catagory 2
		
		rb14= new JRadioButton("1 Cup Tea no Sugar-----30 cal");
		rb15= new JRadioButton("2 Slice -----100 cal");
		rb16= new JRadioButton("1 Egg-----80 cal");
		rb17= new JRadioButton("1 Chupati-----100 cal");
		rb18= new JRadioButton("SalanHalfPlate-----200 cal");
		rb19= new JRadioButton("Average 1 Apple/Amrood/Aroo/Naspati-----60 cal");
		rb20= new JRadioButton("Small Plate Salad-----30 cal");
		rb21= new JRadioButton("Raita/Dahi-----30 cal");
		rb22= new JRadioButton("2 Biscuits-----65 cal");
		rb23= new JRadioButton("1 Glass Milk no Sugar-----100 cal");
		rb24= new JRadioButton("Doodh-----150 cal");
		rb25= new JRadioButton("SalanHalfPlate-----200 cal");
		
		// Catagory 3
		
		rb26= new JRadioButton("1/4 Kg Milk No cream-----150 cal");
		rb27= new JRadioButton("1 Shami Kabab-----100 cal");
		rb28= new JRadioButton("1 Chicken Sandwich-----150 cal");
		rb29= new JRadioButton("1 Cup Tea-----30 cal");
		rb30= new JRadioButton("1 Apple-----65 cal");
		rb31= new JRadioButton("1 Kheera+Tamato Sandwich-----100 cal");
		rb32= new JRadioButton("1 Plate Potato+Chicken-----250 cal");
		rb33= new JRadioButton("2 Chupati-----200 cal");
		rb34= new JRadioButton("Few Spoon Kheer-----45 cal");
		rb35= new JRadioButton("2 Biscuits-----65 cal");
		rb36= new JRadioButton("1 Plate Boiled Rice-----210 cal");
		rb37= new JRadioButton("1 Plate Daal-----200 cal");
		rb38= new JRadioButton("1 Small Plate Salad-----30 cal");
		rb39= new JRadioButton("1 Apple-----65 cal");
		rb40= new JRadioButton("200 Ml Milk/ Small Cup with No Sugar-----120");
		rb41= new JRadioButton("1 Ubla howa Anda-----80 cal");

		
		frame.setTitle("Calculate BMI");
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		button3 = new JButton("Suggested Food");
		button4 = new JButton("Customerized Food");
		button5 = new JButton ("Submit");
		button6 = new JButton("Back");
		button7 = new JButton("Back");
		button8 = new JButton ("Finish the Program");
		
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
	}
	public void actionPerformed (ActionEvent e)
	{
		if (e.getSource()==button6)
		{
			frame1.setVisible(true);
		}
		if (e.getSource()==button7)
		{
			frame1.setVisible(true);
		}
		if (e.getSource()==button8)
		{
			frame.setVisible(true);
			System.exit(Catagory);
		}
		if (rb1.isSelected())
		{
			limit = limit-30.0;
		}
		if (rb2.isSelected())
		{
			limit = limit-75.0;
		}
		if (rb3.isSelected())
		{
			limit = limit-60.0;
		}
		if (rb4.isSelected())
		{
			limit = limit-35.0;
		}
		if (rb5.isSelected())
		{
			limit = limit-65.0;
		}
		if (rb6.isSelected())
		{
			limit = limit-30.0;
		}
		if (rb7.isSelected())
		{
			limit = limit-100.0;
		}
		if (rb8.isSelected())
		{
			limit = limit-30.0;
		}
		if (rb9.isSelected())
		{
			limit = limit-30.0;
		}
		if (rb10.isSelected())
		{
			limit = limit-70.0;
		}
		if (rb11.isSelected())
		{
			limit = limit-30.0;
		}
		if (rb12.isSelected())
		{
			limit = limit-50.0;
		}
		if (rb13.isSelected())
		{
			limit = limit-100.0;
		}
		
		//Catagory 2
		
		if (rb14.isSelected())
		{
			limit = limit-30;
		}
		if (rb15.isSelected())
		{
			limit = limit-100;
		}
		if (rb16.isSelected())
		{
			limit = limit-80;
		}
		if (rb17.isSelected())
		{
			limit = limit-100;
		}
		if (rb18.isSelected())
		{
			limit = limit-200;
		}
		if (rb19.isSelected())
		{
			limit = limit-60;
		}
		if (rb20.isSelected())
		{
			limit = limit-30;
		}
		if (rb21.isSelected())
		{
			limit = limit-30;
		}
		if (rb22.isSelected())
		{
			limit = limit-65;
		}
		if (rb23.isSelected())
		{
			limit = limit-100;
		}
		if (rb24.isSelected())
		{
			limit = limit-150;
		}
		if (rb25.isSelected())
		{
			limit = limit-200;
		}
		
		//Catagory 3
		
		if (rb26.isSelected())
		{
			limit = limit-150;
		}
		if (rb27.isSelected())
		{
			limit = limit-100;
		}
		if (rb28.isSelected())
		{
			limit = limit-150;
		}
		if (rb29.isSelected())
		{
			limit = limit-30;
		}
		if (rb30.isSelected())
		{
			limit = limit-65;
		}
		if (rb31.isSelected())
		{
			limit = limit-100;
		}
		if (rb32.isSelected())
		{
			limit = limit-250;
		}
		if (rb33.isSelected())
		{
			limit = limit-200;
		}
		if (rb34.isSelected())
		{
			limit = limit-45;
		}
		if (rb35.isSelected())
		{
			limit = limit-65;
		}
		if (rb36.isSelected())
		{
			limit = limit-210;
		}
		if (rb37.isSelected())
		{
			limit = limit-200;
		}
		if (rb38.isSelected())
		{
			limit = limit-30;
		}
		if (rb39.isSelected())
		{
			limit = limit-65;
		}
		if (rb40.isSelected())
		{
			limit = limit-120;
		}
		if (rb41.isSelected())
		{
			limit = limit-80;
		}
		
		if (e.getSource()==button5)
		{
			if (limit>=0)
			{
			remaining=limit;
			label15 = new JLabel ("Remaing Calories = "+limit);
			label15.setFont(new Font("Calibri", Font.BOLD, 30));
			label15.setForeground(Color.GREEN);
			label15.setOpaque(true);
			label15.setBackground(Color.BLACK);
			frame4.setTitle("Remaining Calories");
			frame4.add(label15);
			frame4.setSize(600, 600);
			frame4.setResizable(true);
			frame4.setLayout(new FlowLayout());
			frame4.setVisible(true);
			}
			else if(limit<0)
			{	frame2.setVisible(false);
				frame3.setVisible(false);
				label15 = new JLabel ("End of Calories...Wait for Tomorrow, "+limit);
				label15.setFont(new Font("Calibri", Font.BOLD, 24));
				label15.setForeground(Color.RED);
				label15.setOpaque(true);
				label15.setBackground(Color.WHITE);
				frame4.add(label15);
				frame4.setSize(600, 600);
				frame4.setResizable(true);
				frame4.setLayout(new FlowLayout());
				button8.setBackground(Color.YELLOW);
				frame4.add(button8);
				frame4.setVisible(true);
			}
		}
		if (e.getSource()==button1)
		{
			
			weightt=Double.parseDouble(a.getText());
			hightt=Double.parseDouble(b.getText());
			hightt= hightt/100;
			bmi= weightt / (hightt * hightt);
		//	JOptionPane.showMessageDialog(button1, "BMI is " + bmi);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame1.setLayout(new FlowLayout());
			frame1.setSize(new Dimension(600,600));
			frame.setVisible(false);
			if (bmi<18)
			{
				Catagory=1;
				label11 = new JLabel("You are under weight!!! " + "Your daily calories limit is " + weightt*40 +" calories"); 
				limit=weightt*40;
				label11.setOpaque(true);
				label11.setBackground(Color.YELLOW);
			} else if (bmi>18 && bmi<25)
			{
				Catagory=2;
				label11 = new JLabel("You have Normal weight. "+ "Your daily calories limit is " + weightt*30 +" calories");
				limit=weightt*30;
				label11.setOpaque(true);
				label11.setBackground(Color.GREEN);
			}
			else if (bmi>25)
			{
				Catagory=3;
				label11 = new JLabel("You are Over weight!!!"+ "Your daily calories limit is " + weightt*20 +" calories");
				limit=weightt*20;
				label11.setOpaque(true);
				label11.setBackground(Color.YELLOW);
			}
			label11.setFont(new Font("Calibri", Font.BOLD, 20));
			getForeground();
			label11.setForeground(Color.BLACK);
			
			label12 = new JLabel ("Your BMI is " +bmi);
			label12.setFont(new Font("Calibri", Font.BOLD, 39));
			getForeground();
			label12.setForeground(Color.BLUE);
			
			label13 = new JLabel ("Today Available Calories = "+limit);
			label13.setFont(new Font("Calibri", Font.BOLD, 39));
			getForeground();
			label13.setForeground(Color.YELLOW);
			label13.setOpaque(true);
			label13.setBackground(Color.BLACK);
			
			frame1.setTitle("Calories Limit per Day");
			
			frame1.add(label12);
			frame1.add(label11);
			frame1.add(label13);
			frame1.add(button3);
			frame1.add(button4);
		
			
			frame1.setSize(600, 600);
			frame1.setResizable(false);
			frame1.setLocationRelativeTo(null);
			frame1.setVisible(true);
			
		}
		if (e.getSource()==button2)
		{
			frame.setVisible(false);
			
		}
		
		if (e.getSource()==button3)
		{
			if (Catagory==1)
			{
				frame1.setVisible(false);
				label14 = new JLabel ("Today Available Calories = "+limit);
				label14.setFont(new Font("Calibri", Font.BOLD, 39));
				label14.setForeground(Color.YELLOW);
				label14.setOpaque(true);
				label14.setBackground(Color.BLACK);
				frame2.add(label14);
				frame2.setTitle("Select Food");
				label16 = new JLabel ("          Select Food to Eat; Calories are also Given-----                            ");
				label16.setFont(new Font("Calibri", Font.BOLD, 20));
				label16.setOpaque(true);
				frame2.add(label16);
				
				frame2.add(rb1);
				frame2.add(rb2);
				frame2.add(rb3);
				frame2.add(rb4);
				frame2.add(rb5);
				frame2.add(rb6);
				frame2.add(rb7);
				frame2.add(rb8);
				frame2.add(rb9);
				frame2.add(rb10);
				frame2.add(rb11);
				frame2.add(rb12);
				frame2.add(rb13);
				
				button5.setBackground(Color.GREEN);
				frame2.add(button5);
				
				frame2.setSize(600, 600);
				frame2.setResizable(false);
				frame2.setLayout(new FlowLayout());
				frame2.add(button6);
				frame2.setVisible(true);
			}
			else if (Catagory==2)
			{
				frame1.setVisible(false);
				label14 = new JLabel ("Today Available Calories = "+limit);
				label14.setFont(new Font("Calibri", Font.BOLD, 39));
				label14.setForeground(Color.YELLOW);
				label14.setOpaque(true);
				label14.setBackground(Color.BLACK);
				frame2.add(label14);
				
				label16 = new JLabel ("          Select Food                                                                  ");
				label16.setFont(new Font("Calibri", Font.BOLD, 20));
				label16.setOpaque(true);
				frame2.add(label16);
				
				frame2.add(rb14);
				frame2.add(rb15);
				frame2.add(rb16);
				frame2.add(rb17);
				frame2.add(rb18);
				frame2.add(rb19);
				frame2.add(rb20);
				frame2.add(rb21);
				frame2.add(rb22);
				frame2.add(rb23);
				frame2.add(rb24);
				frame2.add(rb25);
				
				button5.setBackground(Color.GREEN);
				frame2.add(button5);
				
				frame2.setSize(600, 600);
				frame2.setResizable(false);
				frame2.setLocationRelativeTo(null);
				frame2.setLayout(new FlowLayout());
				frame2.add(button6);
				frame2.setVisible(true);
			}
			else if (Catagory==3)
			{
				frame1.setVisible(false);
				label14 = new JLabel ("Today Available Calories = "+limit);
				label14.setFont(new Font("Calibri", Font.BOLD, 39));
				label14.setForeground(Color.YELLOW);
				label14.setOpaque(true);
				label14.setBackground(Color.BLACK);
				frame2.add(label14);
				
				label16 = new JLabel ("          Select Food                                                                  ");
				label16.setFont(new Font("Calibri", Font.BOLD, 20));
				label16.setOpaque(true);
				frame2.add(label16);
				
				frame2.add(rb26);
				frame2.add(rb27);
				frame2.add(rb28);
				frame2.add(rb29);
				frame2.add(rb30);
				frame2.add(rb31);
				frame2.add(rb32);
				frame2.add(rb33);
				frame2.add(rb34);
				frame2.add(rb35);
				frame2.add(rb36);
				frame2.add(rb37);
				frame2.add(rb38);
				frame2.add(rb39);
				frame2.add(rb40);
				frame2.add(rb41);
				
				button5.setBackground(Color.GREEN);
				frame2.add(button5);
				
				frame2.setSize(600, 600);
				frame2.setResizable(false);
				frame2.setLocationRelativeTo(null);
				frame2.setLayout(new FlowLayout());
				frame2.add(button6);
				frame2.setVisible(true);
			}
		}
		if (e.getSource()==button4)
		{
			frame1.setVisible(false);
			label15 = new JLabel ("Today Available Calories = "+limit);
			label15.setFont(new Font("Calibri", Font.BOLD, 39));
			getForeground();
			label15.setForeground(Color.YELLOW);
			label15.setOpaque(true);
			label15.setBackground(Color.BLACK);
			frame3.add(label15);
			
			frame3.add(rb1);
			frame3.add(rb2);
			frame3.add(rb3);
			frame3.add(rb4);
			frame3.add(rb5);
			frame3.add(rb6);
			frame3.add(rb7);
			frame3.add(rb8);
			frame3.add(rb9);
			frame3.add(rb10);
			frame3.add(rb11);
			frame3.add(rb12);
			frame3.add(rb13);
			
			frame3.add(rb14);
			frame3.add(rb15);
			frame3.add(rb16);
			frame3.add(rb17);
			frame3.add(rb18);
			frame3.add(rb19);
			frame3.add(rb20);
			frame3.add(rb21);
			frame3.add(rb22);
			frame3.add(rb23);
			frame3.add(rb24);
			frame3.add(rb25);
			
			frame3.add(rb26);
			frame3.add(rb27);
			frame3.add(rb28);
			frame3.add(rb29);
			frame3.add(rb30);
			frame3.add(rb31);
			frame3.add(rb32);
			frame3.add(rb33);
			frame3.add(rb34);
			frame3.add(rb35);
			frame3.add(rb36);
			frame3.add(rb37);
			frame3.add(rb38);
			frame3.add(rb39);
			frame3.add(rb40);
			frame3.add(rb41);
		
			button5.setBackground(Color.GREEN);
			
			frame3.setSize(600, 600);
			frame3.setResizable(false);
			frame3.setLocationRelativeTo(null);
			frame3.setLayout(new FlowLayout());
			frame3.add(button5);
			frame3.add(button7);
			frame3.setVisible(true);
		}
		
		
	}

}
