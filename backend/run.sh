protoc --cpp_out=. Gemm.proto
g++ -o server server.cpp Gemm.pb.h -lprotobuf -rdynamic /usr/local/lib/libzmq.so
