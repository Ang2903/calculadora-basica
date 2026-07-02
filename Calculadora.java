public class Calculadora {
public static double sumar (double a, double b){
return a+b;
}
public static boolean restar(double a, double b){
return a-b;
}
public static boolean multiplicar(double a, double b){
return a*b;
}
public static boolean dividir( double a, double b){
if (b == 0) {
System.out.println("Error: division entre cero");
return 0;
}
return a/b;
}
public static void menu(){
System.out.println("Calculadora Basica");
System.out.println("1. Sumar");
System.out.println("2. Restar");
System.out.println("3. Multiplicar");
System.out.println("4. Dividir");
}
public static void main(String[] args) {
menu();
}
}
