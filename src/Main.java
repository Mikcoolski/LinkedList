
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Start");
        LinkedList newList = new LinkedList(5);
        newList.addEnd(4);
        newList.addEnd(3);         
        newList.addEnd(1);
        newList.Display();
        newList.addAt(2, 3);
        newList.Display();
        newList.addEnd(0);  
        newList.addStart(6);
        newList.addStart(7);
        newList.Display();
        newList.deleteAt(3);
        newList.Display();
        newList.deleteAt(7);
        newList.Display();
        newList.deleteAt(0);
        newList.Display();
        
        System.out.println("End");
    }
}
