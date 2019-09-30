package sample00;

import java.math.BigDecimal;

public class BigDecimal_double03 {
	public static void main(String[] args) {
		
		BigDecimal a = new BigDecimal("2.01");
		BigDecimal b = new BigDecimal("2.010");
		
//		BigDecimal�� Object�̴�. -> == ���� ���� �� false ����� ���´�.
		boolean comp = (a == b);		
		System.out.println(comp);
		
//		.equals()�� �Ҽ����� �� ���ڸ����� �����ؾ� true ��ȯ�Ѵ�.
		System.out.println(a.equals(b));
		
//		compareTo()�� ���� ���ϸ�, 
//		�Ҽ��� ���ڸ��� 0 �����ϰ� �����ϸ� 0, ������ -1, ������ 1�� ��ȯ�Ѵ�.
		int result = a.compareTo(b);
		
		String str = "";
		if (result == 0)
			str = "����";
		else if (result == -1)
			str = "����.";
		else 
			str = "����.";		
		System.out.println(result + " : " + str);
	}
}
