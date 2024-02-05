package app.view;

import java.util.Scanner;

import app.utils.Constants;
import app.utils.MenuText;

public class AppMenu {
    public static String[] choiceOptionMenu() {
        String[] outputData = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the file write or read option(W/R)");
        String userChoice = scanner.nextLine();
        switch (userChoice) {
            case MenuText.OPTION_WRITE -> {
                System.out.println("Write the name of the file");
                outputData[0] = Constants.BASE_PATH_IN+scanner.nextLine()+".txt";
                System.out.println("Write the contents of the file");
                outputData[1] = scanner.nextLine();
                outputData[2] = MenuText.OPTION_WRITE;
            }

            case MenuText.OPTION_READ -> {
                System.out.println("Specify a file name");
                outputData[0] = Constants.BASE_PATH_IN+scanner.nextLine()+".txt";
                outputData[2] = MenuText.OPTION_READ;
            }

            default -> {
                //просто заглушка щоб неламалась програма при неправильному
                //вводі даних
                outputData[2] = "Invalid input";
                System.out.println("Invalid input");
            }

        }
        return outputData;

    }

    public static void getOutput(String outputText) {
        System.out.println(outputText);
    }
}
