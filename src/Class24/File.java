package Class24;

abstract public class File {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide
    specific implementation of open behaviour: Example: to open .
    java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */
    abstract void open();
    void edit(){
        System.out.println("to edit a file: right click and then click on edit ");
    }
    void close(){
        System.out.println("to close an open file: click on the cross in top right hand corner");
    }
   }
   class JavaFile extends File{
void open(){
    System.out.println("to open .java file we need notepad++ or sublime text");
}
   }
   class WordFile extends File{
    void open(){
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
   }
   class PdfFile extends File{
void open(){
    System.out.println("to open a pdf file we need Adobe InDesign");
}

       public static void main(String[] args) {
          File []files={new WordFile(),new JavaFile(),new PdfFile()};
          for(File file:files) {
              file.open();
              file.edit();
              file.close();
          }
       }
   }

