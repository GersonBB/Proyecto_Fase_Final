package uvg.edu.gt;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

        @org.junit.jupiter.api.Test
        void push() {
            Stack<Integer> stack = new Stack<Integer>() {
                @Override
                public void push(Integer num) {

                }

                @Override
                public boolean empty() {
                    return false;
                }

                @Override
                public int size() {
                    return 0;
                }

                @Override
                public Integer pop() {
                    return null;
                }

                @Override
                public Integer peek() {
                    return null;
                }
            };
            stack.push(1);
            assertEquals(1, stack.size());
        }

        @org.junit.jupiter.api.Test
        void empty() {
            Stack<Integer> stack = new Stack<Integer>() {
                @Override
                public void push(Integer num) {

                }

                @Override
                public boolean empty() {
                    return false;
                }

                @Override
                public int size() {
                    return 0;
                }

                @Override
                public Integer pop() {
                    return null;
                }

                @Override
                public Integer peek() {
                    return null;
                }
            };
            assertEquals(true, stack.empty());
        }

        @org.junit.jupiter.api.Test
        void size() {
            Stack<Integer> stack = new Stack<Integer>() {
                @Override
                public void push(Integer num) {

                }

                @Override
                public boolean empty() {
                    return false;
                }

                @Override
                public int size() {
                    return 0;
                }

                @Override
                public Integer pop() {
                    return null;
                }

                @Override
                public Integer peek() {
                    return null;
                }
            };
            stack.push(1);
            assertEquals(1, stack.size());
        }

        @org.junit.jupiter.api.Test
        void pop() {
            Stack<Integer> stack = new Stack<Integer>() {
                @Override
                public void push(Integer num) {

                }

                @Override
                public boolean empty() {
                    return false;
                }

                @Override
                public int size() {
                    return 0;
                }

                @Override
                public Integer pop() {
                    return null;
                }

                @Override
                public Integer peek() {
                    return null;
                }
            };
            stack.push(1);
            assertEquals(1, stack.pop());
        }

        @org.junit.jupiter.api.Test
        void peek() {
            Stack<Integer> stack = new Stack<Integer>() {
                @Override
                public void push(Integer num) {

                }

                @Override
                public boolean empty() {
                    return false;
                }

                @Override
                public int size() {
                    return 0;
                }

                @Override
                public Integer pop() {
                    return null;
                }

                @Override
                public Integer peek() {
                    return null;
                }
            };
            stack.push(1);
            assertEquals(1, stack.peek());
        }

}