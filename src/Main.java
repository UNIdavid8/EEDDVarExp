import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
System.out.println("Hello and welcome!\n");

        int vi = 2;
        double vd = 2.3;
        char vc ='A';
        String cad = "hola";
        System.out.println("vi: "+ vi + " vd: " +vd);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un entero: ");
        vi = sc.nextInt();
        System.out.println("El numero que has ingresado es: "+vi);

        if(vi % 2 == 0){
            System.out.println("El numero " + vi + " es par");
        }else{
            System.out.println("El numero " + vi + " es impar");
        }
        if(vi > 50){
            System.out.println("El numero " + vi + " es mayor que 50");
        }else{
            System.out.println("El numero " + vi + " es menor que 50");
        }
        System.out.println("introduzca un color: (R,G,B)");
        cad = sc.next();
        vc = cad.charAt(0);

        switch(vc){

            case 'R':
                case 'r':
                System.out.print("El color es RED");
                break;

                case 'G':
                case 'g':
                        System.out.print("El color es GREEN");
                    break;

                    case 'B':
                    case 'b':
                        System.out.print("El color es BLUE");
                        break;
                        default:
                            System.out.print("El color es ERRONEO");
        }
        int suma1 = 0, suma2 = 0;
        for(int i = 1; i <= 10; i++){
            suma1 += i;
            suma2 = suma2 + i;
            System.out.printf("SUMA1 = %d + %d = %d\n", i, suma1, suma1+i);
            System.out.printf("SUMA2 = %d + %d = %d\n", i, suma2, suma2+i);
        }
        int numero = 1;


        while(numero % 2 != 0 ){
            System.out.println("INTRODUCE UN NUMERO: ");
            numero = sc.nextInt();

            if(numero % 2 == 0){
                System.out.println("El numero " + numero + " es par");
            }else System.out.println("El numero " + numero + " es impar");
        }
        int contador = 0;
        while(contador != 2){
            System.out.println("INTRODUCE UN NUMERO: ");
            numero = sc.nextInt();
            if(numero % 2 == 0){
                contador++;
                System.out.println("El numero " + numero + " es par");
                System.out.println("contador : "+contador);
            }
            if(numero % 2 != 0){
                contador = 0;
                System.out.println("El numero " + numero + " es impar");
                System.out.println("contador : "+contador);
            }
        }
    }
}