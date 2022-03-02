/*Main method of the program*/

import java.util.Scanner;
public class Assignments {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ShowDetails show = new ShowDetails();
		
		try {
			do {
				System.out.print("Choose a problem from 1-10: ");
				show.answer = input.nextInt();
		
				switch(show.answer) {
				case 1:
					System.out.println(Instructions.questionOne);
					show.DisplayFunc(show.firstNum, show.secondNum);
					break;
				case 2: 
					System.out.println(Instructions.questionTwo);
					show.DisplayFunc(show.area, show.perimeter, show.PI, show.radius);
					break;
				case 3: 
					System.out.println(Instructions.questionThree);
					show.Rectangle();
					break;
				case 4:
					System.out.println(Instructions.questionFour);
					show.DisplayFunc(show.firstNum, show.secondNum, show.thirdNum);
					break;
				case 5:
					System.out.println(Instructions.questionFive);
					show.DisplayFunc(show.number);
					break;
				case 6: 
					System.out.println(Instructions.questionSix);
					show.DisplayFunc(show.quantity, show.productPrice, show.revenue, show.discount, 
					         		 show.totalDiscount, show.finalRevenue);
					break;
				case 7: 
					System.out.println(Instructions.questionSeven);
					show.DisplayFunc();
					break;
				case 8:
					System.out.println(Instructions.questionEight);
					show.Grades();
					break;
				case 9:
					System.out.println(Instructions.questionNine);
					show.DisplayFunc(show.grade);
					break;
				case 10: 
					System.out.println(Instructions.questionTen);
				show.OddNumbers();
				break;
				default: 
					System.out.println("Input must be numbers 1-10 only!");
					System.exit(0);
				}
					System.out.println("Choose a different program? Y/N");
					show.choice = input.next();
				}while(show.choice.equals("Y")|| show.choice.equals("y"));
			}catch(Exception e) {
			System.out.println("Oops! Something went wrong.");
		}
	input.close();
	}

}
