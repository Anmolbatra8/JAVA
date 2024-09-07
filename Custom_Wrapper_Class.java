//Wrapper class article (end program) : https://www.geeksforgeeks.org/wrapper-classes-java/

/* Problem statement: Create a custom Statistics class in Java to manage a collection of integers. This class should allow insertion of values, and provide 
methods to calculate and display the sum, average (formatted to 2 decimal places), maximum, minimum, and count of the inserted numbers. Ensure proper 
handling of cases where no numbers are inserted.

*/

class Statistics {

private int maxi = Integer.MIN_VALUE;
private int mini = Integer.MAX_VALUE;
private int sum = 0;
private int size = 0;


public void insert(int x) {
this.size++;
this.sum += x;

if(x > this.maxi) {
this.maxi = x;
}

if(x < this.mini) {
this.mini = x;
}
}


public void getSum() {
if(this.size > 0) {
System.out.println("Sum is: " + this.sum);
}
else 
{
 System.out.println("No numbers inserted");
        }

}

public void getAverage() {
if(this.size > 0) {
System.out.println("Average is: " + String.format("%.2f",(float) this.sum/this.size));
}
else 
{
 System.out.println("No numbers inserted");
        }

}

public void getMax() {
if(this.size > 0) {
System.out.println("Max number is : " + this.maxi);
}
else 
{
 System.out.println("No numbers inserted");
        }

}

public void getMini() {
if(this.size > 0) {
System.out.println("Min Number is : " + this.mini);
}

else 
{
 System.out.println("No numbers inserted");
        }
}

public void getCount() {

System.out.println("The count of numbers is : "+ this.size);
}

}

class Main {

public static void main(String[] args) {
Statistics s1 = new Statistics();
s1.insert(8);
s1.insert(9);
s1.insert(11);
s1.getMax();
s1.getCount();
s1.getMini();
s1.getSum();
s1.getAverage();

}
}
