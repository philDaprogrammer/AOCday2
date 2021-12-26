import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Solution {
    public void part1(String filename) {
        int horizontal = 0;
        int vertical   = 0;

        try {
            FileInputStream stream = new FileInputStream(filename);
            Scanner sc             = new Scanner(stream);

            while (sc.hasNext()) {
                switch (sc.next()) {
                    case "forward":
                        if (sc.hasNext()) horizontal += Integer.parseInt(sc.next());
                        break;
                    case "down":
                        if (sc.hasNext()) vertical += Integer.parseInt(sc.next());
                        break;
                    case "up":
                        if (sc.hasNext()) vertical -= Integer.parseInt(sc.next());
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("product: " + (horizontal * vertical));
    }

    public void part2(String filename) {
        int aim        = 0;
        int horizontal = 0;
        int vertical   = 0;

        try {
            FileInputStream stream = new FileInputStream(filename);
            Scanner sc             = new Scanner(stream);

            while (sc.hasNext()) {
                switch (sc.next()) {
                    case "forward":
                        if (sc.hasNext()) {
                          int x = Integer.parseInt(sc.next());
                          horizontal += x;
                          vertical   += (aim * x);
                        }
                        break;
                    case "down":
                        if (sc.hasNext()) aim += Integer.parseInt(sc.next());
                        break;
                    case "up":
                        if (sc.hasNext()) aim -= Integer.parseInt(sc.next());
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Aim: " + (horizontal * vertical));
    }
}