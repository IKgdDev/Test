public class MagicBox<T> {
    T[] items;

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
}
