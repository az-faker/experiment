package 链表;

/**
 * @author faker
 * @date 2018/6/26
 */
public class Node<E> {
    E element;

    Node<E> next;

    Node<E> last;

    Node(E element, Node<E> next, Node<E> last) {
        this.element = element;
        this.next = next;
        this.last = last;
    }
}
