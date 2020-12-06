package challenge;

import java.util.ArrayList;
import java.util.List;

public class ChallengeManager {

    private List<Challenge> challengeList;

    public ChallengeManager() {
        this.challengeList = new ArrayList<>();
    }

    public void add(Challenge challenge) {
        this.challengeList.add(challenge);
    }

    public void run(String id) {
        this.challengeList.stream().filter(challenge -> challenge.getId().equals(id)).forEach(Challenge::run);
    }
}
