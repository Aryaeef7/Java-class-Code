package class24;

public class FileTester {
    public static void main(String[] args){

   File[] file={new JavaFile(),new WordFile(),new PDFile()};
        for (int i = 0; i <file.length ; i++) {
            File f=file[i];
            f.open();
            f.edit();
            f.close();

        }
        }
    }

