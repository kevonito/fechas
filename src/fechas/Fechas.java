package fechas;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String fecha;
		String fechas[];
		String [] parte = new String [3];
		

		do {
			System.out.println("Introduzca una fecha");
			fecha = sc.next();

			if (fecha.contains("/")) {
				fechas = fecha.split("/");

			} else if (fecha.contains("-")) {
				fechas = fecha.split("-");
			} else {
				fechas = new String[3];
				System.out.println("fecha incorrecta");
			}
		} while (fechas[0] == null);

		
		for (int i = 0; i < fechas.length; i++) {
			parte[i] = fechas[i];
		}
		
		
		
		
		int dia = Integer.parseInt(parte[0]);
		int mes = Integer.parseInt(parte[1]);
		int año = Integer.parseInt(parte[2]);
		
		if (año % 4 == 0 && mes == 2 && dia > 0 && dia <= 29) {
			System.out.println("Fecha correcta");
		
		}else if (mes == 1 && dia <= 31 && dia > 0) {
			System.out.println("Fecha correcta");
		}else if (mes == 2 && dia <= 28 && dia > 0) {
			System.out.println("Fecha correcta");
		}else if (mes == 3 && dia <= 31 && dia > 0) {
			System.out.println("Fecha correcta");
		}else if (mes == 4 && dia <= 30 && dia > 0) {
			System.out.println("Fecha correcta");
		}else if (mes == 5 && dia <= 31 && dia > 0) {
			System.out.println("Fecha correcta");
		}else if (mes == 6 && dia <= 30 && dia > 0) {
			System.out.println("Fecha correcta");
		}else if (mes == 7 && dia <= 31 && dia > 0) {
			System.out.println("Fecha correcta");
		}else if (mes == 8 && dia <= 31 && dia > 0) {
			System.out.println("Fecha correcta");
		}else if (mes == 9 && dia <= 30 && dia > 0) {
			System.out.println("Fecha correcta");
		}else if (mes == 10 && dia <= 31 && dia > 0) {
			System.out.println("Fecha correcta");
		}else if (mes == 11 && dia <= 30 && dia > 0) {
			System.out.println("Fecha correcta");
		}else if (mes == 12 && dia <= 31 && dia > 0) {
			System.out.println("Fecha correcta");
		}else {
			System.out.println("Fecha incorrecta");
		}

	}
}
