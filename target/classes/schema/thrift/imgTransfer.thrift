namespace java com.uangel.marshal.thrift

service MapTransferService {
  Parameter transfer(1:Parameter image)
}

struct Parameter {
  1: i32 id,
  2: string imageName, 
  3:binary imageMap,
}