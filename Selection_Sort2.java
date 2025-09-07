import java.util.Scanner;
public class Selection_Sort2{
      public static void print(int [] arr){
        for(int ele: arr){
              System.out.print(ele+ " ");
        }
      }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total elements: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
          System.out.print("Enter elements: ");
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }
          print(arr);
          for(int i=n-1;i>0;i--){
                int max=Integer.MIN_VALUE;
                int maxdx=-1;
                for(int j=0;j<=i;j++){
                    if(arr[j]>max){
                        max=arr[j];
                        maxdx=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[maxdx];
                arr[maxdx]=temp;
            }
            System.out.println();
            print(arr);
    }
}
