public class Dictionary{
	static Map<String,String> map;

	public static void main(String[] args) {
		map = new HashMap<String,String>();   
		map.put("alma", "apple");  
   		map.put("fa", "tree");  
	}

	// Implement this method. It should add the given key-value pair to the the map
	public static void addWord(String hunWord, String engWord) {

	}
	
	// Implement this method. It should remove the key-value pair by the given key from the map
	public static void removeWord(String hunWord) {
	
	}

	// Implement these methods. They should return the translation of the given word from the map
	public static String translateToHun(String engWord) {
		return null;
	}

  	public static String translateToEng(String hunWord) {
		return null;
  	}
}
