package Others;

import java.util.Scanner;

public abstract class Banking1{
	Scanner inp=new  Scanner(System.in);

abstract void create(double deposit);
abstract void fees();
abstract void Deposit(double deposit);
abstract void withdraw(double withdraw);
abstract void setNewName();

boolean checkPin(String pin){	
	int small=0,caps=0,num=0,symb=0;
	int len=pin.length();
	if (len<8) return false;
	else {
		for(int i=0;i<len;i++) {
			if(pin.charAt(i)>=48 && pin.charAt(i)<=57) {
				num++;
				
			}
			else if(pin.charAt(i)>=65 && pin.charAt(i)<=90) {
				caps++;
				}
			
			else if(pin.charAt(i)>=97 && pin.charAt(i)<=122) {
				small++;
			}
			else symb++;
		}
		if(num>0 && small>0 && caps>0 && symb>0) return true;
		else return false;
	}
}
String checkPinValidity() {
	String pin;
	boolean pinChk=false;
do {
	System.out.println("Enter PIN (length>=8 Should contain atleast 1small,1caps,1number,1Symbol)");
	pin=inp.next();
	pinChk=checkPin(pin);
	}while(pinChk==false);
return pin;
}
void balance(double balance){
	System.out.println("Balance : "+balance);
}
void name(String name){
	System.out.println("Account Holder Name : "+name);	
}
}
