public class NamesTest {
    public static void main(String[] args){
        // values hard-coded to facilitate testing
        String[] names={"john","mary","andy","beth","chris",
                        "frank","carol","bob","sue","joe"};
        System.out.println("first: "+getFirstAlphabetically(names));
        System.out.println("last: "+getLastAlphabetically(names));
    }
    
}
