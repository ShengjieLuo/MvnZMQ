export MVNZMQ_HOME=/root/MvnZMQ
java -classpath target/helloworld-0.0.1-SNAPSHOT.jar:$MVNZMQ_HOME/lib/jzmq-jni-3.1.1-SNAPSHOT.jar hwserver
