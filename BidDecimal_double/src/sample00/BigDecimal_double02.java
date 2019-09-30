package sample00;
/*
 소수로 BigDecimal 타입을 초기화할 때는 문자열 형태로 생성자에 전달하는 방법이 안정적이다.
 double타입을 그대로 사용하면 기존의 double타입이 실제값과 차이를 갖는것과 같은 결과가 나온다.
 */
import java.math.BigDecimal;

public class BigDecimal_double02 {
	public static void main(String[] args) {
		
//		double타입 그대로 사용할 경우 기대값과 차이난다.
		System.out.println(new BigDecimal(0.01));
		
//		문자열로 초기화 1.
		System.out.println(new BigDecimal("0.01"));
		
//		문자열로 초기화 2.
		System.out.println(BigDecimal.valueOf(0.01));
	}
}
