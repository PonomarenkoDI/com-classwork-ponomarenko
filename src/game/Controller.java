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

    public void movePerson(game.Map map) {
        int move = getDirection();
        switch (move) {
            case (4): {
                map.goToLeft();
                map.showMap(map.map);
                break;
            }
            case (6): {
                map.goToRight();
                map.showMap(map.map);
                break;
            }
            case (8): {
                map.goToUp();
                map.showMap(map.map);
                break;
            }
            case (2): {
                map.goToDown();
                map.showMap(map.map);
                break;
            }

            default: {
                System.out.println("Вы нажали не верную кнопку!");
            }

        }
    }
}
