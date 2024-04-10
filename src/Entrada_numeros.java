import javax.swing.*;
public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		double x=10000.0;
//		
//		System.out.printf("%1.2f", x/3);
//		//lo redondea a los dos primeros decimales
//		
//		 ===========================================================================
		
		String num1=JOptionPane.showInputDialog("Introduce un numero");
		//el numero se almacena en una String y lo vamos a pasar a double
		
		double num2=Double.parseDouble(num1);
		
		System.out.println("La raiz de " + num2 + " es");
		
		System.out.printf("%1.4f", Math.sqrt(num2));
		

	}

}
