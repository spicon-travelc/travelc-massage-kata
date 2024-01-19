package com.trc.massage;

import org.junit.jupiter.api.Test;

import java.time.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SetupTest {

    @Test
    public void setup() {
        assertFalse(true);
    }

    @Test
    public void quoteMassages() {
        var massageAvail = new MassageAvail();
//
//        var result = massageAvail.quote(LocalDate.now());
//
//        assertThat(result, is(notNullValue()));
//        assertThat(result.code,is(notNullValue()));
//        assertThat(result.name,is(notNullValue()));
//        assertThat(result.status,is(notNullValue()));
//        assertThat(result.duration,is(notNullValue()));
//        assertThat(result.price,is(notNullValue()));
//        assertThat(result.cancelPollicies,is(notNullValue()));
    }

}
