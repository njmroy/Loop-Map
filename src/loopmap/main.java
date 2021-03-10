package loopmap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Integer sum = 0, product=1;
        Integer min,max;
        
        List <Integer> nums = new ArrayList<>();
        for (int i = 0;i<5;i++)
        {
            System.out.println("Enter number "+ (i+1) +" of 5.");
            int x = input.nextInt();
            nums.add(x);
        }
        
        //Find sum by iterating over number list
        for (int i=0; i<nums.size();i++)
        {
            sum += nums.get(i);

        }
        
        //Find product by iterating over number list, set to zero if any value is zero. 
        if (nums.contains(0)==true)
        {
            product=0;
        }
        else 
        {    
            for (int i=0; i<nums.size();i++)
                product *= nums.get(i);
        }
        
            
        
        //find smallest by sorting using collections
        Collections.sort(nums);
         min=nums.get(0);
         
        //find max of sorted arrayList
         max=nums.get(nums.size()-1);
         
         String text= "Sum is "+sum+"\nProduct is "+product
                 +"\nSmallest is "+min+"\nLargest is "+max;
         System.out.println(text);
         
                 
    }

}