
public class Cadenas_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String nombre="Felipe Froilan de todos los Santos";
//		
//		System.out.println("Mi nombre es " + nombre);
//		
//		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
//		
//		System.out.println("La primera letra de tu nombre es " + nombre.charAt(0));
//		
//		int ultimaletra;
//		ultimaletra=nombre.length();
//		
//		System.out.println("Y la ultima letra es la " + nombre.charAt(ultimaletra-1));
		
		
//		=========================================================================================
		
//		String frase="Hoy es un estupendo dia para aprender a programar en Java";
//		//un subsstring para extrar partes de la cadena
//		
//		String frase_resumen=frase.substring(1, 3); 
//		//El primer parametro indica que quiero empezar a extraer desde la posicion o de Hoy en la frase
//		//El segundo parametro indica el primer caracter que no quiero extraer, en este caso el espacio detras de Hoy en la frase.
//		
//		String frase_resumen1=frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo..." + frase.substring(29, 57);
//		//puedes añadirles concatenaciones
//		
//		System.out.println(frase_resumen);
//		System.out.println(frase_resumen1);
		
//		=========================================================================================
		
		String alumno1, alumno2;
		
		alumno1="David";
		alumno2="david";
		//con minuscula y mayuscula cambia entre True o False
		
		System.out.println(alumno1.equals(alumno2));
		//para comparar 2 cadenas de caracteres.
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		//para comparar ignorando mayusculas, minusculas ( solo compara las letras)
		
		
	}

}
