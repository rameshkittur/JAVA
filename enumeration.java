public class enumeration {
    enum size{
        S,M,L,XL
    }
    public static void main(String[]args){
        size cloth=size.M;
        for(size var:size.values()){
            System.out.println(var);
        }
        switch (cloth){
            case S:System.out.println("cloth size is small");
                     break;
            case M:System.out.println("cloth size is Medium");
                break;
            case L:System.out.println("cloth size is large");
                break;
            case XL:System.out.println("cloth size is very large");
                break;
        }
    }
}
