package org.example;

import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MassageGateway {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

    private static final String QUOTE_ENDPOINT = "http://192.168.10.124/resources/massages/quote/%s";

    public static Response quote(LocalDate localDate) {
        var webClient = WebClient.create(QUOTE_ENDPOINT.formatted(DATE_FORMATTER.format(localDate))).
                type(MediaType.APPLICATION_JSON_TYPE).
                accept(MediaType.APPLICATION_JSON_TYPE);
        return webClient.get();
    }
}