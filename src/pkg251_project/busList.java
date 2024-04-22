/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg251_project;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author yara
 */
class busList {

    private static final List<Bus> buses = new ArrayList<>();

    public static int size() {
        return buses.size();
    }

    public static Bus get(int i) {
        return buses.get(i);
    }
    
    public static void add(Bus bus) {
        buses.add(bus);
    }

    public static boolean remove(Bus bus) {
        return buses.remove(bus);
    }
    
}
