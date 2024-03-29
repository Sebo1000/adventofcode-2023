package com.seb.common.day;

import com.seb.core.AbstractPuzzle;
import com.seb.core.PuzzlePart;
import com.seb.core.PuzzleRunner;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.NotImplementedException;

@Slf4j
public class Day extends AbstractPuzzle {

    public static void main(String[] args) {
        PuzzleRunner.run(new Day());
    }

    private String[] lines;

    @Override
    public boolean isSample() {
        return true;
    }

    @Override
    public PuzzlePart runPart() {
        return PuzzlePart.ALL;
    }

    @Override
    public void commonPart(String rawInput) {
        lines = splitInputLines(rawInput);
    }

    @Override
    public String solvePart1(String rawInput) {
        throw new NotImplementedException("Solve me !");
    }

    @Override
    public String solvePart2(String rawInput) {
        throw new NotImplementedException("Solve me !");
    }

}

