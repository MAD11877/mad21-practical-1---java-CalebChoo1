import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int max = in.nextInt();
    int[] numlist = new int[max]; 
    for(int i = 0; i < max; i++) {   
      numlist[i]=in.nextInt();  
    } 
    int maxCount = 0;
    int num = 0;
    for (int i = 0; i < numlist.length; i++) {
        int count = 1;
        for (int j = i + 1; j < numlist.length; j++) {
            if(numlist[i] == numlist[j]){
              count++;
            }
        }
        if (maxCount < count){
            maxCount = count;
            num = numlist[i];
        }
    }
    System.out.println(num);
  }
}
