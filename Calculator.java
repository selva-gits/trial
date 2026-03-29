class Calcul{
public int add(int n1, int n2){
return n1 + n2;
}
}
public class Calculator{
public static void main(String[] args){
Calcul cal = new Calcul();
int result = cal.add(3, 5);
System.out.println("Result is: " + result);
}
}