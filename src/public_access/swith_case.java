/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package public_access;

/**
 *
 * @author deepalsuranga
 */
public class swith_case {

    public static void main(String[] args) {

        swith_case sd=new swith_case();
        sd.getTypeOfDayWithSwitchStatement("Monday");
    }

    public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
        String typeOfDay = null;
        switch (dayOfWeekArg) {
            case "Monday":
                typeOfDay = "Start of work week";
                System.out.println("Start of work week");
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                System.out.println("Midweek");
                break;
            case "Friday":
                typeOfDay = "End of work week";
                System.out.println("End of work week");
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                System.out.println("Weekend");
                break;
            
        }
        return typeOfDay;
        
    }

}
