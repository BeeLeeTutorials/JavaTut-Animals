package com.beeleeong;

import java.util.ArrayList;

public abstract class Animal {
  public String sound() {
    return "woof";
  }

  public void speak() {
    System.out.println(this.sound());
  }
}
