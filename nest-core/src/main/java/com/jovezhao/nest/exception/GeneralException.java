package com.jovezhao.nest.exception;

/**
 * 自定义的异常
 *
 * @author xiangxj
 */
public class GeneralException extends CustomRuntimeException {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 1L;

    public GeneralException(String message) {
        super(message, 510);
    }

    public GeneralException(String message, int code) {
        super(message, code, new Object());
    }

    public GeneralException(String message, String param) {
        super(message, 510, param);
    }

}