package challenge.days;

import challenge.Challenge;

import java.io.File;
import java.util.List;

public class Day1_0 extends Challenge {
    public Day1_0(String id, File data) {
        super(id, data);
    }

    @Override
    public void run() {
        System.out.println(getLines());
        System.out.println("-----");
        System.out.println(getString());
        System.out.println("-----");
    }
}
