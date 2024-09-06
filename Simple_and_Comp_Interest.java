public class Main {
  
  public static double simpleInterest(int P,int R,int T) {
  return((P*R*T) / 100.00); // using only 100 will do integer division and truncate the floating point answer as required
  }
  
  /*
  
  In your simple interest calculation:
  
Integer division truncated any fractional part when dividing by 100.
By changing 100 to 100.00 (a double), you ensured the division happened with floating-point precision, retaining the fractional part and giving the correct result.
Always remember: if you want accurate results when working with decimals, make sure at least one operand is a double or float to force floating-point division.
  */
  
public static int compundInterest(int P,int T,int N,int R) {
double rate = R/100.00;
double Amount = P *  Math.pow((1+rate/N),N*T);
return (int) Amount;
/*
1)Use Floating-Point Division for Rate:

Ensure the rate is calculated using floating-point division (R / 100.0) to avoid truncation and preserve decimal precision.

2)Handle Math.pow Correctly:

Use Math.pow() to calculate powers with floating-point precision, and avoid casting prematurely to int, which could cause loss of data.

3)Truncate or Round as Needed:

After calculating the amount, you can truncate or round the result using (int) to return only the integer portion if needed.
*/
}
  public static void main(String[] args) {
      double Si = simpleInterest(50000,10,5);
      System.out.println(Si);

      double CompA = compundInterest(1000,2,2,10);
      System.out.println(CompA);
    }  
  
}
