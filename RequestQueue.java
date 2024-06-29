import Includes.*;

public class RequestQueue {
    private Node<RequestData> front;
    private Node<RequestData> back;
    private int length = 0;

    public RequestData getFront() {
        return this.front.data;
    }

    public int getLength() {
        /*
         * Your code here.
         */
        // Node<RequestData> temp = front;
        // while(temp != null){
        //     this.length++;
        //     temp = temp.next;
        // }
        return this.length;
    }

    public void push(int ISBN, int UserID) {
        Node<RequestData> temp = new Node<RequestData>();
        temp.data = new RequestData(); // Assuming RequestData has a constructor or use appropriate setter methods
        temp.data.ISBN = ISBN;
        temp.data.UserID = UserID;
    
        if (this.back == null) { // Handling an empty queue
            this.front = temp;
            this.back = temp;
        } else {
            this.back.next = temp;
            temp.previous = this.back;
            this.back = temp;
        }
    
        this.length++; // Increment the length of the queue
    }
    

    public void pop() {      // processing needs to be done before popping, 
        /*
         * Your code here.
         */
        // what if the queue is null?

        Node<RequestData> temp = this.front.next;
        if (temp == null) { // Handling single element queue
            this.front = null;
            this.back = null;
        } else {
            this.front = temp;
            this.front.previous = null;
        }
        this.length--;
        return;
    }

    public String toString(){
        Node<RequestData> temp = front;
        String s = "Length: " + length + "\n";
        while(temp != null){
            s+=temp.data.toString();
            temp = temp.next;
        }
        return s;
    }
}
