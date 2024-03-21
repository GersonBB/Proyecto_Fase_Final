package uvg.edu.gt;

import static org.junit.jupiter.api.Assertions.*;

class StackVectorTest {

        @org.junit.jupiter.api.Test
        void push() {
            StackVector<Integer> stack = new StackVector<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            assertEquals(3, stack.size());
        }

        @org.junit.jupiter.api.Test
        void pop() {
            StackVector<Integer> stack = new StackVector<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            assertEquals(3, stack.pop());
            assertEquals(2, stack.pop());
            assertEquals(1, stack.pop());
        }

        @org.junit.jupiter.api.Test
        void empty() {
            StackVector<Integer> stack = new StackVector<>();
            assertTrue(stack.empty());
            stack.push(1);
            assertFalse(stack.empty());
        }

        @org.junit.jupiter.api.Test
        void size() {
            StackVector<Integer> stack = new StackVector<>();
            assertEquals(0, stack.size());
            stack.push(1);
            assertEquals(1, stack.size());
            stack.push(2);
            assertEquals(2, stack.size());
            stack.push(3);
            assertEquals(3, stack.size());
        }

}