import java.util.Scanner;

public class tripletsum {
     public static void pairSum(int arr[],int n,int x){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int z=i+2;z<n;z++){
                if(arr[i]+arr[j]+arr[z]==x){
                    System.out.println("yes"+arr[i]+" "+arr[j]+" "+arr[z]);
                }else{
                    System.out.println("NO");
                }
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
