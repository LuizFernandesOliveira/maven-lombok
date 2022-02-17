package features;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class FeatureGetterSetterV2 {
  private String name;
  private Integer age;
  @Setter(AccessLevel.PRIVATE) private BigDecimal salary;

  public FeatureGetterSetterV2(String name, Integer age, BigDecimal salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
}
