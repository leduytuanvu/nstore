package com.leduytuanvu.nstore.response;

public class ResponseCustom {
    private Integer statusCode;
    private String message;
    private Object data = null;

    public ResponseCustom() {
    }

    public ResponseCustom(Integer status, String message, Object data) {
        this.statusCode = status;
        this.message = message;
        this.data = data;
    }

    public ResponseCustom setResponseCustom200(Object data) {
        this.statusCode = 200;
        this.message = "Success";
        this.data = data;
        return this;
    }

    public ResponseCustom setResponseCustom404(String message) {
        this.statusCode = 404;
        this.message = message;
        this.data = null;
        return this;
    }

    public ResponseCustom setResponseCustom400(String message) {
        this.statusCode = 400;
        this.message = message;
        this.data = null;
        return this;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer status) {
        this.statusCode = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
