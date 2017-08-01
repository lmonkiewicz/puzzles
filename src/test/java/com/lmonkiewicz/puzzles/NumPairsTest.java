package com.lmonkiewicz.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumPairsTest {


    @Test
    void noPairFromEmptyList() {
        int[] data = {};

        final NumPairs numPairs = new NumPairs();
        assertEquals(0, numPairs.countPairsOnArray(data, 1));
    }

    @Test
    void onlyOnePair() {
        int[] data = {-1, 1, 0};


        final NumPairs numPairs = new NumPairs();
        assertEquals(1, numPairs.countPairsOnArray(data, 0));
    }

    @Test
    void threePairsFromSameNumberFewTimes() {
        int[] data = {1, 1, 1};
        final NumPairs numPairs = new NumPairs();

        assertEquals(3, numPairs.countPairsOnArray(data, 2));
    }



    @Test
    void noPairFromEmptyListOnMap() {
        int[] data = {};

        final NumPairs numPairs = new NumPairs();
        assertEquals(0, numPairs.countPairsOnMap(data, 1));
    }

    @Test
    void onlyOnePairOnMap() {
        int[] data = {-1, 1, 0};


        final NumPairs numPairs = new NumPairs();
        assertEquals(1, numPairs.countPairsOnMap(data, 0));
    }

    @Test
    void threePairsFromSameNumberFewTimesOnMap() {
        int[] data = {1, 1, 1};
        final NumPairs numPairs = new NumPairs();

        assertEquals(3, numPairs.countPairsOnMap(data, 2));
    }
}