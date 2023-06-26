import java.util.Scanner;

public class dupliE {
    static void DuplicateE(int arr[],int n){
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans^arr[i];
        }
        for(int i=1;i<n;i++){
            ans=ans^i;
            
        }System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

            }
            System.out.println("OUTPUT");
            DuplicateE(arr, n);


        
    }
    
}
