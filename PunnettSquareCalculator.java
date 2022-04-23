//imports
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Scanner;

//OvalDrawPlus inheriting from JFrame
public class PunnettSquareCalculator extends JFrame {

//initializing constants
static final int RED = 50;
static final int GREEN = 20;
static final int BLUE = 60;

//OvalDrawPlus Method
	public OvalDrawPlus() {
		super("OvalDrawPlus");
		//setting close option.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setting size of JPanel
		setSize(500,400);
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
				System.out.println("Closing OvalDrawPlus... ");
			}
		});

	} 
      //setting up graphics/paint
      public void paint(Graphics g) {
		super.paint(g);
		int width = getWidth();
		int height = getHeight();

		//drawing dark blue rectangle, then purple oval
		g.drawRect(0,3,width,height);
		//.darker() makes the blue color darker.
		g.setColor(Color.BLUE.darker());
		//filling dark blue color in rectangle
		g.fillRect(0,3,width,height);
		//drawing oval
		g.drawOval(0,3,width,height);


		//creating purple color with RGB
		Color NewColor = new Color(RED,GREEN,BLUE);
		g.setColor(NewColor);

		//filling oval
		g.fillOval(0,3,width,height);
	}

	//main class

	public static void main(String[] args) {
		System.out.println("What is the percentage of your child having brown hair?");
		System.out.println("Examples: BB = Both Brown hair genes are dominant. Bb = one gene is dominant, one is negative. bb = both are recessive (meaning blonde hair). ");
		System.out.println("*****************************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first hair genotype(B or b): ");
		String yourgeneone = sc.nextLine();
		System.out.println("Please enter your second hair gene(B or b): ");
		String yourgenetwo = sc.nextLine();
		System.out.println("Please enter your partner's first hair gene(B or b): ");
		String partnergeneone = sc.nextLine();
		System.out.println("Please enter your patner's second hair gene(B or b): ");
		String partnergenetwo = sc.nextLine();
		if (yourgeneone = "B" || yourgenetwo = "b" && partnergeneone = "B"

		OvalDrawPlus draw = new OvalDrawPlus();
	}
}