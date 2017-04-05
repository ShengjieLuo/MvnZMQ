#include <zmq.hpp>
#include <string>
#include <iostream>
#include "Gemm.pb.h"
using namespace std;

int main(int argc, char* argv[]) {

  GOOGLE_PROTOBUF_VERIFY_VERSION;

  zmq::context_t context (1);
  zmq::socket_t socket (context, ZMQ_REP);
  socket.bind ("tcp://*:5556");
  zmq::message_t request;
  socket.recv (&request);
  zmqsample::MatrixGemm matrix_gemm;
  matrix_gemm.ParseFromArray(request.data(), request.size());

  cout << "matrixA: "<<matrix_gemm.matrixa().dimensionx()<<"*"<<matrix_gemm.matrixa().dimensiony()<<endl;
  for (int i=0;i<matrix_gemm.matrixa().dimensionx()*matrix_gemm.matrixa().dimensiony();i++)
    { cout << matrix_gemm.matrixa().element(i)<<" ";}
  cout << endl;

  cout << "matrixB: "<<matrix_gemm.matrixb().dimensionx()<<"*"<<matrix_gemm.matrixb().dimensiony()<<endl;
  for (int i=0;i<matrix_gemm.matrixb().dimensionx()*matrix_gemm.matrixb().dimensiony();i++)
    { cout << matrix_gemm.matrixb().element(i)<<" ";}
  cout << endl;
  
  google::protobuf::ShutdownProtobufLibrary();
  return 0;
}
