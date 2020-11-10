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

  public static SuperArray findOverlap(SuperArray a, SuperArray b)
    {
      SuperArray overlap = new SuperArray();
      int greatest = Math.max(a.size(), b.size());
      for (int i = 0; i < greatest; i++)
        {
          if (b.contains(a.get(i)))
            overlap.add(a.get(i));
        }
      removeDuplicates(overlap);
      return overlap;
    }
/*
  public static SuperArray zip(SuperArray a, Superarray b)
    {

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
      SuperArray a = new SuperArray();

      a.add("9");           a.add("1");           a.add("2");           a.add("2");
      a.add("3");           a.add("4");

      SuperArray b = new SuperArray();

      b.add("0");           b.add("4");           b.add("2");           b.add("2");
      b.add("9");

      System.out.println(findOverlap(a, b));
      //expected ["9","2","4"]

     System.out.print(b.lastIndexOf("2"));
      //expected 3
    }
}
