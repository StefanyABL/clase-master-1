import java.util.Scanner;

public class ClassFeb23_18 {
	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
//		byte b = 0b1010;  //base 2-ob cantidad en binario 
//		short  o = 0352; //base 8
//		int x = 0xff;//base 16
//		int n = 46_360_872; // organizar para tener lectura  mejor de la cantidad 
		//		String c1 = new String ("UPTC"); // c1 contiene direccion de memoria diferente (puede ser por new; por que se crea un objeto y ocupa espacio de memoria), para comparar cadenas de caracteres es equals 
		//		String c2 =  new String  ("UPTC");
		//		System.out.println(c1.equals(c2)?"IGUALES": "DIFERENTES");
		//		byte y =(byte) 349;
		//		byte y = 69;
		//		byte z = (byte) (y>>2);
		//		long  p= 12345678901l;// l significa long
		//		float f = 3480.18f;// significa float
		//		byte c = (byte) (y<<3);
		//		System.out.println(z+"\t"+c);
		double pi = Math.PI;
		System.out.printf("[%.2f]\n",pi);
		System.out.printf("[%15.2f]\n",pi);
		System.out.printf("[%-15.2f]\n",pi);
		int n = 9530690;
		System.out.printf("%d en octal = %o en hexadecimal  = %x \n",n,n,n);
		System.out.printf("[%015d]\n",n);
		String name = "lola";
		short age = 23;
		System.out.printf("hola  %s tienes %d  años  eres  %s ", name, age,age>=18?"mayor":"menor");
		
		

		//		System.out.println(y);
		//		int age =0;
		//		String  state = age >=18?"ADULTO":"MENOR";
		//		if (c1==c2){
		//			System.out.println("cadenas iguales");
		//			
		//		}else{
		//			System.out.println("cadenas diferentes ");
		//		}
		//		System.out.println(n);
		//		System.out.println(b+"\t"+o+"\t"+x);
	}

}
