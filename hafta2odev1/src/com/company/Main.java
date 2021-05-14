package com.company;

public class Main {

    public static void main(String[] args) {



      Dersler ders1 = new Dersler(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)","Engin Demiroğ",50.20);
      Dersler ders2 = new Dersler(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","Engin Demiroğ",65.80);
      Dersler ders3 = new Dersler(3,"Programlamaya Giriş için Temel Kurs","Engin Demiroğ",80.70);

      Dersler[] derslers = {ders1,ders2,ders3};

      for(Dersler ders:derslers)
      {
          System.out.println((ders.dersAdi));
      }

        System.out.println((derslers.length));

      Student student = new Student();
      student.id=1;
      student.Name="Murat ÇAYIR";

      DersManager dersManager =new DersManager();
      dersManager.addToDers(ders1);
      dersManager.addToDers(ders2);
      dersManager.addToDers(ders3);
    }
}
