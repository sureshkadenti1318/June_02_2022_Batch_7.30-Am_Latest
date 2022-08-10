package String_Functions;

public class String_Functions_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Selenium Java";
		String str_2 = "Test";

		int lngth = str.length();// returns length of the string

		System.out.println(lngth);

		String conctedstring = str.concat(str_2);// Join the string

		System.out.println(conctedstring);

		System.out.println(str);

		String s = str.trim();// Remove the spaces

		System.out.println(s);

		char c = str_2.charAt(3);// t----print charctr psnt at perticular position

		System.out.println(c);

		boolean flag = str.contains("Sel");// true----------it will search for the chartrs provided in the perticular
											// string ,if it found returns true else flase

		System.out.println(flag);

		boolean flag2 = str.equals("selenium");// it will compare two given strings both are same returns true else
												// false

		System.out.println(flag2);// false

		boolean flag3 = str.equalsIgnoreCase("selenium"); // it will ignore case sensitivity

		System.out.println(flag3);// true
//String str=	"Selenium Java";
		String replc = str.replace("Selenium", "QTP"); // QTP Java

		System.out.println(replc);//

		String replc_char = str.replace('S', 'K');

		System.out.println(replc_char);

		String lwrcase = str.toLowerCase();

		System.out.println(lwrcase);

		String uprcase = str.toUpperCase();

		System.out.println(uprcase);

	}

}
