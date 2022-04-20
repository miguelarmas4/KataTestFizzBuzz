import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {

    int numero;

    @Test
    void testReturnNumber10() {
        String[] esperado = new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"};
        String[] valor = Contar.lista(10);
        Assertions.assertArrayEquals(esperado, valor);
        Contar.imprimeListado();
    }

    @Test
    void testReturnPrueba20() {
        String[] esperado = new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
        String[] valor = Contar.lista(20);
        Assertions.assertArrayEquals(esperado, valor);
        Contar.imprimeListado();
    }

    @Test
    void testReturnPrueba100() {
        String[] esperado = new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz", "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz", "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz"};
        String[] valor = Contar.lista(100);
        Contar.imprimeListado();
    }

    @Test
    void testStage2_ReturnPrueba_20() {
        String[] esperado = new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
        String[] valor = ContarStage2.lista(20);
        Assertions.assertArrayEquals(esperado, valor);
        ContarStage2.imprimeListado();
    }

    @Test
    void testStage2_ReturnPrueba100() {
        String[] esperado = new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz", "41", "Fizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "FizzBuzz", "Buzz", "FizzBuzz", "FizzBuzz", "Buzz", "Buzz", "FizzBuzz", "Buzz", "Buzz", "FizzBuzz", "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", "71", "Fizz", "Fizz", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz", "82", "Fizz", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz"};
        String[] valor = ContarStage2.lista(100);
        Assertions.assertArrayEquals(esperado, valor);
        ContarStage2.imprimeListado();
    }

    @Test
    void verResultados() {
        String[] valor = ContarStage2.lista(100);
        ContarStage2.imprimeListado();
    }

}
