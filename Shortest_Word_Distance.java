

/**
 * @author liyanorng
 *
 *
 * Shortest Word Distance
 * 
 * Given a list of words and two words word1 and word2, return shortest distance between 
 * these two words in the list.
 * 
 * Ex.
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"]
 *
 *	Input: word1 = “coding”, word2 = “practice”
	Output: 3
 *
 *
 *	Input: word1 = "makes", word2 = "coding"
	Output: 1
	
	Note:
	You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.

 */


public class Shortest_Word_Distance {
	
	
    public static int shortestDistance(String[] words, String word1, String word2) {
    	
    	int firstWord = -1;
    	int secondWord = -1;
    	int min = Integer.MAX_VALUE;
    	
    	for(int i = 0; i < words.length; i++) {
    		if(words[i].equals(word1)){
    			firstWord = i + 1;
    		}
    		else if(words[i].equals(word2)) {
    			secondWord = i + 1;
    		}
    		if(firstWord != -1 && secondWord != -1) {
    			min = Math.min(min,  Math.abs(firstWord - secondWord));
    		}
    	}
    	
    	return min;
    	    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		
		System.out.println(shortestDistance(words, "practice", "coding"));
		
	}

}
