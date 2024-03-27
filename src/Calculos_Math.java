
public class Calculos_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//math.sqrt(n) raiz cuadrada de un numero es double
		//math.pow (base, exponente) potencia numeros, base + exponente de un doble
		//math.sin(angulo)
		//math.cos (angulo)
		//math.tan(angulo)
		//math.atan(angulo)
		//math.round(decimal) redondeo de un numero
		//math.Pi constante de clase con numero PI
		//int raiz=(int)math.round(num1); refundicion, para convertir un tipo de dato en otro
		
		
//		===============================================================
		
		//double raiz=Math.sqrt(9);
		
		//System.out.println(raiz);
		
//		===============================================================
//		
//		double num1=5.85;
//		
//		int resultado=(int)Math.round(num1);
//		//con refundicion pasando un long a int
//		
//		System.out.println(resultado);
//		
//		===============================================================
		
		double base=5;
		double exponente=3;
		
		int resultado=(int)Math.pow(base, exponente);
		
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es = " +resultado);
		
	}

}
