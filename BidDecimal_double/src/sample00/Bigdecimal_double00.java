package sample00;
/*
 double Ÿ���� ���������� ���� ������ �� �������� �ٻ�ġ�� ����
 -> �����ߴ� ���� �ٽ� �������� ǥ���ϸ鼭 ��밪�� �������� ���̰� ����Եȴ�.
 */
public class Bigdecimal_double00 {
	
	public static void main(String[] args) {
		
		double a = 10.0000;
		double b = 3.0000;
		
//		������ : 13.000001999999
		double u = a + b;
		System.out.printf("a + b = %.5f\n", u);
		
//		������ : 6.9999999999999
		double d = a-b;
		System.out.format("a - b = %.5f\n", d);	
		
//		������ : 30.000013000000997
		double x = a*b;
		System.out.println(String.format("a * b = %.5f", x));
		
	}
	
}
