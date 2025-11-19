package eva3_9_areas;

import java.util.Scanner;

public class EVA3_9_AREAS {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("Bienvenido al sistema");
        System.out.println("Selecciona una opcion");
        Menu();
        opcion = captu.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del ciruclo");
                    double radio = captu.nextInt();
                    calcularArea(radio);
                    break;
                case 2:
                    System.out.println("Ingrese la base mayor");
                    int BASE = captu.nextInt();
                    System.out.println("Igrese la base menor");
                    int basemenor = captu.nextInt();
                    System.out.println("Ingresa la altura");
                    int altura1 = captu.nextInt();
                    calcularArea(BASE, basemenor, altura1);
                    break;
                case 3:
                    System.out.println("Ingresa la base");
                    int base = captu.nextInt();
                    System.out.println("Ingresa la altura");
                    int altura = captu.nextInt();
                    calcularArea(base, altura);
                    break;
                default:
                    break;
            }
            }while(opcion != 4);{
        }
                
    }
    public static void Menu(){
        System.out.println("1.Calcular el area de un circulo");
        System.out.println("2.Calcular el area de un rectangulo");
        System.out.println("3.Calcular el area de un trapecio");
        System.out.println("4.Salir del sistema");
    }
    public static void calcularArea(double radio){
        double pi = 3.14;
        double area = pi * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }
    public static void calcularArea (int BASE, int basemenor, int altura){
        int area = (((BASE + basemenor) * altura)/2);
        System.out.println("El area de trapecio es: " + area);
    }
    public static void calcularArea (int base, int altura){
        int areaRectangulo = base*altura;
        System.out.println("El area del rectangulo es: " + areaRectangulo);
    }
    
    }   