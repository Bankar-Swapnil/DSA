import java.util.HashMap;
import java.util.Map;

public class frequencyOfElment {

    public static void main(String args[]){

        //1st approch
    // Example array
    //     int[] array = {1, 2, 3, 4, 1, 2, 2, 5, 3, 4, 4};

    //     // Creating a HashMap to store element frequencies
    //     Map<Integer, Integer> frequencyMap = new HashMap<>();

    //     // Calculating the frequency of each element
    //     for (int element : array) {
    //         // If the element is already in the map, increment its frequency
    //         if (frequencyMap.containsKey(element)) {
    //             frequencyMap.put(element, frequencyMap.get(element) + 1);
    //         } else {
    //             // If the element is not in the map, add it with a frequency of 1
    //             frequencyMap.put(element, 1);
    //         }
    //     }

    //     // Displaying the frequency of each element
    //     System.out.println("Element frequencies:");
    //     for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
    //         System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
    //     }



    //2nd approch 

    //Initialize array  
    int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
    //Array fr will store frequencies of element  
    int [] fr = new int [arr.length];  
    int visited = -1;  
    for(int i = 0; i < arr.length; i++){  
        int count = 1;  
        for(int j = i+1; j < arr.length; j++){  
            if(arr[i] == arr[j]){  
                count++;  
                //To avoid counting same element again  
                fr[j] = visited;  
            }  
        }  
        if(fr[i] != visited)  
            fr[i] = count;  
    }  

    //Displays the frequency of each element present in array  
    System.out.println("---------------------------------------");  
    System.out.println(" Element | Frequency");  
    System.out.println("---------------------------------------");  
    for(int i = 0; i < fr.length; i++){  
        if(fr[i] != visited)  
            System.out.println("    " + arr[i] + "    |    " + fr[i]);  
    }  
    System.out.println("----------------------------------------");  
}

}
