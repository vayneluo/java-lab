package org.lattice.java.lab.utils.enums;

/**
 * @description: 常用字符串常量池
 * @author: lattice
 * @date: 2023/2/20 1:53 PM
 */
public enum StringPool {

    /**
     * 空字符串
     */
    EMPTY(""),

    /**
     * 空格
     */
    SPACE(" "),

    /**
     * 点
     */
    DOT("."),

    /**
     * 逗号
     */
    COMMA(","),

    /**
     * 冒号
     */
    COLON(":"),

    /**
     * 分号
     */
    SEMICOLON(";"),

    /**
     * 下划线
     */
    UNDERLINE("_"),

    /**
     * 短横线
     */
    HYPHEN("-"),

    /**
     * 竖线
     */
    VERTICAL_LINE("|"),

    /**
     * 双引号
     */
    DOUBLE_QUOTES("\""),

    /**
     * 单引号
     */
    SINGLE_QUOTES("'"),

    /**
     * 左括号
     */
    LEFT_BRACKET("("),

    /**
     * 右括号
     */
    RIGHT_BRACKET(")"),

    /**
     * 左中括号
     */
    LEFT_MIDDLE_BRACKET("["),

    /**
     * 右中括号
     */
    RIGHT_MIDDLE_BRACKET("]"),

    /**
     * 左大括号
     */
    LEFT_BIG_BRACKET("{"),

    /**
     * 右大括号
     */
    RIGHT_BIG_BRACKET("}"),

    /**
     * 等于号
     */
    EQUALS("="),

    /**
     * 与号
     */
    AND("&"),

    /**
     * 问号
     */
    QUESTION_MARK("?"),

    /**
     * 百分号
     */
    PERCENT("%"),

    /**
     * 井号
     */
    NUMBER_SIGN("#"),

    /**
     * 美元符号
     */
    DOLLAR("$"),

    /**
     * 星号
     */
    ASTERISK("*"),

    /**
     * 加号
     */
    PLUS("+"),

    /**
     * 减号
     */
    MINUS("-"),

    /**
     * 斜杠
     */
    SLASH("/"),

    /**
     * 反斜杠
     */
    BACKSLASH("\\"),

    /**
     * 回车
     */
    CR("\r"),

    /**
     * 换行
     */
    LF("\n"),
    ;

    StringPool() {
    }

    private String value;

    StringPool(String value) {
        this.value = value;
    }
}
