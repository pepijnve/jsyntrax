package org.atpfivt.jsyntrax.generators.elements;

import org.atpfivt.jsyntrax.util.Pair;

import java.awt.*;

public class BubbleElementBase extends Element {
    // TODO: add href
    public BubbleElementBase(Pair<Integer, Integer> start, Pair<Integer, Integer> end, String text,
                         Pair<Integer, Integer> textPos, Font font, String fontName, Color textColor,
                         int width, Color fill, String tag) {
        super(tag);
        super.start = start;
        super.end = end;
        this.text = text;
        this.textPos = textPos;
        this.font = font;
        this.fontName = fontName;
        this.textColor = textColor;
        this.width = width;
        this.fill = fill;
    }

    String text;
    Pair<Integer, Integer> textPos;
    Font font;
    String fontName;
    Color textColor;
    int width;
    Color fill;
}