import com.kodilla.good.patterns.challenges.food2door.*;
import org.junit.Assert;
import org.junit.Test;

public class OrderInShopTestSuite {
    @Test
    public void testOrderInExtraFoodShop() {
        //Given
        OrderRequestRetriverExtraFoodShop orderRequestRetriver = new OrderRequestRetriverExtraFoodShop();
        OrderRequest orderRequest = orderRequestRetriver.retriver();
        DelivererProductProcessor delivererProductProcessor = new DelivererProductProcessor(new ExtraFoodShop(orderRequest.getDelivererProcessName().getDelivererName(), orderRequest.getProduct())
                , new InformAboutNewDeliver(), new Repository());
        delivererProductProcessor.processor(orderRequest);
        //When
        boolean isAllowedOrder = orderRequest.getDelivererProcessName().process();
        //Then
        Assert.assertTrue(isAllowedOrder);
    }

    @Test
    public void testOrderInHealthyShop() {
        //Given
        OrderRequestRetriverHealthyShop orderRequestRetriverHealthyShop = new OrderRequestRetriverHealthyShop();
        OrderRequest orderRequest = orderRequestRetriverHealthyShop.retriver();
        DelivererProductProcessor delivererProductProcessor = new DelivererProductProcessor(new HealthyShop(orderRequest.getDelivererProcessName().getDelivererName(), orderRequest.getProduct())
                , new InformAboutNewDeliver(), new Repository());
        delivererProductProcessor.processor(orderRequest);
        //When
        boolean isAllowedOrder = orderRequest.getDelivererProcessName().process();
        //Then
        Assert.assertFalse(isAllowedOrder);
    }

    @Test
    public void testGlutenFreeShop() {
        //Given
        OrderRequestRetriverGlutenFreeShop orderRequestRetriverGlutenFreeShop = new OrderRequestRetriverGlutenFreeShop();
        OrderRequest orderRequest = orderRequestRetriverGlutenFreeShop.retriver();
        DelivererProductProcessor delivererProductProcessor = new DelivererProductProcessor(new GlutenFreeShop(orderRequest.getDelivererProcessName().getDelivererName(), orderRequest.getProduct())
                , new InformAboutNewDeliver(), new Repository());
        delivererProductProcessor.processor(orderRequest);
        //When
        boolean isAllowedOrder = orderRequest.getDelivererProcessName().process();
        //Then
        Assert.assertFalse(isAllowedOrder);
    }
}
