package Observer_util;

public class Player {
    private String name;
    private Integer score;
    private Integer fouls;

    public Player(String name, Integer score, Integer fouls) {
        this.name = name;
        this.score = score;
        this.fouls = fouls;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setFouls(Integer fouls) {
        this.fouls = fouls;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getFouls() {
        return fouls;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", fouls=" + fouls +
                '}';
    }
}
