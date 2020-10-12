package oit.is.z0469.kaizi.janken.model;

import java.util.ArrayList;

public class Janken{
  ArrayList<String> nameList = new ArrayList<>();

  public ArrayList<String> getNameList(){
    return nameList;
  }

  public void setNameList(ArrayList<String> nameList){
    this.nameList = nameList;
  }
}
