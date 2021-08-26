package model;

public final class AlgorithmsRecursive {
	
	public static long calcFactorial(long n) {
		if(n == 1|| n ==0) {
			return 1;
		}return n * calcFactorial(n-1);
	}
	
	public static int calcSumatoria (int n) {
		if(n == 1 ) {
		return 1;
		}return n +calcSumatoria(n -1);
	}
	
	public static int calcFibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}return calcFibonacci(n-1) + calcFibonacci(n-2);
	}
	
	public static int calcDiv(int dividendo, int divisor) {
		if(dividendo - divisor <= 1) {
			return 1;
		}return 1 + calcDiv(dividendo - divisor, divisor);
	}
	
	public static boolean isCousing(int n) {
		int cont = 2;
		boolean cousing = true;
		while( cont <= n /2 && cousing ) {
			cousing =! (n% cont++ == 0);
		}
		return cousing;
	}
	
	
	
	public static long CuentaCifras(long numero){
		if (numero < 10) {
			return 1;
		}else {
		return 1 + CuentaCifras(numero/10);
		}
	}

	
	
	
	
	
	
	
	
	
}
