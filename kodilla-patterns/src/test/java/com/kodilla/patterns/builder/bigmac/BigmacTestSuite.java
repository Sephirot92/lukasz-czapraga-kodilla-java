package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Bun with Sezame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("Onion")
                .ingredient("Lettuce")
                .build();
        System.out.println(bigmac);

        //When
        int howManybuns = bigmac.getBurgers();
        //Then
        Assert.assertEquals(2, howManybuns);
    }
}
