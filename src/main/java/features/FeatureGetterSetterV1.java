package features;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class FeatureGetterSetterV1 {
  @Getter @Setter
  private String name;

  @Getter @Setter
  private Integer age;

  @Getter @Setter(AccessLevel.PRIVATE)
  private BigDecimal salary;

  public FeatureGetterSetterV1(String name, Integer age, BigDecimal salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
}
