import java.util.Random;

public class MagicBox<T> {
    private T[] items;

    public MagicBox(int itemsCount) {
        items = (T[]) new Object[itemsCount];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна, осталось заполнить ещё " + (items.length - i));
            }
        }
        return items[new Random().nextInt(items.length)];
    }

    public int getBoxVolume(){
        return items.length;
    }

}
