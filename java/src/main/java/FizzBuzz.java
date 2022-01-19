public class FizzBuzz {
  enum Dividers {
    FIFTEEN(15, "fizzbuzz"),
    FIVE(5, "buzz"),
    THREE(3, "fizz");

    public final String translation;
    public final int value;

    Dividers(int value, String translation) {
      this.value = value;
      this.translation = translation;
    }
  }

  public static String convert(int number) {
    for (Dividers divider : Dividers.values()) {
      if (isDivisibleBy(number, divider.value)) return divider.translation;
    }
    return String.valueOf(number);
  }

  private static boolean isDivisibleBy(int number, int divider) {
    return number % divider == 0;
  }
}
