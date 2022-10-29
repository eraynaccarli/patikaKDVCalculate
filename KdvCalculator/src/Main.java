import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter price: ");
		int input = sc.nextInt();
		double newPrice = input + calculate(input);
		System.out.println("Price:  " + input +"\n" + 
							"New Price: " + newPrice + "\n" +  
						 " Added KDV Price:" + calculate(input));
		
		
	}
	
	public static double calculate(double price) {
		if(price <= 1000) {
			price =  price * 0.18;
			return price;
		}
		else {
			price = price * 0.8;
			return price;
		}
	}
	
	

}
