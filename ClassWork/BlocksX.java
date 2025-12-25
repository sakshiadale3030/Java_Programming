class Demo
{
   public int i;   // instance variable
   static public int j = 21;   //class variable
   
   static   //Static Block
   {
      System.out.println("Inside Static block");
      j =21;
   }

   {
      System.out.println("Inside the initializer block");
   }

   public Demo()   //Constructor
   {
     System.out.println("Inside Constructor");
      this.i = 11;
   }

   public Demo(int a)   //Parameterised Constructor
   {
     System.out.println("Inside Parameterised Constructor");
      this.i = a;
   }

   

}

class BlocksX
{
    public static void main(String A[])
    { 
        System.out.println("Inside Main");
        // Demo dobj;  //not a object it is reference

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
        Demo dobj4 = new Demo(11);
        

    }
}