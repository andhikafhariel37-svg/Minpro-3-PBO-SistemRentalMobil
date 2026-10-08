/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author User
 */
import controller.RentalController;
import view.RentalView;

public class Main {
    public static void main(String[] args) {
        RentalController controller = new RentalController();
        RentalView view = new RentalView(controller);
        
        view.jalankanMenu();
    }
}