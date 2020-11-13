class Tester{
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++)
      System.out.println(words.get(i));
    System.out.println(words.isEmpty());
    SuperArray n = new SuperArray();
    System.out.println(n.isEmpty());
    System.out.println(words.toString());
    System.out.println(words.contains("kani"));


//tries
    try
      {
        SuperArray i = new SuperArray(0);
        System.out.println("success");
      }
    catch (IllegalArgumentException e)
      {
        System.out.println("initialCapacity is incorrect");
        e.printStackTrace();
      }
//expected pass

      try
        {
          SuperArray s = new SuperArray(-5);
          System.out.println("success");
        }
      catch (IllegalArgumentException e)
        {
          System.out.println("initialCapacity is incorrect");
          e.printStackTrace();
        }
//expected fail



  }
}