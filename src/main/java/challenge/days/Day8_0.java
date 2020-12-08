package challenge.days;

import challenge.Challenge;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class Day8_0 extends Challenge {

    public Day8_0(String id, File data) {
        super(id, data);
    }

    @Override
    public void run() {
        int accumulator = 0;
        int instructionNumber = 0;
        Set<Integer> seen = new HashSet<>();

        String[] instructions = getString().split("\\n");
        while (true) {
            if (seen.contains(instructionNumber)) {
                System.out.println("accumulator : " + accumulator);
                break;
            }
            seen.add(instructionNumber);
            String[] splits = instructions[instructionNumber].split(" ");
            int parsedInt = Integer.parseInt(splits[1]);
            if (splits[0].equals("nop")) {
                instructionNumber++;
            }
            if (splits[0].equals("acc")) {
                accumulator += parsedInt;
                instructionNumber += 1;
            }
            if (splits[0].equals("jmp")) {
                instructionNumber += parsedInt;
            }

        }
    }
}
