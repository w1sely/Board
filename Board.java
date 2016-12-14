package prac;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Board {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Battleship");
		frame.setSize(800, 500);
		frame.setLayout(new GridLayout(1, 2));
		frame.add(new LeftField());
		frame.add(new RightField());
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
