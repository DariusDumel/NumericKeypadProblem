/**
 * Created by Darius Dumel
 * 7/13/2018
 */
public class Main {
   public static void main(String[] args)
   {
      NumericKeypad numpad = new NumericKeypad();
      String[] allPossibleCombinations = numpad.possibleCombinations("234");

      for(int index = 0; index < allPossibleCombinations.length; index++)
      {
         System.out.println(allPossibleCombinations[index]);
      }
   }
}
