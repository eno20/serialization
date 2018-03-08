/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.uangel.marshal.avro.service2;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface MapTransferService {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"MapTransferService\",\"namespace\":\"com.uangel.marshal.avro.service2\",\"types\":[{\"type\":\"record\",\"name\":\"Parameter\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"imageName\",\"type\":\"string\"},{\"name\":\"imageMap\",\"type\":\"bytes\"},{\"name\":\"imageType\",\"type\":\"string\"}]}],\"messages\":{\"transfer\":{\"request\":[{\"name\":\"image\",\"type\":\"Parameter\"}],\"response\":\"Parameter\"}}}");
  /**
   */
  com.uangel.marshal.avro.service2.Parameter transfer(com.uangel.marshal.avro.service2.Parameter image) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends MapTransferService {
    public static final org.apache.avro.Protocol PROTOCOL = com.uangel.marshal.avro.service2.MapTransferService.PROTOCOL;
    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void transfer(com.uangel.marshal.avro.service2.Parameter image, org.apache.avro.ipc.Callback<com.uangel.marshal.avro.service2.Parameter> callback) throws java.io.IOException;
  }
}