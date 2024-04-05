package org.karsun;

public class OrderValidResponse {
    
    private Boolean valid = false;
    private String message;

    public OrderValidResponse() {

    }

    public OrderValidResponse(Boolean valid, String message) {
        this.valid = valid;
        this.message = message;
    }

    public Boolean getValid() {
        return this.valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
