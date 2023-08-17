import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DataRecorder {
    public static void dataRecorder(Person person) {
        System.out.println("Введите следующие данные, разделенные пробелом:\n" +
                "Фамилия Имя Отчество датарождения номертелефона пол");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String [] convertedData = data.split(" ");
        if (convertedData.length != 6) {
            throw new RuntimeException("Должно быть шесть данных, разделённых пробелом. Введите данные в корректном формате!");
        } else {
            String surname = convertedData[0];
            if(surname.isEmpty())
                throw new RuntimeException("Нужно ввести фамилию!");
            String name = convertedData[1];
            if(name.isEmpty())
                throw new RuntimeException("Нужно ввести имя!");
            String patronymic = convertedData[2];
            if(patronymic.isEmpty())
                throw new RuntimeException("Нужно ввести отчество!");
            String dateOfBirth = convertedData[3].trim();
            if(dateOfBirth.length() != 10)
                throw new RuntimeException("Нужно ввести дату рождения в формате dd.mm.yyyy!");
            String phoneNumber = convertedData[4].trim();
            if(phoneNumber.length() != 10)
                throw new RuntimeException("Нужно ввести номер телефона, состоящий из 10 цифр!");
            String sex = convertedData[5].trim();
            if (sex.isEmpty() ||!sex.equals("m") && !sex.equals("f"))
                throw new RuntimeException("Нужно ввести пол, обозначив его буквой m или f!");

            System.out.println(Arrays.toString(convertedData));
            try ( FileWriter writer = new FileWriter(new File(person.getSurname() + ".txt"), true)){
                System.out.println(person);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
