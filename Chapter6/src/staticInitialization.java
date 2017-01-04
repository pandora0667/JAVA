/**
 * Created by jusk2 on 2017-01-04.
 */
public class staticInitialization {

  static String company = "Microsoft";
  static String model = "Surface Pro 4";
  static String info;

  static {
    info = company + " - " +  model;
  }
}
