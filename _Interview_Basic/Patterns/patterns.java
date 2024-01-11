import java.util.*;
public class patterns {

    public static void main(String[] args) {
        

        // for(int i=1;i<5;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=5;i>0;i--){
        //     for(int j=i;j>0;j--){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }


        // for(int i=1;i<6;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // char a='A';

        // for(int i=0;i<6;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(a+" ");
        //         a++;
        //     }
        //     System.out.println();
        // }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++ ){
                if(i==1 || i==n || j==1 || j==n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        int k=1;

        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }


        

    }
}

