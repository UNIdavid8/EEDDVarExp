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
    }
}