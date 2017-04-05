protoc --java_out=. addressbook.proto
javac -classpath /root/MvnZMQ/lib/protobuf-java-3.2.0.jar:. reader.java
javac -classpath /root/MvnZMQ/lib/protobuf-java-3.2.0.jar:. writer.java
java -classpath /root/MvnZMQ/lib/protobuf-java-3.2.0.jar:. AddPerson a.in
java -classpath /root/MvnZMQ/lib/protobuf-java-3.2.0.jar:. ListProple a.in

