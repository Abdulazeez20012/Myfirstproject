import java.util.Scanner;
public class SumOfInteger {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter number:");

int num1 = input.nextInt();

int num1 = num1 / 100;
int reminder =- num1 % 100;
int resultTwo = reminder / 10;
int resultThree = reminder % 10;
int sum = resulteOne + resultTwo + resultThree;
System.out.printf("The sum of the digit is %d", sum);

}

}