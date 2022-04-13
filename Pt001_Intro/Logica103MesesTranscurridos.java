/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "MESESTRANSCURRIDOS.java."

import java.io.*;

public class mesestranscurridos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double agniofinal;
		double agnioinicio;
		double meses;
		
		System.out.println("Digite el año de inicio: ");
		agnioinicio = Double.parseDouble(bufEntrada.readLine());
		
		System.out.println("Digite el año final: ");
		agniofinal = Double.parseDouble(bufEntrada.readLine());
		
		meses = (agniofinal-agnioinicio)*12;
		
		System.out.println("La cantidad de meses transcurridos entre "+agnioinicio+" y "+agniofinal+" es "+meses+" meses.");
	}


}

