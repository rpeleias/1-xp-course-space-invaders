package com.clickbus.xpcourse.jogos;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import javax.xml.ws.RespectBinding;

import static org.junit.Assert.assertEquals;

public class ScenarioOfGilverTest {

    Jogo jogo;

    @Before
    public void setup() {
        this.jogo = new SpaceOfGilver();
    }

    @Test
    public void testTela() {
        String expected = "";
        expected += "     \n";
        expected += "     \n";
        expected += "     \n";
        expected += "     \n";
        expected += "     \n";
        assertEquals(expected, jogo.tela());
    }

    @Test
    public void testSpaceTicked() {
        String expected = "";
        expected += "     \n";
        expected += "     \n";
        expected += "     \n";
        expected += "     \n";
        expected += "  A  \n";
        jogo.tick();
        assertEquals(expected, jogo.tela());
    }

    @Ignore
    @Test
    public void testMoveLeft() {
        String expectedFirstMove = "";
        expectedFirstMove += "     \n";
        expectedFirstMove += "     \n";
        expectedFirstMove += "     \n";
        expectedFirstMove += "     \n";
        expectedFirstMove += " A   \n";
        jogo.tick();
        jogo.esquerda();
        assertEquals(expectedFirstMove, jogo.tela());

        String expectedSecondMove = "";
        expectedSecondMove += "     \n";
        expectedSecondMove += "     \n";
        expectedSecondMove += "     \n";
        expectedSecondMove += "     \n";
        expectedSecondMove += "A    \n";
        jogo.tick();
        jogo.esquerda();
        assertEquals(expectedSecondMove, jogo.tela());

        String expectedThirdMove = "";
        expectedThirdMove += "     \n";
        expectedThirdMove += "     \n";
        expectedThirdMove += "     \n";
        expectedThirdMove += "     \n";
        expectedThirdMove += "A    \n";
        jogo.tick();
        jogo.esquerda();
        assertEquals(expectedThirdMove, jogo.tela());
    }
}
