import java.util.Scanner;

public class SinhalaMonth{
	public static void main(String []args){
		//create scanner
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the Month Number");
		int month=input.nextInt();
		switch (month)+{
			case 1:System.out.println("Duruthu");
				break;
			case 2:System.out.println("Nawam");
				break;
			case 3:System.out.println("Madin");
				break;
			case 4:System.out.println("Bak");
				break;
			case 5:System.out.println("Vesak");
				break;
			case 6:System.out.println("Poson");
				break;
			case 7:System.out.println("Esala");
				break;
			case 8:System.out.println("Nikini");
				break;
			case 9:System.out.println("Dinara");
				break;
			case 10:System.out.println("Wap");
				break;
			case 11:System.out.println("Il");
				break;
			case 12:System.out.println("Uduwap");
		}
	}
}