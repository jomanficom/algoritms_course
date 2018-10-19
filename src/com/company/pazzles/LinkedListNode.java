package com.company.pazzles;

public class LinkedListNode {
    int item;
    LinkedListNode next;

    public LinkedListNode(int item, LinkedListNode next) {
        this.item = item;
        this.next = next;
    }

    public static void main(String[] args) {
        //4683
        LinkedListNode n1 = new LinkedListNode(3, new LinkedListNode(8, new LinkedListNode(6, new LinkedListNode(4, null))));

        //145
        LinkedListNode n2 = new LinkedListNode(5, new LinkedListNode(4, new LinkedListNode(1, null)));
        LinkedListNode sum = addTwonumbers(n1, n2);

        printNumber(sum);
    }

    private static void printNumber(LinkedListNode number){
        while (number != null){
            System.out.print(number.item);
            number = number.next;
        }
    }

    private static LinkedListNode addTwonumbers(LinkedListNode n1, LinkedListNode n2) {
        int overflow = 0;
        LinkedListNode result = null;
        LinkedListNode currentNode = null;
        int resultValue;


        while (n1 != null || n2 != null){
            if (n1 == null ){
                resultValue = (n2.item + overflow) % 10; //остаток от деления на 10
                overflow = (int)( n2.item + overflow)/10; //целая часть деления на 10
            } else {
                if (n2 == null){
                    resultValue = (n1.item + overflow) % 10; //остаток от деления на 10
                    overflow = (int)(n1.item + overflow)/10; //целая часть деления на 10
                } else {
                    resultValue = (n1.item + n2.item + overflow) % 10; //остаток от деления на 10
                    overflow = (int)(n1.item + n2.item + overflow)/10; //целая часть деления на 10
                }
            }
            if (result == null){
                result = new LinkedListNode(resultValue, null);
                currentNode =  result;
            } else {
                currentNode.next = new LinkedListNode(resultValue, null);
                currentNode = currentNode.next;

            }
            if (n1 != null){
                n1 = n1.next;
            }
            if (n2 != null){
                n2 = n2.next;
            }


        }

        if (overflow != 0){
            currentNode = new LinkedListNode(overflow, null);
        }


        return result;
    }
}
