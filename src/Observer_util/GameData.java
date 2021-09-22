package Observer_util;

import Observer.Observer;

import java.util.ArrayList;
import java.util.Observable;

// 实现Observable 为Subject
public class GameData extends Observable {
    private Long currentTime;
    private ArrayList<Player> playerDatas;
    private Score score;

    public GameData() { }

    // 不需要追踪、注册、删除观察者（超类已经完成）

    public void dataChanged() {
        // 在调用notifyObservers() 之前需要调用setChanged来表明数据状态已经改变
        setChanged();
        // 在明确了数据改变过后才会通知观察者
        // 我们没有传输GameData的数据 使用的是“拉” 的方式
        notifyObservers();
    }

    public void measureGameData(Score score, Long currentTime, ArrayList<Player> playerDatas) {
        this.score = score;
        this.currentTime = currentTime;
        this.playerDatas = playerDatas;
        dataChanged();
    }

    // 这种写法需要使用“拉”的方式 所以观察者会使用这个方法来获取GameData的数据
    public Long getCurrentTime() {
        return currentTime;
    }

    public ArrayList<Player> getPlayerDatas() {
        return playerDatas;
    }

    public Score getScore() {
        return score;
    }

}
