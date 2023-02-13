package git_eclipse;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PersonaAPP_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		sc.useLocale(Locale.US);

		//Introducimos los datos
		System.out.println("Introduce el nombre");
		String nombre = sc.next();
		System.out.println("Introduce la edad");
		int edad = sc.nextInt();
		System.out.println("Introduce el sexo");
		char sexo = sc.next().charAt(0);
		System.out.println("Introduce el peso");
		double peso = sc.nextDouble();
		System.out.println("Introduce la altura");
		double altura = sc.nextDouble();
		Persona persona1 = new Persona();
		Persona persona2 = new Persona(nombre, edad, sexo);
		Persona persona3 = new Persona(nombre, edad, sexo, peso,
				altura);
		persona1.setNombre("Laura");
		persona1.setEdad(30);
		persona1.setSexo('M');
		persona1.setPeso(60);
		persona1.setAltura(1.60);
		persona2.setPeso(90.5);
		persona2.setAltura(1.80);
		System.out.println("Persona1");
		MuestraMensajePeso(persona1);
		System.out.println(persona1.toString());
		System.out.println("Persona2");
		MuestraMensajePeso(persona2);
		System.out.println(persona2.toString());
		boolean mayorDeEdad = persona1.esMayorDeEdad();
		if(mayorDeEdad == true)
			System.out.println("el usuario es mayor de edad");
		else
			System.out.println("el usuario es menor de edad");
		

		System.out.println("Persona3");
		MuestraMensajePeso(persona3);
		System.out.println(persona3.toString());
		
		System.out.println("persona 3 es mayor de edad=" + persona3.esMayorDeEdad());
		
	}
	public static void MuestraMensajePeso(Persona p) {
		int IMC = p.calcularIMC();
		switch (IMC) {
		case Persona.PESO_IDEAL:
			System.out.println("La persona esta en su pesoideal");

			break;
		case Persona.INFRAPESO:
			System.out.println("La persona esta por debajo de supeso ideal");

			break;
		case Persona.SOBREPESO:
			System.out.println("La persona esta por encima de supeso ideal");

			break;
		}
	}
}

