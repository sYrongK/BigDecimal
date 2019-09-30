package sample00;

/*
 BigDecimal의 사칙연산
 */
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimal_double04 {
	public static void main(String[] args) {
		
		BigDecimal a = new BigDecimal("8");
		BigDecimal b = new BigDecimal("7");
		
//		더하기
		BigDecimal result = a.add(b);
		System.out.println("더하기 : " + result);
		
//		빼기
		result = a.subtract(b);
		System.out.println("빼기 : " + result);
		
//		곱하기
		result = a.multiply(b);
		System.out.println("곱하기 : " + result);
		
//		나누기 1. 
//		result = a.divide(b);
//		System.out.println("나누기1 : " + result);  -> 1.142857...
		
//		나누기 2.
		result = a.divide(b, 3, RoundingMode.HALF_EVEN);
		System.out.println("나누기2 : " + result);
		
//		나누기 3. 
//		나누기 후 나머지를 반환한다. 전체 자리수를 34개로 제한
		result = a.remainder(b, MathContext.DECIMAL128);
		System.out.println("나누기3 : " + result);
		
//		절대값
		System.out.println("절대값 : " + new BigDecimal("-3").abs());
		
//		최소값
		result = a.min(b);
		System.out.println("최소값 : " + result);
		
//		최대값
		result = a.max(b);
		System.out.println("최대값 : " + result);
		
	}
}
