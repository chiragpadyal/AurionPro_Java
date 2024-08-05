package com.sawbhav.test;

import java.util.Scanner;

import com.sawbhav.model.CricketPlayer;

public class CricketPlayerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		CricketPlayer cricketPlayers[] = new CricketPlayer[11];
		
		
		for (int i = 0; i < cricketPlayers.length; i++) {
			System.out.println("Enter player id: ");
			int playerId = scanner.nextInt();
			System.out.println("Enter player name: ");
			String name = scanner.next();
			System.out.println("Enter player numberOfMatches: ");
			int numberOfMatches = scanner.nextInt();
			System.out.println("Enter player runs: ");
			int runs = scanner.nextInt();
			System.out.println("Enter player numberOfWickets: ");
			int numberOfWickets = scanner.nextInt();
			
			cricketPlayers[i] = new CricketPlayer(playerId, name, numberOfMatches, runs, numberOfWickets);
		}
		
		for (CricketPlayer cricketPlayer : cricketPlayers) {
			System.out.println("Display: " );
			cricketPlayer.display();
			System.out.println("Average: " + cricketPlayer.calculateAverage());
		}
		
		scanner.close();
		
	}
	
}
