import javax.lang.model.util.ElementScanner6;

public class Hello {
    public static void main(String[] args) {
    String xNome = "Grego";
        if(args.length>0){
            System.out.print("Hello "+xNome+"\nParamentro 0: "+args[0]);
        }            
        if(args.length>1){
              System.out.print("\nParamentro 1: "+args[1]);
        }
        
    }
}
