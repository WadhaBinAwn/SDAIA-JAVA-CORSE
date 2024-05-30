package Exercise.day1.Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFromFile {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the file name with path:");
            String filePath = scanner.nextLine();

            File file = new File(filePath);

            Map<Character, Integer> charCountMap = new HashMap<>();

            try (Scanner fileScanner = new Scanner(file)) {

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();

                    for (char c : line.toCharArray()) {
                        if(Character.isLetter(c)){
                        charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);}
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                return;
            }

            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
