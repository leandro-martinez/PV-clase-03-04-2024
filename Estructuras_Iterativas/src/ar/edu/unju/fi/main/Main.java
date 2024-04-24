package ar.edu.unju.fi.main;

import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.Registro_Nota;

public class Main {
	public static void main(String[] args) {
		//feature test
		 Alumno alumno = crearAlumno();
		 registrarNotas(alumno,2);		
		 
		System.out.println(alumno);
		
	}
	public static Alumno crearAlumno() {
		// inicializamos un nuevo objeto "alumno"
		Alumno alumno = new Alumno();
		
		// scanner permite ingresar datos desde la terminal
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
		//nextInt pasa de String a Integer
		
		System.out.println("Ingrese su nombre: ");
		String nombre = scanner.next();
		
		System.out.println("Ingrese su apellido: ");
		String apellido = scanner.next();
		
		// seteamos los valores ingresados al objeto alumno
		alumno.setLegajo(legajo);
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
		
		// retornamos alumno para ser utilizado en otras funciones
		return alumno;
	}
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner scanner = new Scanner(System.in);
		
		while(numMaterias <= 2) {
			System.out.println("Ingrese el codigo de la materia: ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el codigo del registro de nota: ");
			String codigoNote = scanner.next();
			System.out.println("Ingrese la nota final: ");
			Float nota = scanner.nextFloat();
			
			Registro_Nota registroNota = new Registro_Nota(codigoNote,alumno,materia,nota);
			
			System.out.println(registroNota.toString());
			numMaterias++;
		}
		scanner.close();
	}
}
