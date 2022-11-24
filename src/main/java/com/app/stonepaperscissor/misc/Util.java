package com.app.stonepaperscissor.misc;

public class Util {

    private static final String[] options = {"Stone", "Paper", "Scissor"};

    public static String generateChoice() {
        int choice = ((int)(Math.random()*10))%3;
        return options[choice];
    }

    public static String assessStatus(String player, String computer) {
        switch (player) {
            case "Stone" -> {
                switch (computer) {
                    case "Paper":
                        return "Computer wins";
                    case "Stone":
                        return "It is a tie";
                    case "Scissor":
                        return "Player wins";
                }
            }
            case "Paper" -> {
                switch (computer) {
                    case "Scissor":
                        return "Computer wins";
                    case "Paper":
                        return "It is a tie";
                    case "Stone":
                        return "Player wins";
                }
            }
            case "Scissor" -> {
                switch (computer) {
                    case "Stone":
                        return "Computer wins";
                    case "Scissor":
                        return "It is a tie";
                    case "Paper":
                        return "Player wins";
                }
            }
            default -> { return "Invalid choice"; }
        }
        return "";
    }

}
