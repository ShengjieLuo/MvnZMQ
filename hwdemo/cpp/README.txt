The binding of C++ to zeromq is simple compared with mot kinds of languages.

cp zmq.hpp /usr/local/include
g++ -o server hwserver.cpp -rdynamic /usr/local/lib/libzmq.so
g++ -o client hwclient.cpp -rdynamic /usr/local/lib/libzmq.so

c++ version and c version use the same zmq library.
The only thing different is to use the specific head files.
