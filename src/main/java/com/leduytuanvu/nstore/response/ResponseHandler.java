package com.leduytuanvu.nstore.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.LinkedHashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> responseBuilder(
            ResponseCustom responseCustom
    ) {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("statusCode", responseCustom.getStatusCode());
        response.put("message", responseCustom.getMessage());
        response.put("data", responseCustom.getData());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
