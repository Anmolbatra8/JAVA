// Complete Video: https://www.youtube.com/watch?v=dr-pLeJBr38

public class Main {
  public static void main(String[] args) {
  
  /*
  N = 3
  A B C
  D E F
  G H I
  
  (try to do it without an external variable)
  Similar to:
  N = 3
  1 2 3
  4 5 6
  7 8 9
  
  
int N =3;
int i = 1;
char ch = 'A';
while(i <= N) {

int j = 1;
while(j <= N) {
System.out.print(ch+" ");
ch++;
j++;

}
System.out.println();
i++;
} 

*/
/*
N = 3
A B C
B C D 
C D E

Similar to: 
  j j j
i 1 2 3
i 2 3 4
i 3 4 5

row-> N
col -> N
value start->(A +i -1) then, keep adding and printing till j (column) reaches N
*/
int N = 3;
int i = 1;
while(i <= N) {
int j = 1;
char ch = (char) ( 'A' + i -1);
while(j <= N) {
System.out.print(ch);
ch++;
j++;
}
System.out.println();
i++;
}
  }
}
