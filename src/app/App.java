package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Multipl m = new Multipl();
        System.out.println(m.mult(sc.nextDouble(), sc.nextDouble()));
    }
}