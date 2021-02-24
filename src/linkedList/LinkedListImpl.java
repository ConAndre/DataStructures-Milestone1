package linkedList;

public class LinkedListImpl implements LinkedList {

    ListItem head;
    ListItem tail;

    @Override
    public Boolean isItemInList(String thisItem) {
        ListItem tmp = head;
        boolean isItemInList = false;

        while(tmp != null) {
            if (tmp.data.equalsIgnoreCase(thisItem)) {
                isItemInList = true;
                break;
            }
            tmp = tmp.next;
        }
        return isItemInList;
    }

    @Override
    public Boolean addItem(String value) {
        if (isItemInList(value)) {
            return false;
        }
        // get the last item:
        ListItem lastItem = getLastItem();

        //add to the end of the list
        ListItem newItem = new ListItem(value);

        if (head == null) {
            head = newItem;
            this.tail = head;
        }
        else {
            lastItem.next = newItem;
            this.tail = newItem;
        }
        return true;
    }

    private ListItem getLastItem() {
        ListItem lastItem;
        if (head == null)
            lastItem = null;
        else {
            lastItem = head;
            // last node points to null
            while (lastItem.next != null)
                lastItem = lastItem.next;
        }
        return lastItem;
    }

    @Override
    public Integer itemCount() {
        ListItem tmp = head;
        int itemCount = 0;
        while(tmp != null) {
            itemCount++;
            tmp = tmp.next;
        }
        return itemCount;
    }

    @Override
    public void listItems() {
        ListItem tmp = head;

        while(tmp != null) {
            System.out.println("item: " + tmp.data);
            tmp = tmp.next;
        }
        System.out.println("HEAD " + head.data);
        System.out.println("TAIL " + tail.data);
    }

    @Override
    public Boolean deleteItem(String thisItem) {
        if (!(isItemInList(thisItem))) {
            return false;
        }
        boolean deleted = false;
        ListItem tmp = head;
        ListItem prev = head;
        while(tmp != null) {
            if (tmp.data.equalsIgnoreCase(thisItem)) {
                if (tmp == tail && tmp != head) {
                    prev.next = null;
                    this.tail = prev;
                } else if (tmp == head) {
                    if (tmp.next != null) {
                        this.head = tmp.next;
                    } else {
                        this.head.data = null;
                        this.head.next = null;
                        this.head = tail;
                    }
                } else {
                    prev.next = tmp.next;
                }
                deleted = true;
                break;
            }
            prev = tmp;
            tmp = tmp.next;
        }
        return deleted;
    }

    @Override
    public Boolean insertBefore(String newItem, String itemToInsertBefore) {
        if (!(isItemInList(itemToInsertBefore))) {
            return false;
        }
        boolean added = false;
        ListItem tmp = head;
        ListItem prev = head;
        while(tmp != null) {
            if (tmp.data.equalsIgnoreCase(itemToInsertBefore)) {
                ListItem item = new ListItem(newItem);
                if (prev == head) {
                    item.next = tmp;
                    this.head = item;
                } else {
                    prev.next = item;
                    item.next = tmp;
                }
                added = true;
                break;
            }
            prev = tmp;
            tmp = tmp.next;
        }
        return added;
    }

    @Override
    public Boolean insertAfter(String newItem, String itemToInsertAfter) {
        if (!(isItemInList(itemToInsertAfter))) {
            return false;
        }
        boolean added = false;
        ListItem tmp = head;
        while(tmp != null) {
            if (tmp.data.equalsIgnoreCase(itemToInsertAfter)) {
                ListItem item = new ListItem(newItem);
                if (tmp == tail) {
                    tmp.next = item;
                    this.tail = item;
                } else {
                    item.next = tmp.next;
                    tmp.next = item;
                }
                added = true;
                break;
            }
            tmp = tmp.next;
        }
        return added;
    }

    @Override
    public void sort() {

    }
}
