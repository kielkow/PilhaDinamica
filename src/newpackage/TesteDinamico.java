package newpackage;

public class TesteDinamico {
    
    
        public static void main(String[] args) {
            
            PilhaDinamica p = new PilhaDinamica();
            
            System.out.println(p.size());
            
            p.push(0);
            p.push(1);
            p.push(2);
            p.push(3);
            p.pop();
            
            System.out.println(p.top());
            System.out.println(p.size());
        }
}
