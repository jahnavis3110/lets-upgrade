
assignment day-3
package javafight;

import java.util.Scanner;

public class PrimeOrNot {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the number to check:");
int n = sc.nextInt();
int i, m = 0, flag = 0;

m = n / 2;
if (n == 0 || n == 1) {
System.out.println(n + " is not prime number");
} else {
for (i = 2; i <= m; i++) {
if (n % i == 0) {
System.out.println(n + " is not prime number");
flag = 1;
break;
}
}
if (flag == 0) {
System.out.println(n + " is prime number");
}

}
}
}
