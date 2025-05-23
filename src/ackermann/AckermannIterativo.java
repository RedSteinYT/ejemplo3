/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ackermann;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Luis Alejandro Castro Contreras
 */
public class AckermannIterativo {
    public static int ackermann(int m, int n) {
        Deque<Par> PilaPrincipal = new ArrayDeque<>();
        Deque<Integer> PilaAyuda = new ArrayDeque<>();
        PilaPrincipal.push(new Par(m, n));
        Integer result = null;

        while (!PilaPrincipal.isEmpty()) {
            Par current = PilaPrincipal.pop();
            int currentM = current.m;
            int currentN = current.n;

            if (currentM == 0) {
                result = currentN + 1;
                if (!PilaAyuda.isEmpty()) {
                    int newM = PilaAyuda.pop();
                    PilaPrincipal.push(new Par(newM, result));
                    result = null;
                } else {
                    break;
                }
            } else if (currentN == 0) {
                PilaPrincipal.push(new Par(currentM - 1, 1));
            } else {
                PilaAyuda.push(currentM - 1);
                PilaPrincipal.push(new Par(currentM, currentN - 1));
            }
        }

        return result;
    }

}
