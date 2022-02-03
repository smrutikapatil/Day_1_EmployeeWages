package com.employeewage;

public class EmpWageBuilderUC2 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int daily_Wage = 0;
        int wage_Pr_Hr = 20;
        int working_Hour = 0;
        double emp_check = Math.floor(Math.random() * 10) % 2;
        if (emp_check == IS_FULL_TIME)
            working_Hour = 8;
        else
          working_Hour = 0;
        daily_Wage = working_Hour * wage_Pr_Hr;
        System.out.println("Employee daily wage is " + daily_Wage);
    }
}