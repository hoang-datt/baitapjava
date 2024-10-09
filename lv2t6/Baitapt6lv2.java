/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapt6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Baitapt6lv2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//bai 1        
        System.out.println("nhap ho ten day du: ");
        String hoTen = sc.nextLine();
        hoTen.trim();

        String ho = hoTen.substring(0, hoTen.indexOf(" "));
        String tenDem = hoTen.substring(hoTen.indexOf(" "), hoTen.lastIndexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" "));

        System.out.println("Ho: " + ho.toUpperCase());
        System.out.println("Ten Dem: " + tenDem.toUpperCase());
        System.out.println("Ten: " + ten.toUpperCase());
// bai 2
        System.out.println("nhap vao chuoi: ");
        String input = sc.nextLine();
        String output = alPhaBet(input);

        System.out.println("input: " + input);
        System.out.println("output: " + output);
// bai 3
        System.out.println("nhap vao chuoi: ");
        String camel = sc.nextLine();
        String xuat = camelCase(camel);

        System.out.println("input: " + camel);
        System.out.println("output: " + xuat);
// bai 4
        System.out.println("nhap vao chuoi: ");
        String doiXung = sc.nextLine();

        StringBuilder k = new StringBuilder();
        k.append(doiXung);
        k.reverse();

        boolean isSymmetric = isSymmetric(doiXung);

        System.out.println("input: " + doiXung);
        System.out.println("output: " + isSymmetric);
//bai 5
        System.out.println("nhap vao so dien thoai: ");
        String sdt = sc.nextLine();
        String out = checkPhone(sdt);

        System.out.println("so dien thoai vua nhap: " + out);
// bai 6
        System.out.print("nhap vao chuoi: ");
        String chuoi = sc.nextLine();

        System.out.print("nhap khoang dich chuyen: ");
        int dichChuyen = sc.nextInt();

        String chuoiMaHoa = maHoaVaGiaiMaChuoi(chuoi, dichChuyen, true);
        System.out.println("chuoi ma hoa: " + chuoiMaHoa);

        String chuoiGiaiMa = maHoaVaGiaiMaChuoi(chuoiMaHoa, dichChuyen, false);
        System.out.println("chuoi gia ma: " + chuoiGiaiMa);
//bai 7
        System.out.print("nhap vao chuoi: ");
        String str = sc.nextLine();

        String longestSubstring = longestSubstringWithoutRepeatingChars(str);
        System.out.println("doan chuoi dai nhat khong chua ki tu lap lai: " + longestSubstring);
    }
//bai 2

    private static String alPhaBet(String input) {
        char array[] = input.toCharArray();
        Arrays.sort(array);

        return new String(array);
    }
// bai 3

    private static String camelCase(String camel) {
        String words[] = camel.split("\\s+");

        StringBuilder camelCase = new StringBuilder();

        for (String word : words) {
            camelCase.append(capitaLizeFirstLetter(word));
        }
        return camelCase.toString();
    }

    private static String capitaLizeFirstLetter(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
// bai 4

    private static boolean isSymmetric(String doiXung) {
        int left = 0;
        int right = doiXung.length() - 1;

        while (left < right) {
            if (doiXung.charAt(left) != doiXung.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
// bai 5

    private static String checkPhone(String sdt) {
        if (sdt.length() >= 10) {
            System.out.println("so dien thoai vuot qua so luong: ");
        } else if (sdt.length() < 8) {
            System.out.println("so dien thoai khong du so luong");
        }
        return String.format("%s %s %s", sdt.substring(0, 3), sdt.substring(3, 6), sdt.substring(6));
    }
// bai 6    

    public static String maHoaVaGiaiMaChuoi(String chuoi, int dichChuyen, boolean maHoa) {
        StringBuilder chuoiKetQua = new StringBuilder();
        for (char c : chuoi.toCharArray()) {
            if (maHoa) {
                chuoiKetQua.append((char) (c + dichChuyen));
            } else {
                chuoiKetQua.append((char) (c - dichChuyen));
            }
        }
        return chuoiKetQua.toString();
    }
//bai 7        

    public static String longestSubstringWithoutRepeatingChars(String str) {
        String longestSubstring = "";
        String currentSubstring = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!currentSubstring.contains(String.valueOf(c))) {
                currentSubstring += c;
                if (currentSubstring.length() > longestSubstring.length()) {
                    longestSubstring = currentSubstring;
                }
            } else {
                currentSubstring = String.valueOf(c);
            }
        }

        return longestSubstring;
    }
}
