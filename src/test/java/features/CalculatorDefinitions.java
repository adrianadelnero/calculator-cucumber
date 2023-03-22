package features;

import br.com.api.Calculator;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;

public class CalculatorDefinitions {

    Calculator calculator;
    private int total;

    @Dado("Que eu tenha uma calculadora")
    public void que_eu_tenha_uma_calculadora() {
        calculator = new Calculator();
    }
    @Quando("Eu somo os números {int} e {int}")
    public void eu_somo_os_números_e(Integer num1, Integer num2) {
        total = calculator.sum(num1, num2);
    }
    @Entao("O resultado deve ser {int}")
    public void o_resultado_deve_ser(Integer result) {
        Assertions.assertEquals(total, result);
    }
}
