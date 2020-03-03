import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {




        Pets dog1 = new Dog("Bazooka", 2, false, "moof");
        Dog dog2 = new Dog("Goofy", 7, true, "whoof");
        Pets dog3 = new Dog();




    @Test
    public void setPetName() {
        dog1.setPetName("JJ");
        assertEquals("JJ", "Bazooka");
        dog3.setPetName("AK");
        assertEquals("AK", dog3.getPetName());
    }

    @Test
    public void setPetWeight() {
        dog1.setPetWeight(3);
        assertEquals(3, dog1.getPetWeight());
        dog3.setPetWeight(3);
        assertEquals(4, dog3.getPetWeight());
    }

    @Test
    public void isSold() {
        assertFalse("Not Sold",dog1.isSold());
    }

    @Test
    public void setSold() {
        dog1.setSold(false);
        assertEquals(false, dog1.isSold());
        dog3.setSold(true);
        assertEquals(true, dog3.isSold());
    }

    }
