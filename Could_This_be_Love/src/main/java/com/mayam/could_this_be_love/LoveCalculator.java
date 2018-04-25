package com.mayam.could_this_be_love;

import java.util.Random;

public class LoveCalculator {
    public static void main(String[] args) {
        System.out.println("Your love score is"
        +ifYouHadMylove("Mr X","Miss Y"));

    }


public static int ifYouHadMylove(String yourName, String theirsName){
    Random random = new Random();
    int loveScore = random.nextInt(101);
    if (loveScore>80){
        System.out.println(yourName+"and"+theirsName+"You love each other as Kanye loves Kanye");
    }else if (loveScore>40){
        System.out.println(yourName+" and "+theirsName+" You go together like coke and menthos");
    }
    else {
        System.out.println(yourName+" and "+theirsName+" ,No love possible, you 'll die alone");
    }
    return loveScore;
}
}
