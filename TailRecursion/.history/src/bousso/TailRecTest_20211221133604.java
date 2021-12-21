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
        Stream<Long> stre = Stream.of((long)3,(long)0,(long)5);
        //Act
        List<Long> lst = stre.map((x)->TailRec.factorialtail(x)).collect(Collectors.toList());
        //Assert
        Long[] test = {(long) 6,(long)1,(long)120};
        assertTrue(lst.size()==test.length);
    }
}
