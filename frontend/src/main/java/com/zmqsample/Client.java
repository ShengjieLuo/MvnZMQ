package com.zmqsample;

//Client.java: Send a matrix to backend
//For example : [2,2,[1,2,3,4]]
// 2: The x-dimension 2 : The y-dimension 
// [1,2,3,4] : The matrix value
//The example shows a matrix within 2*2 size

import org.zeromq.ZMQ;
import com.zmqsample.Gemm.Matrix;
import com.zmqsample.Gemm.MatrixGemm;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        ZMQ.Context context = ZMQ.context(1);

        //  Socket to talk to server
        System.out.println("Connecting to server...");

        ZMQ.Socket requester = context.socket(ZMQ.REQ);
        //Use port 5556 in the program
        requester.connect("tcp://localhost:5556");

        Matrix.Builder matrixA = Matrix.newBuilder();
        matrixA.setDimensionX(2);
        matrixA.setDimensionY(2);
        int[] elementsA = {0,0,0,0};
	for (int i=0;i<elementsA.length;i++){matrixA.addElement(elementsA[i]);}

        Matrix.Builder matrixB = Matrix.newBuilder();
        matrixB.setDimensionX(2);
        matrixB.setDimensionY(2);
        int[] elementsB = {0,0,0,0};
	for (int i=0;i<elementsB.length;i++){matrixB.addElement(elementsB[i]);}
        
        MatrixGemm.Builder matrixGemm = MatrixGemm.newBuilder();
        matrixGemm.setMatrixA(matrixA.build());
        matrixGemm.setMatrixB(matrixB.build());

        requester.send(matrixGemm.build().toByteArray(), 0);
        requester.close();
        context.term();
    }
}

