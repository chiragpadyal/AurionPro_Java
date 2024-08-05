package com.sawbhav.model;

public class CricketPlayer {
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;
	
	
	public CricketPlayer(int playerId, String name, int numberOfMatches, int runs, int numberOfWickets) {
		this.playerId = playerId >= 0 ? playerId : 0;
		this.name = name;
		this.numberOfMatches = numberOfMatches>= 1 ? numberOfMatches : 0;
		this.runs = runs>= 0 ? runs : 0;
		this.numberOfWickets = numberOfWickets>= 0 ? numberOfWickets : 0;
	}
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		if(playerId >= 0)
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		if(numberOfMatches >= 1)
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		if(runs >= 0)
		this.runs = runs;
	}
	public int getNumberOfWitches() {
		return numberOfWickets;
	}
	public void setNumberOfWitches(int numberOfWickets) {
		if(numberOfWickets >= 0)
		this.numberOfWickets = numberOfWickets;
	}

	public void display() {
		System.out.println("Player ID: "+ this.playerId);
		System.out.println("Player Name: "+ this.name);
		System.out.println("Player No. Of Matches: "+ this.numberOfMatches);
		System.out.println("Player ID: "+ this.runs);
		System.out.println("Player No. Of Wickets: "+ this.numberOfWickets);
	}

	
	public double calculateAverage() {
		return this.runs / this.numberOfMatches;
	}
}
