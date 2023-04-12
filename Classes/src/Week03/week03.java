package Week03;

import java.util.Arrays;

public class week03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/////first array
int[] ages = new int[8];
ages[0] = 3; 
ages[1] = 9;
ages[2] = 23;
ages[3] = 64;
ages[4] = 8;
ages[5] = 28;
ages[6] = 93;
ages[7] = 12;
int lastMinusFirst =  ages[ages.length - 1] - ages[0];
System.out.println(lastMinusFirst);
 int sum = 0;
 for(int number : ages) {
	 sum += number;
 }
int average = sum / ages.length;
System.out.println(average);

String[] names = new String[6];
names[0] = "Sam";
names[1] = "Tommy";
names[2] = "Tim";
names[3] = "Sally";
names[4] = "Buck";
names[5] = "Bob";
int countedLength = 0;
for(String name : names) {
	countedLength += name.length();
}
  System.out.println(countedLength / names.length);
	for(int i = 0; i < names.length; i++) {
		System.out.println(names[i] + " ");
	}
	int[] nameLengths = new int[names.length];
	for(int i =0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
	} for(int name : nameLengths) {
	System.out.println(name);
	}
	int sums = 0;
	for(int name :nameLengths) {
		sum += name;
	}
	System.out.println(sum);
	
	
	
	
	System.out.println(multiplyString("hello",3 )); 
	
	System.out.println(fullNames("Macy", "Waugh"));
	
	
	double[] doublesTwo = new double[5];
	doublesTwo[0] = 33.3;
	doublesTwo[1] = 44.9;
	doublesTwo[2] = 99.0;
	doublesTwo[3] = 38.3;
	doublesTwo[4] = 43.1;
	
	
	
	double[] doublesOne = new double[4];
	doublesOne[0] = 2.5;
	doublesOne[1] = 55.5;
	doublesOne[2] = 221.5;
	doublesOne[3] = 20.0;
	System.out.println(average);
	System.out.println(willBuyDrink(false, 10.2));
	System.out.println(goodbye("Mace"));
	}
	
	public static String goodbye(String name) {
		return "Goodbye, " + name + "!";
	}
	
	
	
	public static boolean willBuyDrink(boolean isHotoutside, double moneyInMyPocket) {
		int tempOutside = 90;
		boolean isHotOutside = tempOutside >= 99;
		if( moneyInMyPocket > 10.50 && isHotOutside == true) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
	
	public static boolean isAverageBigEnough(int[]ages) {
		int sum = 0;
		for(int age : ages) {
			sum += age;
		} int average = sum / ages.length;
		if(average <= 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean averageOfTwoArrays(double[]doublesOne, double[]doublesTwo) {
		double sumOne = 0;
		double sumTwo = 0;
		 for(double n : doublesOne) {
			 sumOne += n;
		 }
		double averageOne = sumOne / doublesOne.length;
		
		 for(double n : doublesTwo) {
			 sumTwo += n;
		 }
		double averageTwo = sumTwo / doublesTwo.length;
		if(averageOne > averageTwo) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	public static double averageOfDoubles(double[]doublesOne) {
		double sum = 0;
		 for(double n : doublesOne) {
			 sum += n;
		 }
		double average = sum / doublesOne.length;
	return average; 
		}
		
	public static int sumIsGreaterThanH(int[]ages) {
		int sum = 0;
		for(int age : ages) {
			sum += age; }
		return sum;
			
	
	}
	public static String fullNames(String firstName, String lastName) {
	
		String fullName = firstName + " " + lastName;
	return fullName; }
	
public static String multiplyString(String word, int n) {
	String result = "";
	for(int i =0; i < n; i++) {
		result += word;
	}
	return result;
} 
}

