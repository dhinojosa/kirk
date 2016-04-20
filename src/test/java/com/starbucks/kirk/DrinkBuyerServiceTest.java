package com.starbucks.kirk;

import org.junit.Test;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.assertEquals;

/**
 * @author Daniel Hinojosa
 * @since 4/20/16 4:39 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */
public class DrinkBuyerServiceTest {
    @Test
    public void testPurchaseOfDrink() {
        DrinkDAO dao = createMock(DrinkDAO.class);
        DrinkBuyerService service = new DrinkBuyerService(dao);
        CoffeeDrink drink = new CoffeeDrink();
        expect(dao.persist(drink)).andReturn(1);
        replay(dao);
        int result = service.addToDatabase(drink);
        assertEquals(1, result);
        verify(dao);
    }
}
