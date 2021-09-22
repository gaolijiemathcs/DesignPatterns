package Observer_util;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

// 观察者需要实现java.util内置的Observer
public class TencentSportBoard implements Observer, DisplayElement {
    // 需要定义Observable类属性 在构造器启动的时候将参数初始化
    Observable observable;
    private Long currentTime;
    private ArrayList<Player> playerDatas;
    private Score score;

    // 构造器 需要一个Observer当做参数 并且将TencentSportBoard.observable作为参数传入
    public TencentSportBoard(Observable observable) {
        this.observable = observable;
        // 将当前对象登记注册为观察者
        observable.addObserver(this);
    }

    /**
     *  这里是以"拉"的方式表示将数据从Observable（Subject）拉取的
     * @param obs 对象为Observable对象
     * @param arg 数据对象
     */
    @Override
    public void update(Observable obs, Object arg) {
        // 先确定这个数据对象是GameData类型 然后利用get方法获取对应的数据 并且展示
        if(obs instanceof GameData) {
            GameData gameData = (GameData) obs;
            this.currentTime = gameData.getCurrentTime();
            this.playerDatas = gameData.getPlayerDatas();
            this.score = gameData.getScore();
            display();
        }
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

}
