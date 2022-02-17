import features.FeatureCleanup;
import features.FeatureGetterSetterV1;
import features.FeatureGetterSetterV2;
import features.FeatureNonNull;
import features.FeatureToString;
import features.FeatureVal;

import java.io.IOException;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) throws IOException {
    new FeatureVal().show();

    new FeatureNonNull().show("Luiz Fernandes de Oliveira", 24);

    new FeatureCleanup().show();

    // setSalary is not present
    new FeatureGetterSetterV1("Nando", 24, BigDecimal.TEN);
    // setSalary is not present
    new FeatureGetterSetterV2("Nando", 24, BigDecimal.TEN);

    new FeatureToString(1, "Nando", 24).show();
  }
}
