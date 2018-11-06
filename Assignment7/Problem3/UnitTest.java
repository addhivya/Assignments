package Assignment7.Problem3;

import org.junit.*;

import static org.junit.Assert.*;


public class UnitTest {

    Scissors s = new Scissors(5);
    Paper p = new Paper(7);
    Rock r = new Rock(15);

    @Test
    public void setStrength() {
        assertEquals(5,s.strength);
        assertEquals(7,p.strength);
        assertEquals(15,r.strength);
    }

    @Test
    public void rockPaperSissorGame() {
        assertTrue(s.fight(p));
        assertFalse(p.fight(s));
        assertTrue(p.fight(r));
        assertFalse(r.fight(p));
        assertTrue(r.fight(s));
        assertFalse(s.fight(r));
    }
}
