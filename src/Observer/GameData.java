package Observer;

import java.util.ArrayList;

public class GameData implements Subject{
    private ArrayList<Observer> observers;
    private Long currentTime;
    private ArrayList<Player> playerDatas;
    private Score score;

    public GameData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(score, currentTime, playerDatas);
        }
    }

    public void dataChanged() {
        notifyObservers();
    }

    public void measureGameData(Score score, Long currentTime, ArrayList<Player> playerDatas) {
        this.score = score;
        this.currentTime = currentTime;
        this.playerDatas = playerDatas;
        dataChanged();
    }

    // 其他方法
}
