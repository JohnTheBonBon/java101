/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101;

import javax.swing.JOptionPane;

/**
 *
 * @author Aidan
 */
public class Java101
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		areYouOlderThan18();
		//GreaterThanExample();
		//MathGuessExample(args);
	}

	public static void GreaterThanExample()
	{
		System.out.println("GreaterThanExample");
	}

	public static void areYouOlderThan18()
	{
		String ageInput = JOptionPane.showInputDialog("What age are u ");
		int age = Integer.parseInt(ageInput);
		if (age > 18)
		{
			System.err.println("you can vote, depends what country..");
		}
		else if(age == 18)
		{
			System.out.println("do somethig");
		}
			else {
			System.out.println("stay in school");
		}
		
	}
	

	public static void MathGuessExample(String[] args)
	{
		System.out.print("Hello");
		String questionString = "Your name?";
		System.out.println(questionString);
		String name = JOptionPane.showInputDialog(questionString);

		System.out.println("hello " + name + " is my name");

		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter a number");

		String answerinput1 = JOptionPane.showInputDialog("Enter the multiplication answer");
		int guessanswer = Integer.parseInt(answerinput1);
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);

		int sum;
		sum = number1 * number2;

		if (guessanswer == sum)
		{
			System.out.println("you guessed correctly");
		} else
		{
			System.out.println("you got that wrong" + guessanswer + " is wrong. " + sum + " Is the right answer.");
		}
		System.out.println(sum);
		System.out.println(number1 + " * " + number2 + " = " + sum);
		int ans = add(64, 5);
		int ans1 = add2(5, 5);
		System.out.println(ans);
	}

	public static int add(int number1, int number2)
	{

		return number1 + number2;
	}

	public static int add2(int number3, int number4)
	{
		return number3 * number4;
	}
}

// TODO code application logic here

