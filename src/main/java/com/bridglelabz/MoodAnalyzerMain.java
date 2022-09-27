package com.bridglelabz;

public class MoodAnalyzerMain {
    public MoodAnalyzerMain() {
    }

    public String analyzeMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
