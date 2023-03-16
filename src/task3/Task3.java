package task3;

//Необхідно створити рядок із текстом (текст взяти будь-який з інтернету).
// Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожну речення з нового рядка.
public class Task3 {
    public static void main(String[] args) {
        String text1 = "Необхідно створити рядок із текстом (текст взяти будь-який з інтернету).";
        System.out.println(text1.substring(0, text1.length() / 2));
        System.out.println(text1.substring(text1.length() / 2));
    }
}
