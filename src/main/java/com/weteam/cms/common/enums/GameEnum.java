package com.weteam.cms.common.enums;

public enum GameEnum {

    GAME_NOT_EXIT("30001", "竞赛不存在");

    /**
     * 错误码
     */
    private String code;
    /**
     * 错误描述
     */
    private String msg;

    private GameEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
