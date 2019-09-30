package sample00;
/*
 double 타입은 내부적으로 수를 저장할 때 이진수의 근사치를 저장
 -> 저장했던 수를 다시 십진수로 표현하면서 기대값과 실제값에 차이가 생기게된다.
 */
public class Bigdecimal_double00 {
	
	public static void main(String[] args) {
		
		double a = 10.0000;
		double b = 3.0000;
		
//		실제값 : 13.000001999999
		double u = a + b;
		System.out.printf("a + b = %.5f\n", u);
		
//		실제값 : 6.9999999999999
		double d = a-b;
		System.out.format("a - b = %.5f\n", d);	
		
//		실제값 : 30.000013000000997
		double x = a*b;
		System.out.println(String.format("a * b = %.5f", x));
		
	}
	
}
