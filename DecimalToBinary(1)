// Decimal to Binary Conversion using Bitwise operator
public class Main {

public static String dectobin(int num) {
  String binary = "";
  while(num > 0) {
  if((num & 1) == 1) {
  //String is pre appended here to store the binary digits
  //into reverse order at source
  binary = "1" + binary;
  }
  else {
  binary = "0"+ binary;
  }
  num = num >> 1;
    }
return binary;
}
  public static void main(String[] args) {
String ans = dectobin(81);
System.out.println(ans);

    }  
}
