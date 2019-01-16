import java.util.HashMap;

public class Card {
	private String cardname;
	private HashMap<String, Integer> values;

	public Card(String cardname, String[] headers, int[] inputValues) {
		this.cardname = cardname;
		for(int i=0;i<headers.length;i++) {
			values.put(headers[i],inputValues[i]);
		}
	}
	
	public String getCardName() {
		return cardname;
	}
	
	public int getValue(String category) {
		return values.get(category);
	}
	
	public String[] getHeaders() {
		return (String[]) values.keySet().toArray();
	}

}
