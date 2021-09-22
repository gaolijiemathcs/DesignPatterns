package Observer;

import java.util.ArrayList;

public interface Observer {
    public void update(Score score, Long currentTime, ArrayList<Player> playersData);
}
