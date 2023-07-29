import java.util.Scanner;

public class pairSum {
    public static void pairSum(int arr[],int n,int x){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println("yes"+arr[i]+" "+arr[j]);
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        System.out.println(" INPUT");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pairSum(arr, n, x);


    }
    
}
