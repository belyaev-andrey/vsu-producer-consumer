package org.example;

public class Container {

    private String content;

    public String getContent() {
        String s = content;
        content = null;
        return s;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
