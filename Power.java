/**
 * Copyright (c) 2009 ISP RAS. 109004, A. Solzhenitsina, 25, Moscow, Russia. All rights reserved.
 * <p>
 * $Id$ Created on Jan 15, 2016
 */

/**
 * @author Victor Kuliamin
 */

/**
 * Changed 09/2021
 * @author Kate Jud
 */
public class Power {

  //CONST 2^32
  private static final long  MOD = 4294967296L;

  public long pow(int a, int b) {//Было int
    double r = 1;//Было int r=0
    double temp=a;//Меняем на double

    while (b > 0) {

      if ((b & 1) != 0) {
        r=r==0?1:r;//Для корректной работы алгоритма с переполнением
        r *= temp;//Было r*=a
        r%=MOD;//Для корректной работы алгоритма с переполнением
      }
      //Если произошло переполнение и остаток от деления был равен 0
      if (temp==0){
        temp=a;
      }
      temp*=temp;//Было r*=r
      temp%=MOD;//Для корректной работы алгоритма с переполнением

      b >>= 1;
    }

    return (long) r;//Кастуем к целому числу
  }
}