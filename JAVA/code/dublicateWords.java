import java.util.HashMap;
import java.util.Map;

public class dublicateWords {
    public static void main(String[] args)
	{

		String expression
			= "Hi, I am Hritik and I am a programmer";

		String[] words = expression.split(" ");

		Map<String, Integer> word_map = new HashMap<>();

		for (String word : words) {

			if (word_map.get(word) != null) {
				word_map.put(word, word_map.get(word) + 1);
			}
			else {
				word_map.put(word, 1);
			}
		}

		int count =0;

		for (String name : word_map.keySet()) 
        {
            Integer url = word_map.get(name);
            if(url>1){
                count+=1;
                System.out.println("Key = " + name + ", Value = " + url);
            }
        }
		System.out.println(count);
}
}
