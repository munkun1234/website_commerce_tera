package com.teracom.website_commerce.exception;


import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class CommonException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String code;
    private String message;
    private Integer httpStatus;


    public CommonException(String code, String message, Integer httpStatus) {
        super(message);
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
