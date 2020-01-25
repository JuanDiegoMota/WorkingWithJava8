package WorkingWithJava8;

import java.util.function.Function;

public class LambdasBasic {
	public static void main(String[] args) {
		
		Function<Integer, Integer> dobleValor = num -> num * 2;
		System.out.println("La funcion dobleValor() para 8 es: " + dobleValor.apply(8));
	}

}
