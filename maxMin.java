import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number[]=new int[n];
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("OUTPUT");
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         for(int i=0; i<number.length; i++) {
           if(number[i] < min) {
               min = number[i];
           }
           if(number[i] > max) {
               max = number[i];
           }
       }
       System.out.println(min);
       System.out.println(max);

            
            
            
        
    
    }
    
}
