import java.util.*;

class AddLargeNumbers {
  
public static LinkedList numberToDigits(String number)
 {
	
  
  }

   

 public static String digitsToNumber(LinkedList list) 
{


    }

 
   public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2)
 {


    }


}



public class Solution
 {
 
   public static void main(String[] args)
		{

        Scanner sc = new Scanner(System.in);
		System.out.println("enter your input:\n1.numberToDigits \n2.addLargeNumbers");
        int input = sc.nextInt();

        String p = sc.nextLine();

        String q = sc.nextLine();
 
			switch(input)
			{

            case 1:
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;



            case 2:
               	LinkedList pDigits =  AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits =  AddLargeNumbers.numberToDigits(q);
                LinkedList result  =  AddLargeNumbers.addLargeNumbers(pDigits,qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;

			}
		}
}
