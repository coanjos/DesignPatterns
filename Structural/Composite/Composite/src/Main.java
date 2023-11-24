public class Main {
    public static void main(String[] args) {
        // Creating files
        File file1 = new File("File 1");
        File file2 = new File("File 2");
        File file3 = new File("File 3");

        // Creating directories
        Directory dir1 = new Directory("Directory 1");
        Directory dir2 = new Directory("Directory 2");

        // Adding files to directories
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        dir2.addComponent(file3);

        // Adding a directory to another directory
        Directory rootDir = new Directory("Root Directory");
        rootDir.addComponent(dir1);
        rootDir.addComponent(dir2);

        // Showing details
        rootDir.showDetails();
    }
}