mvn package
java -classpath target/writer-reader-0.0.1-SNAPSHOT.jar:/root/MvnZMQ/lib/protobuf-java-3.2.0.jar com.tutorial.AddPerson a.in
java -classpath target/writer-reader-0.0.1-SNAPSHOT.jar:/root/MvnZMQ/lib/protobuf-java-3.2.0.jar com.tutorial.ListPeople a.in
