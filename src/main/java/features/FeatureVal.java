package features;

import lombok.val;

import java.util.ArrayList;

public class FeatureVal {
  public static void show() {
    val messages = new ArrayList<>();

    // Not modified after initialize
    // message = "";

    // Usages
    for (val message : messages) {
      System.out.println(message);
    }
  }
}
