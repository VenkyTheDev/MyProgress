package Day4;

public class Section11 {
    //Abstract Class
    public abstract class ListItem {
        protected ListItem rightLink, leftLink;
        protected Object value;

        public ListItem(Object value) {
            this.value = value;
        }

        abstract ListItem next();
        abstract ListItem setNext(ListItem item);
        abstract ListItem previous();
        abstract ListItem setPrevious(ListItem item);
        abstract int compareTo(ListItem item);

        public Object getValue() {
            return this.value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }
    public class Node extends ListItem {

        public Node(Object value) {
            super(value);
        }

        @Override
        ListItem next() {
            return this.rightLink;
        }

        @Override
        ListItem setNext(ListItem item) {
            this.rightLink = item;
            return this.rightLink;
        }

        @Override
        ListItem previous() {
            return this.leftLink;
        }

        @Override
        ListItem setPrevious(ListItem item) {
            this.leftLink = item;
            return this.leftLink;
        }

        @Override
        int compareTo(ListItem item) {
            if (item != null) {
                return ((Comparable) this.value).compareTo(item.getValue());
            }
            return -1;
        }
    }
    public class MyLinkedList implements NodeList {
        private ListItem root;

        public MyLinkedList(ListItem root) {
            this.root = root;
        }

        @Override
        public ListItem getRoot() {
            return this.root;
        }

        @Override
        public boolean addItem(ListItem newItem) {
            if (newItem == null) {
                return false;
            }

            if (this.root == null) {
                this.root = newItem;
                return true;
            }

            ListItem currentItem = this.root;
            while (currentItem != null) {
                int comparison = currentItem.compareTo(newItem);
                if (comparison < 0) {
                    if (currentItem.next() != null) {
                        currentItem = currentItem.next();
                    } else {
                        currentItem.setNext(newItem);
                        newItem.setPrevious(currentItem);
                        return true;
                    }
                } else if (comparison > 0) {
                    if (currentItem.previous() != null) {
                        currentItem.previous().setNext(newItem);
                        newItem.setPrevious(currentItem.previous());
                    } else {
                        this.root = newItem;
                    }
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        @Override
        public boolean removeItem(ListItem item) {
            if (item == null) {
                return false;
            }

            ListItem currentItem = this.root;

            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison == 0) {
                    if (currentItem.previous() != null) {
                        currentItem.previous().setNext(currentItem.next());
                    } else {
                        this.root = currentItem.next();
                    }

                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                    return true;
                } else if (comparison < 0) {
                    currentItem = currentItem.next();
                } else {
                    return false;
                }
            }
            return false;
        }

        @Override
        public void traverse(ListItem root) {
            if (root == null) {
                System.out.println("The list is empty");
            } else {
                ListItem currentItem = root;
                while (currentItem != null) {
                    System.out.println(currentItem.getValue());
                    currentItem = currentItem.next();
                }
            }
        }
    }
    public interface NodeList {
        ListItem getRoot();
        boolean addItem(ListItem newItem);
        boolean removeItem(ListItem item);
        void traverse(ListItem root);
    }
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
        public boolean addItem(ListItem newItem) {
            if (newItem == null) {
                return false;
            }

            if (this.root == null) {
                this.root = newItem;
                return true;
            }

            ListItem currentItem = this.root;
            while (true) {
                int comparison = currentItem.compareTo(newItem);
                if (comparison < 0) {
                    if (currentItem.next() != null) {
                        currentItem = currentItem.next();
                    } else {
                        currentItem.setNext(newItem);
                        return true;
                    }
                } else if (comparison > 0) {
                    if (currentItem.previous() != null) {
                        currentItem = currentItem.previous();
                    } else {
                        currentItem.setPrevious(newItem);
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }

        @Override
        public boolean removeItem(ListItem item) {
            if (item == null) {
                return false;
            }

            ListItem currentItem = this.root;

            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison == 0) {
                    performRemoval(item, currentItem);
                    return true;
                } else if (comparison < 0) {
                    currentItem = currentItem.next();
                } else {
                    return false;
                }
            }
            return false;
        }

        // Private helper method to handle the removal
        private void performRemoval(ListItem item, ListItem parent) {
            if (item.previous() != null) {
                item.previous().setNext(item.next());
            } else {
                this.root = item.next();
            }

            if (item.next() != null) {
                item.next().setPrevious(item.previous());
            }
        }

        @Override
        public void traverse(ListItem root) {
            if (root != null) {
                traverse(root.previous());
                System.out.println(root.getValue());
                traverse(root.next());
            }
        }
    }

}
