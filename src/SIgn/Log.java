/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIgn;
import java.util.Scanner;

public class Log {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.print("Masukkan ID kursus: ");
        String courseId = scanner.nextLine();

        System.out.print("Masukkan nama kursus: ");
        String courseName = scanner.nextLine();

        System.out.print("Masukkan nama pengajar: ");
        String instructor = scanner.nextLine();

        // Membuat objek Course berdasarkan input pengguna
        Course course = new Course(courseId, courseName, instructor);

        // Menyimpan atau mengelola kursus baru dalam program pembelajaran online
        // Misalnya, menambahkannya ke daftar kursus yang ada atau menyimpan dalam database

        System.out.println("Kursus " + course.getCourseName() + " berhasil dibuat!");
    }
}
