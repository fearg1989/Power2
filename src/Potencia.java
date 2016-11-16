
public class Potencia {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		for (int i = -20; i < 2000; i++) {
			if (isPotential(i)){
				System.out.println(i + " es Potencia de 2: " + isPotential(i));
			}
				
		}
	}
	
	public static Boolean isPotential(Integer number){
		Boolean value;
		value = ((number > 0) && ((number&(number-1)) == 0)) ? true : false;
		return value;
	}

}
