package bogdanov.service;

import javax.jws.WebMethod;
import javax.jws.WebService;



@WebService
public interface ArmService {

  @WebMethod
  String sayHello();

}
