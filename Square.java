import java.util.Scanner;

public class Square {
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

System.out.print("enter the length of square");
int length = input.nextInt();

System.out.print("enter the breath of square");
int breath = input.nextInt(); 
      for (int i = 0; i < length; i++){
      for (int j = 0; j <breath; j++){
System.out.print("o");}
System.out.println();
}
}

}