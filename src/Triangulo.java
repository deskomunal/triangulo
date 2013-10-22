import java.util.*;
public class Triangulo {
	public static void main(String arg[]){
		int a,b,c;
		System.out.println("ingrese el lado a:");
		Scanner in =new Scanner(System.in);
		a=in.nextInt();
		System.out.println("ingrese el lado b:");
		b=in.nextInt();
		System.out.println("ingrese el lado c:");
		c=in.nextInt();
		int cont=0;
		int aux=0;
		if(a!=0 || b!=0 ||c!=0){
			if((b+c)>=a && (a+c)>=b && (b+a)>=c)
				aux=1;
			if(a==b && b==c)
				aux=1;			
			if(aux==1){				
				if(a==b)
					cont++;		
				if (a==c)
					cont++;
				if(b==c)
					cont++;
				if(cont==1)
					System.out.println("EL triangulo es isôsceles");
				if(cont==3)
					System.out.println("EL triangulo es equilatero");
				if(cont==0)
					System.out.println("EL triangulo es escaleno");
			}else 
				System.out.println("los datos ingresados no componen un triangulo");
		}else 
			System.out.println("los datos ingresados no componen un triangulo");
	}
}
