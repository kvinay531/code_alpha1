import java.util.*;
public class studnt{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of students:");
      int num=sc.nextInt();
      int[] grades=new int[num];
      int total=0;
      int highest=Integer.MIN_VALUE;
      int lowest=Integer.MAX_VALUE;
      for(int i=0;i<num;i++){
        System.out.println("Enter the student "+(i+1)+"grade:");
        grades[i]=sc.nextInt();
        total+=grades[i];

        if(grades[i]>highest){
          highest=grades[i];
        }
        if(grades[i]<lowest){
          lowest=grades[i];
        }

      }
      sc.close();
      float avg=(float)total/num;
      System.out.println("The average grade is:"+avg);
      System.out.println("The highest grade is"+highest);
      System.out.println("The lowest grade is"+lowest);

    }
  }