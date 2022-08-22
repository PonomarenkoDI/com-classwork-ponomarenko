package game;

public class Game {
    public static void main(String[] args) {
        Game obj = new Game();
        Map map = new Map();
        Controller cont = new Controller();
        obj.creatMap(map);
        obj.creatStone(map);
        obj.creatStone(map);
        map.addPlayer(9, 0);
        map.showMap(map.map);

        while (map.x != 0 || map.y != 9) {
            cont.movePerson(map);
            if (map.x == 0 && map.y == 9) {
                System.out.println("The end!;)");
            }
        }

    }

    public void creatMap(Map map) {
        map.map = new char[10][10];
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = '_';
            }
        }
    }

    public void creatStone(Map map) {
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = (char) (Math.random() * 100);
                if (map.map[i][j] >= 80) {
                    map.map[i][j] = 'X';
                } else
                    map.map[i][j] = '_';
            }
        }
    }
}
