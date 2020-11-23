public class Dereference {
    public static void main(String[] args) {
        Object obj = new Object();
        String text = obj.toString(); // 'obj' is dereferenced
        
        Object obje = null;
     obje.toString(); // Throws a NullpointerException when this statement is executed
        
    }
}
