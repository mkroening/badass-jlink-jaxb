package io.github.mwkroening.badassjlinkjaxb;

import javax.xml.bind.JAXB;

public class App {
  public String greeting = "Hello World.";

  public static void main(String[] args) {
    JAXB.marshal(new App(), System.out);
  }
}
