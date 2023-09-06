import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Java World.....");
        final String inputExp = ReadInput.read();
        Queue<String> operations;
        Queue<String> numbers;

        String[] numberArr = inputExp.split("[-+*/]");
        String[] openArr = inputExp.split("[0-9]+");

        numbers = new LinkedList<>(Arrays.asList(numberArr));
        operations = new LinkedList<>(Arrays.asList(openArr));

        Double res = Double.parseDouble(Objects.requireNonNull(numbers.poll()));

        while (!numbers.isEmpty()){
            String opr = operations.poll();
            Operate operate;
            switch (Objects.requireNonNull(opr)) {
                case "+" -> operate = new Add();
                case "-" -> operate = new Subtract();
                case "*" -> operate = new Multiply();
                case "/" -> operate = new Divide();
                default -> {
                    continue;
                }
            }
            Double num = Double.parseDouble(Objects.requireNonNull(numbers.poll()));
            res = operate.getResult(res, num);
        }
        System.out.println(res);
    }
}