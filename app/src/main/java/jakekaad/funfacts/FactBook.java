package jakekaad.funfacts;

import java.util.Random;

/**
 * Created by Guest on 4/14/15.
 */
public class FactBook {
    // Member Variables
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes of light from the Sun to reach the Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };


    // Methods (Abilities: things the object can do)
    public String getFact() {


        String fact = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = randomNumber + "";


        fact = mFacts[randomNumber];

        return fact;
    }
}
