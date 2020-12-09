
import challenge.ChallengeManager;
import challenge.days.Day8_0;
import challenge.days.Day8_1;

import java.io.File;

public class AdventOfCode {

    public static void main(String[] args) {
        ClassLoader cl = AdventOfCode.class.getClassLoader();

        ChallengeManager challengeManager = new ChallengeManager();
        challengeManager.add(new Day8_0("8.0", new File(cl.getResource("./data/8_0.txt").getFile())));
        challengeManager.add(new Day8_1("8.1", new File(cl.getResource("./data/8_0.txt").getFile())));

        challengeManager.run("8.1");
    }
}
