package Interface;

/**
 * Members */
interface Members{
    void callBackNotification();
}

class Store{
    Members mb[] = new Members[10];
    int MemberCount = 0;

    public void register(Members m){
        mb[MemberCount++] = m;
    }

    public void invite(){
        for(int i=0; i<MemberCount; i++){
            mb[i].callBackNotification();
        }
    }
}

class Coustmers implements Members{
    String name;
    Coustmers(String n){
        name = n;
    }

    public void callBackNotification(){
        System.out.println("Ok, I'll Visit to store. Name: "+name);
    }
}

public class interfaceCoustmers {
    public static void main(String[] args) {
        Store s = new Store();
        Coustmers c1 = new Coustmers("Hemil");
        Coustmers c2 = new Coustmers("Jay");

        s.register(c1);
        s.register(c2);

        s.invite();
    }
}
