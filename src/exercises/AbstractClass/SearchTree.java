package exercises.AbstractClass;

public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(item);
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        ListItem currItem = this.root;

        while (currItem != null) {
            int comp = (currItem.compareTo(item));
            ListItem parentItem = currItem;

            if (comp < 0) {
                currItem = currItem.next();
            } else if (comp > 0) {
                currItem = currItem.previous();
            } else {
                performRemoval(currItem, parentItem);
                return true;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() != null && item.previous() != null) {
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if (leftmostParent == item) {
                item.setNext(current.next());
            } else {
                leftmostParent.setPrevious(current.next());
            }
        } else {
            ListItem setItem = item.next() == null ? item.previous() : item.next();

            if (parent.next() == item) {
                parent.setNext(setItem);
            } else if (parent.previous() == item) {
                parent.setPrevious(setItem);
            } else {
                this.root = setItem;
            }
        }
    }
}
