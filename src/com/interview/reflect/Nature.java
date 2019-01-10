package com.interview.reflect;

import java.io.Serializable;

/**
 * @author  : gaoti
 */
public class Nature implements Serializable,Cloneable {
    public static final long serializableUID = -2143455632456L;

    //民族
    private String ethnic;
    //语言
    private String language;

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public Nature(String ethnic, String language) {
        this.ethnic = ethnic;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Nature{" +
                "ethnic='" + ethnic + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
