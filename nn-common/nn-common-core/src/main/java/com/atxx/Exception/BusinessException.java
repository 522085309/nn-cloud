package com.atxx.Exception;

import lombok.*;

/**
 * @author:XJ
 */
@Getter
@Setter
@ToString
public class BusinessException extends RuntimeException{
    private Integer code;
    private String msg;

    public BusinessException( Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(Throwable cause, String msg) {
        super(cause);
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
