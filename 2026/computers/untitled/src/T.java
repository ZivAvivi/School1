
public class T {


    public static void main(String[] args) {

        Folder root = new Folder("root");
        Folder docs = new Folder("docs");
        Folder powerpoints = new Folder("powerpoints");
        Folder photos = new Folder("photos");

        docs.addToFolder(powerpoints);
        root.addToFolder(docs);
        root.addToFolder(photos);

        File malware = new File("malware.exe", 1000);
        root.addToFolder(malware);

        File pdf1 = new File("pdf1.pdf", 50);
        docs.addToFolder(pdf1);

        File powerpoint1 = new File("maths.PPTX", 50);
        powerpoints.addToFolder(powerpoint1);

        File photo1 = new File("Photo1.png", 200);
        File photo2 = new File("Photo2.png", 150);
        photos.addToFolder(photo1);
        photos.addToFolder(photo2);


        System.out.println(photo1.getPath());
        photos.removeByName("Photo1.png");
        docs.addToFolder(photo1);
        System.out.println(photo1.getPath());

    }
}