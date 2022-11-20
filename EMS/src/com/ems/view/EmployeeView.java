package com.ems.view;

import com.ems.domain.Employee;
import com.ems.util.EMSUtility;

public class EmployeeView {


    public void enterMainMenu(){
        /*
        进入主菜单
        1. 开关 loopFlag
        2. 开关为 true  显示 主菜单(多次)
        3. 从键盘读取用户选择(指令)
        4. 依据指令对应跳转界面

     */
        //1.开关loopFlag
        boolean loopFlag = true;
        //2.显示主菜单
        while (loopFlag){
            System.out.println(" ");
            System.out.println("-----------------员工信息管理-----------------");

            System.out.println("1 添加员工");
            System.out.println("2 修改员工");
            System.out.println("3 删除员工");
            System.out.println("4 员工列表");
            System.out.println("5 退        出");

            System.out.println("请选择(1-5)：_");

            //3.获取键盘输入
            char c = EMSUtility.readMenuSelection();
            switch (c){
                case '1':
                    addNewEmployee();
                    break;
                case '2':
                    modifyEmployee();
                    break;
                case '3':
                    deleteEmployee();
                    break;
                case '4':
                    listAllEmployees();
                    break;
                case '5':
                    System.out.println("请确认是否退出（Y/N）:  ");
                    char confirm = EMSUtility.readConfirmSelection();
                    if (confirm == 'Y'){
                        loopFlag = false;
                        System.out.println("===============退出=================");
                    }
                    break;
                default:
                    System.out.println("以上条件都不满足");
                    break;
            }


        }


    }

   /* void showMenu(){
        System.out.println("");
        System.out.println("-----------------员工信息管理-----------------");

        System.out.println("1 添加员工");
        System.out.println("2 修改员工");
        System.out.println("3 删除员工");
        System.out.println("4 员工列表");
        System.out.println("5 退        出");

        System.out.println("请选择(1-5)：_");

    }*/

    //添加员工
    private void addNewEmployee(){
        System.out.println("添加员工");
        // TODO
    }

    //修改员工
    private void modifyEmployee (){
        // TODO
    }

    //删除员工
    private void deleteEmployee (){
        // TODO
    }

    //员工列表
    /*
        员工列表的显示功能
        1.显示页面
        2.通过service 获取所有员工信息(员工数组进行遍历)
     */
    private void listAllEmployees(){
        //TODO
        // 1.显示页面
        System.out.println("----------------------------员工列表------------------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t工资\t电话\t邮箱");

        // 2.通过service 获取所有员工信息(员工数组进行遍历)


    }





}
