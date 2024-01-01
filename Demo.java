import java.net.*;
class Demo
{
  public static void main(String[] args) throws UnknownHostException
  {
    InetAddress address = InetAddress.getLocalHost();
    System.out.println(address);
    address = InetAddress.getByName("www.karuprogramminghub.web.app");
    System.out.println(address);
    InetAddress sw[] = InetAddress.getAllByName("www.google.com");
    for(int i=0; i< sw.length; i++)
    {
      System.out.println(sw[i]);
    }
  }
}
