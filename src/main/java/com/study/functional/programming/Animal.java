package com.study.functional.programming;

public class Animal {

   private String especie;
   private boolean podeSaltar;
   private boolean podeNadar;

   public Animal(String nomeDaEspecie, boolean saltador, boolean nadador){
      especie = nomeDaEspecie;
      podeSaltar = saltador;
      podeNadar = nadador;
   }

   public boolean podeSaltar() { return podeSaltar; }
   public boolean podeNadar() { return podeNadar; }
   public String toString() { return especie; }
}