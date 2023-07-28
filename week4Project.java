package week4Project;

public class week4Project {

	public static void main(String[] args) {
//array of int subtract first element from last element
		
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93}; // 1 creating a new array of int
		int firstNum = ages[ages[0]];
		int lastNum = ages[ages.length - 1];
        int result = lastNum - firstNum;
        System.out.println(result);
        int[] ages2 = new int [] {1, 7, 3, 8, 15, 30, 40, 90, 100};
           int firstNum2 = ages2[ages2[0]]; // 3 first element in array always
           int lastNum2 = ages2[ages2.length - 1]; // 4 last element in the array always
           int result2 = lastNum2 - firstNum2; //last element minus first element
           System.out.println(result2); //print the new int result with a different array
           // This will work with any length of array and could be used in a method as well to make it easier.
           
         //2 created a new array of String with the strings provided
          String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
          int sum = 0;
          for(int i = 0; i < names.length; i++) { //a this is the total number of chars / indexs in all strings
            sum += names[i].length();  //
          }
          int average = sum / names.length;
          System.out.println(average);
          String concat ="";
          for(String name: names) //b for each name in names array print each name to the console with a space in between
              concat = concat + " " + name;
          System.out.println(concat);
         int[] nameLengths = new int[names.length];
          for (int i = 0; i < names.length; i++) { //5 this is what populates the namelength array getting the length of 
        	  nameLengths[i] = names[i].length(); //each string in the names array and declaring it in the namelength array
        	  for (int name1 : nameLengths) {
        		  System.out.println(name1); //for each int in name lengths array print to console
        	  }
        	  int nameSum = 0;
        	 for(int n = 0;n < nameLengths.length; n++) { //6 this is a basic for loop that iterates over the namelengths 
        		 nameSum += nameLengths[n];               //and gives the sum of all the namelengths
        	 }
        	  System.out.println(nameSum); //print the name lengths sum
          }   	 
 
          // method testing
          int[] bigArray = new int[] {1, 2, 3};
          double[] doubArray = new double[] {1.0, 20.0, 50.0};
          double[] doubArray2 = new double[] {2.0, 50.0, 70.0};
          System.out.println(isGreaterThan(bigArray));
          System.out.println(fullName("Josh", "Arseneaux"));
      	System.out.println(stringRepeat("String", 3));
      	System.out.println(averageOfArray(doubArray));
      	System.out.println(biggerAverage(doubArray, doubArray2));
      	double moneyInPocket = 10.51;
      	boolean isHotOutside = true;
      	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
      
      	
      	
      	
	}
        
          
          
          
         
	
	
          
        
        
	
	
	
		// TODO Auto-generated method stub

	
	
	public static String stringRepeat(String s, int n) { //7 method that duplicates a string n amount of times
		String result = "";
		for (int i = 0; i < n; i++) {
		    result = result + s;
		} return result;
	}
	
	public static String fullName (String firstName, String lastName) { //8 method that concatenates two strings together
		 String fullName = firstName + " " + lastName;
				 return fullName;
	}
	public static boolean isGreaterThan(int[] arr) { //9 method that sums an array and checks if sum is greater than 100
		int sum = 0;

		for (int i : arr)
		    sum += i;
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
		}
	public static double averageOfArray(double[]arr) { //10 method that gives the average of an array
		
        double sum = 0.0;

        for (double num: arr) {
           sum += num;
        }

        double average = sum / arr.length;
        return average;
	} 
	public static boolean biggerAverage(double[]arr, double[]arr2) { //11 method that takes two arrays and checks which has
		 double sum = 0.0; //a bigger average

	        for (double num: arr) {
	           sum += num;
	        }

	        double average = sum / arr.length;
	        double sum2 = 0.0;

	        for (double num2: arr2) {
	           sum2 += num2;
	        }

	        double average2 = sum2 / arr2.length;
	        if (average > average2) {
	        	return true;
	        } else return false;
	}
	
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { //12 checks if isHoutOutside = true
		if (isHotOutside == true && moneyInPocket >= 10.50) { //and if moneyInPocket greater than 10.50 and returns true 
			return true; //or false
		} else {
			return false;
		}
	}

}
