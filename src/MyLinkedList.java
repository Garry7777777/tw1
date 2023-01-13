public class MyLinkedList<T> implements MyList<T> {
    int size;
    Node<T> first;
    Node<T> last;
    public static class Node<T>{

        public Node<T> item;
        Node<T> next;
        Node<T> prev;

        public Node(Node<T> item) {
            this.item = item;
        }
    }



    @Override
    public void add(T item) {
    N



    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
