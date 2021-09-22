package Observer;

import java.util.ArrayList;

public class StaplesCenter {
    public static void main(String[] args) {
        GameData gameData = new GameData();
        TencentSportBoard tencentSportBoard = new TencentSportBoard(gameData);
        CCTVSportBoard cctvSportBoard = new CCTVSportBoard(gameData);
        WeiboSportBoard weiboSportBoard = new WeiboSportBoard(gameData);

        Score score = new Score(0, 0);
        Long currentTime = 1631966274L;
        ArrayList<Player> playerDatas = new ArrayList<Player>();
        Player p1 = new Player("Kobe", 0, 0);
        playerDatas.add(p1);

        gameData.measureGameData(score, currentTime, playerDatas);

        System.out.println("=========================");

        playerDatas.clear();
        p1.setScore(81);
        playerDatas.add(p1);
        currentTime = 1631966551L;
        score.setAwayTeamScore(102);
        score.setHomeTeamScore(122);
        gameData.measureGameData(score, currentTime, playerDatas);

    }
}
