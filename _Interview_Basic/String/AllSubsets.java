public class AllSubsets {  
    public static void main(String[] args) {  
        String str = "FUN";  
        int len = str.length();  
        int temp = 0;  
        
        // Total possible subsets for a string of size n is n * (n + 1) / 2  
        String arr[] = new String[len * (len + 1) / 2];  
  
        // This loop maintains the starting character  
        for (int i = 0; i < len; i++) {  
            // This loop adds the next character every iteration for the subset to form and adds it to the array  
            for (int j = i; j < len; j++) {  
                arr[temp] = str.substring(i, j + 1);  
                temp++;  
            }  
        }  
  
        // This loop prints all the subsets formed from the string  
        System.out.println("All subsets for the given string are: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);  
        }  
    }  
}
