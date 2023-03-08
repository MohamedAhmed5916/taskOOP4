public class Data extends Print {
    final int  id ;
     String name ;

    public Data(int id, String name) {
        this.id = id;
        this.name = name;
     //  print(  "Id : " +id + "Name : " + name);

    }

    @Override
    public void print(String name) {
        super.print(name);
        this.name=name;
      System.out.print(  "Id : " +this.id + "Name : " + name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
