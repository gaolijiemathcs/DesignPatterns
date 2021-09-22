package Observer;

import java.util.ArrayList;

public class WeiboSportBoard implements Observer, DisplayElement {
    private Long currentTime;
    private ArrayList<Player> playerDatas;
    private Score score;

    private Subject gameData;

    public WeiboSportBoard(GameData gameData) {
        this.gameData = gameData;
        gameData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Here is WeiboSport: ");
        ArrayList<Player> mvps = getMvp(playerDatas);
        for(Player p : mvps) {
            System.out.println(p);
        }
    }

    public ArrayList<Player> getMvp(ArrayList<Player> ps) {
        int maxScore = 0;
        ArrayList<Player> ans = new ArrayList<Player>();
        for(int i = 0; i < ps.size(); i++) {
            if(maxScore < ps.get(i).getScore()) {
                maxScore = ps.get(i).getScore();
                ans.clear();
                ans.add(ps.get(i));
            } else if(maxScore == ps.get(i).getScore()) {
                ans.add(ps.get(i));
            }
        }
        return ans;
    }

    @Override
    public void update(Score score, Long currentTime, ArrayList<Player> playersData) {
        this.currentTime = currentTime;
        this.playerDatas = playersData;
        this.score = score;
        display();
    }
}
