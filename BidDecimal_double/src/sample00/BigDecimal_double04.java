package sample00;

/*
 BigDecimal�� ��Ģ����
 */
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimal_double04 {
	public static void main(String[] args) {
		
		BigDecimal a = new BigDecimal("8");
		BigDecimal b = new BigDecimal("7");
		
//		���ϱ�
		BigDecimal result = a.add(b);
		System.out.println("���ϱ� : " + result);
		
//		����
		result = a.subtract(b);
		System.out.println("���� : " + result);
		
//		���ϱ�
		result = a.multiply(b);
		System.out.println("���ϱ� : " + result);
		
//		������ 1. 
//		result = a.divide(b);
//		System.out.println("������1 : " + result);  -> 1.142857...
		
//		������ 2.
		result = a.divide(b, 3, RoundingMode.HALF_EVEN);
		System.out.println("������2 : " + result);
		
//		������ 3. 
//		������ �� �������� ��ȯ�Ѵ�. ��ü �ڸ����� 34���� ����
		result = a.remainder(b, MathContext.DECIMAL128);
		System.out.println("������3 : " + result);
		
//		���밪
		System.out.println("���밪 : " + new BigDecimal("-3").abs());
		
//		�ּҰ�
		result = a.min(b);
		System.out.println("�ּҰ� : " + result);
		
//		�ִ밪
		result = a.max(b);
		System.out.println("�ִ밪 : " + result);
		
	}
}
