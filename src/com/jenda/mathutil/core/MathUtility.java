/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jenda.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    // hàm tính N! = 1 x 2 x 3 x 4 .... x N
    // ko có giai thừa cho số âm
    // 0! = 1! = 1 quy ước 0! = 1
    // vì giai thừa tăng giá trị rất nhanh, 20! cừa đủ 18 số 0
    // tức 21! tràn kiểu LONG
    // quy ước: hàm này chỉ tính từ 0 ... 20! 
    // có 2 cách viết hàm: for truyền thống và đệ quy - recursion
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be between 0 .. 20!");
    
        if(n == 0 || n == 1) 
            return 1;
        
        
        // sống sót đến đoạn này từ n -> 20 rồi, for mà chởi
        long product = 1; // biến khởi độnng cho tích nhân dồn
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
}
