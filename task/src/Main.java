import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean userAccept = true ;
        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(1 ,"mohamed"));
        arrayList.add(new Data(2 ,"NASIB"));

        while (userAccept){
            int count=arrayList.size();
            System.out.println("1:Add user");
            System.out.println("2:Search");
            System.out.println("3:Edit user");

            int answer=in.nextInt();
            if (answer==1){
                System.out.println("Enter a name");
                String userName=in.next();
                arrayList.add(new Data(++count,userName));
            }else if(answer==2||answer==3) {
                System.out.println("Enter a Id");
                int userId=in.nextInt();
               for (Data data : arrayList){
                   if (userId == data.getId()){
                       if (answer==2){
                           System.out.println("Name :"+data.getName());
                       }else {
                           String newName ;
                           System.out.println("Enter New Name :");
                           newName = in.next();
                           arrayList.add(data.getId()-1 ,new Data(data.getId(), newName)) ;
                       }
                       break;
                   }
                   if (userId <= 0 || userId > arrayList.size()){
                       System.out.println("doesn't exist" );
                       break;
                   }

               }
            }
        }

    }
}