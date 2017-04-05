//Client.java: Send a matrix to backend
//For example : [2,2,[1,2,3,4]]
// 2: The x-dimension 2 : The y-dimension 
// [1,2,3,4] : The matrix value
//The example shows a matrix within 2*2 size

import org.zeromq.ZMQ;

public class hwclient {

    public static void main(String[] args) {
        ZMQ.Context context = ZMQ.context(1);

        //  Socket to talk to server
        System.out.println("Connecting to server...");

        ZMQ.Socket requester = context.socket(ZMQ.REQ);
        //Use port 5556 in the program
        requester.connect("tcp://localhost:5556");

        for (int requestNbr = 0; requestNbr != 10; requestNbr++) {
            String request = "Hello";
            System.out.println("Sending Hello " + requestNbr);
            requester.send(request.getBytes(), 0);

            //byte[] reply = requester.recv(0);
            System.out.println("Received " + new String(reply) + " " + requestNbr);
        }
        requester.close();
        context.term();
    }
}

