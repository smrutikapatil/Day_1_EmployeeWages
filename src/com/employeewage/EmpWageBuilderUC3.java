package com.employeewage;

public class EmpWageBuilderUC3 {
    public static void main(String[] args) {
        int is_Full_Time_Present = 2;
        int is_Part_Time_Present = 1;
        int wage_Pr_Hr = 20;
        int working_Hour = 0;
        int daily_Wage = 0;
        double emp_check = (Math.floor(Math.random() * 10) % 3);
        if (emp_check == is_Full_Time_Present)
            working_Hour = 8;
        else if (emp_check == is_Part_Time_Present)
            working_Hour = 4;
        else
            working_Hour = 0;

        daily_Wage = working_Hour * wage_Pr_Hr;
        System.out.println("Employee wage " + daily_Wage);
    }
}