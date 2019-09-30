package sample00;

import java.math.BigDecimal;

public class BigDecimal_double03 {
	public static void main(String[] args) {
		
		BigDecimal a = new BigDecimal("2.01");
		BigDecimal b = new BigDecimal("2.010");
		
//		BigDecimal은 Object이다. -> == 으로 비교할 시 false 결과가 나온다.
		boolean comp = (a == b);		
		System.out.println(comp);
		
//		.equals()는 소수점의 맨 끝자리까지 동일해야 true 반환한다.
		System.out.println(a.equals(b));
		
//		compareTo()로 값을 비교하면, 
//		소수점 끝자리의 0 무시하고 동일하면 0, 적으면 -1, 많으면 1을 반환한다.
		int result = a.compareTo(b);
		
		String str = "";
		if (result == 0)
			str = "같다";
		else if (result == -1)
			str = "적다.";
		else 
			str = "많다.";		
		System.out.println(result + " : " + str);
	}
}
