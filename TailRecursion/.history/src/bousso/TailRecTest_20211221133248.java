package bousso;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class TailRecTest {
    @Test
    public void testFactorialtail() {
        //Arrange
        Stream<Integer> stre = Stream.of(3,0,5);
        //Act
        List<Long> lst = stre.map((x)->TailRec.factorialtail(x)).collect(Collectors.toList());
        //Assert
        int[] test = {6,1,120};
        assertTrue(lst.size()==test.length);
    }
}
