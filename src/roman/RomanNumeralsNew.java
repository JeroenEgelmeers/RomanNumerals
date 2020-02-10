package roman;

class RomanNumeralsNew {
  private RomanNumeralsNew() {}

  // Solution A
  static String plus(String left, String right) {
    String total = romanToI(left) + romanToI(right);
    return iToRoman(total);
  }

  // Solution B
  static String minus(String left, String right) {
    String leftToI  = romanToI(left);
    String rightToI = romanToI(right);

    return iToRoman(leftToI.replaceFirst(rightToI, ""));
  }

  // Solution C
  static String multiply(String left, String right) {
    String leftToI  = romanToI(left);
    String rightToI = romanToI(right);

    StringBuilder total = new StringBuilder();
    while(!rightToI.isEmpty()) {
      total.append(leftToI);
      rightToI = rightToI.replaceFirst("I", "");
    }

    return iToRoman(total.toString());
  }

  // Solution D
  static String divide(String left, String right) {
    String leftToI = romanToI(left);
    String rightToI = romanToI(right);

    StringBuilder total = new StringBuilder();
    while(leftToI.contains(rightToI)) {
      total.append("I");
      leftToI = leftToI.replaceFirst(rightToI, "");
    }

    return iToRoman(total.toString());
  }

  private static String romanToI(String input) {
    return input.replaceAll("IV", "IIII")
                .replaceAll("V",  "IIIII")
                .replaceAll("IX", "IIIIIIIII")
                .replaceAll("X",  "IIIIIIIIII");
  }

  private static String iToRoman(String input) {
    return input.replaceAll("IIIIIIIIII", "X")
                .replaceAll("IIIIIIIII",  "IX")
                .replaceAll("IIIII",      "V")
                .replaceAll("IIII",       "IV");
  }
}
