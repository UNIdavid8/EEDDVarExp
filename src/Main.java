import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                System.out.printf("Hello and welcome");
                int vi = 2;
                double vd = 2.3;
                char vc = 'A';
                String cadena="hola";

                // Mostrando
                // Actua como operador de concatenacion.
                System.out.println("vi:" +vi + "vd" +vd + "vc" +vc + "cadena" +cadena);

                //Boolianos
                boolean vb=false;
                vi=(int) 2.9 +1;//Con el int se hace una conversion, del numero a la derecha y no redondea.
                //Formas de arreglar si los dos son decimales.
                vi=(int) 2.9 +(int)1.1;
                vi=(int)(2.9 + 1.2);
                //Hay que entender la diferencia entre esas dos posibles soluciones.
                //vi= (int) vb + vb; NO SE PODRIA HACER YA QUE NO SE PUEDE PASAR UN BOOLIANO A UN NUMERO.

                vi= vc +1;// Daria 66 ya que en la tabla Asci "A"=65;(Unicode)
                System.out.println("vi (entero): "+ vi + "vi (char): " +(char)vi);
                System.exit(0);


                Scanner sc= new Scanner(System.in);
                // sout y se rellena solo el system...
                System.out.println("Introduzca un valor entero ...");
                vi= sc.nextInt();
                System.out.println("Valor entero leido:" +vi);

                // Sentencia de bifurcacion.

                if(vi%2 ==0){
                    System.out.println("El numero:" +vi +" es un numero par");
                }else{
                    System.out.println("El numero:" +vi +" es un numero impar");
                }

                // Sentencia de bifurcaciones anidadas.

                if (vi<50){
                    System.out.println("El numero:" +vi +" es menor que 50.");
                }else if(vi>50){
                    System.out.println("El numero:" +vi +" es mayor que 50.");
                }else {
                    System.out.println("El numero" +vi +" =50.");
                }

                // Sentencias switch-case.
                System.out.println("Introduzca un color(R/r, V/v, A/a)");
                cadena= sc.next();
                vc= cadena.charAt(0);//Es como un Array de caracteres en Clion.

                switch(vc){
                    case 'V':
                    case 'v':
                        System.out.println("Color Verde.");
                        break;
                    case 'R':
                    case 'r':
                        System.out.println("Color Rojo.");
                        break;
                    case 'A':
                    case 'a':
                        System.out.println("Color Azul.");
                        break;

                    default:
                        System.out.println("Color Erroneo.");
                }

                // Bucles for cuando se conoce a priori el numero de interacciones.
                int suma1=0, suma2=0;
                for(int i=1;i<=10;i++){
                    suma1=suma1+i;
                    suma2+=i;
                }
                System.out.println("Suma1:" +suma1 +"suma2" + suma2);

                // Bucle while cuando no es conocido a priori el numero de interacciones.
                // Bucle que solicite numeros al usuario hasta que introduzca un numero par.
                int num=sc.nextInt();
                while(num%2 !=0);
                            }
        }