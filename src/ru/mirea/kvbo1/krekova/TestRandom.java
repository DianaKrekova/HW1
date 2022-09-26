package ru.mirea.kvbo1.krekova;

public class TestRandom {
    public static void main(String[] args) {
        int[] a=new int[4];
        boolean f = true;
        for(int i=0;i<a.length;i++){
            a[i]= (int)(Math.random()*(99-10)+10);
            System.out.println(a[i]);
        }
        for(int i=1;i<a.length;i++) {
            if (a[i] <= a[i - 1]) {
                f = false;
                break;
            }
        }
        if (f) {
            System.out.println("Строго возрастает");
        }else System.out.println("Не является строго возрастающим");
    }
}
