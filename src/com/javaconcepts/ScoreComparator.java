package com.javaconcepts;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		
//		if(p1.score>p2.score) {
//			return -1;
//		}
//		return 1;
//	    }
//		
//		500
//		400
//		300
//		200
//		100
		
//		if(p1.score>p2.score) {
//		return 1;
//		}	
//	 	return -1;
//	    }
//	
//	   100
//	   200
//	   300
//	   400
//	   500
		
		
//		if(p1.score<p2.score) {
//			return 1;
//		}
//		return -1;
//	    }
//	
//	   500
//	   400
//	   300
//	   200
//	   100
		

		
//		if(p1.score<p2.score) {
//			return -1;
//			}
//		return 1;
//		}
//	
//	100
//	200
//	300
//	400
//	500
		
		return p1.score-p2.score;
   }
}
