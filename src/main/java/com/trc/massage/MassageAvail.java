package com.trc.massage;

import com.trc.massage.binding.*;
import org.apache.cxf.common.i18n.*;

import java.time.*;
import java.util.*;

public class MassageAvail {
    private MassageGateway gateway = new MassageGateway();

    public List<Massage> quote(LocalDate date) {
        var r = gateway.getMassages(date);

        if (!r.getError().isEmpty()) {
            throw new RuntimeException(r.getError());
        }
        r.getMassages().stream().filter(m -> m.getStatus().equals("AVAILABLE"));

        return response;
    }
}
