package org.atpfivt.jsyntrax.units.nodes;

import org.atpfivt.jsyntrax.styles.Style;
import org.atpfivt.jsyntrax.units.Unit;

public class Node implements Unit {
  Style style;
  String text;

  public Node(String text) {
    this.text = text;
  }

  public Node(Style style, String text) {
    this.style = style;
    this.text = text;
  }

  @Override
  public String toString() {
    return text;
  }
}