package com.dominos.test;

public class CharacterCounter {
  public int count(String keyword, char ch) {
    return keyword.length() + Integer.valueOf(ch);
  }
}
