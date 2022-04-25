//imports
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

//OvalDrawPlus inheriting from JFrame
public class PunnettSquareCalculator extends JFrame {

//initializing constants
static final int RED = 50;
static final int GREEN = 20;
static final int BLUE = 60;

//OvalDrawPlus Method
	public PunnettSquareCalculator() {
		super("Congratulations!");
		//setting close option.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setting size of JPanel
		setSize(500,500);
		//setting location of JPanel
		setLocation(250,0);
		//making JPanel visible
		setVisible(true);

		//setting up closing statement
		//WindowListener - this interface recieves window events aka
		//if the JPanel is exited, open, closed. it will invoke WindowEvent.
		//WindowEvent - this recieves the message that the window closed
		//here, when the window is closed, "Closing OvalDrawPlus..." is executed.
		addWindowListener (new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				System.out.println("We hope you enjoyed (:) ");
			}
		});

	} 
      //setting up graphics/paint
      public void paint(Graphics g) {
		super.paint(g);
		int width = getWidth();
		int height = getHeight();
		// Oval for face outline
        g.drawOval(80, 70, 150, 150);
 
        // Ovals for eyes
        // with black color filled
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
 
        // Arc for the smile
        g.drawArc(130, 180, 50, 20, 180, 180);
	}

	//main class

	public static void main(String[] args) {
		System.out.println("What is the percentage of your child having brown hair?");
		System.out.println("Examples: BB = Both Brown hair genes are dominant. Bb = one gene is dominant, one is negative. bb = both are recessive (meaning blonde hair). ");
		System.out.println("*****************************************************************");
		System.out.println("Capital B first please");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first hair genotype(B or b): ");
		String yourgeneone = sc.nextLine();
		System.out.println("Please enter your second hair gene(B or b): ");
		String yourgenetwo = sc.nextLine();
		System.out.println("Please enter your partner's first hair gene(B or b): ");
		String partnergeneone = sc.nextLine();
		System.out.println("Please enter your patner's second hair gene(B or b): ");
		String partnergenetwo = sc.nextLine();

		if (yourgeneone == "B" & yourgenetwo == "b" && partnergeneone == "B" & partnergenetwo == "b") {
			System.out.println("Your child has a 75% chance of having brown hair.");
			PunnettSquareCalculator dr = new PunnettSquareCalculator();
		} 
		else if (yourgeneone == "B" && yourgenetwo == "B" && partnergeneone == "B" && partnergenetwo == "b") {
			System.out.println("Your child has a 100% chance of developing brown hair.");
			PunnettSquareCalculator dr = new PunnettSquareCalculator();
		}
		else if (yourgeneone == "B" && yourgenetwo == "B" && partnergeneone == "B" && partnergenetwo == "B") {
			System.out.println("Your child has a 100% chance of developing brown hair");
			PunnettSquareCalculator dr = new PunnettSquareCalculator();
		}
		else if (yourgeneone == "b" && yourgenetwo == "b" && partnergeneone == "b" && partnergenetwo == "b") {
			System.out.println("Your child has no chance of developing brown hair");
		}
		else if (yourgeneone == "B" && yourgenetwo == "b" && partnergeneone == "B" && partnergenetwo == "B") {
			System.out.println("Your child has a 100% chance of developing brown hair.");
			PunnettSquareCalculator dr = new PunnettSquareCalculator();
		}
		else if (yourgeneone == "b" && yourgenetwo == "b" && partnergeneone == "B" && partnergenetwo == "b") {
			System.out.println("Your child has a 50% chance of developing brown hair.");
			OvalDrawPlus drawin = new OvalDrawPlus();
		}
		else if (yourgeneone == "B" && yourgenetwo == "b" && partnergeneone == "b" && partnergenetwo == "b") {
			System.out.println("This child has a 50% chance of developing brown hair.");
			PunnettSquareCalculator dr = new PunnettSquareCalculator();
		} else {
			System.out.println("Error. Please try again.");
		}

		//OvalDrawPlus draw = new OvalDrawPlus();
	}
}	