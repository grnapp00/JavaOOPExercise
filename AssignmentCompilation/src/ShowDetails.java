/*Implementation of abstract method*/

import java.util.Scanner;
public class ShowDetails extends VariablesInit implements Instructions{

	Scanner input = new Scanner(System.in);
	
	//Question 1
	public void DisplayFunc(int firstNum, int secondNum){
		System.out.print("Enter first number: ");
		firstNum = input.nextInt();
		System.out.print("Enter second number: ");
		secondNum = input.nextInt();
		
		System.out.println("\nThe result of adding is " + (firstNum + secondNum));
		System.out.println("The result of subtracting is " + (firstNum - secondNum));
		System.out.println("The result of multiplying is " + (firstNum * secondNum));
		System.out.println("The result of dividing is " + (firstNum / secondNum));
	}
	
	//Question 2
	public void DisplayFunc(double area, double perimeter, double PI, double radius) {
		System.out.print("Enter radius: ");
		radius = input.nextDouble();
		
		perimeter = 2 * PI * radius;
		area = PI * radius * radius;
		
		System.out.printf("Perimeter is %.2f ", perimeter);
		System.out.println("\nArea is " + area);
	}
	
	//Question 3
	public void Rectangle() {
		System.out.print("Enter width of the rectangle: ");
		width = input.nextDouble();
		System.out.print("Enter height of the rectangle: ");
		height = input.nextDouble();
		
		perimeter = 2 * (height + width);
		area = width * height;
		
		System.out.println("\nPerimeter of a Rectangle is: " + perimeter);
		System.out.println("Area of a Rectangle is: " + area);
	}
	
	//Question 4
	public void DisplayFunc(int firstNum, int secondNum, int thirdNum) {
		System.out.print("Enter first number: ");
		firstNum = input.nextInt();
		System.out.print("Enter second number: ");
		secondNum = input.nextInt();
		System.out.print("Enter third number: ");
		thirdNum = input.nextInt();
		
		System.out.println("The average of three numbers is: " + (firstNum + secondNum + thirdNum)/3);
	}
	
	//Question 5
	public void DisplayFunc(int number) {
		System.out.print("Enter number: ");
		number = input.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
	
	//Question 6
	public void DisplayFunc(int quantity, double productPrice, double revenue,
			double discount, double totalDiscount, double finalRevenue) {
		System.out.print("Enter product price: ");
		productPrice = input.nextDouble();
		System.out.print("Enter quantity: ");
		quantity = input.nextInt();
		
		revenue = productPrice * quantity;
		
		if(revenue > 5000) {
			totalDiscount = revenue * discount;
			finalRevenue = revenue - totalDiscount;
			System.out.println("Discount is: " + totalDiscount);
			System.out.println("Net Revenue is: " + finalRevenue);
		}
		else {
			System.out.println("Revenue is: " + revenue);
		}
	}
	
	//Question 7
	public void DisplayFunc() {
		System.out.print("Enter number: ");
		number = input.nextInt();
		
		if(number > 0) {
			System.out.println(number + " is Positive");
		}
		else if(number < 0) {
			System.out.println(number + " is Negative");
		}
		else {
			System.out.println(number + " is Zero");
		}
	}
	
	//Question 8
	public void Grades() {
		System.out.print("Enter grade for first subject: ");
		firstSub = input.nextInt();
		System.out.print("Enter grade for second subject: ");
		secondSub = input.nextInt();
		System.out.print("Enter grade for third subject: ");
		thirdSub = input.nextInt();
		
		average = (firstSub + secondSub + thirdSub)/3;
		System.out.println("Average: " + average);
		
		if(average >= 90 && average <= 100) {
			System.out.println("You are 'A' ");
		}
		else if(average >= 80 && average <= 89) {
			System.out.println("You are 'B' ");
		}
		else if(average >= 70 && average <= 79) {
			System.out.println("You are 'C' ");
		}
		else if(average >= 60 && average <= 69) {
			System.out.println("You are 'D' ");
		}
		else if(average >= 0 && average <= 59) {
			System.out.println("You are 'F' ");
		}
		else {
			System.out.println("Invalid input");
		}
	}
	
	//Question 9
	public void DisplayFunc(String grade) {
		System.out.println("A-D, and F only!");
		System.out.print("Enter grade: ");
		grade = input.next().toUpperCase();
		
		switch(grade) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Average");
			break;
		case "D":
			System.out.println("Deficient");
			break;
		case "F":
			System.out.println("Failing");
			break;
		default:
			System.out.println("Invalid input");
		}
	}
	
	//Question 10
	public void OddNumbers() {
		for(int i = 0; i <= 99; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
