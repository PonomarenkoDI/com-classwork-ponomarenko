package game;
public class Game {
    public static void main(String[] args) {
        Game obj = new Game();
        Map map = new Map();
        obj.creatMap(map);
        obj.creatStone(map);
        obj.showMap(map.map);
    }

    public void creatMap(Map map) {
        map.map = new char[10][10];
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = '_';
            }
        }
    }

    public void showMap(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void creatStone(Map map) {
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = (char) (Math.random() * 100);
                if (map.map[i][j] > 80) {
                    map.map[i][j] = 'X';
                } else
                    map.map[i][j] = '_';
            }
        }
    }
}
