package com.bridgelabz;
import com.bridglelabz.MoodAnalyzerMain;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class MoodAnalyzerTest {

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
        String mood = moodAnalyzer.analyzeMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", mood);
    }
}