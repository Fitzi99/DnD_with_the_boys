package com.company;

import java.util.*;

public class Combat {
	
	ArrayList<Integer> moveset = new ArrayList<Integer>(Arrays.asList(1,2,1));
	Player player = new Player(100,100,50,10,5);
	Enemy enemy = new Enemy(100,100,50,10,5,moveset);
	
	public static void main(String[] args) {
		
	}
	
	public void comabtSequence(Player player, Enemy enemy, ArrayList<Integer> moveset) {
		
		Scanner s = new Scanner(System.in);
		int counter = 0;
		
		while(player.getHealth()>0 && enemy.getHealth()>0) {
			
			
			
			if(counter < moveset.size()) {
				int move = moveset.get(counter);
				doMove(player, enemy, move);
			}else {
				counter=0;
				int move = moveset.get(counter);
				doMove(player, enemy, move);			
			}
		}
	}
	
	public void doMove(Player player, Enemy enemy, int move) {
		
		if(move==1) {
			player.setHealth(player.getHealth()-enemy.performAttack());
		}else {
			player.setAttack((int) (player.getAttack()/enemy.performDefence()));
		}
	}
	

}
