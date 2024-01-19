package com.trc.massage;

import org.junit.jupiter.api.*;

import java.time.*;
import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class GatewayIT {

    private final MassageGateway gateway = new MassageGateway();

    @Test
    public void availit() {
        var response = gateway.getMassages(LocalDate.now().plusDays(15));
        assertThat(response.getMassages(), is(notNullValue()));
        assertThat(response.getError(), is(nullValue()));
    }

    @Test
    public void availit14() {
        var response = gateway.getMassages(LocalDate.now().plusDays(14));
        assertThat(response.getError(), is(notNullValue()));
        assertThat(response.getError(), is("La antelación mínima para reservar es de 15 días"));
    }
}
