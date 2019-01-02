package 链表;

/**
 * @author faker
 * @date 2018/6/26
 */
public class MyLinkedList<E> {
    private int size;
    private Node<E> headNode;

    public MyLinkedList() {
        Node headNode = new Node<>(null, null, null);
        headNode.last = headNode;
        headNode.next = headNode;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        return node(index).element;
    }

    private Node<E> node(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = headNode;
        for (int i = 0; i <= index; i++) {
            node = node.next;
        }
        return node;
    }

    public void add(E e) {
        Node<E> last = headNode.last;
        Node<E> newNode = new Node<>(e, headNode, last);
        last.next = newNode;
        headNode.last = newNode;
        size++;
    }

    public void delete() {
        Node<E> last = headNode.last;
        last.last.next = headNode;
        headNode.last = last.last;
        size--;
    }


}
