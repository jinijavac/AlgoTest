package BOJ.Implementation;

import java.util.Scanner;

//시간초과 --> buffered 사용해야 할 듯
public class StackExam {
    // push, pop, size, empty, top 메서드 구현
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 입력 개수
        ArrayStack stack = new ArrayStack(n);

        for (int i = 0; i < n; i++) {
            String command = scanner.next();

            switch (command) {
                case "push":
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty());
                    break;
                case "top":
                    System.out.println(stack.top());
                    break;
            }
        }
    }

    static class ArrayStack {
        private int top;
        private int[] stack;

        public ArrayStack(int size) {
            this.stack = new int[size];
            this.top = -1;
        }

        public void push(int n) {
            stack[++top] = n;
        }

        public int pop() {
            if (top == -1) {
                return -1;
            } else {
                return stack[top--];
            }
        }

        public int size() {
            return top + 1;
        }

        public int empty() {
            if (top == 1) {
                return 1;
            } else return 0;
        }

        public int top() {
            if (top == -1) {
                return -1;
            } else {
                return stack[top];
            }
        }
    }
}