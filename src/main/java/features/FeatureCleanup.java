package features;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class FeatureCleanup {
  public void show() throws IOException {
    // Assim que o escopo fecha o Cleanup fecha o objeto que está aberto
    @Cleanup InputStream in = new FileInputStream("text.txt");
    byte[] b = new byte[10000];
    while (true) {
      int r = in.read(b);
      if (r == -1) break;
//      System.out.println(r);
    }
  }
}
