package org.entu;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test() {
        new App().printMeditation();
    }

    @Test
    public void testSequence() {
        new Sequence();
    }

    @Test
    public void testStep() {
        assertThat(new Step(10).duration());
    }


}
