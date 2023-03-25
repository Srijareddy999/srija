import java.util.ArrayList;
import java.util.Stream.Collectors;
class Main{
    public static void main(String[] args){
    ArrayList<Integer> integer = new ArrayList<>();
    integer.add(15);
    integer.add(8);
    integer.add(4);
    System.out.println(integer.stream().filter(elm -> ref(elm)).collect(Collectors.toList()));
}
static Boolean ref(int r){
    return r%2 == 0;
}
}