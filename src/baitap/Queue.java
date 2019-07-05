/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author USER
 */
public class Queue {

    public static void main(String[] args) {
        int size = 10;
        int front = 0;
        int rear = -1;
        int queue[10];

bool isEmpty    
            () {
    return (front < 0 || front > rear) ? true : false;
        }

        bool isFull
        
            () {
    return rear == size - 1 ? true : false;
        }
        void enqueue
        (int item) {
    if (isFull()) {
               System.out.println("Hàng đợi đã đầy");;
                return;
            }
            rear++;
            queue[rear] = item;
        }

        void dequeue() {
    if (isEmpty()) {
                System.out.println("Hàng đợi rỗng");
                return;
            }
            queue[front] = 0;
            front++;
        }
    }
}
