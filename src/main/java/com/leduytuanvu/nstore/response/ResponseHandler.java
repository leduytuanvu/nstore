package com.leduytuanvu.nstore.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> responseBuilder(
            HttpStatus httpStatus,
            String message,
            Object responseObject
    ) {
        Map<String, Object> response = new HashMap<>();
        response.put("httpStatus", httpStatus);
        response.put("message", message);
        response.put("data", responseObject);

        return new ResponseEntity<>(response, httpStatus);
    }
}
