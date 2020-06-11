package logical.statement.conditional.statement;

public class CombinedStatement {

	public static void main(String[] args) {
		int num1 = 101;
		int num2 = 20;
		if(num1>num2 && num1 % 2==0) {
			System.out.println(num1 + " is bigger than "+num2+ " And " + num1+" is even");
		}else if(num1>num2 && num1 % 2!=0) {
			System.out.println(num1 + " is bigger than "+num2+ " And " + num1+" is odd");
		}else if(num1==num2 && num1 % 2==0) {
			System.out.println("num2: "+ num2 + " is bigger than num1: "+num1+ " And num2 is odd");
		}

	}

}
