package com.javaconcepts;

import java.util.Arrays;

public class Player {
	
	int score;
	String name;
	
	public Player(String name,int score) {
		this.name = name;
		this.score = score;
	}

	public static void main(String[] args) {
		
		Player[] p = new Player[5];
		p[0] = new Player("Mehul", 100);
		p[1] = new Player("Jayesh", 500);
		p[2] = new Player("Rahul", 300);
		p[3] = new Player("Eminem", 200);
		p[4] = new Player("Kartik", 400);
		
		
		Arrays.sort(p, new ScoreComparator());
		
		for(Player s : p) {
			System.out.println(s.score);
		}
		

	}

}
