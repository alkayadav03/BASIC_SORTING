import java.util.Scanner;
public class Selection_Sort{
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
            for(int i=0;i<n-1;i++){
                int min=Integer.MAX_VALUE;
                int mindx=-1;
                for(int j=i;j<n;j++){
                    if(arr[j]<min){
                        min=arr[j];
                        mindx=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[mindx];
                arr[mindx]=temp;
            }
            System.out.println();
            print(arr);
    }
}
