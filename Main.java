import java.util.Scanner;
public class Main {
 public static void main(String args[])
   {
     int[] intArray = new int[20];
     System.out.println("enter the length of array");
     Scanner s=new Scanner(System.in);
     int size=s.nextInt();
     System.out.println("enter the elements in the array");
     for(int i=0;i<size;i++)
       {
         intArray[i]=s.nextInt();
       }
     //int size=intArray.length;
     
     int nz=0,z=0;
     while(nz<size)
       {
           if(intArray[nz]!=0)
           {
             int temp =intArray[nz];
             intArray[nz]=intArray[z];
           intArray[z]=temp;
           nz++;
           z++;}
           else{
             nz++;
           }
             
           }

      for(int i=0;i<size;i++)
       {
        System.out.println( intArray[i]);
       }
         }
   }
