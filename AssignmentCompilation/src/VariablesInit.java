/*Variables and abstract method initialization*/
abstract class VariablesInit {
	public int firstNum = 0,
			   secondNum = 0,
			   thirdNum = 0,
			   number = 0,
			   quantity = 0,
			   firstSub = 0,
			   secondSub = 0,
			   thirdSub = 0,
			   answer = 0;
	public double area = 0,
			 	  radius = 0,
				  perimeter = 0,
				  width = 0,
				  height = 0,
				  productPrice = 0,
				  revenue = 0,
				  discount = .10,
				  totalDiscount = 0,
				  finalRevenue = 0,
				  average = 0;
	public final double PI = 3.14;
	public String grade = "",
			      choice = "";
	
	
	public abstract void DisplayFunc(int number);
	public abstract void Rectangle();
	public abstract void Grades();
	public abstract void OddNumbers();

	
}
