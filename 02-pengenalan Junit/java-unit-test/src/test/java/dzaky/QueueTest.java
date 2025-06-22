package dzaky;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A queue")
public class QueueTest {

    private Queue<String> queue;

    @Nested
    @DisplayName("ketika baru")
    class WhenNew{

        @BeforeEach
        public void setUp(){
            queue = new LinkedList<>();
        }

        @Test
        public void offerAData(){
            queue.offer("A");
            Assertions.assertEquals(1, queue.size());
            queue.forEach(System.out::println);
        }

        @Test
        public void offerMoreData(){
            queue.offer("A");
            queue.offer("B");
            Assertions.assertEquals(2, queue.size());
            queue.forEach(System.out::println);
        }
    }
}


