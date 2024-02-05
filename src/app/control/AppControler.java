package app.control;

import app.model.FileReadService;
import app.model.FileWriteService;
import app.view.AppMenu;
import app.utils.MenuText;

public class AppControler {

    public void startApp() {
        String[] dataFromUser = AppMenu.choiceOptionMenu();

        switch (dataFromUser[2]) {
            case MenuText.OPTION_WRITE -> AppMenu.getOutput(
                    FileWriteService.writeToFile(
                            dataFromUser[0],
                            dataFromUser[1]));

            case MenuText.OPTION_READ -> AppMenu.getOutput(
                    FileReadService.readFromFile(
                            dataFromUser[0]));


        }

    }
}
