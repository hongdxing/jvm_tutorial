package loading;

import sun.misc.Launcher;

import java.net.URL;

public class BootstrapClassPath {

    public static void main(String[] args) {
        URL urls[] = Launcher.getBootstrapClassPath().getURLs();
        for(URL url: urls){
            System.out.println(url.getFile() + "\n");
        }
    }
}
