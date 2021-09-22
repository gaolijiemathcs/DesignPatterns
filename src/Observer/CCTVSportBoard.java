package Observer;

import java.util.ArrayList;

public class CCTVSportBoard implements Observer, DisplayElement{
    private Long currentTime;
    private ArrayList<Player> playerDatas;
    private Score score;

    private Subject gameData;

    public CCTVSportBoard(GameData gameData) {
        this.gameData = gameData;
        gameData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Here is CCTVSport: ");
        System.out.println(score);
    }

    @Override
    public void update(Score score, Long currentTime, ArrayList<Player> playersData) {
        this.currentTime = currentTime;
        this.playerDatas = playersData;
        this.score = score;
        display();
    }
}
