package eva3_4_paso_valor;

public class EVA3_4_PASO_VALOR {

    public static void main(String[] args) {
        int valor = 5;
        System.out.println("Valor(antes) " + valor);
        incrementar(valor);
        System.out.println("valor(despues) " + valor);
    }
    //SE SUMA UNO
    public static void incrementar(int val){
        val = val + 1;
        //(val++)
    }
}
