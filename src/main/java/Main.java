import features.FeatureCleanup;
import features.FeatureNonNull;
import features.FeatureVal;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    new FeatureVal().show();

    new FeatureNonNull().show("Luiz Fernandes de Oliveira", 24);

    new FeatureCleanup().show();
  }
}
