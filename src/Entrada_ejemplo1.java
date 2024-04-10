import java.util.Scanner;
import javax.swing.*;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Scanner entrada=new Scanner(System.in);
//		
//		System.out.println("Introduce tu nombre, por favor");
//		
//		String nombreusuario=entrada.nextLine();
//		//para almacenar una clase string en la variable
//		
//		System.out.println("Introduce edad, por favor");
//		
//		int edad=entrada.nextInt();
//		//para almacenar un nomero entero en la variable
//		
//		System.out.println("Hola, " + nombreusuario + " el año que viene tendras " + (edad+1) + " años,");
		
//		===================================================================================================
		
		String nombreusuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		int edadusuario=Integer.parseInt(edad);
		//transforma la String en un int
		
		System.out.println("Hola " + nombreusuario + ", tendras " + (edadusuario+1) + " años");
		// Hola Ivan, tendras 311 años
		//la edad +1 lo considera texto porque es una String y no esta almacenado en un int, tienes que transformar el String a valor int con un parseInt
		
	}

}
