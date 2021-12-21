package bousso;

import java.util.stream.Stream;

import org.junit.Test;

public class TailRecTest {
    @Test
    public void testFactorialtail() {
        //Arrange
        Stream<Integer> stre = Stream.of(3,0,5);
        //Act
        stre.map(TailRec.factorialtail(int x))
        //Assert

    }
}
