import java.util.Scanner*;

public class Cont{
public static void main(String args[]) {
int i;
int k;

public void Scan(){
System.out.println("Введите первое число");
Scanner scn = new Scanner(System.in);
i = scn.nextInt();
System.out.println("Введите второе число");
k = scn.nextInt();
}

private static int count(int x){
x= x+1;
return x;
}
}

}