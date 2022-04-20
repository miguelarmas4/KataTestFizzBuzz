public class ContarStage2 {

    private static String[] listado;

    public static String[] lista(int numeros){
        listado = new String[numeros];
        String num = "";
        for (int i = 1; i <= numeros; i++) {
            num = determina(i);
            listado[i-1] = num;
        }
        return listado;
    }

    public static void imprimeListado() {
        for (String num : listado){
            System.out.println(num);
        }
    }

    private static String determina(int entrada) {

        String rsp = String.valueOf(entrada);
        boolean div3 = divisible3(entrada);
        boolean div5 = divisible5(entrada);
        if (div3 && div5){
            rsp = "FizzBuzz";
        } else if (div3) {
            rsp = "Fizz";
        } else if (div5) {
            rsp = "Buzz";
        }

        return rsp;

    }

    private static boolean divisible3(int numero) {
        String text = String.valueOf(numero);
        if (numero%3 == 0 || text.indexOf("3") > -1) {
            return true;
        }
        return false;
    }

    private static boolean divisible5(int numero) {
        String text = String.valueOf(numero);
        if (numero%5 == 0 || text.indexOf("5") > -1) {
            return true;
        }
        return false;
    }

}
