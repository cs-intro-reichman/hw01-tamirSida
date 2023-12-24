public class Gen3 {
   public static void main(String[] args) {
      // Performs simple arithmetic operations on two commnand-line arguments
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      double s = Math.random();
      double t = Math.random();
      double u = Math.random();
      int num1 = (int) (((b - a) * s)+a);
      int num2 = (int) (((b - a) * t)+a);
      int num3 = (int) (((b - a) * u)+a);
    
      int smallNum = Math.min(num1, num2);
      int smallestnum = Math.min(smallNum, num3);

      System.out.println(num1);
      System.out.println(num2);
      System.out.println(num3);

      System.out.println("The minimal generated number was " + smallestnum);


   }
}
