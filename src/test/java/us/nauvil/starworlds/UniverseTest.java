package us.nauvil.starworlds;


import org.junit.Test;

public class UniverseTest {

    @Test
    public void testCreate() {
        Universe u = Universe.createRandom("test");
        System.out.println(u);

        System.out.println(u.textUI());
    }

}
