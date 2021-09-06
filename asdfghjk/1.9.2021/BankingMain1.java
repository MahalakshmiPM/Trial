package Others;
import java.util.Scanner;
public class BankingMain1
{

	public static void main(String[] args) {
		boolean pinCheck;
		String pin;
		int menu,choice;
		double deposit;
		Scanner inp= new Scanner(System.in); 
		Banking1 a = null;		
		
		System.out.println("Enter Name ");
		String name=inp.nextLine();	
		System.out.println("Hi "+name);
		
			
				a=new RegularAccount1(name);
				a.checkPinValidity();			
				System.out.println("Enter depodit amount(minimum 500 else 10 rupees panality)"); 
				deposit=inp.nextDouble();
				a.create(deposit);
				System.out.println(a);		
		do {	
			System.out.println("Enter your choice");
			System.out.println("1.withdraw  2.deposit  3.update personal details  0.exit");
			choice=inp.nextInt();
			switch(choice) {
			case 1:
			System.out.println("Enter amount to be withdrawn");
			a.withdraw(inp.nextDouble());
			System.out.println(a);
			break;
			case 2:
				System.out.println("Enter amount to be deposited");
				a.Deposit(inp.nextDouble());
				System.out.println(a);
			break;
			case 3:
				int tem;
				do{System.out.println("1.modify name  2.Change pin 0.back to main menu");
				switch(tem=inp.nextInt()) {
				case 1:
					a.setNewName();
					System.out.println(a);
					break;
				case 2:
				a.checkPinValidity();	
				System.out.println(a);
				break;
				default:
					System.out.println("enter valid choice");
				break;
				}
				}while(tem!=0);
			}
		}while(choice!=0);
	}
}