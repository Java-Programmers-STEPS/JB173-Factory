package factory;
public class SelectNetworkFactory {
     public cellularplan getPlan(String planType){
          if(planType == null){
                  return null;
          }
          if(planType.equalsIgnoreCase("abcNetwork")) {
                  return new abcNetwork();
          }
          else if(planType.equalsIgnoreCase("xyzNetwork")){
                  return new xyzNetwork();
          }
          else if(planType.equalsIgnoreCase("pqrNetwork")) {
                  return new pqrNetwork();
          }
     return null;
     }
}