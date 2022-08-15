package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    private int getDirection() {
        int direction = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            direction = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            System.out.println("Ошибка ввода");
        }
        return direction;
    }

    public void novePerson(Map map) {
        int move = getDirection();
        switch (move) {
            case (4): {
                map.goToLeft();
                break;
            }
            case (6): {
                map.goToRight();
                break;
            }
            case (8): {
                map.goToUp();
                break;
            }
            case (2): {
                map.goToDown();
                break;
            }

            default: {
                System.out.println("Вы нажали не верную кнопку!");
            }

        }
    }
}
