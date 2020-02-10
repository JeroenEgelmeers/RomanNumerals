package roman;

class RomanNumerals {

  private RomanNumerals() {}

  static String add(String left, String right) {
    String total = toI(left) + toI(right);

    if (total.equals("IIII")) {
      total = "IV";
    }

    total = total.replaceAll("IIIII", "V");
    total = total.replaceAll("VV", "X");
    total = total.replaceAll("VIIII", "IX");
    total = total.replaceAll("IIVII", "IX");
    total = total.replaceAll("XIIII", "XIV");

    return total;
  }

  static String toI(String input) {
    return input.replaceAll("IV", "IIII")
                .replaceAll("V", "IIIII")
                .replaceAll("X", "IIIIIIIIII");
  }
}
