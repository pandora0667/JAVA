package org.jusk2.practicejava;

/**
 * Created by jusk2 on 2017-01-11.
 */

public class ShopService {

  private static ShopService singleton = new ShopService();

  private ShopService() {}

  static ShopService getInstance() {
    return singleton;
  }
}
