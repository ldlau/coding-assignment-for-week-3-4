
public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]ages = {3, 9, 23, 64, 2, 8, 28, 93, 84};
		
		System.out.println(ages[ages.length - 1] -ages[0]);
		
		
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		System.out.println(names[1].length());
		int sum = 0;
		for(int age : ages) {
			sum += age;
		}	
		System.out.println(sum/ages.length);
	
		int sumOfLetters = 0;
		for(int i =0; i<names.length; i ++) {
			sumOfLetters += names[i].length();
			}
			System.out.println(sumOfLetters/names.length);
		
		String result = "";
		for(String name : names) {
			result += name + " ";
		}
		System.out.println(result);
		
		System.out.println(names[names.length -1]);
		System.out.println(names[0]);
		
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i ++) {
			nameLengths[i] = names[i].length();
		}
		for(int x : nameLengths) {
			System.out.println(x);
		}
		
	
		int sumOfElements = 0;
		for(int i = 0; i < nameLengths.length; i ++) {
			sumOfElements += nameLengths[i];
		}
		System.out.println(sumOfElements);
		
		System.out.println(multiplyString("hello", 4));
		System.out.println(fullName("Leslie","Lau"));
		System.out.println(isSumGreaterThan100(ages));
		
		double[] numbers = {10, 25, 80, 64};
		System.out.println(getAverage(numbers));
		
		double[] numbersTwo = {4, 6, 19, 7};
		System.out.println(isFirstAverageLarger(numbers, numbersTwo));
		
		boolean isHotOutside = true;
		double moneyInPocket = 12;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		double [] monthlyExpenses = {700.00, 129.02, 210.00, 83.90, 1500.00};
		System.out.println(monthlyExpensesTotal(monthlyExpenses));
		
		
	}	
	public static String multiplyString(String word, int n) {
		String result = "";
		for(int i = 0; i < n; i ++) {
			result += word;
		}
			return result;
	}
	
	public static String fullName(String first, String last) {
		String fullName = first + " " + last;
		return fullName;
	}
	
	public static boolean isSumGreaterThan100(int[] array) {
		int sum = 0;
		for(int number : array) {
			sum += number;
		}
		return sum > 100;
	}
	
	public static double getAverage(double [] numbers) {
		double sum = 0;
		for(double i : numbers) {
			sum += i;
		}
		return sum/numbers.length;
	}
	
	public static boolean isFirstAverageLarger(double[] firstarray, double[] secondarray) {
		double sum1 = 0;
		double sum2 = 0;
		for(double number : firstarray) {
			sum1 += number;
		}
		for(double number : secondarray) {
			sum2 += number;
		}
		return sum1/firstarray.length > sum2/secondarray.length;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside = true && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}
	}
	
	//I am making an array of monthly expenses and a method to get the sum of those expenses as expenses are added or subtracted
	
	public static double monthlyExpensesTotal(double [] array) {
		double sum = 0;
		for(double expense : array) {
			sum += expense;
		}
		return sum;
	}
	
}


