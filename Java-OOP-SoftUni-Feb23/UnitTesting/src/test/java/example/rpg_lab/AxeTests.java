package example.rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTests {
    private static final int DUMMY_INITIAL_HEALTH = 10;
    private static final int DUMMY_INITIAL_DURABILITY = 10;
    private Dummy target;

    @Before
    public void setUpDummy(){
        Dummy target = new Dummy(DUMMY_INITIAL_HEALTH, DUMMY_INITIAL_DURABILITY);
    }

    @Test
    public void testDurability(){
        //arrange - setup:
        Axe axe = new Axe(10,10);

        //act:
        axe.attack(target);

        //assert:
        Assert.assertTrue(axe.getDurabilityPoints() == 9);

    }

    @Test(expected = IllegalStateException.class)
    public void testAttackBroken(){
        //arrange:
        Axe axe = new Axe(10, 0);

        //act:
        axe.attack(target);
    }
}
