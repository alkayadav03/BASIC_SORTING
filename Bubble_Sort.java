import java.util.Scanner;
public class Bubble_Sort{
      public static void print(int []n ){
            for(int ele: n){
                System.out.print(ele+" ");
            }
            System.out.println();
        } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size=sc.nextInt();
        int [] n= new int[size];
         System.out.print("enter the elements: ");
        for(int i=0;i<size;i++){
            n[i]=sc.nextInt();
        }
            print(n);
            for(int i=0;i<n.length-1;i++){
                for(int j=0;j<n.length-1-i;j++){
                    if(n[j]>n[j+1]){ 
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
            }
            print(n);
        }
    }
