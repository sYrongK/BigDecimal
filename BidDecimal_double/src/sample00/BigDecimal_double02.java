package sample00;
/*
 �Ҽ��� BigDecimal Ÿ���� �ʱ�ȭ�� ���� ���ڿ� ���·� �����ڿ� �����ϴ� ����� �������̴�.
 doubleŸ���� �״�� ����ϸ� ������ doubleŸ���� �������� ���̸� ���°Ͱ� ���� ����� ���´�.
 */
import java.math.BigDecimal;

public class BigDecimal_double02 {
	public static void main(String[] args) {
		
//		doubleŸ�� �״�� ����� ��� ��밪�� ���̳���.
		System.out.println(new BigDecimal(0.01));
		
//		���ڿ��� �ʱ�ȭ 1.
		System.out.println(new BigDecimal("0.01"));
		
//		���ڿ��� �ʱ�ȭ 2.
		System.out.println(BigDecimal.valueOf(0.01));
	}
}
