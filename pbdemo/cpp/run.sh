protoc --cpp_out=. addressbook.proto
g++ -o reader reader.cpp addressbook.pb.cc -lprotobuf
g++ -o writer writer.cpp addressbook.pb.cc -lprotobuf
./writer MyAddressBook.in  
./reader MyAddressBook.in 
