import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueOperation = false;
        while (!continueOperation) {
            try {
                System.out.println("Введите все шесть полей контакта, разделяя их пробелами, в одной строке: ");
                Person person = new Person();
                DataRecorder.dataRecorder(person);
            } catch (Exception | Error e) {
                System.err.println(e.getMessage());
            } finally {
                System.out.print("Продолжить ввод данных? Да/Нет: ");
                String answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("Да")) {
                    continueOperation = true;
                }
            }
        }

    }
}
