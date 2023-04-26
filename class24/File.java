package class24;

public abstract class File {
    abstract void open();
    void edit(){
        System.out.println("edit the file");
    }
    void close(){
        System.out.println("closing the file");
    }
}
class JavaFile extends File{
     void open(){
         System.out.println("opening the file in intellij");
     }
}
class WordFile extends File{
    void open(){
        System.out.println("Opening the file in Microsoft word");
    }
}
class PDFile extends File{
    void open(){
        System.out.println("opening the file in acrobat reader");

    }
}