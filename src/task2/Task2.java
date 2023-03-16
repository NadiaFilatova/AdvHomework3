package task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {

        File file = new File("/home/nadia/IdeaProjects/AdvHomework3/task2.txt");
        file.createNewFile();
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Створіть файл, запишіть у нього довільні дані та закрийте файл. " +
                    "Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.\n");
            fw.flush();
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
        }
    }
}
