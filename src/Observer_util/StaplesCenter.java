package Observer_util;


import java.util.ArrayList;

public class StaplesCenter {
    public static void main(String[] args) {
        GameData gameData = new GameData();
        TencentSportBoard tencentSportBoard = new TencentSportBoard(gameData);

        Score score = new Score(0, 0);
        Long currentTime = 1631966274L;
        ArrayList<Player> playerDatas = new ArrayList<Player>();
        Player p1 = new Player("Kobe", 0, 0);
        playerDatas.add(p1);

        gameData.measureGameData(score, currentTime, playerDatas);
    }
}
