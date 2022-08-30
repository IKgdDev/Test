import java.util.Random;

public class MagicBox<T> {
    private T[] items;

    public MagicBox(int itemsCount) {
        items = (T[]) new Object[itemsCount];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                throw new RuntimeException("Коробка не полна, осталось заполнить ещё " + (items.length - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);

        return items[randomInt];
    }

}
