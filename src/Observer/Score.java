package Observer;

public class Score {
    private Integer homeTeamScore;
    private Integer awayTeamScore;

    public void setHomeTeamScore(Integer homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public void setAwayTeamScore(Integer awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public Score(Integer homeTeamScore, Integer awayTeamScore) {
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
    }

    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    public Integer getAwayTeamScore() {
        return awayTeamScore;
    }

    @Override
    public String toString() {
        return "Score{" +
                "homeTeamScore=" + homeTeamScore +
                ", awayTeamScore=" + awayTeamScore +
                '}';
    }
}
