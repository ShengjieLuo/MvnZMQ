# MvnZMQ

This project is a simple demo to show the usage in ZeroMQ(aka, 0MQ)

The project includes the frontend and the backend.
In the frontend, the java application would send the data into the 0MQ.The progrma would be compiled by the help of mvn.
In the backend, the cpp program would receive the data and report the calculation result.

It is important to note that the so-called data here is not a simple string, but an integer array. Therefore, this project would point out a usual method to use complex structure in the zmq.

Following is the explanation of file tree in this project.
./lib 		: The library dependency
./hwdemo 	: The demo of a helloworld program in zmq. If you have any problem in the dependency relation of this project, refer to this demo first and find the solution.
./frontend 	: The Frontend Program, mainly written by java.
./backend	: The Backend Program, mainly written by cpp.
