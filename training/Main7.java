package training;

public class Main7 {
  public static void main(String[] args) throws Exception {
        try{
            String name = null ;
	        name = name.substring(0);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        try{
            String values[] = new String[2];
	        values[2] = "value";
        }catch(Exception ex){
            ex.printStackTrace();
        }

        try{
            Object value = "value";
	        Integer number = (Integer)value;
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}