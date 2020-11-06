public class Demo{

  //index of to find first occurrence of word; remove to get rid of else
  public static void removeDuplicates(SuperArray s)
    {
      for (int i = 0; i < s.size(); i++)
        {
          String element = s.get(i);
          int n = s.indexOf(element);
          if (n != i)
            {
              s.remove(i);
              i -= 1;
            }
        }
    }
/*
  public static SuperArray findOverlap(SuperArray a, SuperArray b)
    {
      Superarray[] overlap = new SuperArray();
      for (int i = 0; i < a.size(); i++)
        {
          if
        }
      return overlap;
    }
*/
  public static void main(String[] args)
    {
      SuperArray words = new SuperArray();

      words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
      words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
      words.add("una");    words.add("ebi");     words.add("toro");

      System.out.println(words);
      removeDuplicates(words);
      System.out.println(words);

      /*
      expected:
      [kani, uni, ebi, una, una, ebi, kani, una, una, ebi, toro]
      [kani, uni, ebi, una, toro]
      */

//      System.out.println(findOverlap( ["9","1","2","2","3","4"], ["0","4","2","2","9"] ));
      //expected ["9","2","4"]
    }
}
