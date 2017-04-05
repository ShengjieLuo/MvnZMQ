C is the native language of ZeroMQ. We need not a specific language binding in the case.

To compile the program, you need run the command line:
gcc -o server hwserver.c -rdynamic /usr/local/lib/libzmq.so
gcc -o client hwclient.c -rdynamic /usr/local/lib/libzmq.so

Automatically, the ZMQ dependency would be found here:
libzmq.so : /usr/local/lib : The library used in the zeromq
zmq.h : /usr/local/include : include <zmq.h>
