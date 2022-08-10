package Data_Types_Operators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 30;
		int b = 10;

		// int sum =a+b;
		// System.out.println(sum);

		System.out.println("-----------1) Arithmetic Operators -----------> +,-,*, /, %-----------------");

		System.out.println("Sum of a and b is : " + (a + b));// 40

		System.out.println("Diff of a and b is : " + (a - b));// 20

		System.out.println("Mul of a and b is : " + (a * b));// 300

		System.out.println("Div of a and b is : " + (a / b));// 3 (cosent)

		System.out.println("Mod Div of a and b is : " + (a % b));// 0 ( Reminder)

		System.out.println("------2) Relational Operator /Comparision operators :  ==,<,>,<=,>=,!="); // true

		System.out.println(a == b);//false
		System.out.println(a > b);//true

		System.out.println(a < b);//false

		System.out.println(a >= b);// true

		System.out.println(a <= b);//false

		System.out.println(a != b);//true
		
		System.out.println("-----Logical operators  :  && ,|| , !"); // true
		
		boolean x = true;
		boolean y = false;

		System.out.println(x && y);// false

		System.out.println(x || y); // true
		System.out.println(!x);// false
		System.out.println(!y);// true


		System.out.println("-----Increment /decrement operators --->  ++ , --"); // true
		
		int c=10;

		System.out.println(c++); // 10
		System.out.println(c);//11
		
		System.out.println(++c);//12
		
		int d=20;
		System.out.println(d--); //20
		
		System.out.println(d);//19


	}

}
