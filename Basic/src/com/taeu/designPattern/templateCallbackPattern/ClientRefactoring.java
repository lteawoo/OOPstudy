package com.taeu.designPattern.templateCallbackPattern;

public class ClientRefactoring {
    public static void main(String[] args) {
        SoliderRefactoring rambo = new SoliderRefactoring();

        rambo.runContext("총! 초총!");

        System.out.println();

        rambo.runContext("검! 검검!");

        System.out.println();

        rambo.runContext("도끼! 독독!");

        System.out.println();
    }
}
