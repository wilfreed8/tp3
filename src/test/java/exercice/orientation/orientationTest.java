package exercice.orientation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class orientationTest {
    orientation actualOrientation;
    String expectedOrientation;
    @BeforeEach
            void setUp() {
         actualOrientation = new orientation();
        expectedOrientation = "";
    }
    @AfterEach
    void tearDown() {
        expectedOrientation=null;
        actualOrientation=null;
    }



    @Test
    void devrait_donner_comme_orientation_nord() {

        //When
        String expectedOrientation = "nord";
        //Given
        String actualOrientation = orientation.tourner(0);
        //
        assertThat(actualOrientation).isEqualTo(expectedOrientation);
    }


    @Test
    void devrait_donner_comme_orientation_Est() {
        //When
        String expectedOrientation = "Est";
        //Given
        String actualOrientation = orientation.tourner(1);
        //
        assertThat(actualOrientation).isEqualTo(expectedOrientation);
    }

}
