import java.util.Scanner;

public class BaseEx3Loop {
	public static void main(String [] args){
		int integerInt = 0;
		if(args.length>0){
			for (int i=0;i<args.length;i++){
				integerInt = Integer.parseInt(args[i]);
				computeParity(integerInt);
				computePositivity(integerInt);
			}
			
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.println("Entrez un nombre");
			
			while (!scan.hasNextInt()) {
				System.out.println("Entrée invalide, veuillez entrer un entier :");
				scan.next(); 
			}
			
			integerInt = scan.nextInt();
			computeParity(integerInt);
			computePositivity(integerInt);
			
		}
		
		
		
	}
	
	public static void computeParity(int integerInt) {
		if(integerInt % 2 == 0){
			System.out.println(integerInt + " est pair");
		} else {
			System.out.println(integerInt + " est impair");
		}
	}
	
	public static void computePositivity(int integerInt) {
		if(integerInt < 0){
			System.out.println(integerInt + " est négatif");
		} else if(integerInt > 0){
			System.out.println(integerInt + " est positif");
		} else if(integerInt == 0){
			System.out.println(integerInt + " est nul");
		}
	}
}