package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(text));
        return poemDecorator.decorate(text);
    }
}
