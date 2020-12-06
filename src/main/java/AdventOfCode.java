
import challenge.ChallengeManager;
import challenge.days.Day1_0;

import java.io.File;

public class AdventOfCode {

    public static void main(String[] args) {
        ClassLoader cl = AdventOfCode.class.getClassLoader();

        ChallengeManager challengeManager = new ChallengeManager();
        challengeManager.add(new Day1_0("1.0", new File(cl.getResource("./data/1_0.txt").getFile())));

        challengeManager.run("1.0");
    }
}
