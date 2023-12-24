public class Triangle {
   public static void main(String[] args) {
      // Performs simple arithmetic operations on two commnand-line arguments
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);
      boolean isAtriangle = ((a + b > c) && (c + b > a) && (a + c > b));
      System.out.println(a + "," + " " + b +"," + " " + c + ":" + " " + isAtriangle);
       
   }
}