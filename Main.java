package com.example.demo6.entity;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.startNewGame("Mexico", "Canada");
        scoreboard.startNewGame("Spain", "Brazil");
        scoreboard.startNewGame("Germany", "France");
        scoreboard.startNewGame("Uruguay", "Italy");
        scoreboard.startNewGame("Argentina", "Australia");
        scoreboard.updateScore("Mexico", "Canada", 0, 5);
        scoreboard.finishGame("Mexico", "Canada");

        Match match = null;
        System.out.println(match.getHomeTeam() + " " + match.getHomeScore() + " - " +
                match.getAwayScore() + " " + match.getAwayTeam());

    }
}