package challenge.days;

import challenge.Challenge;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class Day8_1 extends Challenge {

    public Day8_1(String id, File data) {
        super(id, data);
    }

    @Override
    public void run() {
        String[] oldInstructions = getString().split("\\n");

        for (int i = 0; i < oldInstructions.length; i++) {
            String[] instructions = oldInstructions.clone();
            String[] splits = instructions[i].split(" ");
            if (splits[0].equals("nop")) {
                instructions[i] = "jmp" + " " + splits[1];
            }
            else if (splits[0].equals("jmp")) {
                instructions[i] = "nop" + " " + splits[1];
            }

            int accumulator = 0;
            int instructionNumber = 0;
            int terminator = 0;

            while (instructionNumber >= 0 && instructionNumber < instructions.length && terminator < 1000) {
                terminator++;
                String[] words = instructions[instructionNumber].split(" ");
                int parsedInt = Integer.parseInt(words[1]);
                if (words[0].equals("acc")) {
                    accumulator += parsedInt;
                    instructionNumber += 1;
                } else if (words[0].equals("nop")) {
                    instructionNumber++;
                } else if (words[0].equals("jmp")) {
                    instructionNumber += parsedInt;
                }
            }
            if (instructionNumber == instructions.length) {
                System.out.println("accumulator : " + accumulator);
            }
        }
    }
}
