package model;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Zacki Zulfikar Fauzi on 05-Jun-17.
 * NIM  : 13515147
 * File : ConnectionChecker.java
 */
public class ConnectionChecker {
  public ConnectionChecker(){

  }

  public static boolean netIsAvailable() {
    try {
      final URL url = new URL("http://www.github.com");
      final URLConnection conn = url.openConnection();
      conn.connect();
      return true;
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      return false;
    }
  }

  public static void main(String[] args) {
    // write your code here
    ConnectionChecker conn = new ConnectionChecker();
    boolean check = conn.netIsAvailable();
    System.out.print(check);
  }
}
