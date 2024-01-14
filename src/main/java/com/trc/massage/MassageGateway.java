package com.trc.massage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trc.massage.binding.Response;
import org.apache.cxf.jaxrs.client.WebClient;

import java.time.LocalDate;

public class MassageGateway {

    public static final String ENDPOINT = "http://localhost:38080/massages/";

    private ObjectMapper objectMapper = ObjectMapperFactory.create();

    public Response getMassages(LocalDate date) throws JsonProcessingException {
        WebClient webClient = WebClient.create(ENDPOINT + "quote/yyyy-MM-dd");
        String response = webClient.get(String.class);
        return objectMapper.readValue(response, Response.class);
    }

}
