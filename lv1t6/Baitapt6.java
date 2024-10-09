/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitapt6;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Baitapt6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// bai 1        
        String a = "Hello";
        String b = "";
        
        for(int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        System.out.println(b);  
// bài 2  
        System.out.println("nhap vao chuoi: ");
        String chuoi = sc.nextLine();
        
        System.out.println("nhap vao mot ki tu: ");
        char kitu = sc.nextLine().charAt(0);
        
        int soLanXuatHien = soLanXuatHien(chuoi, kitu);
        System.out.println("ki tu " + kitu + " xuat hien " + soLanXuatHien + " lan trong chuoi");
// bai 3
        System.out.println("nhap vao ho va ten: ");
        String name = sc.nextLine();
        String normalized = normalizedName(name);
        System.out.println("ho va ten sau khi thay doi: " + normalized);
// bai 4
        System.out.println("nhap vao chuoi: ");
        String input = sc.nextLine();
        
        input = input.replaceAll("\\s+", "");
        
        System.out.println("chuoi sau khi xoa khoang trang: " + input);
// bai 5
        System.out.println("nhap vao chuoi: ");
        String title = sc.nextLine();
        
        char array [] = title.toCharArray();
        boolean foundSpace = true;
        for(int i = 0; i < array.length; i++) {
            if(Character.isLetter(array[i])){
                if(foundSpace) {
                    array[i] = Character.toUpperCase(array[i]);
                    foundSpace = false;
                }
            }else {
                foundSpace = true;
            }
        }
        title = String.valueOf(array);
        System.out.println("chuoi sau khi doi: " + title);
// bai 6
        System.out.println("nhap vao chuoi: ");
        String count = sc.nextLine();
        
        int wordCount = wordCount(count);
        System.out.println("chuoi sau khi dem: " + wordCount);
//bai 7
        System.out.println("nhap vao chuoi: ");
        String doiXung = sc.nextLine();
        
        StringBuilder k = new StringBuilder();
        k.append(doiXung);
        k.reverse();
        
        String doiXung1 = k.toString();
        if(doiXung.equals(doiXung1)) {
            System.out.println("day la chuoi doi xung.");
        }else {
            System.out.println("day khong phai la chuoi doi xung.");
        }
//bai 8
        System.out.println("nhap vao chuoi: ");
        String nhap = sc.nextLine();
        
        System.out.println("nhap vao chuoi can tim: ");
        String find = sc.nextLine();
        
        System.out.println("chuoi can thay the: ");
        String replace = sc.nextLine();
        
        String result = nhap.replaceAll(find, replace);
        
        System.out.println("chuoi sau khi thay the: " + result);
    }
    
    
    
    
    
    
    
    
    
//bai2
    private static int soLanXuatHien(String chuoi, char kitu) {
        int count = 0;
        for(int i = 0; i < chuoi.length(); i++) {
            if(chuoi.charAt(i) == kitu) {
                count++;
            }
        }
        return count;
    }
//bai 3
    private static String normalizedName(String name) {
        name = name.toLowerCase();
        
        String words [] = name.split("\\s+");
        
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
        
        StringBuilder normalized = new  StringBuilder();
        for(String word : words) {
            normalized.append(word).append(" ");
        }
        return normalized.toString().trim();
    }    
//bai 6
    private static int wordCount(String count) {
        String word [] = count.split("\\s+");
        return word.length;
    }
}
