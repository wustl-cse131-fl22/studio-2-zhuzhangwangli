package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Start Amount: ");
		double startAmount = scan.nextDouble();
		
		System.out.println("Win Limit: ");
		double winLimit = scan.nextDouble();
		
		System.out.println("Win Chance: ");
		double winChance = scan.nextDouble();
		int a = 0;
		 
		for (int k = 0; k <= 500; k ++)
		{int t = 0;
		double startMoney = startAmount;
		while (startMoney > 0 && startMoney <= winLimit) {
		boolean winChanceBo = Math.random() <= winChance;
		if(winChanceBo)
		{
		startMoney ++;
		}
		else
		{
		startMoney --;
		}
		t++;
		
		
		
		
		
		
		}
		if (startMoney == winLimit+1) {
			System.out.println("Simulation " + k + ": "+(t-1)+" WIN");
		}
		else {
			System.out.println("Simulation " + k + ": "+t+" LOSSE");
			a++;
		}
//		System.out.println("money left: " + startMoney);
		
		
		
		
	}
		System.out.println("Losses: "+ a + " Simulations: 500");

	}
} 