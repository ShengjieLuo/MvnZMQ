cd ./frontend
mvn package
cd ../backend
g++ -o server server.cpp Gemm.pb.cc -lprotobuf -rdynamic /usr/local/lib/libzmq.so
cd ..
