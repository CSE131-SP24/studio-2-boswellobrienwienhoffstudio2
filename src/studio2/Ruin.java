package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please input your starting cash: ");
		Double startingMoney = in.nextDouble();
		System.out.print("Please input your win chance: ");
		Double winChance = in.nextDouble();
		System.out.print("Please input your win limit: ");
		Double winLimit = in.nextDouble();
		System.out.print("Please input your ruin limit: ");
		Double ruin = in.nextDouble();
		while ((startingMoney < winLimit) && (startingMoney > ruin))
		{
		if (Math.random() <= winChance) {
			startingMoney = startingMoney + 1;
			System.out.print("WIN");
		} else {
			startingMoney = startingMoney - 1;
			System.out.print("LOSE");
			
		}
			
			
		System.out.println(startingMoney);
		}
		if (winChance == 0.5) {
			Double expectedRuinRate = 1-(startingMoney / winLimit);
		}

	}

	}


