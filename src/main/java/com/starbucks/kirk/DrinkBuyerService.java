package com.starbucks.kirk;

/**
 * @author Daniel Hinojosa
 * @since 4/20/16 4:45 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
public class DrinkBuyerService {
    private final DrinkDAO dao;

    public DrinkBuyerService(DrinkDAO dao) {
      this.dao = dao;
    }

    public int addToDatabase(CoffeeDrink drink) {
        dao.persist(drink);
        return 1;
    }
}
