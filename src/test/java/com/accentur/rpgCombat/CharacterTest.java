package com.accentur.rpgCombat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void startingCharacterHasHealthOf1000 () {

        //GIVEN
        Character conan = new Character("Conan");

        //WHEN
        var sut = conan.getHealth();

        //THEN
        assertEquals(1000, sut);

    }

    @Test
    void startingCharacterHasLevelOfOne () {

        //GIVEN
        Character scorpion = new Character( "Scorpion");

        //WHEN
        var sut = scorpion.getLevel();

        //THEN
        assertEquals( 1, sut);

    }

    @Test
    void startingCharacterIsAlive() {

        //GIVEN
        Character terminator = new Character ("Terminator");

        //WHEN
        var sut = terminator.isAlive();

        //THEN
        assertEquals(true, sut);
    }
}