class Demo
{
   public int i;   // instance variable
   static public int j = 21;   //class variable
   
   static   //Static Block
   {
      System.out.println("Inside Static block");
      j =21;
   }

   public Demo()   //Constructor
   {
     System.out.println("Inside Constructor");
      this.i = 11;
   }

   

}

class Blocks
{
    public static void main(String A[])
    { 
        System.out.println("Inside Main");
        // Demo dobj;  //not a object it is reference

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
        

    }
}