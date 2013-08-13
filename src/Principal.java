import java.util.Scanner;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x1,y1,x2,y2,x3,y3;
		Punto p1;
		Punto p2;
		Punto p3;
		
		System.out.print("PUNTO 1 - X1: ");
		x1 =sc.nextInt();
		System.out.print("PUNTO 1 - Y1: ");
		y1 =sc.nextInt();
		System.out.print("PUNTO 2 - X2: ");
		x2 =sc.nextInt();
		System.out.print("PUNTO 2 - Y2: ");
		y2 =sc.nextInt();
		System.out.print("PUNTO 3 - X3: ");
		x3 =sc.nextInt();
		System.out.print("PUNTO 3 - Y3: ");
		y3 =sc.nextInt();
		
		p1 = new Punto(x1,y1);
		p2 = new Punto(x2,y2);
		p3 = new Punto(x3,y3);
		
		Triangulo triangulo = new Triangulo(p1,p2,p3);
		
		System.out.println("LOS VERTICES DEL TRIANGULO SON");
		
		System.out.println(triangulo.toString());
		
		System.out.println("EL PERIMETRO DEL TRIANGULO ES");
		
		System.out.println(triangulo.HallarPerimetro());
		
		System.out.println(triangulo.TipoTriangulo());
	}

}
