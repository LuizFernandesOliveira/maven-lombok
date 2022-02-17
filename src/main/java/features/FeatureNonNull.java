package features;

import lombok.NonNull;

public class FeatureNonNull {
  private String name;

  // Não funciona
  @NonNull private Integer age;

  // Funciona
  public void show(@NonNull String name, Integer age) {
    this.name = name;
    this.age = age;
  }
}
