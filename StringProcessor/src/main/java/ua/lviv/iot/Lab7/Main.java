package ua.lviv.iot.Lab7;

public class Main {

  public static void main(final String[] args) {
      StringProcessor text = new StringProcessor();
      String line = StringProcessor.readInputText();
      text.showResults(text.makeAllLastLettersUpper(line));
  }

}
