import java.net.*;
class Protocol{
    public static void main(String[] args) throws MalformedURLException{
        URL hp=new URL("https://www.marktady.com/index");
        System.out.println(hp.getProtocol());
        System.out.println(hp.getDefaultPort());
System.out.println(hp.getFile());
System.out.println(hp.getHost());
    }
}