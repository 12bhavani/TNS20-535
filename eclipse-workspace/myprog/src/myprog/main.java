

package myprog;

import javax.swing.JOptionPane;

public class main {

	public static void main (String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("hi");
		String s = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, s);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
		JOptionPane.showMessageDialog(null, age);
		
	}

}
