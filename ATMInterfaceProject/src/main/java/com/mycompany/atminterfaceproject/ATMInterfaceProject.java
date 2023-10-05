

package com.mycompany.atminterfaceproject;

import java.util.Scanner;

public class ATMInterfaceProject {

    public static int takeIntegerInput(int limit) {
        int input = 0;
        boolean flag = false;
        while ( !flag ) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
		flag = true;
				
		if ( flag && input > limit || input < 1 ) {
                    System.out.println("Choose the number between 1 to " + limit);
                    flag = false;
                }
            }
            catch ( Exception e ) {
                System.out.println("Enter only integer value");
		flag = false;
            }
        }
        return input;
    }
    
    public static void main(String[] args) {
        System.out.println("\n**********WELCOME TO SBI ATM SYSTEM**********\n");
	System.out.println("1.Register \n2.Exit");
	System.out.print("Enter Your Choice - ");
	int choice = takeIntegerInput(2);
		
	if ( choice == 1 ) {
            BankOperations b = new BankOperations();
            b.register();
            while(true) {
		System.out.println("\n1.Login \n2.Exit");
		System.out.print("Enter Your Choice - ");
		int ch = takeIntegerInput(2);
		if ( ch == 1 ) {
                    if (b.login()) {
                        System.out.println("\n\n**********WELCOME " + b.name + " **********\n");
			boolean isFinished = false;
			while (!isFinished) {
			System.out.println("\n1.Withdraw \n2.Deposit \n3.Transfer \n4.Check Balance \n5.Transaction History \n6.Exit");
			System.out.print("\nEnter Your Choice - ");
			int c = takeIntegerInput(6);
			switch(c) {
                            case 1 -> b.withdraw();
                            case 2 -> b.deposit();
                            case 3 -> b.transfer();
                            case 4 -> b.checkBalance();
			    case 5 -> b.transHistory();
			    case 6 -> isFinished = true;
                        }
                        }
                    }
                }
                else {
                    System.exit(0);
                }
            }
        }
        else {
            System.exit(0);
        }
    }
}