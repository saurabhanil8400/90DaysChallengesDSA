import java.util.Scanner;

public class swapN{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
    }
    
    for(int i=0;i<n;i+=2){
        if(i+1<n){
            int temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;



        }
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]);

    }
    // System.out.println(i);
    for(int val:arr){
        System.out.print(val+" ");
    }
}
}