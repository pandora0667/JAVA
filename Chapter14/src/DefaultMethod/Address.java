package DefaultMethod;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class Address {
  private String country;
  private String city;

  public Address(String country, String city) {
    this.country = country;
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public String getCity() {
    return city;
  }
}
