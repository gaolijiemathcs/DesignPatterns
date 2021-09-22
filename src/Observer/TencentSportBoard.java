package Observer;

import java.util.ArrayList;

public class TencentSportBoard implements Observer, DisplayElement{
    private Long currentTime;
    private ArrayList<Player> playerDatas;
    private Score score;

    private Subject gameData;

    public TencentSportBoard(Subject gameData) {
        this.gameData = gameData;
        // 当前观察者注册到主题对象中
        gameData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Here is TencentSport: ");
        System.out.println(this.score);
        System.out.println(this.currentTime);
        for(Player player : playerDatas) {
            System.out.println(player);
        }
    }

    @Override
    public void update(Score score, Long currentTime, ArrayList<Player> playersData) {
        this.currentTime = currentTime;
        this.playerDatas = playersData;
        this.score = score;
        display();
    }
}
