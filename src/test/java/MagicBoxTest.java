import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MagicBoxTest {

    private MagicBox<String> box;

    @BeforeEach
    void setUp() {
        box = new MagicBox<>(2);
    }

    @Test
    @DisplayName("Тест добавления элементов в коробку")
    void testAdd() {
        String item = "Item";
        for (int i = 0; i < box.getBoxVolume(); i++) {
            Assertions.assertTrue(box.add(item));
        }
    }

    @Test
    @DisplayName("Тест переполнения коробки")
    void testAddOverflow() {
        String item = "Item";
        for (int i = 0; i < box.getBoxVolume(); i++) {
            box.add(item);
        }
        Assertions.assertFalse(box.add(item));
    }

    @Test
    @DisplayName("Тест извлечения элемента из неполной коробки")
    void testPickIncompleteBox() {
        String item = "Item";
        for (int i = 0; i < box.getBoxVolume()-1; i++) {
            box.add(item);
        }
        Assertions.assertThrows(RuntimeException.class,()->box.pick());
    }

    @Test
    @DisplayName("Тест извлечения элемента из полной коробки")
    void testPick() {
        String item = "Item";
        for (int i = 0; i < box.getBoxVolume(); i++) {
            box.add(item);
        }
        Assertions.assertInstanceOf(String.class,box.pick());
    }

}
