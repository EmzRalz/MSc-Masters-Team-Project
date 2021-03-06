package logger;

public class PersistentGameData {
	
		private int number_of_draws;
		private int winning_player;
		private int number_of_rounds;
		private int[] player_wins;
		private boolean log_data;
		
	    public PersistentGameData(int number_of_players) {
	    	
	    	player_wins = new int[number_of_players];
	    	for(int i=0; i<player_wins.length; i++) {
	    		player_wins[i] = 0;
	    	}
	    	
	    	number_of_draws = 0;
	    	number_of_rounds = 0;
	    	log_data = true;
	    	
	    } 
	  
	    public void increment_rounds() {
	    	number_of_rounds++;
	    }
	    
	    public void increment_number_of_draws() {
	    	number_of_draws++;
	    }
	    
	    public void log_player_who_won(int player_id) {
	    	winning_player = player_id;
	    }
	    
	    public void log_player_won_rounds(int player_id) {
	    	player_wins[player_id]++;
	    }
	    
	    public void set_logger(boolean to_be_logged) {
	    	log_data = to_be_logged;
	    }
	    
	    public int get_number_of_rounds() {
	    	return number_of_rounds;
	    }
	    
	    public int get_number_of_draws() {
	    	return number_of_draws;
	    }
	    
	    public int get_winning_player() {
	    	return winning_player;
	    }
	    
	    public int[] get_player_wins() {
	    	return player_wins; 
	    }
	    
	    public boolean data_to_be_logged() {
	    	return log_data;
	    }
}
