package com.yiguo.singleton;

public class LazySingleton
{

//  step 2 
  private static LazySingleton lazySingleton ;
//  step 1
  private LazySingleton() {
      
  }
//  step 3 
  public static LazySingleton getInstance () {
      if (lazySingleton == null){
          lazySingleton = new LazySingleton();
      }
      return lazySingleton;
  }
}
