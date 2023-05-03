
public class Rettangolo {
	//attribute
	double width;
	double height;
	
	//constructor
	public Rettangolo(double width, double height){
		this.width = width;
		this.height = height;
	}
	public double perimetr() {
		return (width + height)*2;
	}
	public double area() {
		return (width*height);
	}
	public static void stampaRettangolo(Rettangolo rettangolo) {
		System.out.println("Area rettangolo: " + rettangolo.area() + "Perimetro rettangolo: " + rettangolo.perimetr());
	}
	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {

		System.out.println("Il perimetro del rettangolo è: " + r1.perimetr());
		System.out.println("L'area del rettangolo è: " + r1.area());
		
		System.out.println("Il perimetro del rettangolo è: " + r2.perimetr());
		System.out.println("L'area del rettangolo è: " + r2.area());
		
		System.out.println("La somma dei perimetri dei due rettangoli è: " +r1.perimetr()+r2.perimetr());
		System.out.println("La somma delle aree dei due rettangoli è: " +r1.area()+r2.area());
		
	}

}
