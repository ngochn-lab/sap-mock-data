package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
public class ResponseDto implements Serializable {

    @Getter
    @Serial
    private static final long serialVersionUID = 1398775962163354764L;

    private int    status  = 1;
    private int    code    = 200;
    private String message = "Request has been processed successfully!";
    private Object data;

    public ResponseDto() {
    }

    public ResponseDto(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "status=" + status +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}