public class Main {
    public static void Split(DoubleLinkedList dll) {
        if (dll.size < 2) {
            System.out.println("List is too small to split.");
            return;
        }

        Node mid = dll.head;
        for (int i = 0; i < dll.size / 2 - 1; i++) {
            mid = mid.n;
        }

        DoubleLinkedList list1 = new DoubleLinkedList();
        DoubleLinkedList list2 = new DoubleLinkedList();

        list1.head = dll.head;
        list1.tail = mid;
        list1.size = dll.size / 2;

        list2.head = mid.n;
        list2.tail = dll.tail;
        list2.size = dll.size - list1.size;

        list1.tail.n = null;
        list2.head.p = null;

        System.out.println("List 1:");
        list1.print();
        System.out.println("List 2:");
        list2.print();
    }
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        dll.printFromTail();

        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        dll.deleteLast();
        dll.deleteLast();
        dll.print();
        dll.printFromTail();

        Split(dll);
    }
}
