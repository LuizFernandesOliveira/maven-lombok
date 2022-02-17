package features;

import lombok.ToString;

@ToString
public class FeatureToString {
  @ToString.Exclude private Integer id;
  private String name;
  private Integer age;

  public FeatureToString(Integer id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public void show() {
//    System.out.println(this);
  }
}
