package com.example.demo6.entity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Scoreboard {
    private List<Match> matches;

    public Scoreboard() {
        this.matches = new ArrayList<>();
    }

    public void startNewGame(String homeTeam, String awayTeam) {
        Match match = new Match(homeTeam, awayTeam);
       matches.add(match);
    }

    public void updateScore(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        Match match = findMatch(homeTeam, awayTeam);
        if (match != null) {
            match.updateScore(homeScore, awayScore);
        }


    }

    public List<Match> finishGame(String homeTeam, String awayTeam) {
        Match match = findMatch(homeTeam, awayTeam);
        if (match != null) {
            matches.remove(match);
        }
        return null;
    }
//        public List<Match> getGamesInProgressOrderedByTotalScore () {
//            List<Match> inProgressMatches = new ArrayList<>();
//            for (Match match1 : matches) {
//                inProgressMatches.add(match);
//            }
//
//            // Sort by total score (descending) and then by start time (ascending)
//            inProgressMatches.sort(Comparator.comparingInt(Match::getTotalScore).reversed()
//                    .thenComparingInt(matches::indexOf));
//
//            return inProgressMatches;



    private Match findMatch(String homeTeam, String awayTeam) {
        for (Match match : matches) {
            if (match.getHomeTeam().equals(homeTeam) && match.getAwayTeam().equals(awayTeam)) {
                return match;
            }
        }
        return null;
    }



    }

