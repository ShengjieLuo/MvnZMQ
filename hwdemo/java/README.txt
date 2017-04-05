In this case, we use maven to compile and run the zmq helloworld demo.

1. Use mvn to compile
   $mvn package

2. Run the helloworld program
   $export MVNZMQ_HOME=/root/MvnZMQ
   $java -classpath target/helloworld-0.0.1-SNAPSHOT.jar:$MVNZMQ_HOME/lib/jzmq-jni-3.1.1-SNAPSHOT.jar hwserver
   $java -classpath target/helloworld-0.0.1-SNAPSHOT.jar:$MVNZMQ_HOME/lib/jzmq-jni-3.1.1-SNAPSHOT.jar hwclient

Explanation:
classpath1: target/helloworld-0.0.1-SNAPSHOT.jar 
The jar compiled by maven
classpath2: $MVNZMQ_HOME/lib/jzmq-jni-3.1.1-SNAPSHOT.jar
The location of org.zeromq
