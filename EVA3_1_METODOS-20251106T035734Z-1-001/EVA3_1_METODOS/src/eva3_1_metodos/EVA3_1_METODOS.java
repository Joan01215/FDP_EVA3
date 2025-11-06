package eva3_1_metodos;

public class EVA3_1_METODOS {

    public static void main(String[] args) {
        int val1 = 5, val2 = 10;
        //1.Si necesito guardar el valor de retorno
        int resu = sumarEnteros(val1, val2);//INVOCAR EL METODO
        System.out.println("Suma de 5 + 10= " + resu );
        
    }
    //METODO PARA SUMAR DOS ENTEROS
    //LLAMAR SUS METODOS USANDO VERBOS Y ESCRITURA camelCase
    //1.MODIFICADORES DE ACCESO: public, protected, private, default
    //2. static --> para usarlos dentro del main
    //3. Valor de retorno
    //void --> si no quieren regresar un valor
    //4. NOMBRE DEL METODO: MISMAS REGLAS DE LOS IDENTIFICADORES
    //5. LISTA DE PARAMETROS : PUEDEN SER CERO O N CANTIDAD
    //1       2    3        4               5
    public static int sumarEnteros(int num1, int num2){
    int suma = num1 + num2;
    return suma;
    }
    
}
