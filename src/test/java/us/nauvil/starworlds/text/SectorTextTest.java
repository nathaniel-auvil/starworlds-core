package us.nauvil.starworlds.text;


import org.junit.Test;
import us.nauvil.starworlds.Sector;

public class SectorTextTest {

    @Test
    public void testTextUI() {

        Sector s = Sector.createRandom("test");
        SectorText st = new SectorText();

        System.out.println(st.textUI(s));

    }


}
