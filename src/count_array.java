import java.util.Scanner;
 class count_elements
{
    void count(int n,int[] array){
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(array[i]>=max)
            {
                max=array[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(array[i]<max)
            {
                c++;
            }
        }
        System.out.print("COUNT: "+c);
    }
}
public class count_array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements: ");

        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        count_elements ce=new count_elements();
        ce.count(n,array);
    }
}
