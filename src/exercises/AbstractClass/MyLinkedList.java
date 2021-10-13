package exercises.AbstractClass;

public class MyLinkedList implements NodeList {
    // Head of LL
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (root == null) {
            this.root = item;
        }
        ListItem curr = this.root;
        while (curr.rightLink != null && item.compareTo(curr) < 0) {
            curr = curr.rightLink;
        }
        if (item.compareTo(curr) == 0) return false;
        // item <-> newItem [item2] <-> item 3
        if (item.compareTo(curr) < 0) {
            //set curr.previous to point to new node
            curr.leftLink.setNext(item);
            item.setPrevious(curr.leftLink);
            curr.setPrevious(item);
            item.setNext(curr);
        } else {
            curr.setNext(item);
            item.setPrevious(curr);
        }

        return true;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem curr = root;
        while (curr != null && item.compareTo(curr) != 0) {
            curr = curr.rightLink;
        }
        if (curr == null) return false;
        // item <-> [item2] <-> item 3
        curr.leftLink.setNext(curr.rightLink);
        curr.rightLink.setPrevious(curr.leftLink);

        return true;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) System.out.println("The list is empty");

        ListItem curr = root;
        System.out.println(curr.value);
        while ((curr = curr.rightLink) != null) System.out.println(curr.value);
    }
}
