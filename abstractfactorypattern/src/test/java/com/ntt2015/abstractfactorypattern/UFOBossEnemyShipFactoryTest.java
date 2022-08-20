package com.ntt2015.abstractfactorypattern;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UFOBossEnemyShipFactoryTest {
    @BeforeAll
    static void beforeAll() {
    }
    @AfterAll
    static void afterAll() {
    }
    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }

    /*
     *  testing data
     */
    UFOBossEnemyShipFactory testData;

    @Test
    void Test001() {
        // process array of tags
        assertEquals(0,0);
        assertNotEquals(0,1);
    }

    /**
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
    }
}