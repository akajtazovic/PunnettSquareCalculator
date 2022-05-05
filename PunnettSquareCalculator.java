//imports
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

//PunnettSquareCalculator inheriting from JFrame
public class PunnettSquareCalculator extends JFrame {
//PunnettSquareCalculator Method
	public PunnettSquareCalculator() {
		//setting up the JFrame.
		super("Congratulations!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(250,0);
		JLabel message = new JLabel("Your baby is a brunette!");
		message.setFont(new Font("Verdana",4,40));
		add(message);
		setVisible(true);
		//Closing statment / event.

		addWindowListener (new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				System.out.println("Thank you for using the Punnett Square Calculator!");
			}
		});

	} 
      public void paint(Graphics g) {
      	//Congratulations message.
		super.paint(g);
		int width = getWidth();
		int height = getHeight();
		g.drawString("Congratulations!",240,190);
		g.drawOval(80, 70, 150, 150);
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
        g.drawArc(130, 180, 50, 20, 180, 180);


	}

	//main class

	public static void main(String[] args) {
		System.out.println("*********************************************");
		System.out.println("PUNNETT SQUARE CALCULATOR : BROWN HAIR EDITION");
		System.out.println("*********************************************");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("What is the percentage of your child having brown hair?");
		System.out.println(" ");
		System.out.println("INSTRUCTIONS: ");
		System.out.println("Type in your genotype first, then your partner's.");
		System.out.println(" ");
		System.out.println("*****************************************************************");
		System.out.println(" ");
		System.out.println("Capital B first please, if applicable");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your hair genotype: ");
		String yourgene = sc.nextLine();
		System.out.println("Please enter your partner's hair gene: ");
		String partnergene = sc.nextLine();

		if ((yourgene.equals("Bb")) && (partnergene.equals("Bb"))) {
			System.out.println("75% chance of getting brown hair.");
			PunnettSquareCalculator d = new PunnettSquareCalculator();
		}
		else if ((yourgene.equals("BB")) && (partnergene.equals("BB"))) {
			System.out.println("100% chance of getting brown hair");
			PunnettSquareCalculator dr = new PunnettSquareCalculator();
		}
		else if ((yourgene.equals("Bb")) && (partnergene.equals("BB"))) {
			System.out.println("100% chance of getting brown hair");
			PunnettSquareCalculator d = new PunnettSquareCalculator();
		}
		else if ((yourgene.equals("BB")) && (partnergene.equals("Bb"))) {
			System.out.println("100% chance of getting brown hair");
			PunnettSquareCalculator d = new PunnettSquareCalculator();
		}
		else if ((yourgene.equals("bb")) && (partnergene.equals("bb"))) {
			System.out.println("0% chance of getting brown hair");
			System.out.println("Sorry to report you have no chance of having a brown-haired baby. Bye Bye !");
		}
		else if ((yourgene.equals("Bb")) && (partnergene.equals("bb"))) {
			System.out.println("50% chance of getting brown hair.");
			PunnettSquareCalculator d = new PunnettSquareCalculator();
		}
		else if ((yourgene.equals("bb")) && (partnergene.equals("Bb"))) {
			System.out.println("50% chance of getting brown hair.");
			PunnettSquareCalculator d = new PunnettSquareCalculator();
		} else { 
			System.out.println("Restart the program and try again, there was an error.");
		}

	}
}	