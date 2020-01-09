package com.company;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;

public class Exampl {

    public void catchTryFynaly() {
        String s = null;
        try {
            exeptionMethod(s);
            int[] m = {1, 2, 3, 5,};
            int t = 0;
            for (int i = 0; i < m.length + 2; i++) {
                t = m[i];
            }
        } catch (Exception e) {
            System.out.println("Показываем что мы словили исключение и оно отработало");
        } finally {
            System.out.println("Показываем что блок finally отрабатоет почти в любом случае");
        }
    }

    public void exeptionMethod(String s) throws NullPointerException {
        if (s == null) {
            throw new NullPointerException("Text Exeption");
        } else
            System.out.println("Text" + s);
    }

}
