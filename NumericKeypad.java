import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Darius Dumel 7/13/2018
 */
public class NumericKeypad
{
   HashMap<Character, char[]> map;

   NumericKeypad()
   {
      map = new HashMap<Character, char[]>();

      map.put('2', new char[] { 'a', 'b', 'c' });
      map.put('3', new char[] { 'd', 'e', 'f' });
      map.put('4', new char[] { 'g', 'h', 'i' });
      map.put('5', new char[] { 'j', 'k', 'l' });
      map.put('6', new char[] { 'm', 'n', 'o' });
      map.put('7', new char[] { 'p', 'q', 'r', 's' });
      map.put('8', new char[] { 't', 'u', 'v' });
      map.put('9', new char[] { 'w', 'x', 'y', 'z' });
   }

   public String[] possibleCombinations(String inputDigits)
   {
      ArrayList<String> results = new ArrayList<String>();
      String[] rslts;

      possibleCombinationsHelper(results, new StringBuilder(), inputDigits, 0);

      rslts = new String[results.size()];
      return results.toArray(rslts);
   }

   private void possibleCombinationsHelper(ArrayList<String> results,
         StringBuilder stringBuilder, String inputDigits, int index)
   {
      int digitIndex;
      char digit;
      char[] digitChars;

      if (index >= inputDigits.length())
      {
         results.add(stringBuilder.toString());
         return;
      }

      digit = inputDigits.charAt(index);
      digitChars = map.get(digit);

      for (digitIndex = 0; digitIndex < digitChars.length; digitIndex++)
      {
         stringBuilder.append(digitChars[digitIndex]);
         possibleCombinationsHelper(results, stringBuilder, inputDigits,
               index + 1);
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

   }
}
