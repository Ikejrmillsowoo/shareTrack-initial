import com.zipcode.beans.Item;
import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

    @Test
    public void createItemTest() {
        //Given
         Long id = 1L;
         String type = "Keyboard";
         String model = "Yamaha MODX-8";
         String barCodeNumber = "123-456";
         String imageUrl = "/src/main/resources/keys";
         Long locationId = 10L;

        Item item = new Item(id, type, model, barCodeNumber, imageUrl, locationId);

        //When
        Long actualId =  item.getId();
        String actualType = item.getType();
        String actualModel = item.getModel();
        String actualBarCodeNumber = item.getBarCodeNumber();
        String actualImageUrl = item.getImageUrl();
        Long actualLocationId = item.getLocationId();

        //Then
        Assert.assertEquals(id, actualId);
        Assert.assertEquals(type, actualType);
        Assert.assertEquals(model, actualModel);
        Assert.assertEquals(barCodeNumber, actualBarCodeNumber);
        Assert.assertEquals(imageUrl, actualImageUrl);
        Assert.assertEquals(locationId, actualLocationId);
    }
}
