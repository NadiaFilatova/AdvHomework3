package task4;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        File file = new File("/home/nadia/IdeaProjects/AdvHomework3/src/task4/fileTask4.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
