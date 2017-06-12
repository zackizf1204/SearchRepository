package model;

import java.net.HttpURLConnection;
import java.util.ArrayList;

/**
 * Created by Zacki Zulfikar Fauzi on 06-Jun-17.
 * NIM  : 13515147
 * File : User.java
 */
public class User {
  private HttpURLConnection connection = null;
  private ArrayList<String> ListOfUser;
  private String searchKey;
  private int RepoMax;
  private int RepoMin;


  public User() {
    ListOfUser = new ArrayList<>();
  }

  public User(String keyword) {
    ListOfUser = new ArrayList<>();

  }
}