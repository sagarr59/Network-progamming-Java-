import java.net.*;
public class IpAddress{
    public static void main(String[] args) {
        try{
            InetAddress address= InetAddress.getByName("www.tufohss.edu.np");
            System.out.println(address.getHostName());
            System.out.println(address.getHostAddress());
        }
        catch(Exception e){
            System.out.println("Error Message:"+e);
        }
    }
}