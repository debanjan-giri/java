// Linked List
// int,float is data type but we want to create own data type ,
// create node & its contain data & memory address [ 34 | hdf ]
// memory address of this node is > hdf => [ 65 | bbb ] but its
// contain another node memory address so this how connect node
// benefits is that node can store diff location within memory
// one int data storing use => twice memory [ int | address ]

// ------------> create 3 node
// head__________________________________tell
// [ 65 | ggg ]---[ 99 | ooo ]---[ 78 | null ]
// ____vvv____________ggg____________ooo_____<= memory address
// when i have atleast one node then i can access next node
// because every node contain next node memory address
// [ 65 | gfg ] --> 65 = int type and gfg = node data type
// in java node and in c++ pointer

// type of linked list
// 1. singly linked list [ int | @post ]
// 2. doubly linked list [ @pre | int | @post ]
// 3. circular linked list [last node contian 1st node address]

class LinkedList {

    // create a class with node stucture
    class nodeClass {
        int data; // storing data type is integer
        nodeClass next; // it store obj memory address

        // data insertion using constructure
        nodeClass(int value) {
            this.data = value; // store value in node
            this.next = null; // by default null but we set
        }
    }

    // maintain this class head and tail
    nodeClass Head; // null
    nodeClass Tail; // null
    int nodeCount; // maintain node count++ TC O(1)

    // node displaying method TC O(n)
    void nodePrinting() {
        // when you travel head after loop head change to null
        nodeClass temp = Head; // prevent head change
        // tail is always null so
        while (temp != null) { // so loop until node.next= null
            System.out.println(temp.data);
            temp = temp.next; // every loop temp store next node
        }
    }

    // please maintian node count in class
    int nodeLength() {
        nodeClass temp = Head;
        int count = 0; // every time loop will count
        while (temp != null) { // loop until tail
            count++;
            temp = temp.next;
        }
        return count;
    }

    // start node data insertion method TC O(1)
    void startNodeInsertion(int value) {
        // create one node
        nodeClass nodeObj = new nodeClass(value);
        if (Head == null) { // if linked list is empty
            Head = nodeObj; // then set this node = head
            Tail = nodeObj; // and set this node = tail
        } else { // if already Head present
            nodeObj.next = Head; // connect new node - old head
            Head = nodeObj; // bcz we want this node to be head
        }
        nodeCount++; // maintian this node count
    }

    // ending node data insertion method
    void endNodeInsertion(int value) {
        nodeClass nodeObj = new nodeClass(value);
        if (Head == null) { // if head is not present
            Head = nodeObj; // then set this node is head
            Tail = nodeObj; // then set this node is tail
        } else { // if already tail is present
            Tail.next = nodeObj; // then connect tail->new node
            Tail = nodeObj; // bcz we want that new node = tail
        }
        nodeCount++; // maintian this node count
    }

    // middle node insertion
    void middleNodeInsersion(int index, int value) {
        if (index == 0) {
            startNodeInsertion(value);
            return;
        } else if (index == nodeLength()) {
            endNodeInsertion(value);
            return;
        } else if (index < 0 || index > nodeLength()) {
            System.out.println("wrong index not allowed ");
            return;
        }

        // create node
        nodeClass nodeObj = new nodeClass(value);
        nodeClass temp = Head;
        // (index - 1) one step back from actual index
        // [a][b][c][d] so you want to add [x] between b-c
        // loop will go b position then put x = [a][b][x][c][d]
        for (int i = 0; i < index - 1; i++) {
            // it will move next node to next node using .next
            temp = temp.next;
        }
        // after loop node [b] , so it access b.next = [c] so
        nodeObj.next = temp.next; // first connect [x] to [c]
        // then it connect future node list & already have [b]
        temp.next = nodeObj; // now b.nxt store new address [x]
        nodeCount++;
    }

    // node delete method
    void nodeDeletion(int index) {
        nodeClass temp = Head;
        if (index == 0) {
            // if first node is head then head.next is 2nd node
            Head = temp.next; // update our head = second node
            nodeCount--;
        }
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        // connect two node but skip middle node
        // after loop -1 index node.next value = temp.skip.next
        // skip = this index address will not connected to list
        temp.next = temp.next.next;
        Tail = temp; // ?
        nodeCount--;
    }

    // get element by index method
    int getElement(int index) {
        if (index < 0 || index > nodeLength()) {
            return -1;
        }
        nodeClass temp = Head;
        // loop until index value, even we dont know index size
        for (int i = 0; i < index; i++) {
            temp = temp.next; // it will move next node to next
        }
        return temp.data; // after loop temp will updated
    }

    // get Index By Element method
    int getIndex(int value) {
        nodeClass temp = Head;
        int indexCount = 0;
        while (temp != null) {
            if (temp.data == value) {
                return indexCount;
            }
            indexCount++; // every next node our count update
            temp = temp.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // start node insertion
        ll.startNodeInsertion(56);
        ll.startNodeInsertion(34);

        // end node insertion
        ll.endNodeInsertion(78);
        ll.endNodeInsertion(89);

        // node diplaying
        ll.nodePrinting();

        // node length
        System.out.println(ll.nodeCount); // TC O(1)
        System.out.println(ll.nodeLength()); // TC O(n)

        // middle node insertion
        ll.middleNodeInsersion(2, 99);

        // node deletion
        ll.nodeDeletion(3);

        // print node head and tail
        System.out.println(ll.Head);
        System.out.println(ll.Tail);
        System.out.println(ll.Head.data);
        System.out.println(ll.Tail.data);

        // get element by index
        System.out.println(ll.getElement(0));
        System.out.println(ll.getIndex(99));

        ll.nodePrinting();
        ll.nodeDeletion(4);
        System.out.println("------");
        ll.nodePrinting();
        System.out.println("---");
        System.out.println(ll.Head.data);
        System.out.println(ll.Tail.data);
    }
}